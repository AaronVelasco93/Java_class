/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Condicion_if;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Compara {
    
    public static void main(String[] args) {
        Scanner miSC = new Scanner(System.in);
        //declaracion de variables
        int a;
        int b;
        System.out.println("--------Compara dos numeros---------\n");
        
        System.out.print("Ingresa un numero: ");
            a=miSC.nextInt();
            
        System.out.print("\nIngresa un segundo numero: ");
            b=miSC.nextInt();
            
        if(a==b){
            System.out.println("El valor de A: "+a+" es igual a B: "+b);
        }
        if (a<b) {
            System.out.println("El valor de A: "+a+" es menor que  B: "+b);
        }
       // if (b>a) {
        if(a>b){
            System.out.println("El valor de B: "+b+" es mayor que  A: "+a);
        }
        
        System.out.println("Fin del programa");
    }
}
