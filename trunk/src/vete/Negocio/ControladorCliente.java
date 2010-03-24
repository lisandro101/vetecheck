package vete.Negocio;

import java.util.List;
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

        if (instancia == null) {
            instancia = new ControladorCliente();
        }

        return instancia;

    }

    public String ingresar(Cliente datosCliente) {

        String cadenaError = "";

        GestorCliente.getInstancia().ingresar(datosCliente);

        return cadenaError;
    }

    public List<Cliente> buscar(Cliente datosCliente) {

        List<Cliente> cli = null;

        cli = GestorCliente.getInstancia().buscar(datosCliente);

        return cli;
    }

    public String actualizar(Cliente cliente) {

        String cadenaError = "";

        GestorCliente.getInstancia().actualizar(cliente);

        return cadenaError;

    }

    public String borrar(Cliente cliente) {

        String cadenaError = "";

        GestorCliente.getInstancia().eliminar(cliente);

        return cadenaError;
    }
}
