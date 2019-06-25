/*
 * Estable los datos para la conexión de MySQL.
 */
package tz.franrubio.vehiculos.persistencia;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Clase BBDDManager.
 *
 * Esta clase pertenece a la permanencia del software Se incializan los datos y
 * la conexión a la base de datos MySQL a traves de un fichero properties.
 *
 * @author Francisco J Rubio.
 */
public class BBDDManager {

    public Connection con = null;

    public static final String DRV_OLDBD = "com.mysql.jdbc.Driver";

    /**
     * Método openConexion
     *
     * Abre las conexión tanto con los driver anteriores a la version JDK 6 como
     * para las posteriores. Lanzando sus respectivas excepciones.
     *
     * nombreBD : Nombre de la base de datos. portBD: Puerto de la base de
     * datos. dirBD: Dirección Ip de donde esta alojada la base de datos. drvBD:
     * Driver de conexión de MySql. usuBD: Usuario de la base de datos. pswBD:
     * Contraseña del usuario de la base de datos DRV_OLDBD: Constante. Driver
     * de conexión de Mysql pra versiones anteriores al JDK 6.
     *
     * @throws ClassNotFoundException
     * @throws SQLException
     * @throws IOException
     */
    public void openConexion() throws ClassNotFoundException, SQLException, IOException {
        String nombreBD = GestorConfiguracion.getNombreBD();
        int portBD = GestorConfiguracion.getPortDB();
        String dirBD = GestorConfiguracion.getHost();
        String drvBD = "jdbc:mysql://" + dirBD + ":" + portBD + "/" + nombreBD;
        String usuBD = GestorConfiguracion.getUsuario();
        String pswBD = GestorConfiguracion.getPSW();
        Class.forName(DRV_OLDBD);
        con = DriverManager.getConnection(drvBD, usuBD, pswBD);
    }

    /**
     * Cierra la conexión con la base de datos.
     *
     * @throws SQLException
     */
    public void closeConexion() throws SQLException {
        con.close();
    }
}
