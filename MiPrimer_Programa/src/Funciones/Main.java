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
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print(" Introduzca un número: ");
        int n = sc.nextInt();

        System.out.println("--Antes de llamar a la función--");

        eco(n); //invocamos La función 

        System.out.println("--Después de llamar a la función--");
    }
//La función Lo único que hace es iterar en un bucie y mostrar un mensaje 

    static void eco(int a) { //et parámetro no tiene por qué iiamarse como en La iiamada 
        for (int i = 0; i < a; i++) {
            System.out.println("Eco ... ");
        }
    }

}
