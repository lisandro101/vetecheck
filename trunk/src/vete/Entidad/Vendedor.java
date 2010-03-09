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
public class Vendedor {
    
    private String uid;
    private String nombre;

    public Vendedor(){
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    

}
