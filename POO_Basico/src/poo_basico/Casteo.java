/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_basico;

import javax.swing.JOptionPane;

/**
 *
 * @author Aaron Velasco
 */
public class Casteo {
    
    static int suma(int var1, int var2){
    
        return var1 + var2;
    }
    
    public static void main(String[] args) {
        
        //declaracion de variables
        String Var1;
        String Var2;
        
        Var1 = JOptionPane.showInputDialog("Numero 1");
        Var2 = JOptionPane.showInputDialog("Numero 2");
        
        //casteo
        
        //Declaracion de variables
        int x = Integer.parseInt(Var1);
        int y = Integer.parseInt(Var2);
        
        int z = x+y;
        
        //despliegue de mensaje
        JOptionPane.showMessageDialog(null, "Resultado"+z);
        
        
        
        
    }
    
}
