
package vete.Persistencia;

import com.db4o.Db4o;
import com.db4o.ObjectContainer;
import java.io.File;

/**
 *
 * @author laureano
 */
public class Conector {
    
  //  private ObjectContainer db = null;
    
    /**
     * Metodo para conectar con la base de datos especificada como parametro
     * 
     * @param ruta Ruta a la base de datos a conectar
     * @param nombreBase Nombre del archivo contenedor de los datos
     * @return Se devuelve un ObjectContainer para operar sobre la base de datos
     */
    public ObjectContainer conectar(String ruta, String nombreBase) {
        new File(ruta).mkdir();
        return Db4o.openFile(ruta + File.separator + nombreBase);
    }
    
    /**
     *Metodo para cerrar la conexion con la base de datos
     *
     */
  /*  public void desconectar() {
        
        if ( db != null ) {
            
            try {
                db.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        
        db.close();
        
    }*/
    
    
}






