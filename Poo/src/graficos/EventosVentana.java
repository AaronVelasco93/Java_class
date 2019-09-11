/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficos;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

/**
 *
 * @author Aaron
 */
public class EventosVentana {
    
    public static void main(String[] args) {
        
        MarcoVentana mimarco = new MarcoVentana();
        
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        MarcoVentana mimarco2= new MarcoVentana();
        
        mimarco2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        
        mimarco.setTitle("Ventana 1");
        mimarco2.setTitle("Ventana 2");
        mimarco.setBounds(300, 300, 500, 350);
        mimarco2.setBounds(900, 300, 350, 300);
        
        
    }
    
    
}


class MarcoVentana extends JFrame{
    public MarcoVentana(){
       // setTitle("respondiendo");
        //setBounds(300, 300, 500, 350);
        setVisible(true);
        
        M_Ventana oyente_ventana = new M_Ventana();
        
        addWindowListener(oyente_ventana);//se pone a la ventana a la escucha
        
        
        
        
    }
}


class M_Ventana implements WindowListener{

    @Override
    public void windowOpened(WindowEvent we) {
      
        System.out.println("Ventana abierta");
//  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowClosing(WindowEvent we) {
        
        System.out.println("Cerrando Ventana");
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowClosed(WindowEvent we) {
        System.out.println("La ventana sido cerrada");
// throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowIconified(WindowEvent we) {
        
        System.out.println("Ventana minimizada");
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowDeiconified(WindowEvent we) {
       
        System.out.println("Ventana Restaurada");
// throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowActivated(WindowEvent we) {
        System.out.println("Ventana Activada");
// throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowDeactivated(WindowEvent we) {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
