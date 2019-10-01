/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miprimer_programa;

public class MiPrimer_Programa {

    public static void main(String[] args) {

        int a = 1;
        switch (a * 2) {
            case 1:
                System.out.println("Hola");
                break;
            case 2:
                System.out.println("Paco");
                break;
            case 3:
                System.out.println("Adiós");
                break;
            default:
                System.out.println("Sin coincidencia");
                break;
        }

    }
}
