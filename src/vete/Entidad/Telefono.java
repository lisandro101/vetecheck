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
public class Telefono {
    private String uid;
    private String nombre;
    private String codigo;
    private String numero;
    
    public Telefono(){
        this.setCodigo("");
        this.setNombre("");
        this.setNumero("");
        this.generarUid();
    }
    
    public String getUid(){
        return uid;
    }
    
    public void setUid(String uid){
        this.uid = uid;
    }
    
    public void generarUid(){
        if( getUid() == null ) {
            setUid(UUID.randomUUID().toString());
        }
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getCodigo(){
        return codigo;
    }
    
    public void setCodigo(String codigo){
        this.codigo = codigo;
    }
    
    public String getNumero(){
        return numero;
    }
    
    public void setNumero(String numero){
        this.numero = numero;
    }
    
   

}
