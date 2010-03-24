/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package vete.Entidad;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.ManyToOne;

/**
 *
 * @author Lisandro
 */
@Entity
@Inheritance
public class FacturaVenta extends Factura{

    private static final long serialVersionUID = 1L;
    
    @ManyToOne
    private Cliente cliente;
    @ManyToOne
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
