package tz.franrubio.vehiculos.persistencia;

import java.util.List;
import tz.franrubio.vehiculos.model.Modelo;

/**
 * Interfaz ModeloDAO Se indica las operaciones adicionales que se pueden llegar
 * hacer con el Modelo. Añadir un nuevo Modelo. Consultar los Modelos de una
 * determinada Marca. Borrar un Modelo tras confirmación del usuario. Consultar
 * todos los Modelos. Guardar/Salvar un Modelo.
 *
 * @author Francisco J. Rubio
 * @version 1.0
 * @since 27/06/2018
 */
public interface ModeloDAO {

    public void addModelo(Modelo modelo) throws Exception;

    public void deleteModelo(int id) throws Exception;

    public List<Modelo> findIdMarca(int idMarca) throws Exception;

    public List<Modelo> findAllModelo() throws Exception;

    public void updateModelo(Modelo modelo) throws Exception;
}
