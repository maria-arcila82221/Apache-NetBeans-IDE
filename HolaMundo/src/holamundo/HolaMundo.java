
package holamundo;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class HolaMundo {


    
    public static void main(String[] args) {
        
       int A = 0, B = 0, C;
       Scanner leer = new Scanner(System.in);
        
         System.out.print("Ingrese valor de A: ");
       A = leer.nextInt ();
       
       System.out.print("Ingrese valor de B: ");
       B = leer.nextInt ();
       
       C = A+B;
       
        System.out.print("Hola Mundo...");
        System.out.print("AP2...\n"+A+B);
        System.out.println(C);
        
        
        A = Integer.parseInt(JOptionPane.showInputDialog("Ingrese valor de A: "));
        
        JOptionPane.showInternalMessageDialog(null, "Hola Mundo..."+A, "AP2", -1);
    }
    
}
