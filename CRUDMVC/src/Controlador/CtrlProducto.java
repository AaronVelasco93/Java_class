package Controlador;

import Modelo.ConsultasProducto;
import Modelo.ModProducto;
import Vista.vistaForm;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

//Action Listener para los eventos
public class CtrlProducto implements ActionListener {

   //se llaman a las clases creadas por medio de variables 
    private ModProducto mod;
    private ConsultasProducto modC;
    private vistaForm frm;

    //Contructor 
    public CtrlProducto(ModProducto mod, ConsultasProducto modC, vistaForm frm) {
        this.mod = mod;
        this.modC = modC;
        this.frm = frm;
        //Declaracin de las acciones para cada Boton
        this.frm.btnGuardar.addActionListener(this);
        this.frm.btnModificar.addActionListener(this);
        this.frm.btnEliminar.addActionListener(this);
        this.frm.btnLimpiar.addActionListener(this);
        this.frm.btnBuscar.addActionListener(this);
    }

    //Metodo para inciar la Vista
    public void iniciar() {
        frm.setTitle("Productos de Inventario");
        frm.setLocationRelativeTo(null);
        frm.txtId.setVisible(false);//la caja de texto no sea visible del Id
    }
    
    //metodo para la escucha de los botones
    
     
     @Override
    public void actionPerformed(ActionEvent e) {
        //por medio del if se selecciona que boton va a realizar una accion
        //GUARDAR
        if (e.getSource()==frm.btnGuardar) {
            //Se toman los balores de las cajas de Texto para poder meterlos a el modelopara poder llamar el metodos de guardar y aser el insert a la DB
             mod.setCodigo(frm.txtCodigo.getText());
             mod.setNombre(frm.txtNombre.getText());
             mod.setPrecio(Double.parseDouble(frm.txtPrecio.getText()));//casteo por el tipo de dato
             mod.setCantidad(Integer.parseInt(frm.txtCantidad.getText()));//cateo por el tipo de dato
            
            if(modC.registrar(mod)){
                JOptionPane.showMessageDialog(null, "Registro gudardado Correctamente");
                limpiar();
            }else{
                JOptionPane.showMessageDialog(null, "Error añ realizar el Registro");
                limpiar();
            }
        }
        
        //MODIFICAR
        if (e.getSource() == frm.btnModificar) {
            mod.setId(Integer.parseInt(frm.txtId.getText()));//se agrega el id para la busqueda y realiza el casteo
            
            mod.setCodigo(frm.txtCodigo.getText());
            mod.setNombre(frm.txtNombre.getText());
            mod.setPrecio(Double.parseDouble(frm.txtPrecio.getText()));
            mod.setCantidad(Integer.parseInt(frm.txtCantidad.getText()));
            
            if(modC.modificar(mod))
            {
                JOptionPane.showMessageDialog(null, "Registro Modificado");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error al Modificar");
                limpiar();
            }
        }
        //ELIMINAR
        if (e.getSource() == frm.btnEliminar) {
            mod.setId(Integer.parseInt(frm.txtId.getText()));//Solo el ID
            
            if(modC.eliminar(mod))
            {
                JOptionPane.showMessageDialog(null, "Registro Eliminado Correctamente");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error al Eliminar Registro");
                limpiar();
            }
        }
        //BUSCAR
        if (e.getSource() == frm.btnBuscar) {
            mod.setCodigo(frm.txtCodigo.getText());
            
            if(modC.buscar(mod))
            {
                //en el caso de encontrar algun resultado se requiere acomodar en cada caja de texto
                frm.txtId.setText(String.valueOf(mod.getId()));//cateo
                frm.txtCodigo.setText(mod.getCodigo());
                frm.txtNombre.setText(mod.getNombre());
                frm.txtPrecio.setText(String.valueOf(mod.getPrecio()));
                frm.txtCantidad.setText(String.valueOf(mod.getCantidad()));

            } else {
                JOptionPane.showMessageDialog(null, "No se encontro registro");
                limpiar();
            }
        }
        
        if (e.getSource() == frm.btnLimpiar) {
            limpiar();
        }

    }
   
    
    //Metodos para limipiar todas las cajas de texto
    public void limpiar()
    {
        frm.txtId.setText(null);
        frm.txtCodigo.setText(null);
        frm.txtNombre.setText(null);
        frm.txtPrecio.setText(null);
        frm.txtCantidad.setText(null);
    }

   

}
