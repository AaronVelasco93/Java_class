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
public class Condicionales {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num; //número introducido por el usuario 
        System.out.print(" Introduzca un número: ");
        num = sc.nextInt();
        if (num % 2 == 0) { //si num es par 
            System.out.println("Es par");
        } else { // les impar 
            
            System.out.println("Es impar");
        }
    }

}
