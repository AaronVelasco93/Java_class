/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba_sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author S1PC26
 */
public class Pruebas_prepared {

    private Connection con;

    public Pruebas_prepared() {
        String host;
        String dbName;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            host = "jdbc:mysql://localhost:3306/";
            dbName = "prueba_venta";

            con = DriverManager.getConnection(host + dbName, "root", "");

        } catch (Exception e) {
            System.out.println("Problema de conexion" + e);
        }

    }
    public int insertarProducto( String cp, String sec, String nombre,
            String  pre, String fecha, String importado, String pais, String foto){
        
        String sql="INSERT INTO productos VALUES (?,?,?,?,?,?,?,?);";
        int res=0;
        try {
            PreparedStatement myquery=con.prepareStatement(sql);
            myquery.setString(1, cp);
            myquery.setString(2, sec);
            myquery.setString(3, nombre);
            myquery.setString(4, pre);
            myquery.setString(5, fecha);
            myquery.setString(6, importado);
            myquery.setString(7, pais);
            myquery.setString(8, foto);
            res = myquery.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return res;
    }
    
    public static void main(String[] args) {

        Pruebas_prepared p = new Pruebas_prepared();
        int r=p.insertarProducto("ct56", "deportes", "balon", "50", "hoy", "si", "Mexico", "NA");
        if (r==1) {
            System.out.println("OK");
        }
    }

}
