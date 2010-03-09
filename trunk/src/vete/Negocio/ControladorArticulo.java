/*
 * ControladorArticulo.java
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
import vete.Entidad.Articulo;

/**
 *
 * @author Lisandro
 */
public class ControladorArticulo {
    
    static ControladorArticulo instancia = null;
    
    
    public ControladorArticulo() {
    }
    
    public static synchronized ControladorArticulo getInstancia() {
            
        if( instancia == null ) {
            instancia = new ControladorArticulo();
        }
		
        return instancia;
        
    }	
    
    public String ingresar(HashMap<String,Object> datosArticulo) {
        
        
	String cadenaError = "";
    
	try {   
            GestorArticulo.getInstancia().ingresar(datosArticulo);   
	} 
        catch (Db4oException db4oE) {
            cadenaError = "Se ha producido un error en la Base de Datos."+"\n"+db4oE.toString();
	}
	catch (Exception e) {
            cadenaError = "Se ha producido un error."+"\n"+e.toString();
	}	
		
	return cadenaError;
	
    }
    
    public Vector<Articulo> buscar(HashMap<String, Object> datosArticulo) {
    
    	Vector<Articulo> art = null;
        
        try {   
            art = GestorArticulo.getInstancia().buscar(datosArticulo);
	} 
        catch (Db4oException db4oE) {
           JOptionPane.showMessageDialog(null, "Error en la base de datos. No se pudo realizar la busqueda."+"\n"+db4oE.toString(),"ERROR", JOptionPane.ERROR_MESSAGE);
	}
	catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR. No se pudo realizar la busqueda."+"\n"+e.toString(),"ERROR", JOptionPane.ERROR_MESSAGE);
	}	
        
        return art;
    
    }
    
    public String actualizar(HashMap<String, Object> datosArticulo) {
        
        String cadenaError = "";
    
	try {   
            GestorArticulo.getInstancia().actualizar( datosArticulo );
	} 
        catch (Db4oException db4oE) {
            cadenaError = "Se ha producido un error en la Base de Datos."+"\n"+db4oE.toString();
	}
	catch (Exception e) {
            cadenaError = "Se ha producido un error."+"\n"+e.toString();
	}	
		
	return cadenaError;
                
    }
    
    public String actualizar(Articulo articulo) {
        
        String cadenaError = "";
    
	try {   
            GestorArticulo.getInstancia().actualizar( articulo );
	} 
        catch (Db4oException db4oE) {
            cadenaError = "Se ha producido un error en la Base de Datos."+"\n"+db4oE.toString();
	}
	catch (Exception e) {
            cadenaError = "Se ha producido un error."+"\n"+e.toString();
	}	
		
	return cadenaError;
                
    }
    
    public String borrar(HashMap<String, Object> datosArticulo) {
    
        String cadenaError = "";
    
	try {   
            GestorArticulo.getInstancia().eliminar( datosArticulo );
	} 
        catch (Db4oException db4oE) {
            cadenaError = "Se ha producido un error en la Base de Datos."+"\n"+db4oE.toString();
	}
	catch (Exception e) {
            cadenaError = "Se ha producido un error."+"\n"+e.toString();
	}	
		
	return cadenaError;
           
    }
    
    public String borrar(Articulo articulo) {
    
        String cadenaError = "";
    
	try {   
            GestorArticulo.getInstancia().eliminar( articulo );
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
