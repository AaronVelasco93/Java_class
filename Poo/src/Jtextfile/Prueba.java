/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jtextfile;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;

/**
 *
 * @author Aaron
 */
public class Prueba {
    
    public static void main(String[] args) {
        
        MarcoPrueba mimarco = new MarcoPrueba();
        
            mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
    }
        
    
}

class MarcoPrueba extends JFrame{
    
    public MarcoPrueba (){
        
        setBounds(500, 300, 500, 350);
        
        LaminaPrueba milamina = new LaminaPrueba();
        
            add(milamina);
            setVisible(true);
    }

}

class LaminaPrueba extends JPanel{
    
    public LaminaPrueba(){
    
        JTextField micampo = new JTextField(20);
        
        EscuchaTexto el_evento = new EscuchaTexto();
        
        Document midoc = micampo.getDocument();
        
        midoc.addDocumentListener(el_evento);
        
            add(micampo);
        
    }

    private class EscuchaTexto implements DocumentListener{

        @Override
        public void insertUpdate(DocumentEvent de) {
            
            System.out.println("Has introducido un Texto");
            
        }

        @Override
        public void removeUpdate(DocumentEvent de) {
        
            System.out.println("Has eliminado el texto del area");
            
        }

        @Override
        public void changedUpdate(DocumentEvent de) {
            
        //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        }
        
    
    }    
}