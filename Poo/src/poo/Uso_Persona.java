/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Aaron
 */
public class Uso_Persona {
    
    public static void main(String[] args) {
        
            Persona[] lasPersonas = new Persona[2];
            lasPersonas[0]= new Empleado2("Aaron", 13000, 2017, 1, 15);
            
            lasPersonas[1]= new Alumno("Analia", "Enfermeria");
            
            
            for (Persona lasPersona : lasPersonas) {

                System.out.println( lasPersona.dameNombre()+" "+lasPersona.dameDescripcion() );
        }
        
        
    }
    
}

abstract class Persona{
    
    public Persona(String nom){
        nombre=nom;
        
    }
    
    public String dameNombre(){
        return nombre;
    }
    
    public abstract String dameDescripcion();//metodo abstracto 
        
    
    
    
    private String nombre;
    
    
}

class Empleado2 extends Persona{
   
    public Empleado2( String nom, double sue,int agno, int mes, int dia ){//Contructor para dar estadio inicial a los objetos
      
         super(nom);
         sueldo=sue;
         
         GregorianCalendar calendario = new  GregorianCalendar(agno, mes-1, dia);// metodo no un variable
         
         altaContrato=calendario.getTime();
         ++IdSiguiente;
         Id=IdSiguiente;
         
    
    }
    
    @Override
    public String dameDescripcion(){//Metodo abstracto
        return "Este empleado tiene un ID="+Id+" Con un sueldo = "+sueldo;
                
    }
    
    public double dameSueldo(){//getter
    
        return sueldo;
    }
    
    public Date dameFechaContrato(){//getter
    
        return altaContrato;
    }
    
    public void subeSueldo(double porcentaje){//setter
        
        double aumento = sueldo*porcentaje/100;
            
        sueldo+=aumento;
    }
    
    
    private double sueldo;
    private Date altaContrato;
    static int IdSiguiente;
    int Id;
    
    }


class Alumno extends Persona{
    
    public Alumno(String nom, String car){
        super(nom);
        carrera=car;
    }
    
    @Override
    public String dameDescripcion(){//metodo abstracto
    
        return "Este Alumno esta estudiando la carrera de: "+carrera;
    }
    
    private String carrera;

}