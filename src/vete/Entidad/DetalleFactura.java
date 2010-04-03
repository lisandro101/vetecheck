package vete.Entidad;

import java.io.Serializable;
import java.util.UUID;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import vete.Persistencia.IPersistente;

/**
 *
 * @author Lisandro
 */
@Entity
public class DetalleFactura implements IPersistente, Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private String uid;
    private double precio;
    private int cantidad;
    private double descuento;
    private boolean borrado;

    @ManyToOne
    private Articulo articulo;

    @Override
    public void generarUid() {
        if (getUid() == null) {
            setUid(UUID.randomUUID().toString());
        }
    }

    /**
     * @return the uid
     */
    public String getUid() {
        return uid;
    }

    /**
     * @param uid the uid to set
     */
    public void setUid(String uid) {
        this.uid = uid;
    }

    @Override
    public String toString() {
        return getArticulo().getNombre().toString();
    }

    @Override
    public void setBorrado(boolean borrado) {
        this.borrado = borrado;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @return the borrado
     */
    public boolean isBorrado() {
        return borrado;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * @return the cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @return the articulo
     */
    public Articulo getArticulo() {
        return articulo;
    }

    /**
     * @param articulo the articulo to set
     */
    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }

    /**
     * @return the descuento
     */
    public double getDescuento() {
        return descuento;
    }

    /**
     * @param descuento the descuento to set
     */
    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }
}
