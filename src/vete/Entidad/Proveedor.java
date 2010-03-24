package vete.Entidad;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.OneToMany;

/**
 *
 * @author Lisandro
 */
@Entity
@Inheritance
public class Proveedor extends Persona{

    private static final long serialVersionUID = 1L;
    
    private String nombreFiscal;
    
    @OneToMany
    private List<Factura> facturas;
    @OneToMany
    private List<Articulo> articulos;

    
    
    public Proveedor(){
    }

    /**
     * @return the nombreFiscal
     */
    public String getNombreFiscal() {
        return nombreFiscal;
    }

    /**
     * @param nombreFiscal the nombreFiscal to set
     */
    public void setNombreFiscal(String nombreFiscal) {
        this.nombreFiscal = nombreFiscal;
    }

    /**
     * @return the facturas
     */
    public List<Factura> getFacturas() {
        return facturas;
    }

    /**
     * @param facturas the facturas to set
     */
    public void setFacturas(List<Factura> facturas) {
        this.facturas = facturas;
    }

    /**
     * @return the articulos
     */
    public List<Articulo> getArticulos() {
        return articulos;
    }

    /**
     * @param articulos the articulos to set
     */
    public void setArticulos(List<Articulo> articulos) {
        this.articulos = articulos;
    }
   
}
