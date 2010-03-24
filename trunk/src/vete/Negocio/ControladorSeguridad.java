package vete.Negocio;

import java.util.List;
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

        if (instancia == null) {
            instancia = new ControladorSeguridad();
        }

        return instancia;

    }

    public String ingresarUsuario(Usuario usuario) {

        String cadenaError = "";

        GestorSeguridad.getInstancia().ingresarUsuario(usuario);

        return cadenaError;

    }

    public String ingresarPerfil(Perfil perfil) {

        String cadenaError = "";

        GestorSeguridad.getInstancia().ingresarPerfil(perfil);

        return cadenaError;
    }

    public String ingresarPermiso(Permiso permiso) {

        String cadenaError = "";

        GestorSeguridad.getInstancia().ingresarPermiso(permiso);

        return cadenaError;
    }

    public List<Usuario> buscarUsuario(Usuario usuario) {

        List<Usuario> usuarios = null;

        usuarios = GestorSeguridad.getInstancia().buscarUsuario(usuario);

        return usuarios;

    }

    public List<Perfil> buscarPerfil(Perfil perfil) {

        List<Perfil> perfiles = null;

        perfiles = GestorSeguridad.getInstancia().buscarPerfil(perfil);

        return perfiles;
    }

    public List<Permiso> buscarPermiso(Permiso permiso) {

        List<Permiso> permisos = null;

        permisos = GestorSeguridad.getInstancia().buscarPermiso(permiso);

        return permisos;
    }
}
