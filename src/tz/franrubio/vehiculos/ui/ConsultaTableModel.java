
package tz.franrubio.vehiculos.ui;

import java.util.List;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import tz.franrubio.vehiculos.persistencia.ConsultaSQL;

/**
 * Clase ConsultaTableModel
 * 
 * Esta clase se carga el Table Model de la Consulta
 * Valmos a sobreescribir las metodos de la interfaz TableModel con datos de nuestra consulta sql.
 * 
 * @author Francisco J. Rubio
 * @version 1.0
 * @since 27/06/2018
 */
public class ConsultaTableModel implements TableModel{
      private List<ConsultaSQL> listaConsulta;
      private String[] nombreColumnas;
      private Class[] tipos;
    /**
     * Constructor ConsultaTableModel
     * 
     * @param _listaConsulta: Listado con el resultado de una consulta Sql.
     * @param _nombreColumnas: Listado de los nombres de las Columnas de la tabla.
     * @param _tipos: Listado con los tipos de los datos de las Columnas de la tabla.
     */  
    public ConsultaTableModel(List<ConsultaSQL> _listaConsulta, String[] _nombreColumnas, Class[] _tipos){
        this.listaConsulta = _listaConsulta;
        this.nombreColumnas = _nombreColumnas;
        this.tipos = _tipos;
    } 
    /**
     * Constructor ConsultaTableModel
     * 
     * @param _consulta: Lista con el resultado de una consulta Sql.
     */
    public ConsultaTableModel(List<ConsultaSQL> _consulta){
        this.listaConsulta = _consulta;
    } 
    /**
     * Sobreescritura del método getRowCount
     * 
     * Método que devuelve el número de Filas de la tabla.
     * 
     * @return Devuelve el tamaño de lista de la consulta sql.
     */
    @Override
    public int getRowCount() {
        return listaConsulta.size();
    }
    /**
     * Sobreescritura del método getColumnCount.
     * 
     * Método que duelve el número de Columnas de la tabla.
     * 
     * @return Devuelve la capacidad de la Lista nombre de Columnas.
     */
    @Override
    public int getColumnCount() {
        return nombreColumnas.length;
    }
    /**
     * Sobreescritura del método getColumnName.
     * 
     * Devuelve el nombre de una columna concreta.
     * 
     * @param columnIndex:Número de la columna.
     * @return Valor almacenado de la lista nombreColumnas en ese número de columna.
     */
    @Override
    public String getColumnName(int columnIndex) {
        return nombreColumnas[columnIndex];
    }
    /**
     * Sobreescritura del método getColumnClass.
     * 
     * Devuelve el tipo de datos que se muestra en cada columna.
     * 
     * @param columnIndex:Número de la columna
     * @return Devuelve el tipo de datos almacenado en la lista tipos en ese número de columna.
     */
    @Override
    public Class<?> getColumnClass(int columnIndex) {
        
        return tipos[columnIndex];
    }
    /**
     * Sobreescritura del método isCellEditable.
     * 
     * Este método indica que las celda no son editables.
     * 
     * @param rowIndex: Número de la Fila.
     * @param columnIndex: Número de la Columna
     * @return falso
     */
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }
    /**
     * Sobreescritura del método getValueAt.
     * 
     * Se realiza el volcado de datos de cada una de las filas de Lista de la consulta sql a las filas a la tabla.
     * @param rowIndex: Número de Fila.
     * @param columnIndex  Número de Columna
     * @return El valor correspondiente segun el indice de la columna que corresponda.
     */
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
           ConsultaSQL filaconsulta = listaConsulta.get(rowIndex);
           switch (columnIndex){
               case 0: return filaconsulta.getCampo1();
               case 1: return filaconsulta.getCampo2();
               case 2: return filaconsulta.getCampo3();
               case 3: return filaconsulta.getCampo4();
               case 4: return filaconsulta.getCampo5();
               case 5: return filaconsulta.getCampo6();
               default: return "Error";
           }
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addTableModelListener(TableModelListener l) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeTableModelListener(TableModelListener l) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
