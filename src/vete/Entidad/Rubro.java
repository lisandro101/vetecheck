package vete.Entidad;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;
import java.util.Vector;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import vete.Persistencia.IPersistente;

/**
 *
 * @author Lisandro
 */
@Entity
public class Rubro implements Serializable, IPersistente {

    private static final long serialVersionUID = 1L;
    
    @Id
    private String uid;
    private String nombre;
    private boolean borrado;
    
    @OneToMany
    private List<Articulo> articulos;
    
    
    public Rubro(){
    }
    
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
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the articulos
     */
    public List<Articulo> getArticulos() {
        return articulos;
    }

    /**
     * @param articulos the articulos to set
     */
    public void setArticulos(List<Articulo> articulos) {
        this.articulos = articulos;
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
