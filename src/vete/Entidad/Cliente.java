package vete.Entidad;

import javax.persistence.Entity;
import javax.persistence.Inheritance;

/**
 *
 * @author Lisandro
 */
@Entity
@Inheritance
public class Cliente extends Persona{

     private static final long serialVersionUID = 1L;
   
    private String condicionIva;
    
    /** Constructor por defecto */
    public Cliente() {
        super();
    }

    /**
     * @return the condicionIva
     */
    public String getCondicionIva() {
        return condicionIva;
    }

    /**
     * @param condicionIva the condicionIva to set
     */
    public void setCondicionIva(String condicionIva) {
        this.condicionIva = condicionIva;
    }

}
