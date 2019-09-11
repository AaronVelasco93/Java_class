package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//Hereda de conexion para poder realizar las consultas y usar la conexion 
public class ConsultasProducto extends ModConexion {

    //Metodo Registrar ModProducto
    public boolean registrar(ModProducto pro) {
        
        PreparedStatement ps = null;
        
        Connection con = getConexion();
        //con los ? evitamos inyeccion sql
        String sql = "INSERT INTO producto (codigo, nombre, precio , cantidad) VALUES(?,?,?,?)";

        try {
            //envia la consulta
            ps = con.prepareStatement(sql);
            
            //Enviar cada dato de la consulta
            ps.setString(1, pro.getCodigo());
            ps.setString(2, pro.getNombre());
            ps.setDouble(3, pro.getPrecio());
            ps.setInt(4, pro.getCantidad());
            ps.execute();
            return true; //Solo se puede retornar true lo false por que es un metodo boleano
            
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();//cerrar la conexion
            } catch (SQLException e) {
                System.err.println(e);//error al cerrar la conexion
            }
        }
    }
    
    //Metodo Modficar ModProducto
    public boolean modificar(ModProducto pro) {
        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "UPDATE producto SET codigo=?, nombre=?, precio=?, cantidad=? WHERE id=? ";

        try {
            //envia la consulta
            ps = con.prepareStatement(sql);
            //se mandan los datos de la consulta
            ps.setString(1, pro.getCodigo());
            ps.setString(2, pro.getNombre());
            ps.setDouble(3, pro.getPrecio());
            ps.setInt(4, pro.getCantidad());
            ps.setInt(5, pro.getId());
            ps.execute();
            return true;
            
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }

    //Metodo Eliminar producto
    public boolean eliminar(ModProducto pro) {
        
        PreparedStatement ps = null;
        
        Connection con = getConexion();

        String sql = "DELETE FROM producto WHERE id=? ";

        try {
            
            ps = con.prepareStatement(sql);
            
            ps.setInt(1, pro.getId());
            ps.execute();
            return true;
            
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }
    
    //Metodo de Busqueda de ModProducto
    public boolean buscar(ModProducto pro) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        Connection con = getConexion();

        String sql = "SELECT * FROM producto WHERE codigo=? ";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, pro.getCodigo());//manda la consulta
            rs = ps.executeQuery();//Regresa los resultados de la consulta
            
            if(rs.next())//Se envian datos para ser mostrados
            {
               pro.setId( Integer.parseInt(rs.getString("id")));//casteo
               pro.setCodigo(rs.getString("codigo"));
               pro.setNombre(rs.getString("nombre"));
               pro.setPrecio(Double.parseDouble(rs.getString("precio")));//Casteo
               pro.setCantidad(Integer.parseInt(rs.getString("cantidad")));//Casteo
               return true;//
            }
            return false;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }
}
