package vete.Entidad;

import java.io.Serializable;
import java.util.UUID;
import javax.persistence.Entity;
import javax.persistence.Id;
import vete.Persistencia.IPersistente;

/**
 *
 * @author Lisandro
 */
@Entity
public class Permiso implements Serializable, IPersistente {

    private static final long serialVersionUID = 1L;
    
    @Id
    private String uid;
    private String objeto;
    private boolean actualizar;
    private boolean insertar;
    private boolean leer;
    private boolean borrar;
    private boolean borrado;

    public Permiso() {
    }
    
    /**
     * 
     */
    @Override
    public void generarUid(){
        if( getUid() == null ) {
            setUid(UUID.randomUUID().toString());
        }
    }

    /**
     * @return the uid
     */
    public String getUid() {
        return uid;
    }

    /**
     * @param uid the uid to set
     */
    public void setUid(String uid) {
        this.uid = uid;
    }

    /**
     * @return the objeto
     */
    public String getObjeto() {
        return objeto;
    }

    /**
     * @param objeto the objeto to set
     */
    public void setObjeto(String objeto) {
        this.objeto = objeto;
    }

    /**
     * @return the actualizar
     */
    public boolean isActualizar() {
        return actualizar;
    }

    /**
     * @param actualizar the actualizar to set
     */
    public void setActualizar(boolean actualizar) {
        this.actualizar = actualizar;
    }

    /**
     * @return the insertar
     */
    public boolean isInsertar() {
        return insertar;
    }

    /**
     * @param insertar the insertar to set
     */
    public void setInsertar(boolean insertar) {
        this.insertar = insertar;
    }

    /**
     * @return the leer
     */
    public boolean isLeer() {
        return leer;
    }

    /**
     * @param leer the leer to set
     */
    public void setLeer(boolean leer) {
        this.leer = leer;
    }

    /**
     * @return the borrar
     */
    public boolean isBorrar() {
        return borrar;
    }

    /**
     * @param borrar the borrar to set
     */
    public void setBorrar(boolean borrar) {
        this.borrar = borrar;
    }

    /**
     * @return the borrado
     */
    public boolean isBorrado() {
        return borrado;
    }

    /**
     * @param borrado the borrado to set
     */
    @Override
    public void setBorrado(boolean borrado) {
        this.borrado = borrado;
    }
    
}
