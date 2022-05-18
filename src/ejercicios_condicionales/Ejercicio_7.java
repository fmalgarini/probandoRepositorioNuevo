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
public class Ejercicio_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /**Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo,
            si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
                * * * *
                *     *
                *     *
                * * * *
         **/
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un tamanio de 2 a 50");
        int tamCuadrado = leer.nextInt();
        
        
        if (tamCuadrado >= 0 && tamCuadrado <= 50) {
            
            
            //linea de arriba.
            for (int i = 0; i < tamCuadrado; i++) {
            System.out.print("*");    
            }
            
            //Salto de linea
            System.out.println();   
            
            //centro de la figura
            for (int i = 0; i < tamCuadrado-2; i++) {
                System.out.print("*");
                for (int j = 0; j < tamCuadrado-2; j++) {
                    System.out.print(" ");
                }
                System.out.println("*");              
            }           
            
            //linea de abajo.
            for (int i = 0; i < tamCuadrado; i++) {
                 System.out.print("*"); 
            }
            
        }
        else {System.out.println("Usted ingreso un numero diferente al solicitado");}
        
        
    }
    
}
