/*
 * GestorSeguridad.java
 * 
 * Created on 21/06/2007, 09:38:01
 * 
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */
package vete.Negocio;

import java.util.HashMap;
import java.util.List;
import javax.swing.JOptionPane;
import vete.Entidad.Perfil;
import vete.Entidad.Permiso;
import vete.Entidad.Usuario;
import vete.Persistencia.FachadaPersistencia;

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

    public void ingresarUsuario(HashMap<String, Object> datosUsuario) {

        //Crea un Usuario a partir de la Hash
        Usuario usuario = armarUsuario(datosUsuario);

        //Le asigna un uid generado al azar al Usuario
        usuario.generarUid();

        //Persiste el Usuario
        FachadaPersistencia.getInstancia().grabar(usuario);
    }

    public void ingresarPerfil(HashMap<String, Object> datosPerfil) {

        //Crea un Perfil a partir de la Hash
        Perfil perfil = armarPerfil(datosPerfil);

        //Le asigna un uid generado al azar al Perfil
        perfil.generarUid();

        //Persiste el Usuario
        FachadaPersistencia.getInstancia().grabar(perfil);
    }

    public void ingresarPermiso(HashMap<String, Object> datosPermiso) {

        //Crea un Permiso a partir de la Hash
        Permiso permiso = armarPermiso(datosPermiso);

        //Le asigna un uid generado al azar al Permiso
        permiso.generarUid();

        //Persiste el Usuario
        FachadaPersistencia.getInstancia().grabar(permiso);
    }

    public Usuario armarUsuario(HashMap<String, Object> datosUsuario) {

        Usuario usuario = new Usuario();

        //Recupera los datos del usuario de una Hash y construye un Usuario
        usuario.setNombre((String) datosUsuario.get("nombre"));
        usuario.setContrasenia((String) datosUsuario.get("contrasenia"));
        //usuario.setPerfil((Perfil)datosUsuario.get("perfil"));

        return usuario;
    }

    public Perfil armarPerfil(HashMap<String, Object> datosPerfil) {

        Perfil perfil = new Perfil();

        //Recupera los datos del perfil de una Hash y construye un Perfil
        perfil.setNombre((String) datosPerfil.get("nombre"));
        perfil.setDescripcion((String) datosPerfil.get("descripcion"));
        perfil.setPermisos((List<Permiso>) datosPerfil.get("permisos"));


        return perfil;
    }

    public Permiso armarPermiso(HashMap<String, Object> datosPermiso) {

        Permiso permiso = new Permiso();

        //Recupera los datos del permiso de una Hash y construye un Permiso
        permiso.setObjeto((String) datosPermiso.get("objeto"));
        permiso.setLeer((Boolean) datosPermiso.get("leer"));
        permiso.setInsertar((Boolean) datosPermiso.get("insertar"));
        permiso.setActualizar((Boolean) datosPermiso.get("actualizar"));
        permiso.setBorrar((Boolean) datosPermiso.get("borrar"));

        return permiso;
    }

    public List<Usuario> buscarUsuario(HashMap<String, Object> datosUsuario) {



        //Crea un Usuario a partir de la Hash
        Usuario usuario = armarUsuario(datosUsuario);

        //Busca Cliente en la persistencia
        List<Usuario> usuarios = FachadaPersistencia.getInstancia().buscarUsuario(usuario);

        return usuarios;

    }

    public List<Perfil> buscarPerfil(HashMap<String, Object> datosPerfil) {



        //Crea un Perfil a partir de la Hash
        Perfil perfil = armarPerfil(datosPerfil);

        //Busca Cliente en la persistencia
        List<Perfil> perfiles = FachadaPersistencia.getInstancia().buscarPerfil(perfil);

        return perfiles;

    }

    public List<Perfil> buscarPerfil(Perfil perfil) {

        //Busca Perfil en la persistencia
        List<Perfil> perfiles = FachadaPersistencia.getInstancia().buscarPerfil(perfil);

        return perfiles;

    }

    public List<Permiso> buscarPermiso(HashMap<String, Object> datosPermiso) {



        //Crea un Permiso a partir de la Hash
        Permiso permiso = armarPermiso(datosPermiso);

        //Busca Cliente en la persistencia
        List<Permiso> permisos = FachadaPersistencia.getInstancia().buscarPermiso(permiso);

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
