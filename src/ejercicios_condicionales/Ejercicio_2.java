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
public class Ejercicio_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      //Crear un programa que dado un numero determine si es par o impar.
      
      Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero");
      int par = leer.nextInt();
      
        if (par % 2 == 0) {
            System.out.println("El numero " + par +" es par.");
            
        }
        else{
            System.out.println("El numero " + par + " es impar.");}
      
      
    }
    
}
