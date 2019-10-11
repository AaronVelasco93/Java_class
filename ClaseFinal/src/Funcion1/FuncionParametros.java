/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funcion1;

/**
 *
 * @author S1PC1
 */
public class FuncionParametros {

    public static void main(String[] args) {
        
        int temporal;
        
        suma(5, 5);
        System.out.println(suma(8, 1));
        
       temporal= suma(8, 9);
        System.out.println("El resultado es: "+temporal);
    }
    
    static int suma (int a, int b){
        
        return a+b;
     }
          
    
}
