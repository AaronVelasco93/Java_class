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
public class Condicion1 {

    public static void main(String[] args) {

        Scanner miSC = new Scanner(System.in);

        int a;//declaracion de variable

        System.out.print("Ingresa un Valor: ");

        a = miSC.nextInt();

        // a es menor
        if (a + 1 < 10) {//inicio del condicional
            a = 0;//se reasigna el valor
            System.out.println("Hola");//Mensaje

            System.out.println("Valor de 'A' (Dentro del if) es:" + a);//concatenacion
        }//fin de la estructura if

        System.out.println("Valor de 'A' fuera del if Es: " + a);//ultimo mensje
    }

}
