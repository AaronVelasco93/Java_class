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
public class MAtrices_basico {
    public static void main(String[] args) {
        
        //Matris Basica sin definir un rango
        int [] edades = {1,2,3323,421,512,67,765,45};
        
        
        System.out.println("Edad:"+edades[4]);
        
        System.out.println("Tamalo de la Matris:"+edades.length);
     
        //Suma de datos de una matris
        
        int suma=0;
        
        for (int i = 0; i <edades.length; i++) {
            
            suma = suma+edades[i];
            
            System.out.println("Dato en espera:"+edades[i]);
                 
            System.out.println("Dato:"+i+"="+suma);
        }
        
        
        System.out.println("Suma total:"+suma);
        
        
    }
          
}
