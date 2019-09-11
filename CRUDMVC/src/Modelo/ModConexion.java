
package Modelo;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ModConexion {
    
    private final String base = "tienda";
    private final String user = "root";
    private final String password = "";
    private final String url = "jdbc:mysql://localhost:3306/" + base;
    private Connection con = null;//variable que va a guardar la conexion
    
    public Connection getConexion()
    {
        
        try{
            Class.forName("com.mysql.jdbc.Driver");//Ruta del driver
            con = (Connection) DriverManager.getConnection(this.url, this.user, this.password);//Realizacion de la conexion y se mandan los parametros
            
        } catch(SQLException e)
        {
            System.err.println(e);//en caso de error
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ModConexion.class.getName()).log(Level.SEVERE, null, ex);
        }
      return con;//se retorna la variable de la cinexion
    }

}
