/*
 * GestorCliente.java
 * 
 * Created on 19/06/2007, 00:57:21
 * 
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package vete.Negocio;

import com.db4o.ext.Db4oException;
import java.util.HashMap;
import java.util.Vector;
import vete.Entidad.Cliente;
import vete.Entidad.Telefono;
import vete.Persistencia.Fachada;

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
    public static synchronized GestorCliente getInstancia() { //Aplicación del patron singleton
            
        //Si no existe una instancia del GestorCliente la crea
        if( instancia == null ) {
            instancia = new GestorCliente();
        }
		
        return instancia;
    }	
    
    public void ingresar(HashMap<String, Object> datosCliente) throws Db4oException {
        
        //Crea un Cliente a partir de la Hash
        Cliente cliente = armarCliente(datosCliente);
        
        //Le asigna un uid generado al azar al Cliente
        cliente.generarUid();
        
        //Persiste el Cliente
        Fachada.getInstancia().grabar( cliente );
              
     }
    
    public Vector<Cliente> buscar(HashMap<String, Object> datosCliente) throws Db4oException {
        
    
     
        //Crea un Cliente a partir de la Hash
        Cliente cliente = armarCliente(datosCliente);
        
        //Busca Cliente en la persistencia
//        Vector<Cliente> clientes = Fachada.getInstancia().buscarCliente( cliente );
//        FIXME
        Vector<Cliente> clientes = Fachada.getInstancia().buscarCliente( cliente );
    
        return clientes;
        
    }
    
    public void actualizar(HashMap<String, Object> datosCliente) throws Db4oException {
        
        //Crea un Cliente a partir de la Hash
        Cliente cliente = armarCliente(datosCliente);
        
        //Persiste el Cliente
        Fachada.getInstancia().actualizar( cliente );
        
    }
    
    public void actualizar(Cliente cliente) throws Db4oException {
        
        //Persiste el Cliente
        Fachada.getInstancia().actualizar( cliente );
        
    }
    
    public void eliminar(HashMap<String, Object> datosCliente) throws Db4oException {
        
        //Crea un Cliente a partir de la Hash
        Cliente cliente = armarCliente(datosCliente);
        
        //Persiste el Cliente
        Fachada.getInstancia().borrar( cliente );
        
    }
    
     public void eliminar(Cliente cliente) throws Db4oException {
        
        //Persiste el Cliente
        Fachada.getInstancia().borrar( cliente );
        
    }
    
    @SuppressWarnings("unchecked")
    public Cliente armarCliente(HashMap<String, Object> datosCliente){
        
        Cliente cliente = new Cliente();
        
        //Recupera los datos del cliente de una Hash y construye un Cliente
        cliente.setUid((String)datosCliente.get("uid"));
        cliente.setCodigo((String)datosCliente.get("codigo"));
	cliente.setNombre((String)datosCliente.get("nombre"));
	cliente.setCuit((String)datosCliente.get("cuit"));
        cliente.setMail((String)datosCliente.get("mail"));
        // cliente.setEstado((String)datosCliente.get("estado"));
        cliente.setDescuento((Double)datosCliente.get("descuento"));
        cliente.setEstadoDescuento((String) datosCliente.get("estadoDescuento"));
        cliente.setCondicionIva((String)datosCliente.get("condicionIva"));
        cliente.setDetalle((String)datosCliente.get("detalle"));
	//BETA Manejo del telefono
        cliente.setTelefono((Vector<Telefono>) datosCliente.get("telefono"));
        //BETA Manejo de domicilio
        cliente.setDomicilio(GestorDomicilio.getInstancia().armarDomicilio((HashMap) datosCliente.get("domicilio")));
        cliente.getDomicilio().setPersona(cliente);
        //TODO otros datos del cliente
        
        return cliente;
    }

}
