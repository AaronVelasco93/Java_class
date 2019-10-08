package DatosPersonales;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Usuario
 */
public class Edad {
    
    public static void main(String[] args) {
        
        Scanner miEntradaDatos = new Scanner(System.in);
        
        int iEdad;
        
        System.out.print("Ingresa tu edad: ");
            iEdad = miEntradaDatos.nextInt();
        
        System.out.println("Tu edad del año proximo es "+(iEdad+1)+" años");
         
        
        
        
    }
    
}
