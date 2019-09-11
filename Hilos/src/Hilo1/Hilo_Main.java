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
public class Hilo_Main {
    public static void main(String[] args) {
        System.out.println("Hilo principal iniciado");
        
        //contruir un objeto del hilo
        MiHilo hiloAaron = new MiHilo("HiloA_1:");
        
        //Contruyendo un hilo o un proceso del objeto hiloAaron
        Thread nuevoh = new Thread(hiloAaron);
        
        Thread nuevoh2 = new Thread(hiloAaron);
        
        Thread nuevoh3 = new Thread(hiloAaron);
        
        
        //ejecucion del hilo
        nuevoh.start();
        
        nuevoh2.start();
        nuevoh3.start();
        
        
        for (int i = 0; i < 50; i++) {
            System.out.println(" .");
     
        }try {
            Thread.sleep(100);
        } catch (InterruptedException exc) {
            System.out.println("Hilo principal a sido interreumpido");
        }
                   
        System.out.println("Hilo principa finalizado");
    }
}
