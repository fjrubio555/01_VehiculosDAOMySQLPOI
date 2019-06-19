package tz.franrubio.vehiculos.ui;

import java.awt.event.KeyEvent;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import tz.franrubio.vehiculos.model.GestorMarca;
import tz.franrubio.vehiculos.model.Marca;
import tz.franrubio.vehiculos.model.Modelo;
import static tz.franrubio.vehiculos.persistencia.ModeloDAOMySQLImpl.EXC_MENSG10;
import static tz.franrubio.vehiculos.persistencia.ModeloDAOMySQLImpl.EXC_MENSG11;
import static tz.franrubio.vehiculos.persistencia.ModeloDAOMySQLImpl.EXC_MENSG12;
import static tz.franrubio.vehiculos.persistencia.ModeloDAOMySQLImpl.EXC_MENSG13;
import static tz.franrubio.vehiculos.persistencia.ModeloDAOMySQLImpl.EXC_MENSG6;
import static tz.franrubio.vehiculos.persistencia.ModeloDAOMySQLImpl.EXC_MENSG7;
import static tz.franrubio.vehiculos.persistencia.ModeloDAOMySQLImpl.EXC_MENSG8;
import static tz.franrubio.vehiculos.persistencia.ModeloDAOMySQLImpl.EXC_MENSG9;

/**
 * Panel JPMarca. Este Panel muestra las marcas de los vehiculos, a la vez que
 * se puede añadir uno nuevo, borrar y actualizar una marca.
 * 
 * @author Francisco J. Rubio
 */
public class JPMarcas extends javax.swing.JPanel {

    /**
     * Carga del panel Marcas
     */
    private GestorMarca gma = new GestorMarca();
    private int pos = 0;
    public JPMarcas() {
        initComponents();
        cargarDatos(pos);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     *regenerated by the Form Editor.
     */ 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBarraHerramientas = new javax.swing.JToolBar();
        jbNuevo = new javax.swing.JButton();
        jbGuardar = new javax.swing.JButton();
        jbBorrar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        itfId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtfMarca = new javax.swing.JTextField();
        jbUltimo = new javax.swing.JButton();
        jbSiguiente = new javax.swing.JButton();
        jftId_02 = new javax.swing.JTextField();
        jbAnterior = new javax.swing.JButton();
        jbPrimero = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(600, 420));
        setMinimumSize(new java.awt.Dimension(600, 420));
        setName("JPMarcas"); // NOI18N
        setLayout(new java.awt.BorderLayout());

        jBarraHerramientas.setRollover(true);

        jbNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tz/franrubio/vehiculos/icons/anyadircoche.png"))); // NOI18N
        jbNuevo.setToolTipText("Nueva Marca");
        jbNuevo.setFocusable(false);
        jbNuevo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbNuevo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoActionPerformed(evt);
            }
        });
        jBarraHerramientas.add(jbNuevo);

        jbGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tz/franrubio/vehiculos/icons/guardarchoche.png"))); // NOI18N
        jbGuardar.setToolTipText("Guardar Marca");
        jbGuardar.setFocusable(false);
        jbGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbGuardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });
        jBarraHerramientas.add(jbGuardar);

        jbBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tz/franrubio/vehiculos/icons/borrarcoche.png"))); // NOI18N
        jbBorrar.setToolTipText("Eliminar Marca");
        jbBorrar.setFocusable(false);
        jbBorrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbBorrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBorrarActionPerformed(evt);
            }
        });
        jBarraHerramientas.add(jbBorrar);

        add(jBarraHerramientas, java.awt.BorderLayout.NORTH);

        jLabel1.setText("Identificador");

        itfId.setEnabled(false);

        jLabel2.setText("Marca");

        jbUltimo.setText(">>|");
        jbUltimo.setToolTipText("Ir a Último");
        jbUltimo.setFocusable(false);
        jbUltimo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbUltimo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbUltimoActionPerformed(evt);
            }
        });

        jbSiguiente.setText(">");
        jbSiguiente.setToolTipText("Siguiente");
        jbSiguiente.setFocusable(false);
        jbSiguiente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbSiguiente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSiguienteActionPerformed(evt);
            }
        });

        jftId_02.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jftId_02.setToolTipText("");
        jftId_02.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jftId_02KeyPressed(evt);
            }
        });

        jbAnterior.setText("<");
        jbAnterior.setToolTipText("Anterior");
        jbAnterior.setFocusable(false);
        jbAnterior.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbAnterior.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAnteriorActionPerformed(evt);
            }
        });

        jbPrimero.setText("|<<");
        jbPrimero.setToolTipText("Ir a Primero");
        jbPrimero.setFocusable(false);
        jbPrimero.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbPrimero.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbPrimero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPrimeroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(itfId, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(111, 111, 111))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbPrimero)
                .addGap(18, 18, 18)
                .addComponent(jbAnterior)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jftId_02, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jbSiguiente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbUltimo)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(itfId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtfMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 228, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jbPrimero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbUltimo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbSiguiente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbAnterior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jftId_02, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        add(jPanel1, java.awt.BorderLayout.CENTER);

        getAccessibleContext().setAccessibleName("");
        getAccessibleContext().setAccessibleDescription("Marcas");
        getAccessibleContext().setAccessibleParent(this);
    }// </editor-fold>//GEN-END:initComponents
/**
 * Al pulsar el botón muestra la última marca de la base de datos..
 * @param evt 
 */
    private void jbUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbUltimoActionPerformed

        try {
            pos = gma.getAllMarcas().size() - 1;
            cargarDatos(pos);
        } catch (Exception ex) {
            showDialog(ex.getMessage());
        }
    }//GEN-LAST:event_jbUltimoActionPerformed
/**
 * Al pulsar el botón muestra la siguiente marca a a la actual.
 * @param evt 
 */
    private void jbSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSiguienteActionPerformed

        pos++;
        try {
            if (pos >= gma.getAllMarcas().size()) {
                pos = gma.getAllMarcas().size() - 1;
            }
            cargarDatos(pos);
        } catch (Exception ex) {
            showDialog(ex.getMessage());
        }
    }//GEN-LAST:event_jbSiguienteActionPerformed
/**
 * Cuando pulsamos Enter este evento hace se desplace al indice de la Marca que le hemos indicado.
 * @param evt 
 */
    private void jftId_02KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jftId_02KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            try {
                pos = Integer.parseInt(jftId_02.getText().trim()) - 1;
                //index--;
                if (pos < 1) {
                    pos = 0;
                } else if (pos >= gma.getAllMarcas().size() - 1) {
                    pos = gma.getAllMarcas().size() - 1;
                }
                cargarDatos(pos);
            } catch (NumberFormatException excepcion) {
                showDialog(EXC_MENSG6);
            } catch (Exception ex) {
                showDialog(ex.getMessage());
            }
        }
    }//GEN-LAST:event_jftId_02KeyPressed
/**
 * Al pulsar el botón muestra la siguiente marca a la actual.
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
 * Al pulsar el botón muestra la primera marca de la base de datos.
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
 * Este método Limpia las las cajas de texto preparando asi el formulario para poder añadir una marca nueva.
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
     * Añade una marca si no existe en la base de datos o
     * actualiza guardando los cambios de esa marca si existe.
     *
     * @param evt : Pulsar el botón
     */
    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        int _id = 0;
        Marca marca = null;
        try {

            if (!itfId.getText().equals("")) {
                _id = Integer.parseInt(itfId.getText());
            }

            String _nombreMarca = jtfMarca.getText().trim();
            //Existe un registro por lo que suponemos que ha modificado algo y quiere salvar los cambios. Aun asi se lo preguntaremos para aseguranos.
            if (_id > 0) {

                marca = new Marca(_id, _nombreMarca);
                if (preguntarUsuarioSioNo(EXC_MENSG7, EXC_MENSG8)) {
                    gma.guardarMarca(marca);
                }
            } else {
                //Si no existe valor en el campo suponemos que el usuario quiere añadir un nuevo Modelo de vehiculo.
                marca = new Marca(_id, _nombreMarca);
                if (preguntarUsuarioSioNo(EXC_MENSG9, EXC_MENSG10)) {
                    gma.anyadirMarca(marca);
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
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jbBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBorrarActionPerformed
        int _id = 0;
        if (!itfId.getText().equals("")) {
            _id = Integer.parseInt(itfId.getText().trim());
        }
        if (_id != 0) {
            try {
               if (preguntarUsuarioSioNo(EXC_MENSG11, EXC_MENSG12)) { 
                    gma.borrarMarca(_id);
               }
           
            } catch (Exception ex) {
                showDialog(ex.getMessage());
            }finally{
                cargarDatos(pos-1);
            }
        }
    }//GEN-LAST:event_jbBorrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField itfId;
    private javax.swing.JToolBar jBarraHerramientas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbAnterior;
    private javax.swing.JButton jbBorrar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbNuevo;
    private javax.swing.JButton jbPrimero;
    private javax.swing.JButton jbSiguiente;
    private javax.swing.JButton jbUltimo;
    private javax.swing.JTextField jftId_02;
    private javax.swing.JTextField jtfMarca;
    // End of variables declaration//GEN-END:variables

private void showDialog(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje);
    }
 private void limpiarTodo() {

        itfId.setText("");
        jftId_02.setText("");
        jtfMarca.setText("");
 }        
private void cargarDatos(int _id) {
        try {
            limpiarTodo();
            List<Marca> marcas = gma.getAllMarcas();
            itfId.setText(Integer.toString(marcas.get(_id).getId()));
            jftId_02.setText(Integer.toString(marcas.get(_id).getId()));
            jtfMarca.setText(marcas.get(_id).getMarca());
            
        
        } catch (Exception ex) {
            showDialog(ex.getMessage());
        }
}
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

}

