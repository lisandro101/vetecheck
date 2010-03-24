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
public class Telefono implements Serializable, IPersistente{

    private static final long serialVersionUID = 1L;
    
    @Id
    private String uid;
    private String nombre;
    private String codigo;
    private String numero;
    private boolean borrado;
    
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
    
    @Override
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
