//EJERCICIO PARA MOSTRAR EN GITHUB
package ejerciciogithub;

import java.util.Scanner;

public class EjercicioGITHUB {

    public static void main(String[] args) {
        String nombre;
        Scanner teclado= new Scanner (System.in);
        System.out.println("Introduce tu nombre por favor");
        nombre=teclado.nextLine();
        
        System.out.println("Hola mundo " + nombre + " tu nombre comienza por " + nombre.substring(0, 1));
        
    }
    
}
