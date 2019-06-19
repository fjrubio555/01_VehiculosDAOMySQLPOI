/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tz.franrubio.vehiculos.ui;


import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.FontUnderline;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import tz.franrubio.vehiculos.model.GestorMarca;
import tz.franrubio.vehiculos.model.GestorModelo;
import tz.franrubio.vehiculos.model.Modelo;
import tz.franrubio.vehiculos.persistencia.ConsultaSQL;

/**
 *
 * @author xXx
 */
public class JPConsulta extends javax.swing.JPanel {

    /**
     * Creación del Panel de Consultas.
     */
    private GestorModelo gmC = new GestorModelo();
    private GestorMarca gmaC = new GestorMarca();
    private static final String CONS_MENG1 = "Debe elegir algun criterio de consulta";
    private static final String CONS_MENG2 = "Exportada Consulta a Hoja de Cálculo de Excel.";
    
    public JPConsulta() {
        initComponents();

        jcbMarcas.removeAllItems();
        jcbMarcas.setEnabled(false);
        //DefaultTableModel JTConsulta = new ConsultaTableModel();
        //ConsultaTableModel ctm = new ConsultaTableModel(consultas, nombrescampos, tipos);
        ((DefaultTableModel)jTConsulta.getModel()).setRowCount(0);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelSeleccion = new javax.swing.JPanel();
        jcbMarcas = new javax.swing.JComboBox<>();
        jbBuscar = new javax.swing.JButton();
        jcbMarca = new javax.swing.JCheckBox();
        jPanelExportacion = new javax.swing.JPanel();
        jbExcel = new javax.swing.JButton();
        bProgreso01 = new javax.swing.JProgressBar();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTConsulta = new javax.swing.JTable();

        setMaximumSize(new java.awt.Dimension(600, 420));
        setMinimumSize(new java.awt.Dimension(600, 420));
        setName("PanelConsulta"); // NOI18N
        setPreferredSize(new java.awt.Dimension(600, 420));
        setLayout(new java.awt.BorderLayout());

        jcbMarcas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcbMarcas.setToolTipText("Marcas de Vehiculos");

        jbBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tz/franrubio/vehiculos/icons/busquedacoche.png"))); // NOI18N
        jbBuscar.setToolTipText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jcbMarca.setText("Marca");
        jcbMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbMarcaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelSeleccionLayout = new javax.swing.GroupLayout(jPanelSeleccion);
        jPanelSeleccion.setLayout(jPanelSeleccionLayout);
        jPanelSeleccionLayout.setHorizontalGroup(
            jPanelSeleccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSeleccionLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jcbMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanelSeleccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelSeleccionLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbBuscar)
                        .addGap(34, 34, 34))
                    .addGroup(jPanelSeleccionLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jcbMarcas, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(380, Short.MAX_VALUE))))
        );
        jPanelSeleccionLayout.setVerticalGroup(
            jPanelSeleccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSeleccionLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanelSeleccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbMarcas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbMarca))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbBuscar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanelSeleccion, java.awt.BorderLayout.PAGE_START);

        jPanelExportacion.setPreferredSize(new java.awt.Dimension(515, 80));

        jbExcel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tz/franrubio/vehiculos/icons/iconexcel.png"))); // NOI18N
        jbExcel.setToolTipText("Exporta la busqueda a un documento Excel");
        jbExcel.setBorder(null);
        jbExcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExcelActionPerformed(evt);
            }
        });

        bProgreso01.setStringPainted(true);

        javax.swing.GroupLayout jPanelExportacionLayout = new javax.swing.GroupLayout(jPanelExportacion);
        jPanelExportacion.setLayout(jPanelExportacionLayout);
        jPanelExportacionLayout.setHorizontalGroup(
            jPanelExportacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bProgreso01, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
            .addGroup(jPanelExportacionLayout.createSequentialGroup()
                .addGap(267, 267, 267)
                .addComponent(jbExcel)
                .addContainerGap())
        );
        jPanelExportacionLayout.setVerticalGroup(
            jPanelExportacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelExportacionLayout.createSequentialGroup()
                .addComponent(bProgreso01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbExcel, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanelExportacion, java.awt.BorderLayout.PAGE_END);

        jTConsulta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTConsulta.setName(""); // NOI18N
        jScrollPane1.setViewportView(jTConsulta);
        jTConsulta.getAccessibleContext().setAccessibleDescription("");

        add(jScrollPane1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jbExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcelActionPerformed
        //Creamos un Hilo para la barra de Progreso.
        new Thread( new Runnable() {
            @Override
            public void run() {
                CrearExcel();
            }

        }).start();


    }//GEN-LAST:event_jbExcelActionPerformed
    /**
     * Este evento genera la consulta y carga el JTable.
     *
     * @param evt
     */
    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        if (jcbMarca.isSelected()) {
            int _indexSelec = jcbMarcas.getSelectedIndex();
            int _idMarca = ((MarcasDefaultComboxModel) jcbMarcas.getModel()).getIdMarca(_indexSelec);
            ConsultaSQL consulta = null;
            List<ConsultaSQL> consultas = new ArrayList<>();
            try {
                List<Modelo> modelos = gmC.buscarPorMarca(_idMarca);
                for (Modelo _modelo : modelos) {
                    consulta = new ConsultaSQL(String.valueOf(_modelo.getId()),
                            String.valueOf(jcbMarcas.getSelectedItem()),
                            _modelo.getNombreModelo(),
                            String.valueOf(_modelo.getConsumoModelo()),
                            String.valueOf(_modelo.getEmisionesModelo()),
                            _modelo.getClaEner());
                    consultas.add(consulta);
                }
                Class[] tipos = {String.class, String.class, String.class, String.class, String.class, String.class};
                String[] nombrecampos = {"Id", "Marca", "Modelo", "Consumo", "Eficiencia", "Clasif. Energética"};
                ConsultaTableModel ctm = new ConsultaTableModel(consultas, nombrecampos, tipos);
                jTConsulta.setModel(ctm);

            } catch (Exception ex) {
                ex.printStackTrace();
                showDialog(ex.getMessage());

            }
        } else {

            showDialog(CONS_MENG1);
        }
    }//GEN-LAST:event_jbBuscarActionPerformed
    /**
     * Cuando activamos este evento indicamos que queremos relizar una consulta
     * por marcas. Cargamos el listado de marcas en el ComboBox y lo activamos
     * para poder realizar la consulta.
     *
     * @param evt
     */
    private void jcbMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbMarcaActionPerformed
        try {
            if (jcbMarca.isSelected()) {
                jcbMarcas.setModel(new MarcasDefaultComboxModel(gmaC.getAllMarcas()));
                jcbMarcas.setSelectedIndex(0);
                jcbMarcas.setEnabled(true);
            } else {
                jcbMarcas.removeAllItems();
                jcbMarcas.setEnabled(false);
            }

            jTConsulta.removeAll();
        } catch (Exception ex) {
            showDialog(ex.getMessage());
        }
    }//GEN-LAST:event_jcbMarcaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar bProgreso01;
    private javax.swing.JPanel jPanelExportacion;
    private javax.swing.JPanel jPanelSeleccion;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTConsulta;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbExcel;
    private javax.swing.JCheckBox jcbMarca;
    private javax.swing.JComboBox<String> jcbMarcas;
    // End of variables declaration//GEN-END:variables

    private void showDialog(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje);
    }

    private void CrearExcel() {
        //Instanciamos el libro de Excel (.xlsx)
        XSSFWorkbook libroexcel = new XSSFWorkbook();
        //Instanciamos un hoja del libro.
        XSSFSheet hoja = libroexcel.createSheet();
        libroexcel.setSheetName(libroexcel.getSheetIndex(hoja), jcbMarcas.getSelectedItem().toString());
        //Instanciamos una fila. 
        XSSFRow fila = hoja.createRow(0);
        //En la primera fila, creamos una Celda y le pasamos la Marca del Coche.
        //Creo una nueva fuente
        XSSFFont letra = libroexcel.createFont();
        letra.setFontHeightInPoints((short) 20);
        letra.setBold(true);
        letra.setItalic(true);
        letra.setColor(IndexedColors.DARK_BLUE.getIndex());
        letra.setUnderline(FontUnderline.SINGLE);
        letra.setFontName("Times New Roman");
        //Creo una celda y le añado estilo.
        XSSFCellStyle estilo1 = libroexcel.createCellStyle();
        estilo1.setFont(letra);
        XSSFCell celda = fila.createCell(0);
        celda.setCellValue(String.valueOf(jcbMarcas.getSelectedItem()));
        celda.setCellStyle(estilo1);

        XSSFFont letra2 = libroexcel.createFont();
        letra2.setFontHeightInPoints((short) 10);
        letra2.setBold(true);
        letra2.setItalic(true);
        letra2.setColor(IndexedColors.INDIGO.getIndex());
        letra2.setFontName("Georgia");
        XSSFCellStyle estilo2 = libroexcel.createCellStyle();
        estilo2.setFillForegroundColor(IndexedColors.LIGHT_CORNFLOWER_BLUE.getIndex());
        estilo2.setFillPattern(FillPatternType.SOLID_FOREGROUND);
        estilo2.setFont(letra2);

        fila = hoja.createRow(2);
        XSSFCell celda1 = fila.createCell(0);
        celda1.setCellValue("ID");
        celda1.setCellStyle(estilo2);
        XSSFCell celda2 = fila.createCell(1);
        celda2.setCellValue("MODELO");
        celda2.setCellStyle(estilo2);
        XSSFCell celda3 = fila.createCell(2);
        celda3.setCellValue("CONSUMO");
        celda3.setCellStyle(estilo2);
        XSSFCell celda4 = fila.createCell(3);
        celda4.setCellValue("EMISIONES");
        celda4.setCellStyle(estilo2);
        XSSFCell celda5 = fila.createCell(4);
        celda5.setCellValue("CLAS. ENERGÉTICA");
        celda5.setCellStyle(estilo2);

        //Recorremos el JTable
        bProgreso01.setMaximum(jTConsulta.getRowCount());
        XSSFRow filas;
        int k = 0;
        int l = 3;
        for (int i = 0; i < jTConsulta.getRowCount(); i++) {

            jTConsulta.setRowSelectionInterval(i, i);
            bProgreso01.setValue(i + 1);

            fila = hoja.createRow((l + i + 1));
            for (int j = 0; j < jTConsulta.getColumnCount() - 1; j++) {
                //Creo este procedimiento para evitar que coga los valores de la segunda columna del 
                //TabletModel y de paso convierto los valores de la columna primera, cuarta y quita
                //en númerico, ya que en el TableModel los puse todos a String para futuras consultas.
                k = j;

                if (j >= 1) {
                    k++;
                }
                XSSFCell celda6 = fila.createCell(j);
                celda6.setCellValue(jTConsulta.getValueAt(i, k).toString());
                if (j == 0) {
                    int valor = Integer.valueOf(jTConsulta.getValueAt(i, k).toString());
                    celda6.setCellValue(valor);

                }
                if (k == 3 || k == 4) {
                    float valor2 = Float.valueOf(jTConsulta.getValueAt(i, k).toString());
                    celda6.setCellValue(valor2);
                }

            }

        }
        bProgreso01.setValue(0);

        try {
            LocalDateTime fechaHora = LocalDateTime.now();
            DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd_MM_yyyy_HH_mm_ss");
            String fechaExcel = String.valueOf(fechaHora.format(formato));
            String ruta = System.getProperty("user.dir") + System.getProperty("file.separator");
            String carpetaGuardar = ruta + "Informes";
            File carpeta = new File(carpetaGuardar);
            if (!carpeta.exists()) {
                //creamos la carpeta si no existe
                carpeta.mkdir();
            }
            String rutafichero = carpetaGuardar + System.getProperty("file.separator") + "Informe" + fechaExcel + ".xlsx";
            FileOutputStream fichero = new FileOutputStream(rutafichero);
            libroexcel.write(fichero);
            fichero.close();
            showDialog(CONS_MENG2);

        } catch (IOException ex) {
            showDialog(ex.getMessage());

        }
    }

}
