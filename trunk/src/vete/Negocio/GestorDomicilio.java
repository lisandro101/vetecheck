/*
 * GestorDomicilio.java
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
import vete.Entidad.Domicilio;
import vete.Entidad.Persona;
import vete.Persistencia.Fachada;

/**
 *
 * @author Lisandro
 */
public class GestorDomicilio {
    
    static GestorDomicilio instancia = null;

    public GestorDomicilio() {
    }
    
    /**
     * Este método devuelve una instancia del GestorDomicilio.
     * @return GestorDomicilio
     */  
    public static synchronized GestorDomicilio getInstancia() { //Aplicación del patron singleton
            
        //Si no existe una instancia del GestorDomicilio la crea
        if( instancia == null ) {
            instancia = new GestorDomicilio();
        }
		
        return instancia;
    }	
    
    public void ingresar(HashMap<String, Object> datosDomicilio) throws Db4oException {
        
        //Crea un Domicilio a partir de la Hash
        Domicilio domicilio = armarDomicilio(datosDomicilio);
        
        //Le asigna un uid generado al azar al Domicilio
        domicilio.generarUid();
        
        //Persiste el Domicilio
        Fachada.getInstancia().grabar( domicilio );
              
     }
    
    public Vector<Domicilio> buscar(HashMap<String, Object> datosDomicilio) throws Db4oException {
        
    
     
        //Crea un Domicilio a partir de la Hash
        Domicilio domicilio = armarDomicilio(datosDomicilio);
        
        //TODO Busca Domicilio en la persistencia
        Vector<Domicilio> domicilios = null; 
//        domicilios = Fachada.getInstancia().buscarDomicilio( domicilio );
    
        return domicilios;
        
    }
    
    public void actualizar(HashMap<String, Object> datosDomicilio) throws Db4oException {
        
        //Crea un Domicilio a partir de la Hash
        Domicilio domicilio = armarDomicilio(datosDomicilio);
        
        //Persiste el Domicilio
        Fachada.getInstancia().actualizar( domicilio );
        
    }
    
    public void actualizar(Domicilio domicilio) throws Db4oException {
        
        //Persiste el Domicilio
        Fachada.getInstancia().actualizar( domicilio );
        
    }
    
    public void eliminar(HashMap<String, Object> datosDomicilio) throws Db4oException {
        
        //Crea un Domicilio a partir de la Hash
        Domicilio domicilio = armarDomicilio(datosDomicilio);
        
        //Persiste el Domicilio
        Fachada.getInstancia().borrar( domicilio );
        
    }
    
     public void eliminar(Domicilio domicilio) throws Db4oException {
        
        //Persiste el Domicilio
        Fachada.getInstancia().borrar( domicilio );
        
    }
    
    public Domicilio armarDomicilio(HashMap<String, Object> datosDomicilio){
        
        Domicilio domicilio = new Domicilio();
        
        //Recupera los datos del domicilio de una Hash y construye un Domicilio
        domicilio.setUid((String)datosDomicilio.get("uid"));
        domicilio.setCalle((String)datosDomicilio.get("calle"));
	domicilio.setDepartamento((String)datosDomicilio.get("departamento"));
	domicilio.setLocalidad((String)datosDomicilio.get("localidad"));
        domicilio.setNumero((String)datosDomicilio.get("numero"));
        domicilio.setPais((String)datosDomicilio.get("pais"));
        domicilio.setPiso((String) datosDomicilio.get("piso"));
        domicilio.setProvincia((String)datosDomicilio.get("provincia"));
        domicilio.setPersona((Persona) datosDomicilio.get("persona"));
        
        return domicilio;
    }

}
