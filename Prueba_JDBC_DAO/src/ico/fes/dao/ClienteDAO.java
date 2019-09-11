package ico.fes.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import ico.fes.dp.Cliente;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author jeshc
 */
public class ClienteDAO implements InterfazDAO {

    private ConexionDataBase db;

    public ClienteDAO() {
        db = ConexionDataBase.getInstance();
    }

    @Override
    public boolean insertar(Object obj) throws SQLException {
        boolean res = false;
        String query = "INSERT INTO clientes VALUES"
                + "(?,?,?,?,?,?,?);";

        Cliente c = (Cliente) obj;

        PreparedStatement pstm = db.getConexion().prepareStatement(query);
        pstm.setString(1, c.getCodigo());
        pstm.setString(2, c.getEmpresa());
        pstm.setString(3, c.getDireccion());
        pstm.setString(4, c.getPoblacion());
        pstm.setInt(5, c.getTelefono());
        pstm.setString(6, c.getResponsable());
        pstm.setString(7, c.getHistorial());

        return pstm.executeUpdate() != 0;

    }

    @Override
    public boolean update(Object obj) throws SQLException {
        Cliente c = (Cliente) obj;
        String query = "UPDATE  CLIENTES set "                
                + "EMPRESA=? ,"
                + "DIRECCION=? ,"
                + "POBLACION=? ,"
                + "TELEFONO=? ,"
                + "RESPONSABLE=?"
                + "HISTORIAL=? ,"
                + " where CODIGOCLIENTE=?;";

        PreparedStatement pstm = db.getConexion().prepareStatement(query);
        pstm.setString(1, c.getEmpresa());
        pstm.setString(2, c.getDireccion());
        pstm.setString(3, c.getPoblacion());
        pstm.setInt(4, c.getTelefono());
        pstm.setString(5, c.getResponsable());
        pstm.setString(6, c.getHistorial());
        pstm.setString(7, c.getCodigo());

        return pstm.executeUpdate()!=0;

    }

    @Override
    public boolean delete(String id) throws SQLException {
        return false;

    }

    @Override
    public ArrayList obetenerTodo() throws SQLException {
        return null;
    }

    @Override
    public Object buscarPorId(String id) throws SQLException {
        Cliente resultado = null;
        String query = "SELECT * FROM CLIENTES WHERE CODIGOCLIENTE='" + id+"'";
        
            Statement stm = db.getConexion().createStatement();
            ResultSet rst = stm.executeQuery(query);
            if (rst.next()) {
                resultado = new Cliente(rst.getString("CODIGOCLIENTE"),
                rst.getString("EMPRESA"),
                rst.getString("DIRECCION"),
                rst.getString("POBLACION"),  
                rst.getInt("TELEFONO"),
                rst.getString("RESPONSABLE"),
                rst.getString("HISTORIAL")
                );
            }

  
        return resultado;
    }

}
