/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatosPersonales;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Datos {

    public static void main(String[] args) {
        //String ;
        String nombre, apellidoM, apellidoP;//declaracion de variables para mis datos de texto

        Scanner miSC = new Scanner(System.in);

        System.out.print("Ingresa Nombre: ");
            nombre = miSC.nextLine();
        
        System.out.print("Ingresa Apellido Paterno: ");
            apellidoP = miSC.nextLine();
        
        System.out.print("Ingresa Apellido Materno: ");
            apellidoM = miSC.nextLine();

        System.out.println("Tu nombre completo es: " + apellidoP + " " + apellidoM + " " + nombre);

    }
}
