package vete.Negocio;

import java.util.HashMap;
import java.util.List;
import vete.Entidad.Persona;
import vete.Entidad.Telefono;
import vete.Persistencia.FachadaPersistencia;

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
    
    public void ingresar(HashMap<String, Object> datosPersona) {
        
        //Crea un Persona a partir de la Hash
        Persona persona = armarPersona(datosPersona);
        
        //Le asigna un uid generado al azar al Persona
        persona.generarUid();
        
        //Persiste el Persona
        FachadaPersistencia.getInstancia().grabar( persona );
              
     }
    
    public List<Persona> buscar(HashMap<String, Object> datosPersona) {
        
    
     
        //Crea un Persona a partir de la Hash
        Persona persona = armarPersona(datosPersona);
        
        //Busca Persona en la persistencia
//        Vector<Persona> personas = Fachada.getInstancia().buscarPersona( persona );
//        FIXME
        List<Persona> personas = FachadaPersistencia.getInstancia().buscarPersona( persona );
    
        return personas;
        
    }
    
    public void actualizar(HashMap<String, Object> datosPersona) {
        
        //Crea un Persona a partir de la Hash
        Persona persona = armarPersona(datosPersona);
        
        //Persiste el Persona
        FachadaPersistencia.getInstancia().actualizar( persona );
        
    }
    
    public void actualizar(Persona persona) {
        
        //Persiste el Persona
        FachadaPersistencia.getInstancia().actualizar( persona );
        
    }
    
    public void eliminar(HashMap<String, Object> datosPersona) {
        
        //Crea un Persona a partir de la Hash
        Persona persona = armarPersona(datosPersona);
        
        FachadaPersistencia.getInstancia().borrar( persona );
        
    }
    
     public void eliminar(Persona persona) {
        
        FachadaPersistencia.getInstancia().borrar( persona );
        
    }
    
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
        persona.setTelefonos((List<Telefono>) datosPersona.get("telefono"));
        //BETA Manejo de domicilio
        persona.setDomicilio(GestorDomicilio.getInstancia().armarDomicilio((HashMap) datosPersona.get("domicilio")));
        //TODO otros datos del persona
        
        return persona;
    }

}
