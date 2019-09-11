/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba_sql;
import java.sql.*;
/**
 *
 * @author Aaron Velasco
 */
public class Sql_consulta_select_1 {
    
      public static void main(String[] args) {
        // TODO code application logic here
        
        
        String host;
        String dbName;
        
        try{
        
            //1.- CARGAR DRIVER    
            //Encarga de hacer la conexion a la base de datos por un metodo estatico
            Class.forName("com.mysql.jdbc.Driver");
            
            //DEFINIR URL
            host="jdbc:mysql://localhost:3306/";
            //Nombre de la base de datos 
            dbName="prueba_venta";
            
            //3.- ESTABLECER CONEXION
            //En caso de tener un usuario y contraseña ponerlo
            Connection db = DriverManager.getConnection(host + dbName,"root","");
            
            //Es la sentencia a ejecutar
            Statement  st = db.createStatement();
            
            //ResuSet es un objeto tipo tabla
           ResultSet rs = st.executeQuery(" SELECT * FROM productos "); 
            
            if( rs.wasNull() )
                System.out.println("NADA\n");
            
            while( rs.next() )
            System.out.println( rs.getString("NOMBREARTICULO")+" "+rs.getString("CODIGOARTICULO")+" " );
            
            rs.close();
                st.close();
                db.close();
            
            
        }catch(Exception e){
            
            
            System.out.println("Problema de conexcion"+e);
        
        
        }
        
        
        
        
    }
    
}
