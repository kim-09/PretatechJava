import javax.swing.JOptionPane;
import java.util.*;
import java.util.InputMismatchException;


public class NumParEx1 {
  
  public static void main (String[] args) {

    int i = 0; 
    int num = 0;
      
      for (i = 0; i < 5; i++) {
        
        try {
          num = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha um número de 1 à 10: "));
        
          if (num > 10) {
            JOptionPane.showMessageDialog(null, "Insira um número entre 1 e 10. "); 
            
          }
        } 
        catch (InputMismatchException e ) {
          System.out.println("Insira um número válido. " +e.getMessage());
          
        } 
        finally {
          if (num % 2 == 0){
            JOptionPane.showMessageDialog(null, "Este número é par. ");
          }
          else {
            JOptionPane.showMessageDialog(null, "Este número é impar. ");
          }
        }  

      }
  }























































}
