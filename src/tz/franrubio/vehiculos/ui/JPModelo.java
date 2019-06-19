package tz.franrubio.vehiculos.ui;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Container;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import tz.franrubio.vehiculos.model.GestorMarca;
import tz.franrubio.vehiculos.model.GestorModelo;
import tz.franrubio.vehiculos.model.Modelo;
import static tz.franrubio.vehiculos.persistencia.ModeloDAOMySQLImpl.*;

/**
 * Panel JPModelo. Este Panel muestra los módelos de los vehiculos, a la vez que
 * se puede añadir uno nuevo, borrar, actualizar y hacer determinadas busquedas.
 *
 * @author Francisco J. Rubio
 */
public class JPModelo extends javax.swing.JPanel {

    /**
     * Carga el Panel de los Modelos.
     *
     * @param ClaEnergetica, una enumeración de la clasificación energética de
     * todos los modelos.
     */
    private enum ClaEnergetica {
        A, B, C, D, E, F, G, NA
    };
    private GestorModelo gm = new GestorModelo();
    private GestorMarca gma = new GestorMarca();
    private int pos = 0;
    private JFPrincipal jPrincipal;
    private JPConsulta jPConsultaMod;
    private JPModelo jPModelo;
    public JPModelo() {
        initComponents();
        try {
            cargarDatos(pos);
        } catch (Exception ex) {
            showDialog(ex.getMessage());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBarraHerramientas = new javax.swing.JToolBar();
        jbNuevo = new javax.swing.JButton();
        jbSalvar = new javax.swing.JButton();
        jbBorrar = new javax.swing.JButton();
        jbConsultar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jtfModelo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jcbMarcas = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jtfConsumo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtfEmisiones = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jcbEnergia = new javax.swing.JComboBox<>();
        jbPrimero = new javax.swing.JButton();
        jbAnterior = new javax.swing.JButton();
        jbSiguiente = new javax.swing.JButton();
        jbUltimo = new javax.swing.JButton();
        jftId = new javax.swing.JTextField();

        setMaximumSize(new java.awt.Dimension(379, 237));
        setName("PanelModelo"); // NOI18N
        setLayout(new java.awt.BorderLayout());

        jBarraHerramientas.setFloatable(false);
        jBarraHerramientas.setRollover(true);

        jbNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tz/franrubio/vehiculos/icons/anyadircoche.png"))); // NOI18N
        jbNuevo.setToolTipText("Nuevo");
        jbNuevo.setFocusable(false);
        jbNuevo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbNuevo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoActionPerformed(evt);
            }
        });
        jBarraHerramientas.add(jbNuevo);

        jbSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tz/franrubio/vehiculos/icons/guardarchoche.png"))); // NOI18N
        jbSalvar.setToolTipText("Guardar");
        jbSalvar.setFocusable(false);
        jbSalvar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbSalvar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarActionPerformed(evt);
            }
        });
        jBarraHerramientas.add(jbSalvar);

        jbBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tz/franrubio/vehiculos/icons/borrarcoche.png"))); // NOI18N
        jbBorrar.setToolTipText("Borrar");
        jbBorrar.setFocusable(false);
        jbBorrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbBorrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBorrarActionPerformed(evt);
            }
        });
        jBarraHerramientas.add(jbBorrar);

        jbConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tz/franrubio/vehiculos/icons/buscarCoche.png"))); // NOI18N
        jbConsultar.setToolTipText("Buscar");
        jbConsultar.setFocusable(false);
        jbConsultar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbConsultar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConsultarActionPerformed(evt);
            }
        });
        jBarraHerramientas.add(jbConsultar);

        add(jBarraHerramientas, java.awt.BorderLayout.PAGE_START);

        jLabel1.setText("Modelo");

        jLabel2.setText("Marca");

        jcbMarcas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel3.setText("Consumo");

        jLabel4.setText("Emisiones");

        jLabel5.setText("Clasificación Energética");

        jcbEnergia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jbPrimero.setText("|<<");
        jbPrimero.setFocusable(false);
        jbPrimero.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbPrimero.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbPrimero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPrimeroActionPerformed(evt);
            }
        });

        jbAnterior.setText("<");
        jbAnterior.setFocusable(false);
        jbAnterior.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbAnterior.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAnteriorActionPerformed(evt);
            }
        });

        jbSiguiente.setText(">");
        jbSiguiente.setFocusable(false);
        jbSiguiente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbSiguiente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSiguienteActionPerformed(evt);
            }
        });

        jbUltimo.setText(">>|");
        jbUltimo.setFocusable(false);
        jbUltimo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbUltimo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbUltimoActionPerformed(evt);
            }
        });

        jftId.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jftId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jftIdKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(18, 18, 18)
                            .addComponent(jtfEmisiones, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5)
                            .addGap(27, 27, 27)
                            .addComponent(jcbEnergia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(18, 18, 18)
                            .addComponent(jcbMarcas, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(38, 38, 38)
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jtfConsumo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jbPrimero)
                            .addGap(18, 18, 18)
                            .addComponent(jbAnterior)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jftId, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(11, 11, 11)
                            .addComponent(jbSiguiente)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jbUltimo))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jcbMarcas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jtfConsumo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtfEmisiones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jcbEnergia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jbPrimero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbUltimo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbSiguiente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbAnterior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jftId))
                .addContainerGap())
        );

        add(jPanel1, java.awt.BorderLayout.LINE_START);
        jPanel1.getAccessibleContext().setAccessibleName("");
        jPanel1.getAccessibleContext().setAccessibleDescription("");
    }// </editor-fold>//GEN-END:initComponents

    private void jbConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConsultarActionPerformed

        jPrincipal = (JFPrincipal)SwingUtilities.getWindowAncestor(this);
        //System.out.println(jPrincipal.getName());
        jPConsultaMod = new JPConsulta();
        cambiarPanel(jPConsultaMod);       
    }//GEN-LAST:event_jbConsultarActionPerformed
/**
 * Al pulsar el botón muesta el último modelo de la base de datos.
 * @param evt 
 */
    private void jbUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbUltimoActionPerformed

        try {
            pos = gm.buscarTodosModelos().size() - 1;
            cargarDatos(pos);
        } catch (Exception ex) {
            showDialog(ex.getMessage());
        }
    }//GEN-LAST:event_jbUltimoActionPerformed
/**
 * Al pulsar el botón muestra el siguiente modelo de la base de datos.
 * @param evt 
 */
    private void jbSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSiguienteActionPerformed

        pos++;
        try {
            if (pos >= gm.buscarTodosModelos().size()) {
                pos = gm.buscarTodosModelos().size() - 1;
            }
            cargarDatos(pos);
        } catch (Exception ex) {
            showDialog(ex.getMessage());
        }
    }//GEN-LAST:event_jbSiguienteActionPerformed
/**
 * Al pulsar el botón muesta el primer modelo de la base de datos.
 * @param evt 
 */
    private void jbPrimeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPrimeroActionPerformed
        try {
            cargarDatos(0);
        } catch (Exception ex) {
            showDialog(ex.getMessage());
        }
    }//GEN-LAST:event_jbPrimeroActionPerformed
/**
 * Al pulsar el botón muestra el modelo anterior al actual.
 * @param evt 
 */
    private void jbAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAnteriorActionPerformed
        pos--;
        try {
            if (pos < 1) {
                pos = 0;
            }
            cargarDatos(pos);

        } catch (Exception ex) {
            showDialog(ex.getMessage());
        }

    }//GEN-LAST:event_jbAnteriorActionPerformed
/**
 * Cuando pulsamos Enter este evento hace se desplace al indice de Modelo que le hemos indicado.
 * @param evt 
 */
    private void jftIdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jftIdKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            try {
                pos = Integer.parseInt(jftId.getText().trim()) - 1;
                //index--;
                if (pos < 1) {
                    pos = 0;
                } else if (pos >= gm.buscarTodosModelos().size() - 1) {
                    pos = gm.buscarTodosModelos().size() - 1;
                }
                cargarDatos(pos);
            } catch (NumberFormatException excepcion) {
                showDialog(EXC_MENSG6);
            } catch (Exception ex) {
                showDialog(ex.getMessage());
            }
        }

    }//GEN-LAST:event_jftIdKeyPressed
/**
 * Este método Limpia las las cajas de texto preparando asi el formulario para poder añadir un modelo nuevo.
 * @param evt 
 */
    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed
        try {
            limpiarTodo();
        } catch (Exception ex) {
            showDialog(ex.getMessage());
        }
    }//GEN-LAST:event_jbNuevoActionPerformed
    /**
     * Añade un Modelo nuevo si no existe ese modelo en la base de datos o
     * actualiza dicho modelo si existe.
     *
     * @param evt : Pulsar el botón
     */
    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed
        int _id = 0;
        int _indexSel = 0;
        Modelo modelo = null;
        try {

            if (!jftId.getText().equals("")) {
                _id = Integer.parseInt(jftId.getText().trim());
            }

            String _nombreModelo = jtfModelo.getText().trim();
            Float _Consumo = Float.parseFloat(jtfConsumo.getText().trim());
            Float _Emisiones = Float.valueOf(jtfEmisiones.getText().trim());
            String _ClaEner = String.valueOf(jcbEnergia.getSelectedItem());
            _indexSel = jcbMarcas.getSelectedIndex();
            int _idMarca = ((MarcasDefaultComboxModel) jcbMarcas.getModel()).getIdMarca(_indexSel);
            //Existe un registro por lo que suponemos que ha modificado algo y quiere salvar los cambios. Aun asi se lo preguntaremos para aseguranos.
            if (_id > 0) {

                modelo = new Modelo(_id, _idMarca, _nombreModelo, _Consumo, _Emisiones, _ClaEner);
                if (preguntarUsuarioSioNo(EXC_MENSG7, EXC_MENSG8)) {
                    gm.guardarModelo(modelo);
                }
            } else {
                //Si no existe valor en el campo suponemos que el usuario quiere añadir un nuevo Modelo de vehiculo.
                modelo = new Modelo(_id, _idMarca, _nombreModelo, _Consumo, _Emisiones, _ClaEner);
                if (preguntarUsuarioSioNo(EXC_MENSG9, EXC_MENSG10)) {
                    gm.anyadirModelo(modelo);
                    cargarDatos(pos);
                }
            }
        } catch (NumberFormatException excepcion) {
            showDialog(EXC_MENSG6);
        } catch (NullPointerException ex) {
            showDialog(EXC_MENSG13);
        } catch (Exception ex) {
            showDialog(ex.getMessage());
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jbSalvarActionPerformed
/**
 * Al pulsar el boton Borra el Modelo que esta activo. Aunque antes pregunta al Usuario si desea hacerlo.
 * @param evt 
 */
    private void jbBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBorrarActionPerformed
        int _id = 0;
        if (!jftId.getText().equals("")) {
            _id = Integer.parseInt(jftId.getText().trim());
        }
        if (_id != 0) {
            try {
               if (preguntarUsuarioSioNo(EXC_MENSG11, EXC_MENSG12)) { 
                    gm.borrarModelo(_id);
               }
           
            } catch (Exception ex) {
                showDialog(ex.getMessage());
            }finally{
                cargarDatos(pos-1);
            }
        }
    }//GEN-LAST:event_jbBorrarActionPerformed
    /**
     * Método preguntarUsuarioSioNo
     * 
     * Este método lanza una pregunta con dos posibles respuestas, sí o no.
     * @param texto1 La pregunta que desea realizar
     * @param texto2 La acción a realizar
     * @return OK_OPTION : True o False.
     */
    private boolean preguntarUsuarioSioNo(String texto1, String texto2) {
        int n = JOptionPane.showConfirmDialog(
                this,
                texto1,
                texto2,
                JOptionPane.YES_NO_OPTION);
        return (n == JOptionPane.OK_OPTION);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToolBar jBarraHerramientas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbAnterior;
    private javax.swing.JButton jbBorrar;
    private javax.swing.JButton jbConsultar;
    private javax.swing.JButton jbNuevo;
    private javax.swing.JButton jbPrimero;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JButton jbSiguiente;
    private javax.swing.JButton jbUltimo;
    private javax.swing.JComboBox<String> jcbEnergia;
    private javax.swing.JComboBox<String> jcbMarcas;
    private javax.swing.JTextField jftId;
    private javax.swing.JTextField jtfConsumo;
    private javax.swing.JTextField jtfEmisiones;
    private javax.swing.JTextField jtfModelo;
    // End of variables declaration//GEN-END:variables
    /**
     * Método cagarDatos.
     *
     * Carga los datos de la tabla Modelos de la base de datos.
     */
    private void cargarDatos(int _id) {

        try {
            limpiarTodo();
            List<Modelo> modelos = gm.buscarTodosModelos();
            jftId.setText(Integer.toString(modelos.get(_id).getId()));
            jtfModelo.setText(modelos.get(_id).getNombreModelo());
            jtfConsumo.setText(Float.toString(modelos.get(_id).getConsumoModelo()));
            jtfEmisiones.setText(Float.toString(modelos.get(_id).getEmisionesModelo()));
            jcbEnergia.setSelectedItem(ClaEnergetica.valueOf(modelos.get(_id).getClaEner()));
            String marca = gma.buscarIdMarca(modelos.get(_id).getIdMarca());
            jcbMarcas.setSelectedItem(marca);
        } catch (Exception ex) {
            showDialog(ex.getMessage());
        }

    }

    /**
     * Método showDialog
     *
     * Método para mostrar un mensaje de error.
     *
     * @param mensaje: Mensaje Error.
     */
    private void showDialog(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje);
    }

    /**
     * Método limpiarTodo.
     *
     * Este métdo elimina los datos de los objetos del Panel JPModelo y carga
     * los cobobox.
     */
    private void limpiarTodo() {

        jcbEnergia.removeAll();
        jcbMarcas.removeAll();
        jftId.setText("");
        jtfModelo.setText("");
        jtfConsumo.setText("");
        jtfEmisiones.setText("");
        jcbEnergia.setModel(new DefaultComboBoxModel(ClaEnergetica.values()));
        try {

            MarcasDefaultComboxModel macm = new MarcasDefaultComboxModel(gma.getAllMarcas());
            jcbMarcas.setModel(macm);
            jcbMarcas.setSelectedIndex(0);
        } catch (Exception ex) {
            showDialog(ex.getMessage());
        }

    }
    /**
     * Método cambiarPanel
     * 
     * Este método lo que hace es añadir el panel que le hemos pasado.
     * @param panel: Panel que queremos que visualice. 
     */
    private void cambiarPanel(JPanel panel) {
        
        jPrincipal.jPanelSecundario.removeAll();
        jPrincipal.jPanelSecundario.add(panel);
        jPrincipal.jPanelSecundario.revalidate();
        jPrincipal.jPanelSecundario.repaint();
    }
}
