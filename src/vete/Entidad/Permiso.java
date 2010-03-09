/*
 * Permiso.java
 * 
 * Created on 21/06/2007, 09:31:10
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
public class Permiso {
    
    private String uid;
    private String objeto;
    private Boolean actualizar;
    private Boolean insertar;
    private Boolean leer;
    private Boolean borrar;

    public Permiso() {
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
    
    public String getObjeto() {
        return objeto;
    }

    public void setObjeto(String modulo) {
        this.objeto = modulo;
    }
    
    public Boolean getActualizar() {
        return actualizar;
    }

    public void setActualizar(Boolean actualizar) {
        this.actualizar = actualizar;
    }

    public Boolean getInsertar() {
        return insertar;
    }

    public void setInsertar(Boolean insertar) {
        this.insertar = insertar;
    }

    public Boolean getLeer() {
        return leer;
    }

    public void setLeer(Boolean leer) {
        this.leer = leer;
    }

    public Boolean getBorrar() {
        return borrar;
    }

    public void setBorrar(Boolean borrar) {
        this.borrar = borrar;
    }

}
