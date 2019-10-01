/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miprimer_programa;

import java.util.Scanner;

/**
 *
 * @author Aaron Velasco
 */
public class condicional2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print(" Introduzca un número: ");
            int nl = sc.nextInt(); //primer número 
        System.out.print(" Introduzca otro número: ");
            int n2 = sc.nextInt();
        
        if (nl == n2) { //si n1 es igual que n2 
            System.out.println("Ambos números son iguales");
        } else {
            System.out.println("Lo números son distintos");

        }

    }
}
