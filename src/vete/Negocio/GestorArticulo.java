/*
 * GestorArticulo.java
 * 
 * Created on 19/06/2007, 00:57:21
 * 
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package vete.Negocio;

import com.db4o.ext.Db4oException;
import java.util.HashMap;
import java.util.Vector;
import vete.Entidad.Articulo;
import vete.Persistencia.FachadaPersistencia;

/**
 *
 * @author Lisandro
 */
public class GestorArticulo {
    
    static GestorArticulo instancia = null;

    public GestorArticulo() {
    }
    
    /**
     * Este método devuelve una instancia del GestorArticulo.
     * @return GestorArticulo
     */  
    public static synchronized GestorArticulo getInstancia() { //Aplicación del patron singleton
            
        //Si no existe una instancia del GestorArticulo la crea
        if( instancia == null ) {
            instancia = new GestorArticulo();
        }
		
        return instancia;
    }	
    
    public void ingresar(HashMap<String, Object> datosArticulo) throws Db4oException {
        
        //Crea un Articulo a partir de la Hash
        Articulo articulo = armarArticulo(datosArticulo);
        
        //Le asigna un uid generado al azar al Articulo
        articulo.generarUid();
        
        //Persiste el Articulo
        FachadaPersistencia.getInstancia().grabar(articulo, true);
              
     }
    
    public Vector<Articulo> buscar(HashMap<String, Object> datosArticulo) throws Db4oException {
        
    
     
        //Crea un Articulo a partir de la Hash
        Articulo articulo = armarArticulo(datosArticulo);
        
        //Busca Articulo en la persistencia
        Vector<Articulo> articulos = FachadaPersistencia.getInstancia().buscarArticulo( articulo );
    
        return articulos;
        
    }
    
    public void actualizar(HashMap<String, Object> datosArticulo) throws Db4oException {
        
        //Crea un Articulo a partir de la Hash
        Articulo articulo = armarArticulo(datosArticulo);
        
        //Persiste el Articulo
        Fachada.getInstancia().actualizar( articulo );
        
    }
    
    public void actualizar(Articulo articulo) throws Db4oException {
        
        //Persiste el Articulo
        Fachada.getInstancia().actualizar( articulo );
        
    }
    
    public void eliminar(HashMap<String, Object> datosArticulo) throws Db4oException {
        
        //Crea un Articulo a partir de la Hash
        Articulo articulo = armarArticulo(datosArticulo);
        
        //Persiste el Articulo
        Fachada.getInstancia().borrar( articulo );
        
    }
    
     public void eliminar(Articulo articulo) throws Db4oException {
        
        //Persiste el Articulo
        Fachada.getInstancia().borrar( articulo );
        
    }
    
    public Articulo armarArticulo(HashMap<String, Object> datosArticulo){
        
        Articulo articulo = new Articulo();
        
        //Recupera los datos del articulo de una Hash y construye un Articulo
        articulo.setUid((String) datosArticulo.get("uid"));
        articulo.setCodigo((String) datosArticulo.get("codigo"));
        articulo.setNombre((String) datosArticulo.get("nombre"));
        articulo.setRubro((String) datosArticulo.get("rubro"));
        articulo.setCosto((Double) datosArticulo.get("costo"));
        articulo.setPrecio((Double) datosArticulo.get("precio"));
        articulo.setMargen((Double) datosArticulo.get("margen"));
        articulo.setEstadoMargen((String) datosArticulo.get("estadoMargen"));
        //articulo.setImpuesto((Impuesto) datosArticulo.get("impuesto"));
        articulo.setStock((Double) datosArticulo.get("stock"));
        articulo.setMinimo((Double) datosArticulo.get("minimo"));
        articulo.setMaximo((Double) datosArticulo.get("maximo"));
        articulo.setDetalle((String) datosArticulo.get("detalle"));
        
        
	
        
        //faltan Telefonos y Facturas       
        
        return articulo;
    }

}
