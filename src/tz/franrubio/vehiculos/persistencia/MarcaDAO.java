package tz.franrubio.vehiculos.persistencia;

import java.util.ArrayList;
import tz.franrubio.vehiculos.model.Marca;

/**
 * Interfaz ModeloDAO Se indica las operaciones adicionales que se pueden llegar
 * hacer con la clase Marca. Añadir una nueva Marca, borrar una Marca tras la
 * confirmación del usuario, mostrar todas las marca, buscar por una Marca
 * concreta y guardar una Marca.
 *
 * @author Francisco J. Rubio
 * @version 1.0
 * @since 27/06/2018
 */
public interface MarcaDAO {

    public void addMarca(Marca _marca) throws Exception;

    public void deleteMarca(int _id) throws Exception;

    public ArrayList<Marca> getAllMarca() throws Exception;

    public String findIdMarca(int _id) throws Exception;

    public void updateMarca(Marca _marca) throws Exception;
}
