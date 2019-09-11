/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package layouts;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Aaron
 */
public class Layouts_I {

    public static void main(String[] args) {

        Marco_Layouts marco = new Marco_Layouts();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);

    }

}

class Marco_Layouts extends JFrame {

    public Marco_Layouts() {

        setTitle("Pruva accciones");
        setBounds(600, 350, 500, 500);
        Panel_Layout lamina = new Panel_Layout();

        //FlowLayout disposicio = new FlowLayout(FlowLayout.CENTER);
        //lamina.setLayout(disposicio);
        Panel_Layout2 lamina2 = new Panel_Layout2();

        add(lamina, BorderLayout.NORTH);

        add(lamina2, BorderLayout.SOUTH);

    }

}

class Panel_Layout extends JPanel {

    public Panel_Layout() {

        setLayout(new FlowLayout(FlowLayout.LEFT));
//separacion Horizontal y Vertical

        add(new JButton("Amarillo"));
        add(new JButton("Rojo"));

    }

}

class Panel_Layout2 extends JPanel {

    public Panel_Layout2() {

        setLayout(new BorderLayout());
        add(new JButton("Azul"), BorderLayout.WEST);
        add(new JButton("Verde"), BorderLayout.EAST);
        add(new JButton("Negro"), BorderLayout.CENTER);

    }

}
