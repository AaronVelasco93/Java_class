/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetepruebas;

/**
 *
 * @author Aaron
 * sigel el 38
 */
public class Pruebas {
    public static void main(String[] args) {
        
        Empleados trabajador1 = new Empleados("Aaron");
        Empleados trabajador2 = new Empleados("Analia");
        Empleados trabajador3 = new Empleados("Antonio");
        Empleados trabajador4 = new Empleados("Maria");
        
        trabajador1.cambiaSeccion("Informatica");
        System.out.println(trabajador1.devuleveDatos());
            
        System.out.println(trabajador2.devuleveDatos());
            
        System.out.println(trabajador3.devuleveDatos());
        
        System.out.println(trabajador3.devuleveDatos());
            
        
        
       // System.out.println(trabajador1.devuleveDatos());
        
        
        
        
    }
    
    
}

class Empleados{
    
    public Empleados(String nom){//Contructor de estadio inicial
        
        nombre=nom;
        seccion="Administracion";
        
        
        Id=IdSiguiente;
        IdSiguiente= IdSiguiente+1;
       
    }
    
    public void cambiaSeccion(String seccion){//setter
        
        this.seccion=seccion;
    
    }
    
    
    
    public String devuleveDatos(){//getter
    
        return "El nombre es: "+nombre + " y la seccion es: "+ seccion+" Tiene un ID: "+Id;
    }
    
    
    
    private final String nombre;//variable final, se combierte en una contante, no se puede cambiar en ningun lado
    private String seccion;
    private  int Id;
    private static int IdSiguiente=1;
    

}