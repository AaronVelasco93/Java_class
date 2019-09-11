/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba_sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Aaron
 */
public class Delete_y_Insert_sql {
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       
      
        
        try{
          //1.- CREAR CONEXION
            //driver-> tura-> puerto-> nombre de la base-> usuario->contraseña
        Connection miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/prueba_venta","root","");
            
                      
        //2.-  CREAR UN OBJETO STATEMENT
            
        Statement miStatement = miConexion.createStatement();
        
        
        /*
        //INSERTAR UN REGISTRO EN LA BASE DE DATOS
        
        //INSTRUCCION SQL -> EN UN STRING
        String instruccionSql = "INSERT INTO productos(CODIGOARTICULO,SECCION,NOMBREARTICULO,PRECIO,FECHA,IMPORTADO)"
                + "VALUES"+ "('AR40','DEPORTES','PLAYERA',450,'06/03/2018','FALSO')" ;
                         
        //EJECUTAR INSTRUCCION -> CON EL METODO . EXECUTEUPDATE('STRING')
        miStatement.executeUpdate(instruccionSql);
            //MENSAJE DE DATOS INSERTADOS
            System.out.println("Datos insertados  CORRECTAMENTE");
        */
        
        
        // ELIMINAR UN REGISTRO
        
         String deleteSql="DELETE FROM productos WHERE CODIGOARTICULO='AR40'";
        
        //EJECUTAR INSTRUCCION -> ELIMINAR
        miStatement.executeUpdate(deleteSql);
            //mensaje de datos eliminados
            System.out.println("Se elimino el registro");
        
        
        
    }catch (Exception e){
        
        //QUE HACER SI TENEMOS UN ERROR CON LA CONEXION
              
        System.out.println("Sin Conexion ala base de Datos");
        
            /**
             * printStackTrace
             *  Es una herramienta muy simple, pero muy útil para diagnosticar una excepción.
             * Te dice qué sucedió y en qué parte del código sucedió esto.
             */
            e.printStackTrace();
        
    }
    
    
    }
    
    
    
}
