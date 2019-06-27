package tz.franrubio.vehiculos.persistencia;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 *
 * Clase GestorConfiguracion.
 *
 * Esta clase nos indica donde esta el fichero de configuracion.
 *
 * @author Francisco J. Rubio
 * @version 1.0
 * @since 27/06/2018
 */
public class GestorConfiguracion {

    //Constante donde se encuentra la ruta del fichero properties.
    private static final String FILE_PROP = "/tz/franrubio/vehiculos/persistencia/vehiculo.prop";
    private static Properties p = new Properties();

    //Como el metodo getResourceAsStream puede lanzar una excepcion y no me deja instanciar el fichero en un método estatico.
    //la carga del fichero propertie se hace de la siguente manera:
    static {
        //Busca el fichero en la ruta interna del proyecto.
        InputStream ficheroprop = GestorConfiguracion.class.getResourceAsStream(FILE_PROP);
        try {
            p.load(ficheroprop);
        } catch (IOException ex) {
            ex.printStackTrace();
            System.exit(0);
        }

    }

    /**
     * Método getNombreBD.
     *
     * Método que devuelve de fichero properties el nombre de la base de datos.
     *
     * @return Cadena de texto con nombre de la base de datos.
     * @throws FileNotFoundException Error en un fichero porque lo ha encontrado
     * en la ruta indicada
     * @throws IOException Error de Lectura/Escritura de un fichero.
     */
    public static String getNombreBD() throws FileNotFoundException, IOException {

        return p.getProperty("bbdd");
    }

    /**
     * Método getPortDB.
     *
     * Método que devuelve el puerto de la base de datos.
     *
     * @return Devuelve un enterocon el número del puerto de la base de datos.
     * @throws FileNotFoundException Error en un fichero porque lo ha encontrado
     * en la ruta indicada
     * @throws IOException Error de Lectura/Escritura de un fichero.
     */
    public static int getPortDB() throws FileNotFoundException, IOException {

        return Integer.parseInt(p.getProperty("port"));
    }

    /**
     * Método getHost.
     *
     * Método que devuelve la dirección Ip donde esta alojada la base de datos.
     *
     * @return Devuelve una cadena de texto con la dirección IP.
     * @throws FileNotFoundException Error en un fichero porque lo ha encontrado
     * en la ruta indicada
     * @throws IOException Error de Lectura/Escritura de un fichero.
     */
    public static String getHost() throws FileNotFoundException, IOException {

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
     * @throws FileNotFoundException Error en un fichero porque lo ha encontrado
     * en la ruta indicada
     * @throws IOException Error de Lectura/Escritura de un fichero.
     */
    public static String getUsuario() throws FileNotFoundException, IOException {

        return p.getProperty("usu");
    }

    /**
     * Método getPSW.
     *
     * Método que devuelve la contraseña del usuario de la base de datos.
     *
     * @return Devuelve una cadena de texto con la contraseña del usuario de la
     * base de datos.
     * @throws FileNotFoundException Error en un fichero porque lo ha encontrado
     * en la ruta indicada
     * @throws IOException Error de Lectura/Escritura de un fichero.
     */
    public static String getPSW() throws FileNotFoundException, IOException {

        return p.getProperty("psw");
    }

}
