
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
 * @author Francisco 
 */
public class ConsultaTableModel implements TableModel{
      private List<ConsultaSQL> listaConsulta;
      private String[] nombreColumnas;
      private Class[] tipos;
      
    public ConsultaTableModel(List<ConsultaSQL> _listaConsulta, String[] _nombreColumnas, Class[] _tipos){
        this.listaConsulta = _listaConsulta;
        this.nombreColumnas = _nombreColumnas;
        this.tipos = _tipos;
    }  
    public ConsultaTableModel(List<ConsultaSQL> _Consulta){
        this.listaConsulta = _Consulta;
    }  
    @Override
    public int getRowCount() {
        return listaConsulta.size();
    }

    @Override
    public int getColumnCount() {
        return nombreColumnas.length;
    }

    @Override
    public String getColumnName(int columnIndex) {
        return nombreColumnas[columnIndex];
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        
        return tipos[columnIndex];
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

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
