/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Aaron
 */
public class Varios_oyentes {

    public static void main(String[] args) {
        
        Marco_Principal mimarco = new Marco_Principal();

        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mimarco.setVisible(true);

    }

}

class Marco_Principal extends JFrame {

    public Marco_Principal() {

        setTitle("Prueba Varios");

        setBounds(1000, 100, 300, 200);
        Lamina_Principal lamina = new Lamina_Principal();
        add(lamina);

    }
}

class Lamina_Principal extends JPanel {

    public Lamina_Principal() {

        JButton boton_nuevo = new JButton("Nuevo");
        add(boton_nuevo);

        boton_cerrar = new JButton("Cerrar todo");
        add(boton_cerrar);

        OyenteNuevo miOyente = new OyenteNuevo();
        boton_nuevo.addActionListener(miOyente);

    }

    private class OyenteNuevo implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {//crear una intancia 

            Marco_Emergente marco = new Marco_Emergente(boton_cerrar);
            
            marco.setVisible(true);
        }

    }
    JButton boton_cerrar;
}

class Marco_Emergente extends JFrame {

    public Marco_Emergente( JButton boton_de_principal ) {
        
        contador++;
        
        setTitle("Ventana ->" + contador);

        setBounds(40 * contador, 40 * contador, 250, 150);
        
        CierraTodos oyenteCerrar = new CierraTodos();
            boton_de_principal.addActionListener(oyenteCerrar);
        
    }

    private class CierraTodos implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            
               dispose();
        }

    }

    private static int contador = 0;

}
