package tz.franrubio.vehiculos.model;

import java.util.List;
import tz.franrubio.vehiculos.persistencia.ModeloDAOFactory;
import tz.franrubio.vehiculos.persistencia.ModeloDAO;

/**
 * Clase GestorModelo Implimenta los métodos de la clase Modelo.
 *
 * @author Francisco J. Rubio.
 */
public class GestorModelo {

    ModeloDAOFactory fabricaDAO = new ModeloDAOFactory();
    ModeloDAO impl = fabricaDAO.getModeloDAO();

    public GestorModelo() {

    }

    /**
     * Método anyadirModelo Implementa el método de añadir una nuevo modelo.
     *
     * @param _modelo
     * @throws Exception
     */
    public void anyadirModelo(Modelo _modelo) throws Exception {
        impl.addModelo(_modelo);
    }

    /**
     * Método borrarModelo Implementa el método de borrar un una modelo.
     *
     * @param _id: Número que identifica a un modelo.
     * @throws Exception
     */
    public void borrarModelo(int _id) throws Exception {
        impl.deleteModelo(_id);
    }

    /**
     * Método buscarPorMarca Implementa el método de buscar un modelo de una
     * marca concreta.
     *
     * @param _idMarca: Número que identifica a una marca.
     * @throws Exception
     * @return Una Lista de Modelo de un marca concreta.
     */
    public List<Modelo> buscarPorMarca(int _idMarca) throws Exception {
        return impl.findIdMarca(_idMarca);
    }

    /**
     * Método buscarTodosModelos Implementa el método de buscar todos los
     * modelos.
     *
     * @throws Exception
     * @return Una Lista de Modelos.
     */
    public List<Modelo> buscarTodosModelos() throws Exception {
        return impl.findAllModelo();
    }

    /**
     * Método guardarModelo 
     * 
     * Implementa el método de guardar los datos de un
     * modelo.
     * 
     * @param _modelo
     * @throws Exception 
     */
    public void guardarModelo(Modelo _modelo) throws Exception {
        impl.updateModelo(_modelo);
    }

}
