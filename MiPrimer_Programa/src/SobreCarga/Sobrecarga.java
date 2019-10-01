/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SobreCarga;

/**
 *
 * @author Aaron Velasco
 */
public class Sobrecarga {
    
    //Funcion sobrecargada
    static int suma(int a, int b){
        int suma;
        suma = a+b;
        return suma;
    }
    //Funcion sobrecargada
    static double suma(int a, double pesoA, int b, double pesoB){
        double suma;
        suma = a * pesoA/ (pesoA + pesoB)+ b * pesoB / (pesoA + pesoB);
        return suma;
    }    
    
}
