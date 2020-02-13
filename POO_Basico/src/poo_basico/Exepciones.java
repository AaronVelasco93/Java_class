/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_basico;

/**
 *
 * @author S1PC1
 */
public class Exepciones {
     
     public static void main(String[] args) {
         
        int nums[]=new int[4];
        try {
            System.out.println("Antes de que se genere la excepción.");
            //generar una excepción de índice fuera de límites
            nums[7]=10;
        }catch (ArrayIndexOutOfBoundsException exc){
            //Capturando la excepción
            System.out.println("Índice fuera de los límites!");
        }
        System.out.println("Después de que se genere la excepción.");
    }
    
    
}
