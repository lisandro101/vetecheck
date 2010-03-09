/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package vete.Entidad;

import java.util.GregorianCalendar;
import java.util.UUID;
import java.util.Vector;
import vete.Interfaz.DetalleFactura;

/**
 *
 * @author Lisandro
 */
public class Factura {
    
    private String uid;
    private Double descuento;
    private GregorianCalendar fecha;
    private long numero;
    
    private Vector<DetalleFactura> detalles;
    private FormaDePago formaDePago;
    private Vector<Impuesto> impuestos;

    public Factura(){
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

    public Double getDescuento() {
        return descuento;
    }

    public void setDescuento(Double descuento) {
        this.descuento = descuento;
    }

    public GregorianCalendar getFecha() {
        return fecha;
    }

    public void setFecha(GregorianCalendar fecha) {
        this.fecha = fecha;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public Vector<DetalleFactura> getDetalles() {
        return detalles;
    }

    public void setDetalles(Vector<DetalleFactura> detalles) {
        this.detalles = detalles;
    }

    public FormaDePago getFormaDePago() {
        return formaDePago;
    }

    public void setFormaDePago(FormaDePago formaDePago) {
        this.formaDePago = formaDePago;
    }
    
    
    

}
