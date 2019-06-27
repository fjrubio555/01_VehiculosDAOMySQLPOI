package tz.franrubio.vehiculos.persistencia;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
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
    //private static final Path PATH_FICHDB = Paths.get(System.getProperty("user.dir") + "/src/tz/franrubio/vehiculos/persistencia/vehiculo.prop");
    //private static final Path PATH_FICHDB = Paths.get("G:/Documentos/Cice_Campus/Trabajos/Trabajos/01_VehiculosDAOMySQLPOI/build/classes/vehiculo.prop");
    //URL url= new GestorConfiguracion().getClass().getResourceAsStream("vehiculo.prop");
    //File f = new File(url.toURI());
    
    
    //private static final Path PATH_FICHDB = Paths.get(url.toURI());
    private static final String FILE_PROP = "vehiculo.prop";
    
    //private static final Path PATH_FICHDB = Paths.get(GestorConfiguracion.class.getClassLoader().getResource("vehiculo.prop").getFile());
    
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
        //System.out.println(PATH_FICHDB.toString());
        //String rootPath = Thread.currentThread().getContextClassLoader().getResource("").getPath();
       //String appConfigPath = rootPath + "vehiculo.prop";
        //System.out.println(appConfigPath);
        System.out.println(GestorConfiguracion.class.getResource(FILE_PROP).getFile());
        //p.load(new FileInputStream(PATH_FICHDB.toString()));
        p.load(new FileInputStream(GestorConfiguracion.class.getResource(FILE_PROP).getFile()));
        //p.load(new FileInputStream(GestorConfiguracion.class.getClassLoader().getResource(FILE_PROP).getFile()));
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
        //p.load(new FileInputStream(PATH_FICHDB.toString()));
        p.load(new FileInputStream(GestorConfiguracion.class.getResource(FILE_PROP).getFile()));
        //p.load(new FileInputStream(GestorConfiguracion.class.getClassLoader().getResource(FILE_PROP).getFile()));
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
        //p.load(new FileInputStream(PATH_FICHDB.toString()));
        p.load(new FileInputStream(GestorConfiguracion.class.getResource(FILE_PROP).getFile()));
       //p.load(new FileInputStream(GestorConfiguracion.class.getClassLoader().getResource(FILE_PROP).getFile()));
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
        //p.load(new FileInputStream(PATH_FICHDB.toString()));
        p.load(new FileInputStream(GestorConfiguracion.class.getResource(FILE_PROP).getFile()));
        //p.load(new FileInputStream(GestorConfiguracion.class.getClassLoader().getResource(FILE_PROP).getFile()));
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
        //p.load(new FileInputStream(PATH_FICHDB.toString()));
        p.load(new FileInputStream(GestorConfiguracion.class.getResource(FILE_PROP).getFile()));
        //p.load(new FileInputStream(GestorConfiguracion.class.getClassLoader().getResource(FILE_PROP).getFile()));
        return p.getProperty("psw");
    }
}
