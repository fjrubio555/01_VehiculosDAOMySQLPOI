
package tz.franrubio.vehiculos.persistencia;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.*;
import java.util.Properties;

/**
 * Clase GestorConfiguracion
 * 
 * Esta clase nos indica donde esta el fichero de configuracion.
 * 
 * @author Francisco J. Rubio
 */
public class GestorConfiguracion {
    
private static final Path PATH_FICHDB = Paths.get(System.getProperty("user.dir")+ "/src/tz/franrubio/vehiculos/persistencia/vehiculo.prop"); 

   private static Properties p = new Properties();
   public static String getNombreBD() throws FileNotFoundException, IOException{
       //System.out.println(PATH_FICHDB);
       p.load(new FileInputStream(PATH_FICHDB.toString()));
       return p.getProperty("bbdd");
   }
   public static int getPortDB() throws FileNotFoundException, IOException{
       p.load(new FileInputStream(PATH_FICHDB.toString()));
       return Integer.parseInt(p.getProperty("port"));
   }
   public static String getHost() throws FileNotFoundException, IOException{
       p.load(new FileInputStream(PATH_FICHDB.toString()));
       return p.getProperty("host");
   }
   public static String getUsuario() throws FileNotFoundException, IOException{
       p.load(new FileInputStream(PATH_FICHDB.toString()));
       return p.getProperty("usu");
   }
   public static String getPSW() throws FileNotFoundException, IOException{
       p.load(new FileInputStream(PATH_FICHDB.toString()));
       return p.getProperty("psw");
   }
}
