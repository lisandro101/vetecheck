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
public class FacturaCompra extends Factura{

    private static final long serialVersionUID = 1L;
    
    @ManyToOne
    private Proveedor proveedor;

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }
    

}
