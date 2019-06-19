/*
 * Estable los datos para la conexión de MySQL.
 */
package tz.franrubio.vehiculos.persistencia;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Esta clase pertenece a la permanencia del software
 * Se incializan los datos y la conexión a la base de datos MySQL.
 * Constantes.
 * PORT_BD = Puerto de comunicación de la base de datos.
 * DIR_BD = Dirección IP de donde esta alojada la base de datos.
 * NOM_BD = Nombre de la base de datos.
 * DRV_BD=  Driver de conexión de MySql.
 * USU_BD = Usuario de la base de datos.
 * PSW_BD = Conraseña del usuario de la base de datos.
 * DRV_OLDBD = Driver de conexión de MySql para las versiones anteriores al JDK 6.
 * @author Francisco J Rubio.
 */
public class BBDDManager {

    public Connection con = null;
//    public static final int PORT_BD = 3306;
//    public static final String DIR_BD = "localhost";
//    public static final String NOM_BD = "bbdd_gestmotor";
//    public static final String DRV_BD = "jdbc:mysql://" + DIR_BD + ":" + PORT_BD + "/" + NOM_BD;
//    public static final String USU_BD = "USRJAVA2019";
//    public static final String PSW_BD = "PWD2019ORACLE";
    public static final String DRV_OLDBD = "com.mysql.jdbc.Driver";

    /**
     * Abre las conexión tanto con los driver anteriores a la version JDK 6
     * como para las posteriores. Lanzando sus respectivas excepciones.
     */
    public void openConexion() throws ClassNotFoundException, SQLException, IOException{
        String nombreBD = GestorConfiguracion.getNombreBD();
        int portBD = GestorConfiguracion.getPortDB();
        String dirBD = GestorConfiguracion.getHost();
        String drvBD = "jdbc:mysql://" + dirBD + ":" + portBD + "/" + nombreBD;
        String usuBD= GestorConfiguracion.getUsuario();
        String pswBD = GestorConfiguracion.getPSW();
        Class.forName(DRV_OLDBD);
        con = DriverManager.getConnection(drvBD, usuBD, pswBD);
    }

    /**
     * Cierra la conexión con la base de datos.
     */
    public void closeConexion() throws SQLException {
        con.close();
    }
}
