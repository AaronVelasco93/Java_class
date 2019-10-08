/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase_2;

import java.util.Scanner;

/**
 *
 * @author S1PC1
 */
public class NewClass {
    
    public static void main(String[] args) {
              
     /**
      *El uso de la clase Scanner es una de las mejores maneras de ingresar datos por teclado en Java.
      * 
      * Scanner es una clase en el paquete java.util utilizada para obtener la entrada de los tipos primitivos como int, double etc. y también String.
      * Es la forma más fácil de leer datos en un programa Java, aunque no es muy eficiente si se quiere un método de entrada para escenarios
      * donde el tiempo es una restricción, como en la programación competitiva.
      *       * 
      * 
      */   
        
        Scanner miSc = new Scanner(System.in);
        
        int iNumero1;
        int iNumero2;
        int iResultado;
        
        
        System.out.println("-----------Suma de dos numero---------");
        System.out.println("Ingresar un numero: ");
            iNumero1 = miSc.nextInt();
        
        System.out.println("Ingresar un segundo numero: ");
            iNumero2 = miSc.nextInt();
        
        //Operacion
        
        iResultado=iNumero1+ iNumero2;
        
        System.out.println("El resultado de la operacion es: "+iResultado );
            
        
        
        
        
        
    }
    
    
}
