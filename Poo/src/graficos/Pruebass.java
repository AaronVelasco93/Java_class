/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficos;
//programa para ver las fuentes que estan en la maquina donde trabajas

import java.awt.Graphics;
import java.awt.GraphicsEnvironment;
import javax.swing.*;

/**
 *
 * @author Aaron
 */
public class Pruebass {

    public static void main(String[] args) {

        String fuente = JOptionPane.showInputDialog("Introduce fuente");
        boolean establecefuente = false;

        String[] nombresDeFuentes = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();

        for (String nombresDeFuente : nombresDeFuentes) {

            if (nombresDeFuente.equals(fuente)) {
                establecefuente = true;

            }

            //System.out.println(nombresDeFuente);
        }
        if (establecefuente) {
            System.out.println("Esta instalada la fuente");
        } else {
            System.out.println("No esta la fuente");
        }

    }

}
