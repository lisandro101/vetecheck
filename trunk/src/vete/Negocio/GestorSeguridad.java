package vete.Negocio;

import java.util.List;
import javax.swing.JOptionPane;
import vete.Entidad.Perfil;
import vete.Entidad.Permiso;
import vete.Entidad.Usuario;
import vete.Persistencia.Repositorio;

/**
 *
 * @author Lisandro
 */
public class GestorSeguridad {

    private static GestorSeguridad instancia = null;

    public GestorSeguridad() {
    }

    public static synchronized GestorSeguridad getInstancia() {

        if (instancia == null) {
            instancia = new GestorSeguridad();
        }

        return instancia;
    }

    public void ingresarUsuario(Usuario usuario) {

        //Le asigna un uid generado al azar al Usuario
        usuario.generarUid();

        //Persiste el Usuario
        Repositorio.getInstancia().grabar(usuario);
    }

    public void ingresarPerfil(Perfil perfil) {

        //Le asigna un uid generado al azar al Perfil
        perfil.generarUid();

        //Persiste el Usuario
        Repositorio.getInstancia().grabar(perfil);
    }

    public void ingresarPermiso(Permiso permiso) {

        //Le asigna un uid generado al azar al Permiso
        permiso.generarUid();

        //Persiste el Usuario
        Repositorio.getInstancia().grabar(permiso);
    }

    public List<Usuario> buscarUsuario(Usuario usuario) {

        //Busca Cliente en la persistencia
        List<Usuario> usuarios = Repositorio.getInstancia().buscarUsuario(usuario);

        return usuarios;

    }

    public List<Perfil> buscarPerfil(Perfil perfil) {

        //Busca Perfil en la persistencia
        List<Perfil> perfiles = Repositorio.getInstancia().buscarPerfil(perfil);

        return perfiles;

    }

    public List<Permiso> buscarPermiso(Permiso permiso) {

        //Busca Cliente en la persistencia
        List<Permiso> permisos = Repositorio.getInstancia().buscarPermiso(permiso);

        return permisos;

    }

    public boolean tienePermiso(Usuario usuario, String objeto, String tipoPermiso) {

        boolean puede = false;

        List<Permiso> permisos = usuario.getPerfil().getPermisos();

        for (int i = 0; i <= permisos.size() - 1; i++) {

            Permiso permiso = permisos.get(i);

            if (permiso.getObjeto().equals(objeto)) {

                if (tipoPermiso.equals("INSERTAR")) {
                    puede = permiso.getInsertar();
                } else if (tipoPermiso.equals("ACTUALIZAR")) {
                    puede = permiso.getActualizar();
                } else if (tipoPermiso.equals("LEER")) {
                    puede = permiso.getLeer();
                } else if (tipoPermiso.equals("BORRAR")) {
                    puede = permiso.getBorrar();
                } else {
                    JOptionPane.showMessageDialog(null, "ERROR. Permiso no existente.", "Consulta Permiso", JOptionPane.ERROR_MESSAGE);
                }

            }

        }

        return puede;

    }
}
