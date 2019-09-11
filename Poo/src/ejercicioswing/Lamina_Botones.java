/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioswing;

import java.awt.Button;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 *
 * @author Aaron
 */
public class Lamina_Botones extends JPanel{
    
    public Lamina_Botones(String titulo, String [] opciones){
        
        setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), titulo));
        
        setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
        
        grupo = new ButtonGroup();//se crear el grupo de botones
        
        for (int i=0; i<opciones.length; i++){
            
            JRadioButton bot = new JRadioButton(opciones[i]);
            
            bot.setActionCommand(opciones[i]);
            
            add(bot);
            grupo.add(bot);
            
            bot.setSelected(i==0);
            
        }
        
    }
    
    public String dameSeleccion(){
        
        ButtonModel miboton= grupo.getSelection();
        String s = miboton.getActionCommand();//devulbe el string
        
        return s;//devulbe el string
        
    }
    
    private ButtonGroup grupo;
    
}
