/*
 * ControladorSeguridad.java
 * 
 * Created on 21/06/2007, 10:09:44
 * 
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package vete.Negocio;

import com.db4o.ext.Db4oException;
import java.util.HashMap;
import java.util.Vector;
import javax.swing.JOptionPane;
import vete.Constantes;
import vete.Entidad.Perfil;
import vete.Entidad.Permiso;
import vete.Entidad.Usuario;

/**
 *
 * @author Lisandro
 */
public class ControladorSeguridad {
    
    static ControladorSeguridad instancia = null;

    public ControladorSeguridad() {
    }
    
    public static synchronized ControladorSeguridad getInstancia() {
            
        if( instancia == null ) {
            instancia = new ControladorSeguridad();
        }
		
        return instancia;
        
    }	
    
    public String ingresarUsuario(HashMap<String,Object> datosUsuario) {
        
        
	String cadenaError = "";
    
	try {   
            GestorSeguridad.getInstancia().ingresarUsuario(datosUsuario);   
	} 
        catch (Db4oException db4oE) {
            cadenaError = "Se ha producido un error en la Base de Datos.";
	}
	catch (Exception e) {
            cadenaError = "Se ha producido un error.\n"+e.getMessage();
	}	
		
	return cadenaError;
	
    }
    
    public String ingresarPerfil(HashMap<String,Object> datosPerfil) {
        
        
	String cadenaError = "";
    
	try {   
            GestorSeguridad.getInstancia().ingresarPerfil(datosPerfil);   
	} 
        catch (Db4oException db4oE) {
            cadenaError = "Se ha producido un error en la Base de Datos.";
	}
	catch (Exception e) {
            cadenaError = "Se ha producido un error.\n"+e.getMessage();
	}	
		
	return cadenaError;
	
    }
    
    public String ingresarPermiso(HashMap<String,Object> datosPermiso) {
        
        
	String cadenaError = "";
    
	try {   
            GestorSeguridad.getInstancia().ingresarPermiso(datosPermiso);   
	} 
        catch (Db4oException db4oE) {
            cadenaError = "Se ha producido un error en la Base de Datos.";
	}
	catch (Exception e) {
            cadenaError = "Se ha producido un error.\n"+e.getMessage();
	}	
		
	return cadenaError;
	
    }
    
    public Vector<Usuario> buscarUsuario(HashMap<String, Object> datosUsuario) {
    
    	Vector<Usuario> usuario = null;
        
        try {   
            usuario = GestorSeguridad.getInstancia().buscarUsuario(datosUsuario);
	} 
        catch (Db4oException db4oE) {
           JOptionPane.showMessageDialog(null, "Error en la base de datos. No se pudo realizar la busqueda.",Constantes._ERROR, JOptionPane.ERROR_MESSAGE);
	}
	catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR. No se pudo realizar la busqueda.",Constantes._ERROR, JOptionPane.ERROR_MESSAGE);
	}	
        
        return usuario;
    
    }
    
    public Vector<Perfil> buscarPerfil(HashMap<String, Object> datosPerfil) {
    
    	Vector<Perfil> perfil = null;
        
        try {   
            perfil = GestorSeguridad.getInstancia().buscarPerfil(datosPerfil);
	} 
        catch (Db4oException db4oE) {
           JOptionPane.showMessageDialog(null, "Error en la base de datos. No se pudo realizar la busqueda.",Constantes._ERROR, JOptionPane.ERROR_MESSAGE);
	}
	catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR. No se pudo realizar la busqueda.",Constantes._ERROR, JOptionPane.ERROR_MESSAGE);
	}	
        
        return perfil;
    
    }
    
    public Vector<Perfil> buscarPerfil(Perfil perfil) {
    
    	Vector<Perfil> perfiles = null;
        
        try {   
            perfiles = GestorSeguridad.getInstancia().buscarPerfil(perfil);
	} 
        catch (Db4oException db4oE) {
           JOptionPane.showMessageDialog(null, "Error en la base de datos. No se pudo realizar la busqueda.",Constantes._ERROR, JOptionPane.ERROR_MESSAGE);
	}
	catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR. No se pudo realizar la busqueda.",Constantes._ERROR, JOptionPane.ERROR_MESSAGE);
	}	
        
        return perfiles;
    
    }
    
    public Vector<Permiso> buscarPermiso(HashMap<String, Object> datosPermiso) {
    
    	Vector<Permiso> permiso = null;
        
        try {   
            permiso = GestorSeguridad.getInstancia().buscarPermiso(datosPermiso);
	} 
        catch (Db4oException db4oE) {
           JOptionPane.showMessageDialog(null, "Error en la base de datos. No se pudo realizar la busqueda.",Constantes._ERROR, JOptionPane.ERROR_MESSAGE);
	}
	catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR. No se pudo realizar la busqueda.",Constantes._ERROR, JOptionPane.ERROR_MESSAGE);
	}	
        
        return permiso;
    
    }

}
