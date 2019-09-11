/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase_1;

/**
 *
 * @author aaron
 */
public class Matris_formejorado {
    
    public static void main(String[] args) {
        //matris con for mejorado
        
        int [] numeros = {1,3,4,5,6,7,23,3,3,4,5,6,7,8,4,1};
    
        for (int numero : numeros) {
            System.out.println(numero);
            
        }
 
        //suma
        System.out.println("Suma ");
        int suma=0;
        
        //fore each o for mejorado
        for (int numero : numeros) {
            
            suma+=numero;
            //suma=suma+numero;
        }
          System.out.println(suma);
    }
    
}
