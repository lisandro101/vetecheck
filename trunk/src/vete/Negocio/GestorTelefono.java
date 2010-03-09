/*
 * GestorTelefono.java
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
import vete.Entidad.Telefono;
import vete.Persistencia.Fachada;

/**
 *
 * @author Lisandro
 */
public class GestorTelefono {
    
    static GestorTelefono instancia = null;

    public GestorTelefono() {
    }
    
    /**
     * Este método devuelve una instancia del GestorDomicilio.
     * @return GestorDomicilio
     */  
    public static synchronized GestorTelefono getInstancia() { //Aplicación del patron singleton
            
        //Si no existe una instancia del GestorDomicilio la crea
        if( instancia == null ) {
            instancia = new GestorTelefono();
        }
		
        return instancia;
    }	
    
    public void ingresar(HashMap<String, Object> datosTelefono) throws Db4oException {
        
        //Crea un Domicilio a partir de la Hash
        Telefono telefono = armarTelefono(datosTelefono);
        
        //Le asigna un uid generado al azar al Telefono
        telefono.generarUid();
        
        //Persiste el Telefono
        Fachada.getInstancia().grabar( telefono );
              
     }
    
    public Vector<Telefono> buscar(HashMap<String, Object> datosTelefono) throws Db4oException {
        
    
     
        //Crea un Telefono a partir de la Hash
        Telefono telefono = armarTelefono(datosTelefono);
        
        //TODO Busca Telefono en la persistencia
        Vector<Telefono> telefonos = null; 
//        telefonos = Fachada.getInstancia().buscarTelefono( telefono );
    
        return telefonos;
        
    }
    
    public void actualizar(HashMap<String, Object> datosTelefono) throws Db4oException {
        
        //Crea un Telefono a partir de la Hash
        Telefono telefono = armarTelefono(datosTelefono);
        
        //Persiste el Telefono
        Fachada.getInstancia().actualizar( telefono );
        
    }
    
    public void actualizar(Telefono telefono) throws Db4oException {
        
        //Persiste el Telefono
        Fachada.getInstancia().actualizar( telefono );
        
    }
    
    public void eliminar(HashMap<String, Object> datosTelefono) throws Db4oException {
        
        //Crea un Telefono a partir de la Hash
        Telefono telefono = armarTelefono(datosTelefono);
        
        //Persiste el Telefono
        Fachada.getInstancia().borrar( telefono );
        
    }
    
     public void eliminar(Telefono telefono) throws Db4oException {
        
        //Persiste el Telefono
        Fachada.getInstancia().borrar( telefono );
        
    }
    
    public Telefono armarTelefono(HashMap<String, Object> datosTelefono){
        
        Telefono telefono = new Telefono();
        
        //Recupera los datos del telefono de una Hash y construye un Telefono
        telefono.setUid((String)datosTelefono.get("uid"));
        telefono.setCodigo((String)datosTelefono.get("codigo"));
	telefono.setNumero((String)datosTelefono.get("numero"));
	telefono.setNombre((String)datosTelefono.get("nombre"));
        
        return telefono;
    }

}
