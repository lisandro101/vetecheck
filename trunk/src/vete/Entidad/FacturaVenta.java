/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package vete.Entidad;

/**
 *
 * @author Lisandro
 */
public class FacturaVenta extends Factura{
    
    private Cliente cliente;
    private Vendedor vendedor;

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }
    

}
