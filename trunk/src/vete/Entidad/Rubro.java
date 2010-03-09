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
public class Rubro {
    
    private String uid;
    private String nombre;
    
    private Vector<Articulo> articulos;
    
    
    public Rubro(){
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

    public Vector<Articulo> getArticulos() {
        return articulos;
    }

    public void setArticulos(Vector<Articulo> articulos) {
        this.articulos = articulos;
    }
    
    

}
