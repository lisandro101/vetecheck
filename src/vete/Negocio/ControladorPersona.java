package vete.Negocio;

import java.util.List;
import vete.Entidad.Persona;

/**
 *
 * @author Lisandro
 */
public class ControladorPersona {

    static ControladorPersona instancia = null;

    public ControladorPersona() {
    }

    public static synchronized ControladorPersona getInstancia() {

        if (instancia == null) {
            instancia = new ControladorPersona();
        }

        return instancia;

    }

    public String ingresar(Persona persona) {

        String cadenaError = "";

        GestorPersona.getInstancia().ingresar(persona);

        return cadenaError;

    }

    public List<Persona> buscar(Persona persona) {

        List<Persona> personas = null;

        personas = GestorPersona.getInstancia().buscar(persona);

        return personas;
    }

    public String actualizar(Persona persona) {

        String cadenaError = "";

        GestorPersona.getInstancia().actualizar(persona);

        return cadenaError;

    }

    public String borrar(Persona persona) {

        String cadenaError = "";

        GestorPersona.getInstancia().eliminar(persona);

        return cadenaError;
    }
}
