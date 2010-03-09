/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package vete.Entidad;

import java.util.Vector;

/**
 *
 * @author Lisandro
 */
public class Proveedor extends Persona{
    
    private String nombreFiscal;
    
    private Vector<Factura> facturas;
    private Vector<Articulo> articulos;

    
    
    public Proveedor(){
    }

    public String getNombreFiscal() {
        return nombreFiscal;
    }

    public void setNombreFiscal(String nombreFiscal) {
        this.nombreFiscal = nombreFiscal;
    }

    public Vector<Factura> getFacturas() {
        return facturas;
    }

    public void setFacturas(Vector<Factura> facturas) {
        this.facturas = facturas;
    }

    public Vector<Articulo> getArticulos() {
        return articulos;
    }

    public void setArticulos(Vector<Articulo> articulos) {
        this.articulos = articulos;
    }
   
}
