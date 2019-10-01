/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funciones;

import java.util.Scanner;

/**
 *
 * @author Aaron Velasco
 */
public class Compara {
    
    static int maximo (int a , int b){
        int max;
        if (a > b) {//si a es mayor que b
            max = a;
        }else{//si son iguales o b mayor que a 
            max =b;
        }
        return max;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero:");
        int a = sc.nextInt();
        
        System.out.println("Introduce otro numero");
        int b = sc.nextInt();
        
        System.out.println(" El numero mayor es: "+ maximo(a, b));
        
    }
    
    
}
