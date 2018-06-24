/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duoc.cl.safe.presentacion.capacitaciones;

import duoc.cl.safe.entity.SsfCapacitacion;
import duoc.cl.safe.entity.SsfCapacitacionempresa;
import duoc.cl.safe.entity.SsfEmpresa;
import duoc.cl.safe.entity.SsfEstadocapaempresa;
import duoc.cl.safe.entity.SsfUsuario;
import duoc.cl.safe.herramientas.FormsController;
import duoc.cl.safe.negocio.SsfCapacitacionBO;
import duoc.cl.safe.negocio.SsfCapacitacionempresaBO;
import duoc.cl.safe.negocio.SsfEmpresaBO;
import duoc.cl.safe.negocio.SsfEstadocapaempresaBO;
import duoc.cl.safe.negocio.SsfUsuarioBO;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.apache.log4j.Logger;
import org.apache.log4j.Level;
import org.apache.log4j.PropertyConfigurator;

/**
 *
 * @author Nacho
 */
public class MantenedorCapEmpresa extends javax.swing.JFrame {

    /**
     * Creates new form MantenedorCapacitación
     */
    public MantenedorCapEmpresa() {
        initComponents();
        PropertyConfigurator.configure("log4j.properties");
        resizeTabla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        tfCantAlumnos = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCapEmpresa = new javax.swing.JTable();
        lExito = new javax.swing.JLabel();
        lError = new javax.swing.JLabel();
        tbEstado = new javax.swing.JToggleButton();
        bModificar = new javax.swing.JButton();
        bAgregar = new javax.swing.JButton();
        bLimpiar = new javax.swing.JButton();
        cbUsuario = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        bRefrescar = new javax.swing.JButton();
        cbEmpresa = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        cbEstadoCap = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        cbCapacitacion = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Cantidad Alumnos:");

        tblCapEmpresa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Usuario", "Empresa", "Capacitación", "Estado", "Cantidad Alumnos", "Fecha Creación", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Short.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCapEmpresa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCapEmpresaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblCapEmpresa);

        lExito.setForeground(new java.awt.Color(0, 102, 0));

        lError.setForeground(new java.awt.Color(204, 0, 0));

        tbEstado.setText("Activo");
        tbEstado.setEnabled(false);
        tbEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbEstadoActionPerformed(evt);
            }
        });

        bModificar.setText("Modificar");
        bModificar.setEnabled(false);
        bModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bModificarActionPerformed(evt);
            }
        });

        bAgregar.setText("Agregar");
        bAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAgregarActionPerformed(evt);
            }
        });

        bLimpiar.setText("Limpiar");
        bLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bLimpiarActionPerformed(evt);
            }
        });

        cbUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Seleccione Usuario -" }));

        jLabel3.setText("Usuario:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 0, 102));
        jLabel8.setText("Asignar Capacitación");

        bRefrescar.setText("Refrescar");
        bRefrescar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRefrescarActionPerformed(evt);
            }
        });

        cbEmpresa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Seleccione Empresa -" }));

        jLabel4.setText("Empresa:");

        cbEstadoCap.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Seleccione Estado Capacitación -" }));

        jLabel5.setText("Estado Capacitación:");

        cbCapacitacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Seleccione Capacitación -" }));

        jLabel9.setText("Capacitación:");

        jMenu1.setText("Cargando...");
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel9))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cbCapacitacion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbUsuario, 0, 256, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbEmpresa, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbEstadoCap, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(136, 136, 136))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lExito, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
                                            .addComponent(lError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(3, 3, 3)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(bAgregar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(bModificar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(bLimpiar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(bRefrescar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(tbEstado, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(18, 18, 18)
                                        .addComponent(tfCantAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(180, 180, 180)))))
                        .addGap(33, 33, 33))
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(cbEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbEstadoCap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(cbCapacitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfCantAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)))
                    .addComponent(lExito, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bRefrescar)
                    .addComponent(lError, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bAgregar)
                    .addComponent(bLimpiar)
                    .addComponent(bModificar)
                    .addComponent(tbEstado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setJMenuBar(formsController.getMenu().getMenuBar());
        formsController.getMenu().setjFrame(this);
        this.setLocationRelativeTo(null);
        cargaTabla();
        cargaCapacitacion();
        cargaEmpresa();
        cargaEstadoCap();
        cargaUsuario();
    }//GEN-LAST:event_formWindowOpened

    private void tblCapEmpresaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCapEmpresaMouseClicked
        limpiarMsgs();
        tbEstado.setEnabled(true);
        bModificar.setEnabled(true);
        DefaultTableModel model = (DefaultTableModel) tblCapEmpresa.getModel();
        if (Integer.parseInt(model.getValueAt(tblCapEmpresa.getSelectedRow(), 7).toString()) == 1) {
            tbEstado.setSelected(false);
            activarEstado();
        } else {
            tbEstado.setSelected(true);
            desactivarEstado();
        }
        if (model.getValueAt(tblCapEmpresa.getSelectedRow(), 1) != null) {
            cbUsuario.setSelectedItem(model.getValueAt(tblCapEmpresa.getSelectedRow(), 1).toString());
        } else {
            cbUsuario.setSelectedIndex(0);
        }
        if (model.getValueAt(tblCapEmpresa.getSelectedRow(), 2) != null) {
            cbEmpresa.setSelectedItem(model.getValueAt(tblCapEmpresa.getSelectedRow(), 2).toString());
        } else {
            cbEmpresa.setSelectedIndex(0);
        }
        if (model.getValueAt(tblCapEmpresa.getSelectedRow(), 3) != null) {
            cbCapacitacion.setSelectedItem(model.getValueAt(tblCapEmpresa.getSelectedRow(), 3).toString());
        } else {
            cbCapacitacion.setSelectedIndex(0);
        }
        if (model.getValueAt(tblCapEmpresa.getSelectedRow(), 4) != null) {
            cbEstadoCap.setSelectedItem(model.getValueAt(tblCapEmpresa.getSelectedRow(), 4).toString());
        } else {
            cbEstadoCap.setSelectedIndex(0);
        }
        if (model.getValueAt(tblCapEmpresa.getSelectedRow(), 5) != null) {
            tfCantAlumnos.setText(model.getValueAt(tblCapEmpresa.getSelectedRow(), 5).toString());
        } else {
            tfCantAlumnos.setText("");
        }
    }//GEN-LAST:event_tblCapEmpresaMouseClicked

    private void bLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLimpiarActionPerformed
        tbEstado.setEnabled(false);
        bModificar.setEnabled(false);
        limpiarMsgs();
        tblCapEmpresa.clearSelection();
        tfCantAlumnos.setText("");
        cbUsuario.setSelectedIndex(0);
        cbEmpresa.setSelectedIndex(0);
        cbCapacitacion.setSelectedIndex(0);
        cbEstadoCap.setSelectedIndex(0);
    }//GEN-LAST:event_bLimpiarActionPerformed

    private void tbEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbEstadoActionPerformed
        limpiarMsgs();
        DefaultTableModel model = (DefaultTableModel) tblCapEmpresa.getModel();
        cebo = new SsfCapacitacionempresaBO();

        if (tblCapEmpresa.getSelectedRow() == -1) {
            tbEstado.setEnabled(false);
            if (tblCapEmpresa.getRowCount() == 0) {
                lError.setText("Tabla vacía");
            } else {
                lError.setText("No hay fila seleccionada");
            }
        } else {
            int id = Short.parseShort(model.getValueAt(tblCapEmpresa.getSelectedRow(), 0).toString());
            if (!tbEstado.isSelected()) {
                if (cebo.activarSP(id)) {
                    activarEstado();
                    model.setValueAt("1", tblCapEmpresa.getSelectedRow(), 7);
                }
            } else {
                if (cebo.desactivarSP(id)) {
                    desactivarEstado();
                    model.setValueAt("0", tblCapEmpresa.getSelectedRow(), 7);
                }
            }
        }
    }//GEN-LAST:event_tbEstadoActionPerformed

    private void bAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAgregarActionPerformed
        cebo = new SsfCapacitacionempresaBO();
        limpiarMsgs();
        if (cbUsuario.getSelectedIndex() == 0) {
            lError.setText("Seleccione un usuario");
        } else if (cbEmpresa.getSelectedIndex() == 0) {
            lError.setText("Seleccione una empresa");
        } else if (cbCapacitacion.getSelectedIndex() == 0) {
            lError.setText("Seleccione una capacitación");
        } else if (cbEstadoCap.getSelectedIndex() == 0) {
            lError.setText("Seleccione un estado capacitación");
        } else {
            String idusuario, idempresa, idcap, idestadocap, cantalum;
            cantalum = tfCantAlumnos.getText();
            idusuario = mapu.get(cbUsuario.getSelectedItem()).toString();
            idempresa = mape.get(cbEmpresa.getSelectedItem()).toString();
            idcap = mapc.get(cbCapacitacion.getSelectedItem()).toString();
            idestadocap = mapece.get(cbEstadoCap.getSelectedItem()).toString();
            SsfCapacitacionempresa c = new SsfCapacitacionempresa();
            try {
                if (!cantalum.isEmpty()) {
                    Long nlong = Long.parseLong(cantalum);
                    c.setCantidadAlumnos(nlong);
                }
            } catch (NumberFormatException e) {
                log.log(Level.ERROR, "Error al ingresar cantidad alumnos", e);
                lError.setText("Error al ingresar cantidad alumnos");
            }
            c.setIdUsuario(new SsfUsuario(BigDecimal.valueOf((long) Long.valueOf(idusuario))));
            c.setIdEmpresa(new SsfEmpresa(BigDecimal.valueOf((long) Long.valueOf(idempresa))));
            c.setIdCapacitacion(new SsfCapacitacion(BigDecimal.valueOf((long) Long.valueOf(idcap))));
            c.setIdEstadocapacitacion(new SsfEstadocapaempresa(BigDecimal.valueOf((long) Long.valueOf(idestadocap))));
            if (cebo.addSP(c)) {
                lExito.setText("Capacitación empresa agregada exitosamente.");
                cargaTabla();
            } else {
                lError.setText("No se pudo agregar");
            }
        }
    }//GEN-LAST:event_bAgregarActionPerformed

    private void bModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bModificarActionPerformed
        DefaultTableModel model = (DefaultTableModel) tblCapEmpresa.getModel();
        cebo = new SsfCapacitacionempresaBO();
        limpiarMsgs();
        if (tblCapEmpresa.getSelectedRow() == -1) {
            tbEstado.setEnabled(false);
            if (tblCapEmpresa.getRowCount() == 0) {
                lError.setText("Tabla vacía");
            } else {
                lError.setText("No hay fila seleccionada");
            }
        } else {
            if (cbUsuario.getSelectedIndex() == 0) {
                lError.setText("Seleccione un usuario");
            } else if (cbEmpresa.getSelectedIndex() == 0) {
                lError.setText("Seleccione una empresa");
            } else if (cbCapacitacion.getSelectedIndex() == 0) {
                lError.setText("Seleccione una capacitación");
            } else if (cbEstadoCap.getSelectedIndex() == 0) {
                lError.setText("Seleccione un estado capacitación");
            } else {
                String idusuario, idempresa, idcap, idestadocap, cantalum, id;
                id = model.getValueAt(tblCapEmpresa.getSelectedRow(), 0).toString();
                cantalum = tfCantAlumnos.getText();
                idusuario = mapu.get(cbUsuario.getSelectedItem()).toString();
                idempresa = mape.get(cbEmpresa.getSelectedItem()).toString();
                idcap = mapc.get(cbCapacitacion.getSelectedItem()).toString();
                idestadocap = mapece.get(cbEstadoCap.getSelectedItem()).toString();
                SsfCapacitacionempresa c = cebo.findSP(Integer.valueOf(id));
                try {
                    if (!cantalum.isEmpty()) {
                        Long nlong = Long.parseLong(cantalum);
                        c.setCantidadAlumnos(nlong);
                    }
                } catch (NumberFormatException e) {
                    log.log(Level.ERROR, "Error al ingresar cantidad alumnos", e);
                    cantalum = "error";
                    lError.setText("Error al ingresar cantidad alumnos");
                }
                //c.setId(BigDecimal.valueOf(Long.valueOf(id)));
                c.setIdUsuario(new SsfUsuario(BigDecimal.valueOf((long) Long.valueOf(idusuario))));
                c.setIdEmpresa(new SsfEmpresa(BigDecimal.valueOf((long) Long.valueOf(idempresa))));
                c.setIdCapacitacion(new SsfCapacitacion(BigDecimal.valueOf((long) Long.valueOf(idcap))));
                c.setIdEstadocapacitacion(new SsfEstadocapaempresa(BigDecimal.valueOf((long) Long.valueOf(idestadocap))));
                if (cebo.updateSP(c)) {
                    lExito.setText("Capacitación modificada exitosamente.");
                    model.setValueAt(cbUsuario.getSelectedItem(), tblCapEmpresa.getSelectedRow(), 1);
                    model.setValueAt(cbEmpresa.getSelectedItem(), tblCapEmpresa.getSelectedRow(), 2);
                    model.setValueAt(cbCapacitacion.getSelectedItem(), tblCapEmpresa.getSelectedRow(), 3);
                    model.setValueAt(cbEstadoCap.getSelectedItem(), tblCapEmpresa.getSelectedRow(), 4);
                    if (!cantalum.equalsIgnoreCase("error")) {
                        model.setValueAt(cantalum, tblCapEmpresa.getSelectedRow(), 5);
                    }
                } else {
                    lError.setText("No se pudo modificar");
                }
            }
        }
    }//GEN-LAST:event_bModificarActionPerformed

    private void bRefrescarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRefrescarActionPerformed
        tbEstado.setEnabled(false);
        bModificar.setEnabled(false);
        limpiarMsgs();
        tblCapEmpresa.clearSelection();
        tfCantAlumnos.setText("");
        cbUsuario.setSelectedIndex(0);
        cbCapacitacion.setSelectedIndex(0);
        cbEmpresa.setSelectedIndex(0);
        cbEstadoCap.setSelectedIndex(0);
        cargaTabla();
    }//GEN-LAST:event_bRefrescarActionPerformed

    /**
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
            java.util.logging.Logger.getLogger(MantenedorCapEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MantenedorCapEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MantenedorCapEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MantenedorCapEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MantenedorCapEmpresa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAgregar;
    private javax.swing.JButton bLimpiar;
    private javax.swing.JButton bModificar;
    private javax.swing.JButton bRefrescar;
    private javax.swing.JComboBox<String> cbCapacitacion;
    private javax.swing.JComboBox<String> cbEmpresa;
    private javax.swing.JComboBox<String> cbEstadoCap;
    private javax.swing.JComboBox<String> cbUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lError;
    private javax.swing.JLabel lExito;
    private javax.swing.JToggleButton tbEstado;
    private javax.swing.JTable tblCapEmpresa;
    private javax.swing.JTextField tfCantAlumnos;
    // End of variables declaration//GEN-END:variables

    private SsfCapacitacionempresaBO cebo;
    private HashMap<String, Integer> mapu = new HashMap<>();
    private HashMap<String, Integer> mape = new HashMap<>();
    private HashMap<String, Integer> mapc = new HashMap<>();
    private HashMap<String, Integer> mapece = new HashMap<>();
    private static Logger log = Logger.getLogger(MantenedorCapEmpresa.class.getName());
    private FormsController formsController;
    
    public void cargaUsuario() {
        SsfUsuarioBO ubo = new SsfUsuarioBO();
        List<SsfUsuario> ulist = ubo.getAllSP();
        ulist.forEach((u) -> {
            mapu.put(u.getUsername(), u.getId().intValue());
        });
        ulist.forEach((u) -> {
            cbUsuario.addItem(u.getUsername());
        });
    }

    public void cargaEmpresa() {
        SsfEmpresaBO ebo = new SsfEmpresaBO();
        List<SsfEmpresa> elist = ebo.getAllSP();
        elist.forEach((e) -> {
            mape.put(e.getNombre(), e.getId().intValue());
        });
        elist.forEach((e) -> {
            cbEmpresa.addItem(e.getNombre());
        });
    }

    public void cargaCapacitacion() {
        SsfCapacitacionBO cbo = new SsfCapacitacionBO();
        List<SsfCapacitacion> clist = cbo.getAllSP();
        clist.forEach((c) -> {
            mapc.put(c.getNombre(), c.getId().intValue());
        });
        clist.forEach((c) -> {
            cbCapacitacion.addItem(c.getNombre());
        });
    }

    public void cargaEstadoCap() {
        SsfEstadocapaempresaBO ecebo = new SsfEstadocapaempresaBO();
        List<SsfEstadocapaempresa> ecelist = ecebo.getAllSP();
        ecelist.forEach((ece) -> {
            mapece.put(ece.getEstadocapaemp(), ece.getId().intValue());
        });
        ecelist.forEach((ece) -> {
            cbEstadoCap.addItem(ece.getEstadocapaemp());
        });
    }

    private void cargaTabla() {
        DefaultTableModel model = (DefaultTableModel) tblCapEmpresa.getModel();
        model.setRowCount(0);
        cebo = new SsfCapacitacionempresaBO();
        List<SsfCapacitacionempresa> lc = cebo.getAllSP();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        lc.forEach((c) -> {
            model.addRow(new Object[]{c.getId(), c.getIdUsuario().getUsername(), c.getIdEmpresa().getNombre(),
                c.getIdCapacitacion().getNombre(), c.getIdEstadocapacitacion().getEstadocapaemp(), c.getCantidadAlumnos(),
                sdf.format(c.getFechCreacion()), c.getEstado()});
        });
    }

    private void desactivarEstado() {
        tbEstado.setText("Desactivado");
        tbEstado.setBackground(new java.awt.Color(255, 51, 51));
    }

    private void activarEstado() {
        tbEstado.setText("Activo");
        tbEstado.setBackground(new java.awt.Color(0, 204, 102));
    }

    private void limpiarMsgs() {
        lExito.setText("");
        lError.setText("");
    }

    
    public void setFormsController(FormsController formsController) {
        this.formsController = formsController;
    }
    
    private void resizeTabla() {
        tblCapEmpresa.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        tblCapEmpresa.getColumnModel().getColumn(0).setMaxWidth(40);
        tblCapEmpresa.getColumnModel().getColumn(1).setMaxWidth(80);
        tblCapEmpresa.getColumnModel().getColumn(2).setMaxWidth(200);
        tblCapEmpresa.getColumnModel().getColumn(3).setMaxWidth(150);
        tblCapEmpresa.getColumnModel().getColumn(4).setMaxWidth(80);
        tblCapEmpresa.getColumnModel().getColumn(5).setMaxWidth(130);
        tblCapEmpresa.getColumnModel().getColumn(6).setMaxWidth(120);
        tblCapEmpresa.getColumnModel().getColumn(7).setMaxWidth(50);
    }
}
