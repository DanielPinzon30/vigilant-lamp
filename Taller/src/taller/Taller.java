package taller;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author juand
 */
public class Taller {

    /**
     * @param args the command line arguments
     */
    public static int n,x=0;
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
         Scanner entrada2 = new Scanner (System.in);
        Persona personas = new Persona();
       int n=0;
        
        String respuesta, respuesta1;
        
           
        do{
        personas.agrgarPersona();
        
        System.out.println("Desea agregar otra persona? (Si-No) ");
        respuesta=entrada.nextLine();
      
        }while("si".equals(respuesta) || "Si".equals(respuesta));
         for(int j=0;j<personas.Nombres.size();j++){
        for(int i=0;i<personas.Nombres.size();i++){
        System.out.println(""+i+". "+personas.Nombres.get(i));
        }
        
       
        System.out.println("Persona a la que desea ingresar temperatura: ");
            n=entrada.nextInt();
        do{            
        
        personas.agregarTemperaturas();
       
        System.out.println("Desea agregar otra temperatura? (Si-No) ");
        respuesta1=entrada2.nextLine();
        x++;
        }while("si".equals(respuesta1) || "Si".equals(respuesta1));}
       
       personas.mostrarPersonas();
     
    }
    
}
