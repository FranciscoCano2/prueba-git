package suma;

import java.util.Scanner;

/**
 *
 * @author franc
 */
public class Suma {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        int number1, number2;

        System.out.println("Ingrese un numero");
        number1= leer.nextInt();
        
        System.out.println("Ingrese un numero");
        number2= leer.nextInt();
        
        System.out.println(number1+number2);
        
    }

}
