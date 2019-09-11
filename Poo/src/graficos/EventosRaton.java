/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficos;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;

/**
 *
 * @author Aaron
 */
public class EventosRaton {
    
    public static void main(String[] args) {
        
        MarcoRaton mimarco = new MarcoRaton();
        
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
}


class MarcoRaton extends JFrame{
    public MarcoRaton(){
        setVisible(true);
        setBounds(700, 300, 600, 450);
        
        EventosDeRaton EventoRaton = new EventosDeRaton();
            //addMouseListener(EventoRaton);//se pone a la escucha
            addMouseMotionListener(EventoRaton);
    }

}

class EventosDeRaton implements MouseMotionListener{//herencia

    @Override
    public void mouseDragged(MouseEvent me) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("estas arrastrando el raton");
    }

    @Override
    public void mouseMoved(MouseEvent me) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Estas moviendo el raton");
    }


}