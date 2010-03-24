package vete.Entidad;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import vete.Persistencia.IPersistente;

/**
 *
 * @author Lisandro
 */
@Entity
@Inheritance
public class Persona implements Serializable, IPersistente{

    private static final long serialVersionUID = 1L;

    @Id
    private String uid;
    private String codigo;
    private String cuit;
    private double descuento;
    private String estadoDescuento;
    private String estado;
    private String mail;
    private String nombre;
    private String detalle;
    private boolean borrado;

    @OneToMany
    private List<Telefono> telefonos;
    @OneToOne
    private Domicilio domicilio;

    public Persona() {
        generarUid();
    }

    /**
     * 
     */
    @Override
    public void generarUid() {
        if (getUid() == null) {
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
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the cuit
     */
    public String getCuit() {
        return cuit;
    }

    /**
     * @param cuit the cuit to set
     */
    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    /**
     * @return the descuento
     */
    public double getDescuento() {
        return descuento;
    }

    /**
     * @param descuento the descuento to set
     */
    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    /**
     * @return the estadoDescuento
     */
    public String getEstadoDescuento() {
        return estadoDescuento;
    }

    /**
     * @param estadoDescuento the estadoDescuento to set
     */
    public void setEstadoDescuento(String estadoDescuento) {
        this.estadoDescuento = estadoDescuento;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * @return the mail
     */
    public String getMail() {
        return mail;
    }

    /**
     * @param mail the mail to set
     */
    public void setMail(String mail) {
        this.mail = mail;
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
     * @return the detalle
     */
    public String getDetalle() {
        return detalle;
    }

    /**
     * @param detalle the detalle to set
     */
    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    /**
     * @return the telefonos
     */
    public List<Telefono> getTelefonos() {
        return telefonos;
    }

    /**
     * @param telefonos the telefonos to set
     */
    public void setTelefonos(List<Telefono> telefonos) {
        this.telefonos = telefonos;
    }

    /**
     * @return the domicilio
     */
    public Domicilio getDomicilio() {
        return domicilio;
    }

    /**
     * @param domicilio the domicilio to set
     */
    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
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
