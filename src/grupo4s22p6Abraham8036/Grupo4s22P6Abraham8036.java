package grupo4s22p6Abraham8036;

import java.util.ArrayList;
import java.util.Arrays;


public class Grupo4s22P6Abraham8036 {

  
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> lista = new ArrayList<String>(Arrays.asList("A","B","C","D","F"));
        lista.forEach(contenido -> {
            System.out.println("El vaolor contenido" + contenido);
    });
        lista.add("G");
        lista.add("H");
        
        System.out.println("\n segunda dorma de trabajar recorridos de listas \n");
        
        for(String contenido1 : lista){
            System.out.println("El vaolor contenido" +contenido1);
        }
        lista.add("Jose Daniel");
        lista.add("esta es una libea muy larga");
        lista.add("Dany");
        lista.add("segunda linea muy larga sin problema de almacena");
        
        System.out.println("\n tercer forma de trabajar recorridos de listas \n");
        lista.forEach(contenido2 -> {
            System.out.println("El vaolor contenido" + contenido2);
    });
  }
    
}
