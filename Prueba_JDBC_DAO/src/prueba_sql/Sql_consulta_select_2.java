/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba_sql;
import java.sql.*;

/**
 *
 * @author Aaron
 */
public class Sql_consulta_select_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       
      
        
        try{
          //1.- CREAR CONEXCION
            //driver-> tura-> puerto-> nombre de la base-> usuario->contraseña
        Connection miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/prueba_venta","root","");
            
        //2.-  CREAR UN OBJETO STATEMENT
            
        Statement miStatement = miConexion.createStatement();
        
        
        
        // 3.-EJECUTAR SQL 
      
        
        
        ResultSet miResulset=miStatement.executeQuery("SELECT * FROM productos");
       
        
       
       //4  LEER EL RESULTADO
       //leer un registro a la ves 
       
       while(miResulset.next()){
            
           /*
           System.out.println( miResulset.getString("NOMBREARTICULO")+" "+miResulset.getString("CODIGOARTICULO")+" " );
       */
           System.out.println( miResulset.getString("CODIGOARTICULO")+" "+miResulset.getString("SECCION")+" "+miResulset.getString("NOMBREARTICULO")+" " );
       
           
       } 

         
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



/*
    INSERTAR, ACTUALIZAR Y BORRAR
   INSERT, UPDATE Y DELETE

*/