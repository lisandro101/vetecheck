/*
 * Usuario.java
 * 
 * Created on 21/06/2007, 09:20:50
 * 
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package vete.Entidad;

import java.util.UUID;

/**
 *
 * @author Lisandro
 */
public class Usuario {
    
    private String uid= null;
    private String nombre= null;
    private String contrasenia= null;
    private Perfil perfil = null;

    public Usuario() {
    }
    
    public String getUid() {
        return uid;
    }
    
    /**
     * 
     * @param uid 
     */
    public void setUid(String uid) {
        this.uid = uid;
    }
    
    /**
     * 
     */
    public void generarUid(){
        if( getUid() == null ) {
            setUid(UUID.randomUUID().toString());
        }
    }
    
    public String getNombre(){
        
        return nombre;
        
    }
    
    public String getContrasenia(){
        
        return contrasenia;
        
    }
    
    public void setNombre(String nombre){
        
        this.nombre = nombre;
        
    }
    
    public void setContrasenia(String contrasenia){
        
        this.contrasenia = contrasenia;
        
    }
    
    public Perfil getPerfil() {
        return perfil;
    }

    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }

}
