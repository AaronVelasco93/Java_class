/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import javax.swing.*;
/**
 *
 * @author Aaron
 */
public class Uso_Coche {
    
    
    public static void main(String[] args) {
        
     
        Coche miCoche = new Coche();
                  
        miCoche.establece_color(JOptionPane.showInputDialog("Introduce color"));//Pasar valor por argumento
       
        System.out.println(miCoche.dime_datos_generales());
        
        System.out.println(miCoche.dime_color());
        
        miCoche.configura_asientos(JOptionPane.showInputDialog("Tiene asientos de cuero: "));
        System.out.println(miCoche.dime_asientos());
       
        miCoche.configura_climatizador(JOptionPane.showInputDialog("Tiene Climatizador"));
         
        System.out.println(miCoche.dime_climatizador());

        System.out.println(miCoche.dime_peso_coche());
        
        System.out.println("El precio final del coches es: "+miCoche.precio_coche());
        
    }
    
}
