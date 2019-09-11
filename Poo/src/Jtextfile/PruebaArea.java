/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jtextfile;

import javax.swing.JFrame;

/**
 *
 * @author Aaron
 */
public class PruebaArea {
    
    
    public static void main(String[] args) {
    
        MarcoPruebaArea mimarco = new MarcoPruebaArea();
        
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        mimarco.setVisible(true);
        
        
    }
}
class MarcoPruebaArea extends JFrame{

    public MarcoPruebaArea(){
        
        setTitle("Prubas de area");
        
        setBounds(500, 300, 500, 350);
    }

}
