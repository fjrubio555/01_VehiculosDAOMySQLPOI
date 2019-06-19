
package tz.franrubio.vehiculos.model;

import java.util.List;
import tz.franrubio.vehiculos.persistencia.ModeloDAOFactory;
import tz.franrubio.vehiculos.persistencia.ModeloDAO;

/**
 * Clase GestorModelo
 * Implimenta los métodos de la clase Modelo.
 * @author Francisco J. Rubio.
 */
public class GestorModelo {
    ModeloDAOFactory fabricaDAO = new ModeloDAOFactory();
    ModeloDAO impl = fabricaDAO.getModeloDAO();
    
    public GestorModelo(){
        
    }
    
    public void anyadirModelo(Modelo _modelo) throws Exception{
        impl.addModelo(_modelo);
    }
    
    public void borrarModelo (int _id) throws Exception{
        impl.deleteModelo(_id);
    }
    public List<Modelo> buscarPorMarca (int _idMarca) throws Exception{
        return impl.findIdMarca(_idMarca);
    }
    public List<Modelo> buscarTodosModelos () throws Exception{
        return impl.findAllModelo();
    }
    public void guardarModelo(Modelo _modelo) throws Exception{
        impl.updateModelo(_modelo);
    }
   
}
