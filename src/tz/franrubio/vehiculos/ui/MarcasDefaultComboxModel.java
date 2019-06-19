
package tz.franrubio.vehiculos.ui;

import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import tz.franrubio.vehiculos.model.Marca;

/**
 * Clase MarcasDefaultComboxModel
 * 
 * Es una clase que hereda de DefaultComboBoxModel, la utilizaremos para que nos descargue todos las marcas
 * de los modelos de vehículos en un comboBox.
 * 
 * @param ArryList marcas: Un array con todas marcas de modelos de vehículos.
 * @author Francisco J. Rubio
 * 
 */
public class MarcasDefaultComboxModel extends DefaultComboBoxModel{
    private ArrayList<Marca> marcas;
    public MarcasDefaultComboxModel(ArrayList<Marca> marcas){
        this.marcas = marcas;
    }
    
    /**
     * Sobreescribimos el método getSize().
     * @return el tamñado de nuestro array.
     */
    @Override
    public int getSize() {
        return marcas.size();
    }
    /**
     * Sobreescribimos el metodo getElementAt.
     * @param index, indice de la marca que queremos seleccionar
     * @return la marca que tenemos seleccionada en el combobox.
     */
    @Override
    public String getElementAt(int index) {
        return marcas.get(index).getMarca();
    }
    /**
     * Método getIdMarca:
     * 
     * Un método que nos devuelve el Id de la marca que tenemos seleccionada.
     * 
     * @param index: Indice de lista del combobox que tenemos seleccionado
     * @return Id: Indentificador de la marca que tenemos selecciona en el combobox
     */
    public int getIdMarca(int index){
        return marcas.get(index).getId();
    }
    
}
