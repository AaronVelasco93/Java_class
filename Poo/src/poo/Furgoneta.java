/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author Aaron
 */
public class Furgoneta extends Coche{//Forgoneta hereda de coche con la palabra reservada extends
    
    private int capasidad_carga;
    private int plazas_extra;
    
    
    public Furgoneta(int plazas_extra, int capacidad_carga){
        super();//llamar al contructor de la clase padre
        
        this.capasidad_carga=capacidad_carga;
        
        this.plazas_extra=plazas_extra;    
    
    }
    
 
    
}
