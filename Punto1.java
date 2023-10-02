/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aprender1;

//importar el scanner
import java.util.Scanner; 
//1.	Realizar un programa que rellene un vector con 5 
//valores ingresados por el usuario y los muestre por pantalla.
/**
 *
 * @author Trc_Mateo
 */
public class Punto1 {
    public static void main(String[] args) {
        
        //Llamar al scanner para poder dejar al usuario ingrasar texto
     Scanner scanner = new Scanner(System.in);
     //crear el vector (hasta 5)
     int[] vector = new int[5];
     //pedir el numero, desde el primero hasta el quinto
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese el valor del numero "+ (i+1)+": ");
            vector[i] = scanner.nextInt();
        }
        //imprimir los valores deesde i=0 hasta i=4
        System.out.println("Los valores ingresados por el usuario son ");
        for (int i = 0; i < 5; i++) {
            System.out.println("valor numero "+ (i + 1)+": "+ vector[i]);     
        }
        scanner.close();
                
}
}