/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funciones;

import java.util.Scanner;

/**
 *
 * @author Aaron Velasco
 */
public class Numero {

    //La función ordena Los valores pasados y los utiliza como valores de un bucie for 
    static void mostrar(int a, int b) {

        int mayor = a > b ? a : b; //asignamos a mayor el mayor entre a y 
        
        int menor = a < b ? a : b; //y en menor ei más pequeflo entre a y b 
        
        for (int i = menor; i <= mayor; i++) { //siempre iremos del menor ai mayor 
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca primer número: ");
        int a = sc.nextInt();
        System.out.print("Introduzca segundo número: ");
        int b = sc.nextInt();
        mostrar(a, b);
    }

}
