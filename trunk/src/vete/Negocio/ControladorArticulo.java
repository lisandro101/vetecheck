/*
 * ControladorArticulo.java
 * 
 * Created on 19/06/2007, 16:09:26
 * 
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */
package vete.Negocio;

import java.util.List;
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

        if (instancia == null) {
            instancia = new ControladorArticulo();
        }

        return instancia;

    }

    public String ingresar(Articulo datosArticulo) {

        String cadenaError = "";

        GestorArticulo.getInstancia().ingresar(datosArticulo);

        return cadenaError;
    }

    public List<Articulo> buscar(Articulo datosArticulo) {

        List<Articulo> art = null;

        art = GestorArticulo.getInstancia().buscar(datosArticulo);

        return art;
    }

    public String actualizar(Articulo articulo) {

        String cadenaError = "";

        GestorArticulo.getInstancia().actualizar(articulo);

        return cadenaError;

    }

    public String borrar(Articulo articulo) {

        String cadenaError = "";

        GestorArticulo.getInstancia().eliminar(articulo);

        return cadenaError;

    }
}
