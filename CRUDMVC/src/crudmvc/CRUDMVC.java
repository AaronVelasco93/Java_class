/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crudmvc;

import Controlador.CtrlProducto;
import Modelo.ConsultasProducto;
import Modelo.ModProducto;
import Vista.vistaForm;


public class CRUDMVC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        ModProducto mod = new ModProducto();
        ConsultasProducto modC = new ConsultasProducto();
        vistaForm frm = new vistaForm();
        
        CtrlProducto ctrl = new CtrlProducto(mod, modC, frm);
        ctrl.iniciar();
        frm.setVisible(true);
        
    }
    
}
