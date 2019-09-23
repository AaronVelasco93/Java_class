/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones_aritmeticas;

import java.awt.Event;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author aaron
 */
public class Operaciones_aritmeticas {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        evento miObj = new evento();
        miObj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
}

class evento extends JFrame{
    //Declaracion de botones
    private JButton b1 = new JButton("Suma");
    private JButton b2 = new JButton("Resta");
    private JButton b3 = new JButton("Multiplicacion");
    private JButton b4 = new JButton("Divicion");
    private JButton b5 = new JButton("modulo");    
    
    handler handle = new handler();
    
    
    //metodo del evento
    evento(){
    this.add(b1);
    this.add(b2);
    this.add(b3);
    this.add(b4);
    this.add(b5);
    b1.addActionListener(handle);
    b2.addActionListener(handle);
    b3.addActionListener(handle);
    b4.addActionListener(handle);
    b5.addActionListener(handle);
    
    //Dimeciones del frame y que sea visible
    this.setSize(400,400);
    this.setVisible(true);
    this.setLayout(new FlowLayout());
   

    }
    
}

class handler implements ActionListener {
    
    @Override
    public void actionPerformed(ActionEvent e) {
        //Object b1= false;
        String operacion = e.getActionCommand();
        
        
        if (e.getSource() == operacion) {
        
            String s1 = JOptionPane.showInputDialog("Ingresa tu primer numero");
            String s2 = JOptionPane.showInputDialog("Ingresa tu segundo numero");
            int x = Integer.parseInt(s1);
            int y = Integer.parseInt(s2);
            int z = x+y;
            JOptionPane.showMessageDialog(null, "Resultado es:"+z);
            
        }
     
        
        
    }
   
    

}


