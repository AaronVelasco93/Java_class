/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persona;

/**
 *
 * @author Aaron Velasco
 */
public class Persona {
    //Atributos
    String nombre;
    byte edad;
    double estatura;

    //contructor 
    public Persona(String nombre, byte edad, double estatura) {
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
    }
    //Constructor sobre cargado 
    public Persona(String nombre) {
        this.nombre= nombre;
        estatura=1.0;
    }

    public Persona() {
    }
    
    
    
    
    
    void saludar(){
        System.out.println("Hola mi nombre es "+nombre);
        System.out.println("Encantado de conocerte");
    }
    
    void cumplirAños(){
        edad++;// incrementa la edad
    }
    
    void crecer(double  incremento){
        estatura=+incremento;// la estatura aumenta por medio del usuario
    }
    
    public static void main(String[] args) {
        
       Persona p;
       p = new Persona();
       
       p.edad= 25;
       p.cumplirAños();// tu objeto cumplio un año mas 
        
        
    }
}



