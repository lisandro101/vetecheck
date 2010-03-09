/*
 * Cliente.java
 *
 * Created on 18/06/2007, 17:52:34
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package vete.Entidad;

import java.util.Vector;

/**
 *
 * @author Lisandro
 */
public class Cliente extends Persona{
   
    private String condicionIva;    
    
    private Vector<FacturaVenta> facturas;
    
    
    
    /** Constructor por defecto */
    public Cliente() {
        super();
        this.setCondicionIva("");
    }

    public String getCondicionIva() {
        return condicionIva;
    }

    public void setCondicionIva(String condicionIva) {
        
        if (condicionIva == null) {
            this.condicionIva = "";            
        }
        else {
            this.condicionIva = condicionIva;
        }
        
    }
    
    public Vector<FacturaVenta> getFacturas() {
        return facturas;
    }

    public void setFacturas(Vector<FacturaVenta> facturas) {
        this.facturas = facturas;
    }

}
