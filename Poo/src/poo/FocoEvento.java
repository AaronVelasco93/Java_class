/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import com.sun.prism.Graphics;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Aaron
 */
public class FocoEvento {
  
    public static void main(String[] args) {
        
    MarcoFoco mimarco = new MarcoFoco();
        
      mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    }
   
}
 class MarcoFoco extends JFrame{
     
     public MarcoFoco(){
         
         setVisible(true);
         
         setBounds(300, 300, 600, 450);
         add(new LaminaFoco());
         
     }
 
 }

class LaminaFoco extends JPanel{
    
    public void paintComponent(Graphics g){
        
       
       super.paintComponent((java.awt.Graphics) g);
        setLayout(null);//asi no hay colocacion por defecto
        cuadro1 = new JTextField();
        
        cuadro2 = new JTextField();
        
        cuadro1.setBounds(120, 10, 150, 20);
        cuadro2.setBounds(120, 50, 150, 20);
            add(cuadro1);
            add(cuadro2);
            
        LanzaFocos elFoco = new LanzaFocos();
            cuadro1.addFocusListener(elFoco);
    }
    private class LanzaFocos implements FocusListener{

    @Override
    public void focusGained(FocusEvent fe) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void focusLost(FocusEvent fe) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("He perdido el foco");
    }
    
    
}
    
    JTextField cuadro1;//variable tipo objeto
    JTextField cuadro2;//variable tipo objeto
    
}

