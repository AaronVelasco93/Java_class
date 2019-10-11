/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasefinal;

import com.sun.org.apache.xerces.internal.dom.PSVIAttrNSImpl;

/**
 *
 * @author S1PC1
 */
public class ClaseFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //saludoControl(5);
        Suma(3, 4, 6);
        
        saludoNombre("Aaron");
        areaTria(5.0, 5.0);
            
        
    }
    
    
    //entrada de un String
    static void saludoNombre(String sNombre){
        
        System.out.println("Tu nombre es: "+sNombre);
    }
    
        //funcion con entrada de parametros
    static void saludoControl(int veces){
        for (int i = 0; i <= veces; i++) {
            System.out.println("Saludos "+i);
        }
    }
    //Entrada de parametros de tipo entero
    static void Suma(int a, int b, int c){
        
          System.out.println("Resultado: "+(a+b+c));
    }
    
    //area de un triangulo
    static void areaTria(double base, double altura){
        double resul;
        resul= (base*altura)/2;
        System.out.println("Resultado: "+resul);
    }
    
  
}
