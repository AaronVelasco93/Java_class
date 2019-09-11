/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.Action;
import javax.swing.JOptionPane;
import javax.swing.Timer;
/**
 *
 * @author Aaron
 */
public class PruebaTemporizador {
    
    public static void main(String[] args) {
        
        DameLaHora oyente = new DameLaHora();
        //ActionListener oyente = new DameLaHra();
        Timer mitmporizador = new Timer(5000, oyente);//objeto tipo Timer (tiempo en milisegundos, el objeto)
        
        mitmporizador.start();//comienza el temporizador
        
        
        JOptionPane.showMessageDialog(null,"Pulsa Aceptar para detener");//espera de menseje
        System.exit(0);
        
    }
    
}

class DameLaHora implements ActionListener{//una interface

    @Override
    public void actionPerformed(ActionEvent e){
        Date ahora= new Date();
        
        System.out.println("Te pongo la hora cada 5 Seg"+ahora);
        
        Toolkit.getDefaultToolkit().beep();
    }
}
