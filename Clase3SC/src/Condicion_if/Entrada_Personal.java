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
public class Entrada_Personal {
    
    public static void main(String[] args) {
        Scanner miSC = new Scanner(System.in);
        int Edad;
        String Nombre;
        
        System.out.print("Ingresa tu Nombre: ");
            Nombre= miSC.nextLine();
        System.out.println("Ingresa tu edad: ");
            Edad = miSC.nextInt();
        if (Edad>=18) {
            System.out.println("Hola "+Nombre+" puedes pasar. \n Tu edad es:"+Edad+" años");
            
        }else{
            System.out.println("Hola "+Nombre+" lo lamento, no puedes pasar por tu edad. \n Edad: "+Edad+" años");
        }
        
    }
    
}
