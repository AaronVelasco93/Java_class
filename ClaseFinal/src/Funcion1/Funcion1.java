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
public class Funcion1 {
    
    
    //Metodo main
    public static void main(String[] args) {
        
        
        //saludoFor();
        
        
        
    }
    
    //FUNCIONES
    
    /*
    *El método estático en Java es un método que pertenece a la clase 
    *y no al objeto. Un método estático solo puede acceder a datos estáticos.
    */
    
    //Los metodos estaticos pertenecen a la clase en lugar de a una instancia especifica 
    //void indica que no retorna un valor
    static void saludarBasico(){
        System.out.println("Hola este es una saludo Basico");
    }
    
    static void saludoFor(){
        for (int i = 0; i <= 10; i++) {
            System.out.println("Saludo : "+i);
        }
        
    }
    
    
    
}
