/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package vete.Entidad;

import java.util.UUID;
import java.util.Vector;
import vete.Interfaz.DetalleFactura;

/**
 *
 * @author Silvina
 */



public class Articulo {
    
    private String uid;
    private String codigo;
    private String nombre;
    private String rubro;
    private Double costo;
    private Double precio;
    private Double margen;
    private String estadoMargen;
//    private String impuesto;
    private Double stock;
    private Double minimo;
    private Double maximo;
    private String detalle;
    
    private Vector<Lote> lotes; 
    private Vector<Rubro> rubros;
    private Vector<DetalleFactura> detallesFactura;
    private Vector<Proveedor> proveedores;
    
    

    public Articulo(){
    }
    
    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public void generarUid(){
        if( getUid() == null ) {
            setUid(UUID.randomUUID().toString());
        }
    }
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRubro() {
        return rubro;
    }

    public void setRubro(String rubro) {
        this.rubro = rubro;
    }

    public Double getCosto() {
        return costo;
    }

    public void setCosto(Double costo) {
        this.costo = costo;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Double getMargen() {
        return margen;
    }

    public void setMargen(Double margen) {
        this.margen = margen;
    }

    public Double getStock() {
        return stock;
    }

    public void setStock(Double stock) {
        this.stock = stock;
    }

    public Double getMinimo() {
        return minimo;
    }

    public void setMinimo(Double minimo) {
        this.minimo = minimo;
    }

    public Double getMaximo() {
        return maximo;
    }

    public void setMaximo(Double maximo) {
        this.maximo = maximo;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public String getEstadoMargen() {
        return estadoMargen;
    }

    public void setEstadoMargen(String estadoMargen) {
        this.estadoMargen = estadoMargen;
    }

    public Vector<Lote> getLotes() {
        return lotes;
    }

    public void setLotes(Vector<Lote> lotes) {
        this.lotes = lotes;
    }

    public Vector<Rubro> getRubros() {
        return rubros;
    }

    public void setRubros(Vector<Rubro> rubros) {
        this.rubros = rubros;
    }

    public Vector<DetalleFactura> getDetallesFactura() {
        return detallesFactura;
    }

    public void setDetallesFactura(Vector<DetalleFactura> detallesFactura) {
        this.detallesFactura = detallesFactura;
    }

    public Vector<Proveedor> getProveedores() {
        return proveedores;
    }

    public void setProveedores(Vector<Proveedor> proveedores) {
        this.proveedores = proveedores;
    }

}
