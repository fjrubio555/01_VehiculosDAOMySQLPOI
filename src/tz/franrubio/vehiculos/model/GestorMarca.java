package tz.franrubio.vehiculos.model;

import java.util.ArrayList;
import tz.franrubio.vehiculos.persistencia.MarcaDAO;
import tz.franrubio.vehiculos.persistencia.MarcaDAOFactory;

/**
 * Clase GestorMarca Implimenta los métodos de la clase Marca.
 *
 * @author Francisco J. Rubio.
 * @version 1.0
 * @since 27/06/2018
 */
public class GestorMarca {

    MarcaDAOFactory fabricaDAO = new MarcaDAOFactory();
    MarcaDAO impl = fabricaDAO.getMarcaDAO();

    public GestorMarca() {

    }

    /**
     * Método anyadirMarca Implementa el método de añadir una nueva marca.
     *
     * @param _marca Marca del modelo.
     * @throws Exception Error en general
     */
    public void anyadirMarca(Marca _marca) throws Exception {
        impl.addMarca(_marca);
    }

    /**
     * Método borrarMarca Implementa el método de borrar una marca.
     *
     * @param _id Identificador de la marca a borrar.
     * @throws Exception Error en general
     */
    public void borrarMarca(int _id) throws Exception {
        impl.deleteMarca(_id);
    }

    /**
     * Método getAllMarcas Implementa el método de recoger todos las marcas.
     *
     * @return Listado de todas las marcas de la tabla de la base de datos.
     * @throws Exception Error en general
     */
    public ArrayList<Marca> getAllMarcas() throws Exception {
        return impl.getAllMarca();
    }

    /**
     * Método buscarIdMarca Implementa el método buscar la marca por su
     * identificador.
     *
     * @param _id: Identificador de la marca
     * @return El nombre de la marca que coincide con ese identificador.
     * @throws Exception Error en general
     */
    public String buscarIdMarca(int _id) throws Exception {
        return impl.findIdMarca(_id);
    }

    /**
     * Métido updateMarca Implementa el método updateMarca que actualiza los
     * datos de una marca en la base de datos.
     *
     * @param _marca: Marca de un modelo.
     * @throws Exception Error en general
     */
    public void guardarMarca(Marca _marca) throws Exception {
        impl.updateMarca(_marca);
    }
}
