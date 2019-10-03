/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_basico;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author aaron
 */
public class Retornos {

//Metodo definicion
    
    //metodo de suma
    static int suma(int var1, int var2){
    
        return var1 + var2;
    }
    
    //metodo de resta
    static int resta (int var1, int var2){
        return var1-var2;
    }
    
    public static void main(String[] args) {
        
        // Declaracion de variables
         int numero1 ;
         int numero2 ;
         int Res;
         
         Scanner miSc = new Scanner(System.in);
         
      
         
      System.out.println("Ingresa el numero 1: ");
            numero1=miSc.nextInt();
         System.out.println("Ingresa el numero 2: ");
            numero2 = miSc.nextInt();
         
       
        //Operacion
         Res = suma(numero1, numero2);
                 
         System.out.println(Res);
         
         
        
    }
    
}
