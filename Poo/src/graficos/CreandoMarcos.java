/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficos;
import com.sun.glass.ui.Cursor;
import java.awt.Frame;
import javax.swing.*;
/**
 *
 * @author Aaron
 */
public class CreandoMarcos {
    
    public static void main(String[] args) {
        
        miMarco marco1 = new miMarco();
            
        marco1.setVisible(true);//se hace visible
        marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//se cierra
        
    }
    
}


class miMarco extends JFrame{
    
    public miMarco(){
        
       // setSize(500,300);//tamaño de la ventana
    
        //setLocation(500,300);
        
        setBounds(500,300,550,250);
        
        //setResizable(false);
        //setExtendedState(Frame.MAXIMIZED_BOTH);
        setTitle("Mi ventana");
    }
    
    
    
    
}