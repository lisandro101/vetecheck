/*
 * GestorPersona.java
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
import vete.Entidad.Persona;
import vete.Entidad.Telefono;
import vete.Persistencia.Fachada;

/**
 *
 * @author Lisandro
 */
public class GestorPersona {
    
    static GestorPersona instancia = null;

    public GestorPersona() {
    }
    
    /**
     * Este método devuelve una instancia del GestorPersona.
     * @return GestorPersona
     */  
    public static synchronized GestorPersona getInstancia() { //Aplicación del patron singleton
            
        //Si no existe una instancia del GestorPersona la crea
        if( instancia == null ) {
            instancia = new GestorPersona();
        }
		
        return instancia;
    }	
    
    public void ingresar(HashMap<String, Object> datosPersona) throws Db4oException {
        
        //Crea un Persona a partir de la Hash
        Persona persona = armarPersona(datosPersona);
        
        //Le asigna un uid generado al azar al Persona
        persona.generarUid();
        
        //Persiste el Persona
        Fachada.getInstancia().grabar( persona );
              
     }
    
    public Vector<Persona> buscar(HashMap<String, Object> datosPersona) throws Db4oException {
        
    
     
        //Crea un Persona a partir de la Hash
        Persona persona = armarPersona(datosPersona);
        
        //Busca Persona en la persistencia
//        Vector<Persona> personas = Fachada.getInstancia().buscarPersona( persona );
//        FIXME
        Vector<Persona> personas = Fachada.getInstancia().buscarPersona( persona );
    
        return personas;
        
    }
    
    public void actualizar(HashMap<String, Object> datosPersona) throws Db4oException {
        
        //Crea un Persona a partir de la Hash
        Persona persona = armarPersona(datosPersona);
        
        //Persiste el Persona
        Fachada.getInstancia().actualizar( persona );
        
    }
    
    public void actualizar(Persona persona) throws Db4oException {
        
        //Persiste el Persona
        Fachada.getInstancia().actualizar( persona );
        
    }
    
    public void eliminar(HashMap<String, Object> datosPersona) throws Db4oException {
        
        //Crea un Persona a partir de la Hash
        Persona persona = armarPersona(datosPersona);
        
        //Persiste el Persona
        Fachada.getInstancia().borrar( persona );
        
    }
    
     public void eliminar(Persona persona) throws Db4oException {
        
        //Persiste el Persona
        Fachada.getInstancia().borrar( persona );
        
    }
    
    @SuppressWarnings("unchecked")
    public Persona armarPersona(HashMap<String, Object> datosPersona){
        
        Persona persona = new Persona();
        
        //Recupera los datos del persona de una Hash y construye un Persona
        persona.setUid((String)datosPersona.get("uid"));
        persona.setCodigo((String)datosPersona.get("codigo"));
	persona.setNombre((String)datosPersona.get("nombre"));
	persona.setCuit((String)datosPersona.get("cuit"));
        persona.setMail((String)datosPersona.get("mail"));
        // persona.setEstado((String)datosPersona.get("estado"));
        persona.setDescuento((Double)datosPersona.get("descuento"));
        persona.setEstadoDescuento((String) datosPersona.get("estadoDescuento"));
//        persona.setCondicionIva((String)datosPersona.get("condicionIva"));
        persona.setDetalle((String)datosPersona.get("detalle"));
	//BETA Manejo del telefono
        persona.setTelefono((Vector<Telefono>) datosPersona.get("telefono"));
        //BETA Manejo de domicilio
        persona.setDomicilio(GestorDomicilio.getInstancia().armarDomicilio((HashMap) datosPersona.get("domicilio")));
        persona.getDomicilio().setPersona(persona);
        //TODO otros datos del persona
        
        return persona;
    }

}
