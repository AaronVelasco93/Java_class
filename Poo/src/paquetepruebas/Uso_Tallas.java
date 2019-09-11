/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetepruebas;

import java.util.Scanner;

/**
 *
 * @author Aaron
 */
public class Uso_Tallas {
    
    //enum Talla{ MINI,MEDIANO,GRANDE,MUY_GRANDE};//se crea una instancia
 
    
    enum Talla{
    
            MINI("S"),MEDIANO("M"),GRANDE("L"),MUY_GRANDE("XL");//
            
        private Talla(String abreviatura){//constructor
            this.abreviatura=abreviatura;
        
        }
        
        public String dameAbreviatura(){
        
            return abreviatura;
        }
        
        
    private final String abreviatura;
    }
    
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        
        System.out.println("Escribe una talla: MINI, MEDIANO, GRANDE, MUY_GRANDE");
        
            String entrada_datos=entrada.next().toLowerCase();//lowecase (para que todo lo que escriva el usuario lo pase a mayusculas)
        
        Talla la_talla=Enum.valueOf(Talla.class, entrada_datos);
        
        System.out.println("Talla ="+la_talla);
        
        System.out.println("Abreviatura ="+ la_talla.dameAbreviatura());
    }
            
}
