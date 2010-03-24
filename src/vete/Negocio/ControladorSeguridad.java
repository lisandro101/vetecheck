package vete.Negocio;

import java.util.HashMap;
import java.util.List;
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
    
    public String ingresarUsuario(Usuario usuario) {
        
        
	String cadenaError = "";
    
	try {   
            GestorSeguridad.getInstancia().ingresarUsuario(usuario);
	} 
        catch (Db4oException db4oE) {
            cadenaError = "Se ha producido un error en la Base de Datos.";
	}
	catch (Exception e) {
            cadenaError = "Se ha producido un error.\n"+e.getMessage();
	}	
		
	return cadenaError;
	
    }
    
    public String ingresarPerfil(Perfil perfil) {
        
        
	String cadenaError = "";
    
	try {   
            GestorSeguridad.getInstancia().ingresarPerfil(perfil);
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
    
    public List<Usuario> buscarUsuario(HashMap<String, Object> datosUsuario) {
    
    	List<Usuario> usuario = null;
        
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
    
    public List<Perfil> buscarPerfil(HashMap<String, Object> datosPerfil) {
    
    	List<Perfil> perfil = null;
        
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
    
    public List<Perfil> buscarPerfil(Perfil perfil) {
    
    	List<Perfil> perfiles = null;
        
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
    
    public List<Permiso> buscarPermiso(HashMap<String, Object> datosPermiso) {
    
    	List<Permiso> permiso = null;
        
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
