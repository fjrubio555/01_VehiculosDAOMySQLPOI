package tz.franrubio.vehiculos.ui;

import java.awt.BorderLayout;
import javax.swing.JPanel;

/**
 * JFrame JFPrincipal Panel Princiapal
 *
 * @author Francisco J. Rubio
 */
public class JFPrincipal extends javax.swing.JFrame {

    /**
     * Creación de un nuevo formulario JFPrincipal
     *
     * jpModelo el panel de los modelos de vehículos.
     */
    private JPModelo jpModelos;
    private JPConsulta jpConsulta;
    private JPMarcas jpMarcas;

    public JFPrincipal() {
        
        initComponents();
        setTitle("Vehículos_v_1.0"); //Titulo de la aplicación princiapl
        setBounds(600, 200, 720, 420); //Posición y tamaño de la ventana.
        this.setResizable(false); //No se puede redimensionar el Frame
        getContentPane().add(jPanelSecundario, BorderLayout.CENTER); //Añadimos el Panel Secuandario al centro.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBotones = new javax.swing.JPanel();
        jbModelo = new javax.swing.JButton();
        jbMarcas = new javax.swing.JButton();
        jbConsultar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jPanelSecundario = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(720, 400));
        setName("JFPrincipal"); // NOI18N

        jPanelBotones.setName("PanelBotones"); // NOI18N

        jbModelo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tz/franrubio/vehiculos/icons/car_64.png"))); // NOI18N
        jbModelo.setToolTipText("Modelos");
        jbModelo.setMaximumSize(new java.awt.Dimension(100, 60));
        jbModelo.setMinimumSize(new java.awt.Dimension(100, 60));
        jbModelo.setPreferredSize(new java.awt.Dimension(100, 60));
        jbModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModeloActionPerformed(evt);
            }
        });

        jbMarcas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tz/franrubio/vehiculos/icons/marcas.png"))); // NOI18N
        jbMarcas.setToolTipText("Marcas");
        jbMarcas.setMaximumSize(new java.awt.Dimension(100, 60));
        jbMarcas.setMinimumSize(new java.awt.Dimension(100, 60));
        jbMarcas.setPreferredSize(new java.awt.Dimension(100, 60));
        jbMarcas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMarcasActionPerformed(evt);
            }
        });

        jbConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tz/franrubio/vehiculos/icons/bucarcoche01.png"))); // NOI18N
        jbConsultar.setToolTipText("Consultas");
        jbConsultar.setMaximumSize(new java.awt.Dimension(100, 60));
        jbConsultar.setMinimumSize(new java.awt.Dimension(100, 60));
        jbConsultar.setPreferredSize(new java.awt.Dimension(100, 60));
        jbConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConsultarActionPerformed(evt);
            }
        });

        jbSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tz/franrubio/vehiculos/icons/64_Exit.png"))); // NOI18N
        jbSalir.setToolTipText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelBotonesLayout = new javax.swing.GroupLayout(jPanelBotones);
        jPanelBotones.setLayout(jPanelBotonesLayout);
        jPanelBotonesLayout.setHorizontalGroup(
            jPanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jbConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jbSalir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbModelo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelBotonesLayout.createSequentialGroup()
                        .addComponent(jbMarcas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelBotonesLayout.setVerticalGroup(
            jPanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBotonesLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jbModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jbMarcas, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jbConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jbSalir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelBotones, java.awt.BorderLayout.LINE_START);

        jPanelSecundario.setMaximumSize(new java.awt.Dimension(600, 400));
        jPanelSecundario.setMinimumSize(new java.awt.Dimension(600, 400));
        jPanelSecundario.setName("PanelSecundario"); // NOI18N
        jPanelSecundario.setPreferredSize(new java.awt.Dimension(600, 400));
        jPanelSecundario.setLayout(new java.awt.CardLayout());
        getContentPane().add(jPanelSecundario, java.awt.BorderLayout.LINE_END);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Método jbModeloActionPerformed.
     *
     * Cuando pulsa el botón de Modelos aparece el panel de Modelos.
     *
     * @param evt
     */
    private void jbModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModeloActionPerformed
        jpModelos = new JPModelo();
        cambiarPanel(jpModelos);
    }//GEN-LAST:event_jbModeloActionPerformed
    /**
     * MétodojbMarcasActionPerformed.
     *
     * Cuando pulsa el botón de Marcas aparece el panel de Marcas.
     *
     * @param evt
     */
    private void jbMarcasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMarcasActionPerformed
        jpMarcas = new JPMarcas();
        cambiarPanel(jpMarcas);
    }//GEN-LAST:event_jbMarcasActionPerformed
    /**
     * Método jbSalirActionPerformed.
     *
     * Cierra la aplicación.
     *
     * @param evt
     */
    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jbSalirActionPerformed
    /**
     * Método jbConsultarActionPerformed.
     *
     * Cuando pulsa el botón de Consulta parece el panel de Consultas.
     *
     * @param evt
     */
    private void jbConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConsultarActionPerformed
        jpConsulta = new JPConsulta();
        cambiarPanel(jpConsulta);
    }//GEN-LAST:event_jbConsultarActionPerformed

    /**
     * Método Principal.
     *
     * Abre un hilo donde hace visible el Frame Principal de la Aplicación.
     *
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanelBotones;
    public javax.swing.JPanel jPanelSecundario;
    private javax.swing.JButton jbConsultar;
    private javax.swing.JButton jbMarcas;
    private javax.swing.JButton jbModelo;
    private javax.swing.JButton jbSalir;
    // End of variables declaration//GEN-END:variables

    /**
     * Métido cambiarPanel:
     *
     * Añade un panel, primero borra todo el contenedor, luego añade y por
     * último repinta el panel.
     *
     * @param panel: Panel que deseamos añadir
     */
    public void cambiarPanel(JPanel panel) {

        jPanelSecundario.removeAll();
        jPanelSecundario.add(panel, BorderLayout.CENTER);
        jPanelSecundario.revalidate();
        jPanelSecundario.repaint();
    }
}
