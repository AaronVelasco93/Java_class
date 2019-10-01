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

/* 
* Esta ciase permite gestionar ia cuenta corriente de un cliente. Para crear una 
* cuenta se necesita ai menos ei nombre y ei DNI del cliente. El saldo inicial 
* será de O euros, y ia cuenta tiene asignado un Límite para descubiertos: 
* ia cuenta puede estar en números rojos hasta ei Límite asignado. 
*/
public class CuentaCorriente {

    double saldo; //efectivo disponible en ia cuenta 
    String nombre; //del titular 
    String dni; //del titular 
    double limite; //límite de descubierto 

    //Constructor con parametros
    public CuentaCorriente(String nombre, String dni) {
        saldo = 0;
        this.nombre = nombre;
        this.dni = dni;
        limite = -50;
    }

    boolean egreso(double cant) { //sacar dinero de ia cuenta corriente 
        boolean operacionPosible;
        if ((saldo - cant) >= limite) { //si solicitamos sacar dinero dentro
            //del límite 
            saldo -= cant; //no se permite realizar ia operación. 
            operacionPosible = true;
        } else {
            System.out.println("No hay dinero suficiente");
            operacionPosible = false;
        }
        return (operacionPosible); //indica si ha sido posible realizar ia operación 
    }

    //afiadimos dinero a ia cuenta corriente 
    void ingreso(double cant) {
        saldo += cant;
    }

    void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Dni: " + dni);
        System.out.println("Saldo: " + saldo);
        System.out.println("Limite descubierto: " + limite);
    }

}
