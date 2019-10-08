/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Condicion_if;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class CondicionElse {
    
    public static void main(String[] args) {
        Scanner miSC = new Scanner(System.in);
        int a;
        
        System.out.print("Ingresa un numero: ");
            a=miSC.nextInt();
        if (a<0) {
            System.out.println("Tu numero es negativo: "+a);
            
        }else if (a==0){
            System.out.println("Tu numero es igual a 0");
            
        }else if (a>0){
            System.out.println("Tu numero es positivo: "+a);
        }
    
    
    }   
    
}
