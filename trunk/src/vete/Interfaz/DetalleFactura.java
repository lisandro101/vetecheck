/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package vete.Interfaz;

import java.util.UUID;
import vete.Entidad.Articulo;

/**
 *
 * @author Lisandro
 */
public class DetalleFactura {
    
    private String uid;
    private int cantidad;
    private double descuento;
    private double precio;
    private Articulo articulo;

    public DetalleFactura(){    
    }
    
    public void generarUid(){
        if( getUid() == null ) {
            setUid(UUID.randomUUID().toString());
        }
    }
    
    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }

}
