/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_basico;

/**
 *
 * @author aaron
 */
// Clase principal
public class Metodos_basicos { 
    
    
    //metodo saludar
    static void Saludar(){
        
        //El metodo saluda
        System.out.println("Hola desde un metodo");
    }
    
    //main
    public static void main(String[] args) {
        
        //mandando a llamar el metodo saludar
        
        System.out.println("Saludo Numero 1");
        Saludar();
        
        
        System.out.println("Saludo 2");
        
        Saludar();
        
        Saludar();
    }
    
    
}
