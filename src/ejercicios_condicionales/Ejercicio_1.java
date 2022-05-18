/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_condicionales;

import java.util.Scanner;

/**
 *
 * @author Facundo
 */
public class Ejercicio_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Implementar un programa que dado dos números enteros determine cuál
         * es el mayor y lo muestre por pantalla.
         */
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int numero1 = leer.nextInt();
        
        Scanner leer2 = new Scanner(System.in);
        System.out.println("Ingrese otro numero");
        int numero2 = leer2.nextInt();
        
        if (numero1>numero2) {
          System.out.println("El numero " + numero1 + " es mayor que el " + numero2);
            
        }
        else if (numero1<numero2){
            System.out.println("El numero " + numero2 + " es mayor que el " + numero1);
        }
            
        
        
        
        
    }

}
