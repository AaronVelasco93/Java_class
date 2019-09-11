/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hilo1;

/**
 *
 * @author S1PC1
 */
public class MiHilo implements Runnable{

    //variable
    String nombreHilo;

    //Contructor de la clase hilo
    public MiHilo(String nombre) {
        nombreHilo = nombre;
    }
   
    
    
    // interface requiere sus metodos
    @Override
    public void run() {
        //codigo del hilo
        System.out.println("Comenzando"+nombreHilo);
        //Exepcion
        try {
            
            //Bucle que cuenta del 0 al 9
            for (int contar = 0; contar < 10; contar++) {
                //interrumpcion de hilo por un tiempo idefinido
                Thread.sleep(1000);
                System.out.println("En "+nombreHilo+", El recuento"+contar);
                
            }
        
        } catch ( InterruptedException exc) {
            System.out.println(nombreHilo+" Interrumpido el proceso");
        }
        System.out.println("Termina"+nombreHilo);
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
