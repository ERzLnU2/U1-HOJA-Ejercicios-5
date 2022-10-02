# U1-HOJA-Ejercicios-5
Pedir años @User y verificar mayoria de edad en JAVA..

![51](https://user-images.githubusercontent.com/80227002/193462586-28ffdd47-c7eb-4a83-beae-ce2cea60be59.png)

```java
/**
 * Pagina 17
   ejercicio 5.
   
 * Realizar una aplicación que solicite al usuario 
   su edad y le indique si es mayor de edad.
 
 *  (mediante un booleano: true o false).

 */
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
```

![52](https://user-images.githubusercontent.com/80227002/193462592-62a3a35f-437b-4cf2-a701-6f25c0a15113.png)

