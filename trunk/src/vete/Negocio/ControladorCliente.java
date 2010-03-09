/*
 * ControladorCliente.java
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
import vete.Entidad.Cliente;

/**
 *
 * @author Lisandro
 */
public class ControladorCliente {
    
    static ControladorCliente instancia = null;
    
    
    public ControladorCliente() {
    }
    
    public static synchronized ControladorCliente getInstancia() {
            
        if( instancia == null ) {
            instancia = new ControladorCliente();
        }
		
        return instancia;
        
    }	
    
    public String ingresar(HashMap<String,Object> datosCliente) {
        
        
	String cadenaError = "";
    
	try {   
            GestorCliente.getInstancia().ingresar(datosCliente);   
	} 
        catch (Db4oException db4oE) {
            cadenaError = "Se ha producido un error en la Base de Datos."+"\n"+db4oE.toString();
	}
	catch (Exception e) {
            cadenaError = "Se ha producido un error."+"\n"+e.toString();
	}	
		
	return cadenaError;
	
    }
    
    public Vector<Cliente> buscar(HashMap<String, Object> datosCliente) {
    
    	Vector<Cliente> cli = null;
        
        try {   
            cli = GestorCliente.getInstancia().buscar(datosCliente);
	} 
        catch (Db4oException db4oE) {
           JOptionPane.showMessageDialog(null, "Error en la base de datos. No se pudo realizar la busqueda."+"\n"+db4oE.toString(),"ERROR", JOptionPane.ERROR_MESSAGE);
	}
	catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR. No se pudo realizar la busqueda."+"\n"+e.toString(),"ERROR", JOptionPane.ERROR_MESSAGE);
	}	
        
        return cli;
    
    }
    
    public String actualizar(HashMap<String, Object> datosCliente) {
        
        String cadenaError = "";
    
	try {   
            GestorCliente.getInstancia().actualizar( datosCliente );
	} 
        catch (Db4oException db4oE) {
            cadenaError = "Se ha producido un error en la Base de Datos."+"\n"+db4oE.toString();
	}
	catch (Exception e) {
            cadenaError = "Se ha producido un error."+"\n"+e.toString();
	}	
		
	return cadenaError;
                
    }
    
    public String actualizar(Cliente cliente) {
        
        String cadenaError = "";
    
	try {   
            GestorCliente.getInstancia().actualizar( cliente );
	} 
        catch (Db4oException db4oE) {
            cadenaError = "Se ha producido un error en la Base de Datos."+"\n"+db4oE.toString();
	}
	catch (Exception e) {
            cadenaError = "Se ha producido un error."+"\n"+e.toString();
	}	
		
	return cadenaError;
                
    }
    
    public String borrar(HashMap<String, Object> datosCliente) {
    
        String cadenaError = "";
    
	try {   
            GestorCliente.getInstancia().eliminar( datosCliente );
	} 
        catch (Db4oException db4oE) {
            cadenaError = "Se ha producido un error en la Base de Datos."+"\n"+db4oE.toString();
	}
	catch (Exception e) {
            cadenaError = "Se ha producido un error."+"\n"+e.toString();
	}	
		
	return cadenaError;
           
    }
    
    public String borrar(Cliente cliente) {
    
        String cadenaError = "";
    
	try {   
            GestorCliente.getInstancia().eliminar( cliente );
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
