package tz.franrubio.vehiculos.persistencia;

/**
 * Clase ModeloDAOFactory Esta clase nos devuelve una implementación en el caso
 * actual de MySql.
 *
 * @author Francisco J. Rubio
 * @version 1.0
 * @since 27/06/2018
 */
public class ModeloDAOFactory {

    public ModeloDAO getModeloDAO() {
        return new ModeloDAOMySQLImpl();
    }
}
