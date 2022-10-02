/**
 * Pagina 17
   ejercicio 5.
   
 * Realizar una aplicación que solicite al usuario 
   su edad y le indique si es mayor de edad.
 
   (mediante un booleano: true o false). 
 * @author Daw120
 */
package com.solomongo.ejercicio5_daw120;
import java.util.Scanner;
public class Ejercicio5_DAW120 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); 
        int edad;
        int mayor=18;
        boolean result;
        String resultSalida;
        
        System.out.print("\nQue edad tienes?: ");
        edad=teclado.nextInt();
        System.out.print("  - edad: "+edad+" anos...."+"\n\n"); 
          
        result=(edad>mayor);      
        resultSalida=result==true?"*Eres Mayor de edad!!":"Eres Menor de edad..";  
        System.out.println(resultSalida+"\n");     
    }
}
