package vete.Interfaz;

import javax.swing.UIManager;

/**
 *
 * @author Lisandro
 */
public class Main {
    
    /**
     * 
     */
    public static MainFrame frm = null;
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
        
       
//       init = new Login();
//       init.setVisible(true);

       frm = new MainFrame();
       frm.setVisible(true);
    
    }

}
