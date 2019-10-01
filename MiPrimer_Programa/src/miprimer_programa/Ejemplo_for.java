/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miprimer_programa;

/**
 *
 * @author Aaron Velasco
 */
public class Ejemplo_for {
    public static void main(String[] args) {
         for (int i = 1; i <= 2; i++) {
             System.out.println("Bucle Externo, i= "+i);
             for (int j = 1; j <= 3; j++) {
                 System.out.println("....Bucle medio j= "+j);
                 for (int k = 1; k <= 4; k++) {
                       System.out.println(".......Bucle interno K= "+k); 
                 }
             }
              System.out.println("");
        }
        
        
    }
}
