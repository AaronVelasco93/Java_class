/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebasuni;

/**
 *
 * @author Aaron
 */
public class Comparanumeros {

    public Comparanumeros() {
    }

    public int a;
    public int b;

    public boolean mayor(int a, int b) {

        this.a = a;
        this.b = b;
        if (a > b) {
            System.out.println("A: " + a + " es mayor que B: " + b);
            return true;
        } else {

            System.out.println("B: " + b + " es mayor que A: " + a);
            return false;
        }

    }

    public boolean igualdad(int a, int b) {

        this.a = a;
        this.b = b;

        if (a == b) {
            System.out.println("Los dos valores son iguales");

            return true;
        } else {
            System.out.println("Los dos valores son diferentes.");
            return false;
        }
    }

}
