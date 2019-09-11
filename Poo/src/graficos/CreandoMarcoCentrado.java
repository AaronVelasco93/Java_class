/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficos;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 *
 * @author Aaron
 */
public class CreandoMarcoCentrado {
    public static void main(String[] args) {
        
        MarcoCentrado mimarco= new MarcoCentrado();
        
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mimarco.setVisible(true);
        
    }
    
}

class MarcoCentrado extends JFrame{
    
    public MarcoCentrado(){
        
        Toolkit mipantalla= Toolkit.getDefaultToolkit();
        
        Dimension tamanoPantalla = mipantalla.getScreenSize();
        
        int alturaPantalla = tamanoPantalla.height;
        int anchoPantalla= tamanoPantalla.width;
        
        setSize(anchoPantalla/2,alturaPantalla/2);
        setLocation(anchoPantalla/4,alturaPantalla/4);
        
        
    }
        
}