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
public class Domicilio implements Serializable, IPersistente {

    private static final long serialVersionUID = 1L;
    @Id
    private String uid;
    private String calle;
    private String numero;
    private String piso;
    private String departamento;
    private String localidad;
    private String provincia;
    private String pais;
    private boolean borrado;

    public Domicilio() {
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
     * @return the calle
     */
    public String getCalle() {
        return calle;
    }

    /**
     * @param calle the calle to set
     */
    public void setCalle(String calle) {
        this.calle = calle;
    }

    /**
     * @return the numero
     */
    public String getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }

    /**
     * @return the piso
     */
    public String getPiso() {
        return piso;
    }

    /**
     * @param piso the piso to set
     */
    public void setPiso(String piso) {
        this.piso = piso;
    }

    /**
     * @return the departamento
     */
    public String getDepartamento() {
        return departamento;
    }

    /**
     * @param departamento the departamento to set
     */
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    /**
     * @return the localidad
     */
    public String getLocalidad() {
        return localidad;
    }

    /**
     * @param localidad the localidad to set
     */
    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    /**
     * @return the provincia
     */
    public String getProvincia() {
        return provincia;
    }

    /**
     * @param provincia the provincia to set
     */
    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    /**
     * @return the pais
     */
    public String getPais() {
        return pais;
    }

    /**
     * @param pais the pais to set
     */
    public void setPais(String pais) {
        this.pais = pais;
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
    public void setBorrado(boolean borrado) {
        this.borrado = borrado;
    }
}
