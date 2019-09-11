/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.iu;

import ico.fes.dao.ClienteDAO;
import ico.fes.dp.Cliente;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author jeshc
 */
public class Pruebas {
    public static void main(String[] args) {
        ClienteDAO cdao=new ClienteDAO();
        
        Cliente c= new Cliente("A1", "UNAM", "rancho seco s/n", "Neza", 56230963, "jhc", "sss");
        
        try {
            
            if (cdao.insertar(c)) {
                JOptionPane.showMessageDialog(null, "Insertado correctamente!!!");
            } else {
                JOptionPane.showMessageDialog(null, "Error al insertar, revisar los datos");
            }
            
            Cliente cli= (Cliente)cdao.buscarPorId("CT17");
            System.out.println("Empresa:"+cli.getEmpresa()+" Direccion"+cli.getDireccion());
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
