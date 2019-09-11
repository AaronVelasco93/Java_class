/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jtextfile;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author Aaron
 */
public class EjemploArea {
    
    public static void main(String[] args) {
        
        MarcoArea mimarco = new MarcoArea();
        
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
}

class MarcoArea extends JFrame{
    
    public MarcoArea(){
        
        setBounds(500, 300, 500, 350);
        
        LaminaArea milamina= new LaminaArea();
        
        add(milamina);
       
        setVisible(true);
    }

}

class LaminaArea extends JPanel{
    
    public LaminaArea(){
        
         miarea = new JTextArea(8, 20);//tamaño de el area de texto
       
        JScrollPane laminaBarras = new JScrollPane(miarea);
        
        miarea.setLineWrap(true);//metodo de TextArea
        
        add(laminaBarras);
        
        JButton miboton = new JButton("Enviar");
        
        miboton.addActionListener(new GestionaArea());
        
        add(miboton);
    }
    
    
    private class GestionaArea implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            
            System.out.println(miarea.getText());//se rescata el texto
            
            
        }
    
        
    
    }
    private JTextArea miarea;// se puede acceder en todo la clase
}
