/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficos;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Aaron
 */
public class PruebaImagenes {
    
    public static void main(String[] args) {
        
        MarcoImagen mimarco = new MarcoImagen();
        
        mimarco.setVisible(true);
       mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
    
}

class MarcoImagen extends JFrame{

    public MarcoImagen(){
        setTitle("Marco Imagen");
    
        setBounds(750,300,300,200);
        LaminaConImagen milamina = new LaminaConImagen();
        
        add(milamina);
    }
    
       

}

class LaminaConImagen extends JPanel{

    @Override
    public void paintComponent(Graphics g){
    
        super.paintComponent(g);
        
       // File miimagen = new File("src/graficos/1.jpg");
        
        try{
        
            imagen=ImageIO.read(  new File("src/graficos/2.jpg"));
        
        }catch(IOException e){
        
            System.out.println("La imagen no se encuentra");
        }
        
        g.drawImage(imagen, 0, 0,null);
        g.copyArea(0, 0, 100, 100, 200, 200);
        
    }
    
    
    private Image imagen;

}