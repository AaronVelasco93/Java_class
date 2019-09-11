/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jtextfile;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Aaron
 */
public class planilla {
    
    public static void main(String[] args) {
        
        Marco_name mimarco = new Marco_name();
        
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
}

class Marco_name extends JFrame{
    
    public Marco_name(){
        
        setBounds(500, 300, 500, 350);
        
        Lamina_name milamina= new Lamina_name();
        
        add(milamina);
       
        setVisible(true);
    }

}

class Lamina_name extends JPanel{
    
    public Lamina_name(){
        
      
        
        
        
    
    }
}