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
    int NumeroA;
    int NumeroB;
    
    //Contructor
    public Sobrecarga() {
    }
    
    
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
    
    
    public static void main(String[] args) {
        
        int Num1;
        int Num2;
        
        Num1=10;
        Num2=2;

        
        
        System.out.println(suma(Num1, Num2));
    }
    
}
