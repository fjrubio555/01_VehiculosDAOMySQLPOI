package tz.franrubio.vehiculos.persistencia;

/**
 * Clase ModeloDAOFactory Esta clase nos devuelve una implementación en el caso
 * actual de MySql.
 *
 * @author Francisco J. Rubio
 */
public class ModeloDAOFactory {

    public ModeloDAO getModeloDAO() {
        return new ModeloDAOMySQLImpl();
    }
}
