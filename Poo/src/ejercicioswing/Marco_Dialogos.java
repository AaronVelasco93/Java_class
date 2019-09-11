/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioswing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Rectangle2D;
import java.util.Date;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Aaron
 */
public class Marco_Dialogos extends JFrame {
    
    public Marco_Dialogos(){
        
        setTitle("Prueba de dialogos");
        setBounds(300, 300, 600, 450);
        
        JPanel lamina_cuadricula = new JPanel();//se crea una lamina
        
        lamina_cuadricula.setLayout(new GridLayout(2,3));
    
        String primero[] ={"Mensaje","Confirmar","Opcion","Entrada"};
        
        lamina_tipo = new Lamina_Botones("Tipo", primero);
        
        lamina_tipo_mensajes = new Lamina_Botones("Tipo de Mensaje", new String []{
            
            "ERROR_MESSAGE",
            "INFORMATIO_MESSAGE",
            "WARNING_MESSAJE",
            "QUESTION_MESSAGE",
            "PLAIN_MESSAGE"
            
        });
        
        lamina_mensaje = new Lamina_Botones("Mensaje", new String[]{
            
            "Cadena",
            "Icono",
            "Componente",
            "Otros",
            "Object[]"
        
        });
        lamina_tipo_opcion = new Lamina_Botones("Confirmar", new String []{
        
            "DEFAULT_OPTION",
            "YES_NO_OPTION",
            "YES_NO_CANCEL_OPTION",
            "OK_CANCEL_OPTION"
                
        });
        
        lamina_opciones = new Lamina_Botones("Opcion", new String[]{
            
                "String[]",
                "Icon[]",
                "Object[]"
        });
        
        String cuarto[]={"campo_texto","Combo"};
        
        lamina_entrada = new Lamina_Botones("Entrada", cuarto);
        
        
        setLayout(new BorderLayout());
        
        
        lamina_cuadricula.add(lamina_tipo);
        lamina_cuadricula.add(lamina_tipo_mensajes);
        lamina_cuadricula.add(lamina_mensaje); 
        lamina_cuadricula.add(lamina_tipo_opcion);
        lamina_cuadricula.add(lamina_opciones);
        lamina_cuadricula.add(lamina_entrada);
        //contrulle la lamina inferior
        
        JPanel lamina_mostrar = new JPanel();//se crear otra lamina
        
        JButton boton_mostrar = new JButton("Mostrar");// asignacion del nombre  el boton
        
        boton_mostrar.addActionListener(new AccionMostrar());
        
        lamina_mostrar.add(boton_mostrar);//boton dentreo de la lamina
        
        add(lamina_mostrar, BorderLayout.SOUTH);//boton en el sur
        
        add(lamina_cuadricula, BorderLayout.CENTER);//la lamina con grid se queda en el centro
        
        add(lamina_cuadricula);
        
        
    }
    //----------------------------------DEVUELVE TIPO ICONO y tambien numero de botones en confirmar--------------------------------------
    
    
    public int dameTipo(Lamina_Botones lamina){
        
        String s = lamina.dameSeleccion();
        
        if (s.equals("ERROR_MESSGE")|| s.equals("YES_NO_OPTION")){
            
            return 0;
            
        }else if(s.equals("IFORMATION_MESSAGE") || s.equals("YES_NO_CANCEL_OPTION")){
        
            return 1;
        
        }else if(s.equals("WARNING_MESSAJE") || s.equals("OK_CANCEL_OPTION")){
        
            return 2;
        }else if (s.equals("QUESTION_MESSAGE")){
            
            return 3;
        }else if (s.equals("PLAIN_MESSAGE")|| s.equals("DEFAULT_OPTION")){
        
            return -1;
        }else{
        return 0;
           }
    }
    
    //----------------------------------Da opciones a la lamina opcion---------------------------
    
    public Object[] dameOpcions(Lamina_Botones lamina){
        
        String s = lamina.dameSeleccion();
        
        if(s.equals("String[]")){
        
            return new String[]{"Amarillo","Azul","Rojo"};
        
        }else if(s.equals("Icon[]")){
        
            return new Object[]{new ImageIcon("src/bola_azul.gif"),new ImageIcon("src/bola_roja.gif"),new ImageIcon("src/bola_amarilla.gif")};
     
        }else if(s.equals("Object[]")){
            
             return new Object[]{cadenaMensaje,
                    iconoMensaje,
                    compoeneteMensaje,
                    objetoMensaje
            };
        
        }
        
        else{
            
            return null;
        
        }
        
        
    }
    
    
    //----------------------------------PROPORCIONA EL MENSAJE------------------------------------
    
     public Object dameMensaje(){
         
         String s = lamina_mensaje.dameSeleccion();//devuleve el string de la opcion deleccionada
     
         if(s.equals("Cadena")){
             
             return cadenaMensaje;
             
         }else if(s.equals("Icono")){
             
             return iconoMensaje;
         }else if(s.equals("Componente")){
         
             return compoeneteMensaje;
         
         }else if(s.equals("Otros")){
             
             return objetoMensaje;
         
         }else if (s.equals("Object[]")){
             
             return new Object[]{cadenaMensaje,
                    iconoMensaje,
                    compoeneteMensaje,
                    objetoMensaje
            };
             
         }else {
             
             return null;
         
         }
      
         
         
     }   
    
    
    //-------------------------------------------------------------------------------------------
    private class AccionMostrar implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
        
          //  System.out.println(lamina_tipo.dameSeleccion());  
            
          if (lamina_tipo.dameSeleccion().equals("Mensaje")){
              
              JOptionPane.showMessageDialog(Marco_Dialogos.this,dameMensaje(),"Titulo",dameTipo(lamina_tipo_mensajes));
          
          }else if(lamina_tipo.dameSeleccion().equals("Confirmar")){
          
              JOptionPane.showConfirmDialog(Marco_Dialogos.this, dameMensaje(),"Titulo",dameTipo(lamina_tipo_opcion),dameTipo(lamina_tipo_mensajes));
              
          
          }else if(lamina_tipo.dameSeleccion().equals("Entrada")){
              
              if(lamina_entrada.dameSeleccion().equals("Campo de texto")){
              
                JOptionPane.showInputDialog(Marco_Dialogos.this, dameMensaje(),"Titulo",dameTipo(lamina_tipo_mensajes));
              
              }else{
                  
                  JOptionPane.showInputDialog(Marco_Dialogos.this, dameMensaje(), "Titulo", dameTipo(lamina_tipo_mensajes), null, new String []{"Amarillo","Azul","Rojo"},"Azul");
              }
              
          }else if(lamina_tipo.dameSeleccion().equals("Opcion")){
          
              JOptionPane.showOptionDialog(Marco_Dialogos.this,dameMensaje(),"Titulo",1,dameTipo(lamina_tipo_mensajes),null,dameOpcions(lamina_opciones),null);
          }
        }
    
        
    }
    
    private Lamina_Botones lamina_tipo, lamina_tipo_mensajes, lamina_mensaje;
    private Lamina_Botones lamina_tipo_opcion;
    private Lamina_Botones lamina_opciones;
    private Lamina_Botones lamina_entrada;
    
    
   private String cadenaMensaje="Mensaje";
   private Icon iconoMensaje= new ImageIcon("src/bola_azul.gif");
   private Object objetoMensaje = new Date();
   private Component compoeneteMensaje = new Lamina_Ejemplo();
    
}

class Lamina_Ejemplo extends JPanel{
    
    @Override
    public void paintComponent(Graphics g){
    
        super.paintComponents(g);
        
        Graphics2D g2=(Graphics2D) g;
        
        Rectangle2D rectangulo = new Rectangle2D.Double(0,0,getWidth(),getHeight());
        
        g2.setPaint(Color.YELLOW);//rellenar el rectangulo
        
        g2.fill(rectangulo);
        
    }
}