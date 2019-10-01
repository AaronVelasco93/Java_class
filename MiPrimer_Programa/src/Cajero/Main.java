/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cajero;

/**
 *
 * @author Aaron Velasco
 */
public class Main {

    public static void main(String[] args) {

        CuentaCorriente c;
        c = new CuentaCorriente("Aaron", "413112576"); //cuenta para aaron
        // con identificacion = 413112576

        c.limite = -100; // estabiecemos ei iímite máximo para un descubierto 
        c.ingreso(1000); // ingresamos 1000 euros 
        c.egreso(300); // sacamos 300 euros. Quedarán 700 euros 
        c.mostrarInformacion();// mostramos 
        System.out.println("Puedo sacar 700 euros: " + c.egreso(700)); //quedan O euros 
        System.out.println("Puedo sacar 500 euros: " + c.egreso(500)); //no es posibie 

    }

}
