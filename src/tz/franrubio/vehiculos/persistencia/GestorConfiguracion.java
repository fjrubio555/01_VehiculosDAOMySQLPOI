package tz.franrubio.vehiculos.persistencia;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.*;
import java.util.Properties;

/**
 *
 * Clase GestorConfiguracion.
 *
 * Esta clase nos indica donde esta el fichero de configuracion.
 *
 * @author Francisco J. Rubio
 */
public class GestorConfiguracion {

    //Constante donde se encuentra la ruta del fichero properties.
    private static final Path PATH_FICHDB = Paths.get(System.getProperty("user.dir") + "/src/tz/franrubio/vehiculos/persistencia/vehiculo.prop");

    private static Properties p = new Properties();

    /**
     * Método getNombreBD.
     *
     * Método que devuelve de fichero properties el nombre de la base de datos.
     *
     * @return Cadena de texto con nombre de la base de datos.
     * @throws FileNotFoundException
     * @throws IOException
     */
    public static String getNombreBD() throws FileNotFoundException, IOException {

        p.load(new FileInputStream(PATH_FICHDB.toString()));
        return p.getProperty("bbdd");
    }

    /**
     * Método getPortDB.
     *
     * Método que devuelve el puerto de la base de datos.
     *
     * @return Devuelve un enterocon el número del puerto de la base de datos.
     * @throws FileNotFoundException
     * @throws IOException
     */
    public static int getPortDB() throws FileNotFoundException, IOException {
        p.load(new FileInputStream(PATH_FICHDB.toString()));
        return Integer.parseInt(p.getProperty("port"));
    }

    /**
     * Método getHost.
     *
     * Método que devuelve la dirección Ip donde esta alojada la base de datos.
     *
     * @return Devuelve una cadena de texto con la dirección IP.
     * @throws FileNotFoundException
     * @throws IOException
     */
    public static String getHost() throws FileNotFoundException, IOException {
        p.load(new FileInputStream(PATH_FICHDB.toString()));
        return p.getProperty("host");
    }

    /**
     * Método getUsuario.
     *
     * Método que devuelve el nombre del usuario que tiene acceso a la base de
     * datos.
     *
     * @return Devuelve una cadena de texto con el nombre del usuario de la base
     * de datos.
     * @throws FileNotFoundException
     * @throws IOException
     */
    public static String getUsuario() throws FileNotFoundException, IOException {
        p.load(new FileInputStream(PATH_FICHDB.toString()));
        return p.getProperty("usu");
    }

    /**
     * Método getPSW.
     *
     * Método que devuelve la contraseña del usuario de la base de datos.
     *
     * @return Devuelve una cadena de texto con la contraseña del usuario de la
     * base de datos.
     * @throws FileNotFoundException
     * @throws IOException
     */
    public static String getPSW() throws FileNotFoundException, IOException {
        p.load(new FileInputStream(PATH_FICHDB.toString()));
        return p.getProperty("psw");
    }
}
