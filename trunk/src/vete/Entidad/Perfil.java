/*
 * Perfil.java
 * 
 * Created on 21/06/2007, 09:25:15
 * 
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package vete.Entidad;

import java.util.UUID;
import java.util.Vector;

/**
 *
 * @author Lisandro
 */
public class Perfil {
    
    private String uid;
    private String nombre;
    private String descripcion;
    private Vector<Permiso> permisos;

    public Perfil() {
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
    
    public String getDescipcion(){
        
        return descripcion;
        
    }
    
    public void setNombre(String nombre){
        
        this.nombre = nombre;
        
    }
    
    public void setDescripcion(String descripcion){
        
        this.descripcion = descripcion;
        
    }
   
    public Vector<Permiso> getPermisos() {
        return permisos;
    }

    public void setPermisos(Vector<Permiso> permisos) {
        this.permisos = permisos;
    }
    
    

}
