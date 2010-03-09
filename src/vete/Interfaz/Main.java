/*
 * Main.java
 * 
 * Created on 18/06/2007, 14:42:13
 * 
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package vete.Interfaz;

import javax.swing.UIManager;
// import vete.Persistencia.Fachada;

/**
 *
 * @author Lisandro
 */
public class Main {
    
    /**
     * 
     */
    // public static MainFrame frm = null;
    public static Login init = null;
    

    public Main() {
    }
    
    public static void main(String[] args) throws Exception{
        
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            //UIManager.setLookAndFeel(new ch.randelshofer.quaqua.QuaquaLookAndFeel());
            
            
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
       
       init = new Login();
    //  Fachada.getInstancia();
       init.setVisible(true);
    
    }

}
