/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package vete.Entidad;

import java.util.UUID;
import java.util.Vector;

/**
 *
 * @author Lisandro
 */
public class Persona {
    
    private String uid;
    private String codigo;
    private String cuit;
    private Double descuento;
    private String estadoDescuento;
    private String estado;
    private String mail;
    private String nombre;
    private String detalle;
    
    
    private Vector<Telefono> telefono;
    private Domicilio domicilio;
    
    
    
    public Persona(){
        
        this.setCodigo("");
        this.setCuit("");
        this.setDescuento(0d);
        this.setDetalle("");
        this.setEstado("");
        this.setEstadoDescuento("");
        this.setMail("");
        this.setNombre("");
        
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

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        
        if (codigo == null) {
            this.codigo = "";            
        }
        else {
            this.codigo = codigo;
        }
        
    }

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        
        if (getCodigo() == null) {
            this.setCodigo("");            
        }
        else {
            this.cuit = cuit;
        }
        
    }

    public Double getDescuento() {
        return descuento;
    }

    public void setDescuento(Double descuento) {
        
        if (descuento == null) {
            this.descuento = new Double(0d);            
        }
        else {
            this.descuento = descuento;
        }
        
    }

    public String getEstadoDescuento() {
        return estadoDescuento;
    }

    public void setEstadoDescuento(String estadoDescuento) {
        this.estadoDescuento = estadoDescuento;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        
        if (estado == null) {
            this.estado = "";            
        }
        else {
            this.estado = estado;
        }
        
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        
        if (mail == null) {
            this.mail = "";            
        }
        else {
            this.mail = mail;
        }
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        
        if (nombre == null) {
            this.nombre = "";            
        }
        else {
            this.nombre = nombre;
        }
        
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        
        if (detalle == null) {
            this.detalle = "";            
        }
        else {
            this.detalle = detalle;
        }
        
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    public Vector<Telefono> getTelefono() {
        return telefono;
    }

    public void setTelefono(Vector<Telefono> telefono) {
        this.telefono = telefono;
    }
    
    public void addTelefono(Telefono telefono){
        this.telefono.add(telefono);
    }

}
