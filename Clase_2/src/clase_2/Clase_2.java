/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase_2;

/**
 *
 * @author S1PC1
 */
public class Clase_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int a =1;
        int b =1; 
        int c =2;
        int d =3;
        int e =4;
        int f =10;
        
        //Igualdad
        System.out.println(a==b);
        
        //a es menor que f
        System.out.println(a<f);
        
        //d es mayor que a
        System.out.println(d>a);
        
        //d es mayor o igual que a
        System.out.println(d>=a);
        
        //d es menor o igual que a
        System.out.println(d<=f);
        
        
        // && -> true
        System.out.println(a==b && d<=f );
        
        // && -> flase
        System.out.println(a==c && d<=f );
        
         // || -> true
        System.out.println(a==c || d<=f );
        
        
        // =! -> true
        System.out.println(a==c != d<=f );
        
         
         
    }
    
}
