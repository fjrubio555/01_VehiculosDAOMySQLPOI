package tz.franrubio.vehiculos.persistencia;

/**
 * Clase MarcaDAOFactory
 *
 * Esta clase nos indica que tipo de implementación vamos a utilizar en este
 * caso va ser una base de datos.
 *
 * @author Francisco J. Rubio
 * @version 1.0
 * @since 27/06/2018
 */
public class MarcaDAOFactory {

    public MarcaDAO getMarcaDAO() {
        return new MarcaDAOMySQLImpl();
    }
}
