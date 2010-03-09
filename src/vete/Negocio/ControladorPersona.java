/*
 * ControladorPersona.java
 * 
 * Created on 19/06/2007, 16:09:26
 * 
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package vete.Negocio;

import com.db4o.ext.Db4oException;
import java.util.HashMap;
import java.util.Vector;
import javax.swing.JOptionPane;
import vete.Entidad.Persona;

/**
 *
 * @author Lisandro
 */
public class ControladorPersona {
    
    static ControladorPersona instancia = null;
    
    
    public ControladorPersona() {
    }
    
    public static synchronized ControladorPersona getInstancia() {
            
        if( instancia == null ) {
            instancia = new ControladorPersona();
        }
		
        return instancia;
        
    }	
    
    public String ingresar(HashMap<String,Object> datosPersona) {
        
        
	String cadenaError = "";
    
	try {   
            GestorPersona.getInstancia().ingresar(datosPersona);   
	} 
        catch (Db4oException db4oE) {
            cadenaError = "Se ha producido un error en la Base de Datos."+"\n"+db4oE.toString();
	}
	catch (Exception e) {
            cadenaError = "Se ha producido un error."+"\n"+e.toString();
	}	
		
	return cadenaError;
	
    }
    
    public Vector<Persona> buscar(HashMap<String, Object> datosPersona) {
    
    	Vector<Persona> per = null;
        
        try {   
            per = GestorPersona.getInstancia().buscar(datosPersona);
	} 
        catch (Db4oException db4oE) {
           JOptionPane.showMessageDialog(null, "Error en la base de datos. No se pudo realizar la busqueda."+"\n"+db4oE.toString(),"ERROR", JOptionPane.ERROR_MESSAGE);
	}
	catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR. No se pudo realizar la busqueda."+"\n"+e.toString(),"ERROR", JOptionPane.ERROR_MESSAGE);
	}	
        
        return per;
    
    }
    
    public String actualizar(HashMap<String, Object> datosPersona) {
        
        String cadenaError = "";
    
	try {   
            GestorPersona.getInstancia().actualizar( datosPersona );
	} 
        catch (Db4oException db4oE) {
            cadenaError = "Se ha producido un error en la Base de Datos."+"\n"+db4oE.toString();
	}
	catch (Exception e) {
            cadenaError = "Se ha producido un error."+"\n"+e.toString();
	}	
		
	return cadenaError;
                
    }
    
    public String actualizar(Persona persona) {
        
        String cadenaError = "";
    
	try {   
            GestorPersona.getInstancia().actualizar( persona );
	} 
        catch (Db4oException db4oE) {
            cadenaError = "Se ha producido un error en la Base de Datos."+"\n"+db4oE.toString();
	}
	catch (Exception e) {
            cadenaError = "Se ha producido un error."+"\n"+e.toString();
	}	
		
	return cadenaError;
                
    }
    
    public String borrar(HashMap<String, Object> datosPersona) {
    
        String cadenaError = "";
    
	try {   
            GestorPersona.getInstancia().eliminar( datosPersona );
	} 
        catch (Db4oException db4oE) {
            cadenaError = "Se ha producido un error en la Base de Datos."+"\n"+db4oE.toString();
	}
	catch (Exception e) {
            cadenaError = "Se ha producido un error."+"\n"+e.toString();
	}	
		
	return cadenaError;
           
    }
    
    public String borrar(Persona persona) {
    
        String cadenaError = "";
    
	try {   
            GestorPersona.getInstancia().eliminar( persona );
	} 
        catch (Db4oException db4oE) {
            cadenaError = "Se ha producido un error en la Base de Datos."+"\n"+db4oE.toString();
	}
	catch (Exception e) {
            cadenaError = "Se ha producido un error."+"\n"+e.toString();
	}	
		
	return cadenaError;
           
    }

}
