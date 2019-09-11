package ico.fes.dao;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;


public class ConexionDataBase {

    private String driver;
    private String url;
    private String db;
    private String user;
    private String password;
    private  Connection conexion;
    private static ConexionDataBase instanciaUnica;

    private  ConexionDataBase() {
        /**
         * Archivo de propiedades de conexion a Mysql
         */
        setProperties();
        /**
         *  conecta a mysql
         */
        conectar();
    }


    private  ConexionDataBase(String driver, String url, String db, String user, String passwd) {
        /**
         *  conecta a mysql
         */
        this.driver=driver;
        this.url=url;
        this.db=db;
        this.user=user;
        this.password=passwd;
        conectar();
    }
    
    public static ConexionDataBase getInstance() {
        if(instanciaUnica==null){
            instanciaUnica=new ConexionDataBase();
        }else{
            System.out.println("Ya instanciada");
        }
        return instanciaUnica;
    }
        public static ConexionDataBase getInstance(String driver, String url, String db, String user, String passwd) {
        if(instanciaUnica==null){
            instanciaUnica=new ConexionDataBase(driver,url,db,user,passwd);
        }else{
            System.out.println("Ya instanciada");
        }
        return instanciaUnica;
    }
    
    private void setProperties() {
        String ruta = System.getProperty("user.dir");
        String ARCHIVO = ruta + "/src/conf/dbdata.properties";
        Properties propiedades;

        try {
            FileInputStream f =
                    new FileInputStream(ARCHIVO);

            propiedades = new Properties();
            propiedades.load(f);
            f.close();
            setDriver(propiedades.getProperty("driver"));
            setUrl(propiedades.getProperty("url"));
            setDb(propiedades.getProperty("db"));
            setUser(propiedades.getProperty("user"));
            setPassword(propiedades.getProperty("password"));

        } catch (Exception e) {
            System.out.println("Error:" + e.toString());
        }

    }
    
    
    private void conectar() {

        try {
            Class.forName(driver);
            conexion = DriverManager.getConnection(url + db, user, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
     
    public void cerrarConexion(){
        try {
            conexion.close();
        } catch (Exception e) {
            e.printStackTrace();
            conexion=null;
        }
    
    }

    public Connection getConexion() {
        return conexion;
    }

    public void setConexion(Connection conexion) {
        this.conexion = conexion;
    }

 

    public String getDb() {
        return db;
    }

    public void setDb(String db) {
        this.db = db;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getPassword() {
        return "*********";
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public static void main(String args[]) {
        ConexionDataBase bd=ConexionDataBase.getInstance();
        ConexionDataBase bd2=ConexionDataBase.getInstance();
        


    }
}