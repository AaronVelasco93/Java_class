/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficos;

import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;
import javax.swing.JFrame;

/**
 *
 * @author Aaron
 */
public class CambioEstado {
    
  public static void main(String[] args) {
        
        MarcoEstado mimarco = new MarcoEstado();
        
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
      
        
    }
    
    
}


class MarcoEstado extends JFrame{
    public MarcoEstado(){
       setTitle("respondiendo");
        setBounds(300, 300, 500, 350);
         setVisible(true);
         
    CambiaEstado nuevo_estado = new CambiaEstado();
        
        addWindowStateListener(nuevo_estado);
    
        
    }
}


class CambiaEstado implements WindowStateListener {

    @Override
    public void windowStateChanged(WindowEvent we) { // METODO ABSTRACTO
       
        System.out.println("La ventana a cambiado de estado");
        
      //  System.out.println(we.getNewState());
      if (we.getNewState()==6){
          System.out.println("La ventana esta pantalla completa");
      }  
      
    }
    

}