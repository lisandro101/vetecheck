/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package vete.Interfaz;

import javax.swing.InputVerifier;
import javax.swing.JComponent;
import javax.swing.JTextField;

/**
 *
 * @author Lisandro
 */
public class ValidadorCUIT extends InputVerifier{

    @Override
    public boolean verify(JComponent e) {
        
        String cuit = ((JTextField)e).getText();
        
        if (cuit == null || cuit.equals("")){
            return true;
        }
        else if(cuit.length() != 12 || cuit.charAt(2) != '-' || cuit.charAt(11) != '-'){
            
            return false;
        }
        
      int valor = 11 - ((Character.getNumericValue(cuit.charAt(0)) * 5 +
      Character.getNumericValue(cuit.charAt(1)) * 4 +
      Character.getNumericValue(cuit.charAt(3)) * 3 +
      Character.getNumericValue(cuit.charAt(4)) * 2 +
      Character.getNumericValue(cuit.charAt(5)) * 7 +
      Character.getNumericValue(cuit.charAt(6)) * 6 +
      Character.getNumericValue(cuit.charAt(7)) * 5 +
      Character.getNumericValue(cuit.charAt(8)) * 4 +
      Character.getNumericValue(cuit.charAt(9)) * 3 +
      Character.getNumericValue(cuit.charAt(10)) * 2) % 11);

      switch (valor) {
        case 11: valor = 0; break;
        case 10: valor = 9; break;
      }

      return Character.getNumericValue(cuit.charAt(12)) == valor;
    }
    

}
