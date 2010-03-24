package vete.Negocio;

import java.util.HashMap;
import java.util.List;
import vete.Entidad.Cliente;
import vete.Entidad.Telefono;
import vete.Persistencia.Repositorio;

/**
 *
 * @author Lisandro
 */
public class GestorCliente {

    static GestorCliente instancia = null;

    public GestorCliente() {
    }

    /**
     * Este método devuelve una instancia del GestorCliente.
     * @return GestorCliente
     */
    public static synchronized GestorCliente getInstancia() {

        //Si no existe una instancia del GestorCliente la crea
        if (instancia == null) {
            instancia = new GestorCliente();
        }

        return instancia;
    }

    public void ingresar(Cliente cliente) {

        //Le asigna un uid generado al azar al Cliente
        cliente.generarUid();

        //Persiste el Cliente
        Repositorio.getInstancia().grabar(cliente);

    }

    public List<Cliente> buscar(Cliente cliente) {

        //Busca Cliente en la persistencia
        List<Cliente> clientes = Repositorio.getInstancia().buscarCliente(cliente);

        return clientes;

    }

    public void actualizar(Cliente cliente) {

        //Persiste el Cliente
        Repositorio.getInstancia().actualizar(cliente);

    }

    public void eliminar(Cliente cliente) {

        //Persiste el Cliente
        Repositorio.getInstancia().borrar(cliente);

    }
    
}
