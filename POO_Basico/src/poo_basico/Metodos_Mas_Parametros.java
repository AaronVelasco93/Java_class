/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_basico;

import java.util.Scanner;

/**
 *
 * @author aaron
 */
public class Metodos_Mas_Parametros {
    
    // creacion de un metodo tomados parametros 
// Ejemplo
    
    //Ejmplo de un metodo cre
    static void saludoNombre(String Nombre){
        System.out.println("Hola "+Nombre);
    }
    
    //main
    public static void main(String[] args) {
        
        //metodo con nombre
        saludoNombre("Aaron");
        
        //programa que pida el nombre por teclado
        
        Scanner miSC = new Scanner(System.in);
        
        String tuNombre;
        
        System.out.println("Itroduce tu nombre: ");
            
            tuNombre = miSC.next();
        //metodo mas variable
        saludoNombre(tuNombre);
            
            
    }
         
    
    
}
