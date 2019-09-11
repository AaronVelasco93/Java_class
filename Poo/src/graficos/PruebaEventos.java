/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficos;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.text.StyleConstants;

/**
 *
 * @author Aaron
 */
public class PruebaEventos {
    
    public static void main(String[] args) {
        
        MarcoBotones mimarco = new MarcoBotones();
        
        mimarco.setVisible(true);
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}

class MarcoBotones extends JFrame {
    
    public MarcoBotones() {
        setTitle("Botones y Eventos");
        
        setBounds(700, 300, 500, 300);
        
        LaminaBotones milamina = new LaminaBotones();
        add(milamina);
    }
    
}

class LaminaBotones extends JPanel {

    JButton botonAzul = new JButton("Azul");
    
    JButton botonAmarillo = new JButton("Amarillo");
    
    JButton botonRojo = new JButton("Rojo");
    
    public LaminaBotones() {
        add(botonAzul);
        
        add(botonAmarillo);
        
        add(botonRojo);
        
        ColorFondo Amarillo = new ColorFondo(Color.yellow);
        
        ColorFondo Azul = new ColorFondo(Color.blue);
        
        ColorFondo Rojo = new ColorFondo(Color.red);
        
        botonAzul.addActionListener(Azul);
        botonRojo.addActionListener(Rojo);
        botonAmarillo.addActionListener(Amarillo);
        
    }
    
  private class ColorFondo implements ActionListener{

    public ColorFondo(Color c){
        
        colorDeFondo= c;
        
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        
        
        setBackground(colorDeFondo);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private Color colorDeFondo;
}
    
}

