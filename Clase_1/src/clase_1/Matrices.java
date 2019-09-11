/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase_1;

import java.util.Scanner;

/**
 *
 * @author aaron
 */
public class Matrices {
    
    public static void main(String[] args) {
        
        //Entrada de datos por scanner
        
        Scanner mi_sc = new Scanner(System.in);

        //Ejemplo 1
        
        //declaracion de una Matris
        //arreglo de 5 datos
        int [] arreglo = new int [5];
        arreglo[0]=1;
        arreglo[1]=2;
        arreglo[2]=3;
        arreglo[3]=4;
        arreglo[4]=5;
        System.out.println("Arreglo 4:"+arreglo[4]);
        
        
        //Ejemplo 2
        
        
        String [] Datos = new String [3];
        
        String Nombre;
        String Apellido_P;
        String Apellido_M;
        
        System.out.println("Nombre:");
            Nombre=mi_sc.next();
        System.out.println("Apellido:");
            Apellido_P=mi_sc.next();
        System.out.println("Materno:");
            Apellido_M=mi_sc.next();
      
        //Se guardan los datos en el arreglo
        Datos[0]=Nombre;
        Datos[1]=Apellido_P;
        Datos[2]=Apellido_M;
        
        //imprimiendo datos 
        
        for (int i = 0; i <Datos.length; i++) {
            
            //recorripo por medio de for 
            System.out.println("Dato"+(i+1)+":"+Datos[i]);
            
            
        }
        
      
        
        
        
    }
    
}
