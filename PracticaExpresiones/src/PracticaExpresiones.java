
import java.util.Scanner;


public class PracticaExpresiones {

    private static Scanner leer = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        System.out.println("INGRESE TEXTO: ");
        String texto = leer.nextLine();
        
        if(texto.matches("^([a-zA-Z]+[ ]*)*$")){
            char[] cadenaTexto = texto.toCharArray();
            
            for (int i = 0; i < cadenaTexto.length; i++) {
                char aux = cadenaTexto[i];
                
                if(aux != '\0'){
                    aux++;
                    System.out.print(aux);
                } else {
                    System.out.print(aux);
                }
            }
        }
    }
    
}
