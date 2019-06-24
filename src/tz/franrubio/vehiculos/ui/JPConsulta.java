/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tz.franrubio.vehiculos.ui;

import com.convertapi.*;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;
import tz.franrubio.vehiculos.model.GestorMarca;
import tz.franrubio.vehiculos.model.GestorModelo;
import tz.franrubio.vehiculos.model.Modelo;
import tz.franrubio.vehiculos.persistencia.ConsultaSQL;

/**
 * Clase JPConsulta
 * 
 * 
 * @author Francisco J. Rubio
 */
public class JPConsulta extends javax.swing.JPanel {

    /**
     * Creación del Panel de Consultas.
     */
    private GestorModelo gmC = new GestorModelo();
    private GestorMarca gmaC = new GestorMarca();
    //Constantes.
    private static final String CONS_MENG1 = "Debe elegir algun criterio de consulta";
    private static final String CONS_MENG2 = "Exportada Consulta a Hoja de Cálculo de Excel.";
    private static final String CONS_MENG3 = "Exportada Consulta a PDF.";
    private static final String CONS_SECRETPALABRA= "cD9r4iA6TgyS33L0";
    private static final String CONS_MENG4 = "Conexión de Internet Interrupida";
    private static final String CONS_MENG5 = "Exportación en PDF cancelada.";
    public JPConsulta() {
        initComponents();

        jcbMarcas.removeAllItems();
        jcbMarcas.setEnabled(false);
        ((DefaultTableModel) jTConsulta.getModel()).setRowCount(0);

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
        jrbMarca = new javax.swing.JRadioButton();
        jPanelExportacion = new javax.swing.JPanel();
        jbExcel = new javax.swing.JButton();
        bProgreso01 = new javax.swing.JProgressBar();
        jbPdf = new javax.swing.JButton();
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

        jrbMarca.setText("Marca");
        jrbMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbMarcaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelSeleccionLayout = new javax.swing.GroupLayout(jPanelSeleccion);
        jPanelSeleccion.setLayout(jPanelSeleccionLayout);
        jPanelSeleccionLayout.setHorizontalGroup(
            jPanelSeleccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSeleccionLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanelSeleccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelSeleccionLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jbBuscar)
                        .addGap(34, 34, 34))
                    .addGroup(jPanelSeleccionLayout.createSequentialGroup()
                        .addComponent(jrbMarca)
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
                    .addComponent(jrbMarca))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbBuscar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanelSeleccion, java.awt.BorderLayout.PAGE_START);

        jPanelExportacion.setPreferredSize(new java.awt.Dimension(515, 80));

        jbExcel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tz/franrubio/vehiculos/icons/iconexcel.png"))); // NOI18N
        jbExcel.setToolTipText("Exporta la busqueda a un documento PDF");
        jbExcel.setBorder(null);
        jbExcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExcelActionPerformed(evt);
            }
        });

        bProgreso01.setStringPainted(true);

        jbPdf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tz/franrubio/vehiculos/icons/iconpdf.png"))); // NOI18N
        jbPdf.setToolTipText("Exporta la busqueda a un documento Excel");
        jbPdf.setBorder(null);
        jbPdf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPdfActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelExportacionLayout = new javax.swing.GroupLayout(jPanelExportacion);
        jPanelExportacion.setLayout(jPanelExportacionLayout);
        jPanelExportacionLayout.setHorizontalGroup(
            jPanelExportacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bProgreso01, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
            .addGroup(jPanelExportacionLayout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addComponent(jbExcel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbPdf)
                .addGap(149, 149, 149))
        );
        jPanelExportacionLayout.setVerticalGroup(
            jPanelExportacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelExportacionLayout.createSequentialGroup()
                .addComponent(bProgreso01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelExportacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbExcel, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbPdf, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
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
    /**
     * Este evento genera la consulta y carga el JTable.
     *
     * @param evt
     */
    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        if (jrbMarca.isSelected()) {
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

    private void jbExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcelActionPerformed
        //Creo un Hilo para la Exportacion del fichero Excel.
        boolean varPDF = false;
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    CrearExcel(varPDF);
                } catch (InterruptedException ex) {
                    showDialog(CONS_MENG4);
                } catch(ExecutionException ex){
                    showDialog(CONS_MENG5);
                }
            }

        });
        t.start();

    }//GEN-LAST:event_jbExcelActionPerformed

    private void jbPdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPdfActionPerformed
        boolean varPDF = true;
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    CrearExcel(varPDF);
                } catch (InterruptedException ex) {
                    showDialog(CONS_MENG4);
                } catch(ExecutionException ex){
                    showDialog(CONS_MENG5);
                }
            }

        });
        t2.start();
    }//GEN-LAST:event_jbPdfActionPerformed

    private void jrbMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbMarcaActionPerformed
        try {
            if (jrbMarca.isSelected()) {
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
    }//GEN-LAST:event_jrbMarcaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar bProgreso01;
    private javax.swing.JPanel jPanelExportacion;
    private javax.swing.JPanel jPanelSeleccion;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTConsulta;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbExcel;
    private javax.swing.JButton jbPdf;
    private javax.swing.JComboBox<String> jcbMarcas;
    private javax.swing.JRadioButton jrbMarca;
    // End of variables declaration//GEN-END:variables

    private void showDialog(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje);
    }

    private void CrearExcel(boolean bPDF) throws InterruptedException, ExecutionException {
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
                //TabletModel y de paso convierto los valores de la columna primera, cuarta y quinta
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
        for (int i = 0; i < 5; i++) {
            hoja.autoSizeColumn(i);
        }
        if (bPDF == false) {
            bProgreso01.setValue(0);
        }
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
            FileOutputStream ficheroexcel = new FileOutputStream(rutafichero);
            libroexcel.write(ficheroexcel);

            ficheroexcel.close();
            if (bPDF == true) {
                //Conversor Online de fichero excel a pdf
                Config.setDefaultSecret(CONS_SECRETPALABRA);
                ConvertApi.convert("xlsx", "pdf",
                        new Param("File", Paths.get(rutafichero))
                ).get().saveFilesSync(Paths.get(carpetaGuardar));
                //Borramos el fichero de excel que ya no nos hace falta
                File ficheroexcel_pdf = new File(rutafichero);
                ficheroexcel_pdf.delete();
                showDialog(CONS_MENG3);
                bProgreso01.setValue(0);
            } else {
                showDialog(CONS_MENG2);
            }

        } catch (IOException ex) {
            showDialog(ex.getMessage());
        }

    }
}
