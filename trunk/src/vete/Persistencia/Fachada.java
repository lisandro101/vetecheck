
package vete.Persistencia;

import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.ext.Db4oException;
import com.db4o.query.Query;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Vector;
import javax.swing.JOptionPane;
import vete.Constantes;
import vete.Entidad.Articulo;
import vete.Entidad.Cliente;
import vete.Entidad.Perfil;
import vete.Entidad.Permiso;
import vete.Entidad.Persona;
import vete.Entidad.Usuario;

/**
 *
 * @author laureano
 */
public class Fachada {
    
    static Fachada instancia = null;
    static ObjectContainer db = null;
    
    private Fachada() {
        inicializar();
    }
    
    public static synchronized Fachada getInstancia() {
            
        if( instancia == null ) {
            instancia = new Fachada();
        }
		
        return instancia;
    }	
   
    public void grabar( Object obj ) throws Db4oException {    
        db.set(obj);
    }
   
    public void actualizar(Object obj) throws Db4oException {       
        db.set (obj);
    }
    
    public void borrar(Object obj) throws Db4oException {
        db.delete( obj );
    }
    
    /*
     *Metodo generico para buscar objetos dentro de la base de datos.
     *Cualquiera sea el objeto pasado como parametro prototipo, se devuelve
     *un vector del mismo tipo que contiene objetos iguales al prototipo
     *@param proto Objeto prototipo para las busqueda
     *@return Se devuelve un vector con los objetos iguales al prototipo
     */
    
    public <T> Vector<T> buscar(T proto) throws Db4oException {
        
        Vector<T> resultado = new Vector<T>();
        ObjectSet<T> objs = db.get( proto );
        
        while(objs.hasNext()) {
            resultado.add(objs.next());
        }
        
        return resultado;
    }
    
//    FIXME
    public <T> Vector<T> buscarObjeto(T proto) throws Db4oException {

        Vector<T> resultado = new Vector<T>();
        
//        Method[] metodos = proto.getClass().getMethods();
        Field[] campos = proto.getClass().getFields();
        
        
        //Crea una consulta
        Query cons = db.query();
        
        //Define que solo buscara Clientes
        cons.constrain( proto.getClass() );
        
        //Define mas restricciones...
        for (int i=0; i<campos.length; i++){
            
            try {
                
                String nombreMetodo = "get" + campos[i].getName().substring(0, 1).toUpperCase() + campos[i].getName().substring(1).toUpperCase();
                Method metodo = proto.getClass().getMethod(nombreMetodo, null);
                JOptionPane.showMessageDialog(null, metodo.invoke(proto, null),Constantes._ERROR, JOptionPane.ERROR_MESSAGE);
                cons.descend(campos[i].getName()).constrain(metodo.invoke(proto, null)).like();
            } 
            catch (IllegalAccessException ex) {
                JOptionPane.showMessageDialog(null, ex.toString(),Constantes._ERROR, JOptionPane.ERROR_MESSAGE);
            } 
            catch (IllegalArgumentException ex) {
                JOptionPane.showMessageDialog(null, ex.toString(),Constantes._ERROR, JOptionPane.ERROR_MESSAGE);
            } 
            catch (InvocationTargetException ex) {
                JOptionPane.showMessageDialog(null, ex.toString(),Constantes._ERROR, JOptionPane.ERROR_MESSAGE);
            } 
            catch (NoSuchMethodException ex) {
                JOptionPane.showMessageDialog(null, ex.toString(),Constantes._ERROR, JOptionPane.ERROR_MESSAGE);
            } 
            catch (SecurityException ex) {
                JOptionPane.showMessageDialog(null, ex.toString(),Constantes._ERROR, JOptionPane.ERROR_MESSAGE);
            }
            
        }        
        
        //Ejecuta la consulta
        @SuppressWarnings("unchecked")
        ObjectSet<T> objetos = cons.execute();
        
        //Con el ObjectSet genera un vector de Objetos como resultado
        while(objetos.hasNext()) {
            resultado.add(objetos.next());
        }
        
        return resultado;
    }
    
    /*
     *Metodo para cerrar la conexion con el archivo de base de datos
     */
    public void desconectar() throws Db4oException {
       db.close();
    }

    private void inicializar() throws Db4oException {
        Conector con = new Conector();
        db = con.conectar( "datos", "base.dat");
    }
    
    public Vector<Cliente> buscarCliente( Cliente cli ) throws Db4oException {
    
        Vector<Cliente> resultado = new Vector<Cliente>();
        
        //Crea una consulta
        Query cons = db.query();
        
        //Define que solo buscara Clientes
        cons.constrain( Cliente.class );
        
        //Define que solo buscara Clientes con estos datos
        cons.descend("codigo").constrain( cli.getCodigo() ).like();
        cons.descend("nombre").constrain( cli.getNombre() ).like();
        cons.descend("cuit").constrain( cli.getCuit() ).like();
        cons.descend("mail").constrain( cli.getMail() ).like();
        // cons.descend("estado").constrain( cli.getEstado() ).like();
        // cons.descend("descuento").constrain( cli.getDescuento() ).like();
        //TODO busqueda relacionada con el domicilio
        
        //Ejecuta la consulta
        @SuppressWarnings("unchecked")
        ObjectSet<Cliente> clientes = cons.execute();
        
        //Con el ObjectSet genera un vector de Clientes como resultado
         while(clientes.hasNext()) {
            resultado.add(clientes.next());
        }
        
        return resultado;
            
    } 
    
    public Vector<Persona> buscarPersona( Persona per ) throws Db4oException {
    
        Vector<Persona> resultado = new Vector<Persona>();
        
        //Crea una consulta
        Query cons = db.query();
        
        //Define que solo buscara Clientes
        cons.constrain( Persona.class );
        
        //Define que solo buscara Clientes con estos datos
        cons.descend("codigo").constrain( per.getCodigo() ).like();
        cons.descend("nombre").constrain( per.getNombre() ).like();
        cons.descend("cuit").constrain( per.getCuit() ).like();
        cons.descend("mail").constrain( per.getMail() ).like();
        // cons.descend("estado").constrain( per.getEstado() ).like();
        // cons.descend("descuento").constrain( per.getDescuento() ).like();
        //TODO busqueda relacionada con el domicilio
        
        //Ejecuta la consulta
        @SuppressWarnings("unchecked")
        ObjectSet<Persona> personas = cons.execute();
        
        //Con el ObjectSet genera un vector de Clientes como resultado
         while(personas.hasNext()) {
            resultado.add(personas.next());
        }
        
        return resultado;
            
    } 
    
    public Vector<Articulo> buscarArticulo( Articulo art ) throws Db4oException {
    
        Vector<Articulo> resultado = new Vector<Articulo>();
        
        //Crea una consulta
        Query cons = db.query();
        
        //Define que solo buscara Clientes
        cons.constrain( Articulo.class );
        
        //Define que solo buscara Clientes con estos datos
        cons.descend("codigo").constrain( art.getCodigo() ).like();
        cons.descend("nombre").constrain( art.getNombre() ).like();
        cons.descend("rubro").constrain( art.getRubro() ).like();
        
        //Ejecuta la consulta
        ObjectSet<Articulo> articulos = cons.execute();
        
        //Con el ObjectSet genera un vector de Clientes como resultado
         while(articulos.hasNext()) {
            resultado.add(articulos.next());
        }
        
        return resultado;
            
    } 
    
    public Vector<Usuario> buscarUsuario( Usuario usuario ) throws Db4oException {
    
        Vector<Usuario> resultado = new Vector<Usuario>();
        
        //Crea una consulta
        Query cons = db.query();
        
        //Define que solo buscara Usuarios
        cons.constrain( Usuario.class );
        
        //Define que solo buscara Usuarios con estos datos
        cons.descend("nombre").constrain( usuario.getNombre() ).like();
        
        //Ejecuta la consulta
        ObjectSet<Usuario> usuarios = cons.execute();
        
        //Con el ObjectSet genera un vector de Usuarios como resultado
         while(usuarios.hasNext()) {
            resultado.add(usuarios.next());
        }
        
        return resultado;
            
    } 
    
    public Vector<Perfil> buscarPerfil( Perfil perfil ) throws Db4oException {
    
        Vector<Perfil> resultado = new Vector<Perfil>();
        
        //Crea una consulta
        Query cons = db.query();
        
        //Define que solo buscara Perfiles
        cons.constrain( Perfil.class );
        
        //Define que solo buscara Perfiles con estos datos
        cons.descend("nombre").constrain( perfil.getNombre() ).like();
        
        //Ejecuta la consulta
        ObjectSet<Perfil> perfiles = cons.execute();
        
        //Con el ObjectSet genera un vector de Perfiles como resultado
         while(perfiles.hasNext()) {
            resultado.add(perfiles.next());
        }
        
        return resultado;
            
    } 
    
    public Vector<Permiso> buscarPermiso( Permiso permiso ) throws Db4oException {
    
        Vector<Permiso> resultado = new Vector<Permiso>();
        
        //Crea una consulta
        Query cons = db.query();
        
        //Define que solo buscara Perfiles
        cons.constrain( Permiso.class );
        
        //Define que solo buscara Perfiles con estos datos
        cons.descend("objeto").constrain( permiso.getObjeto() ).like();
        
        //Ejecuta la consulta
        ObjectSet<Permiso> permisos = cons.execute();
        
        //Con el ObjectSet genera un vector de Permisos como resultado
         while(permisos.hasNext()) {
            resultado.add(permisos.next());
        }
        
        return resultado;
            
    }
    
}