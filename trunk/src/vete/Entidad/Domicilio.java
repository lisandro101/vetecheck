/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package vete.Entidad;

import java.util.UUID;

/**
 *
 * @author Lisandro
 */
public class Domicilio {
    
    private String uid;
    private String calle;
    private String numero;
    private String piso;
    private String departamento;
    private String localidad;
    private String provincia;
    private String pais;
    
    private Persona persona;
    

    
    public Domicilio() {
        this.generarUid();
        this.setCalle("");
        this.setDepartamento("");
        this.setLocalidad("");
        this.setNumero("");
        this.setPais("");
        this.setPiso("");
        this.setPersona(null);
        this.setProvincia("");
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

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        
        if (calle == null) {
            this.calle = "";            
        }
        else {
            this.calle = calle;
        }
        
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        
        if (numero == null) {
            this.numero = "";            
        }
        else {
            this.numero = numero;
        }
        
    }

    public String getPiso() {
        return piso;
    }

    public void setPiso(String piso) {
        
        if (piso == null) {
            this.piso = "";            
        }
        else {
            this.piso = piso;
        }
        
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        
        if (departamento == null) {
            this.departamento = "";            
        }
        else {
            this.departamento = departamento;
        }
        
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        
        if (localidad == null) {
            this.localidad = "";            
        }
        else {
            this.localidad = localidad;
        }
        
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        
        if (provincia == null) {
            this.provincia = "";            
        }
        else {
            this.provincia = provincia;
        }
        
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        
        if (pais == null) {
            this.pais = "";            
        }
        else {
            this.pais = pais;
        }
        
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

}
