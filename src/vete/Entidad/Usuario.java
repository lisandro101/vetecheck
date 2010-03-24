package vete.Entidad;

import java.io.Serializable;
import java.util.UUID;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import vete.Persistencia.IPersistente;

/**
 *
 * @author Lisandro
 */
@Entity
public class Usuario implements Serializable, IPersistente {

    private static final long serialVersionUID = 1L;
    
    @Id
    private String uid;
    private String nombre;
    private String contrasenia;
    private boolean borrado;

    @ManyToOne
    private Perfil perfil;

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
    @Override
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
