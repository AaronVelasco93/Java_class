/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficos;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Aaron
 */
public class EscribiendoEnMarco {
    public static void main(String[] args) {
        
        
        MarcoConTexto mimarco= new MarcoConTexto();
        
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
    
       
}

class MarcoConTexto extends JFrame{

    public MarcoConTexto(){
        
        setVisible(true);
        setSize(600,450);// tamaño en eje X Y
        setLocation(400,200);//
        setTitle("Primer texto");
        Lamina milamina = new Lamina();
        add(milamina);
        
    }
}

class Lamina extends JPanel{
    @Override
    public void paintComponent(Graphics g){
        
        super.paintComponent(g);
        
        Graphics2D g2 = (Graphics2D) g;
        
        
        Rectangle2D rectangulo = new Rectangle2D.Double(100,100,200,150);
        
        g2.draw(rectangulo);
       
    }
}