//1mer punto
package logica;

import bean.Triada;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class LTriada {
    
    ArrayList<Triada> arrayTriada;

    public LTriada() {
        arrayTriada = new ArrayList<>();
    }

    public LTriada(ArrayList<Triada> arrayTriada) {
        this.arrayTriada = arrayTriada;
    }

    public ArrayList<Triada> getArrayTriada() {
        return arrayTriada;
    }

    public void setArrayTriada(ArrayList<Triada> arrayTriada) {
        this.arrayTriada = arrayTriada;
    }
    
    public Boolean validarPrimo(String s){
        int numero = Integer.parseInt(s);
        
        if((numero==2 || numero==3 || numero==5 || numero==7) || (numero%2!=0 && numero%3!=0 && numero%5!=0 && numero%7!=0)){
            //invocar metodo
        } else {
            JOptionPane.showMessageDialog(null, "Mal ingresado", "Error", JOptionPane.ERROR_MESSAGE);
            JOptionPane.showMessageDialog(null, "Ingresa un numero primo (divisible solo por el mismo y la unidad): ", "Información", JOptionPane.INFORMATION_MESSAGE);
        
            return false;
        }
        
        return true;
    }
    
    
    
}
