package vete.Negocio;

import java.util.List;
import vete.Entidad.Articulo;
import vete.Persistencia.Repositorio;

/**
 *
 * @author Lisandro
 */
public class GestorArticulo {

    static GestorArticulo instancia = null;

    public GestorArticulo() {
    }

    /**
     * Este método devuelve una instancia del GestorArticulo.
     * @return GestorArticulo
     */
    public static synchronized GestorArticulo getInstancia() {

        //Si no existe una instancia del GestorArticulo la crea
        if (instancia == null) {
            instancia = new GestorArticulo();
        }

        return instancia;
    }

    public void ingresar(Articulo articulo) {

        //Le asigna un uid generado al azar al Articulo
        articulo.generarUid();

        //Persiste el Articulo
        Repositorio.getInstancia().grabar(articulo);

    }

    public List<Articulo> buscar(Articulo articulo) {

        //Busca Articulo en la persistencia
        List<Articulo> articulos = Repositorio.getInstancia().buscarArticulo(articulo);

        return articulos;

    }

    public void actualizar(Articulo articulo) {

        //Persiste el Articulo
        Repositorio.getInstancia().actualizar(articulo);

    }

    public void eliminar(Articulo articulo) {

        //Persiste el Articulo
        Repositorio.getInstancia().borrar(articulo);

    }

}
