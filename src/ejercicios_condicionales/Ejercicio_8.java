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
public class Ejercicio_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /** Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el
            número ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
            5 *****
            3 ***
            11 ***********
            2 **
         **/
        
        Scanner read = new Scanner(System.in);
        int n;
       
        System.out.println("Ingrese cuatro numeros del 1 al 20 de seguido");
        for (int i = 0; i < 4; i++) {
           
            
            n = read.nextInt();
            if (n>=1 && n<=20) {
                System.out.print(n);
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
                
            }
            else {
                System.out.println("El numero que usted ingreso no se encuentra en el rango solicitado.(1 a 20)");
                break;
            }
                
           
            
        }
        
        
    }
    
}
