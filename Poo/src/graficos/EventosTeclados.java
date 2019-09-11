/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficos;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;

/**
 *
 * @author Aaron
 */
public class EventosTeclados {

    public static void main(String[] args) {

        MarcoTeclas mimarco = new MarcoTeclas();

        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}

class MarcoTeclas extends JFrame {

    public MarcoTeclas() {
        setVisible(true);
        setBounds(700, 300, 600, 450);

        EventoDeTeclado tecla = new EventoDeTeclado();

        addKeyListener(tecla);//escucha de el evento
    }
}

class EventoDeTeclado implements KeyListener {// se requieren los metodos abstractos

    @Override
    public void keyTyped(KeyEvent ke) {

        char letra = ke.getKeyChar();

        System.out.println("La letra es: " + letra);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent ke) {

        int codigo = ke.getKeyCode();

        System.out.println("Codigo" + codigo);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
