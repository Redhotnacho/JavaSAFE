/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duoc.cl.safe.presentacion.evaluaciones;

import duoc.cl.safe.entity.SsfEvaluacion;
import duoc.cl.safe.entity.SsfEvaluacionparametro;
import duoc.cl.safe.entity.SsfParametro;
import duoc.cl.safe.herramientas.FormsController;
import duoc.cl.safe.negocio.SsfEvaluacionBO;
import duoc.cl.safe.negocio.SsfEvaluacionparametroBO;
import duoc.cl.safe.negocio.SsfParametroBO;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Nacho
 */
public class MantenedorEvaluacionParametro extends javax.swing.JFrame {

    /**
     * Creates new form MantenedorParámetro evaluación
     */
    public MantenedorEvaluacionParametro() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgAprueba = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taObservacion = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblEvaluacionParametro = new javax.swing.JTable();
        lExito = new javax.swing.JLabel();
        lError = new javax.swing.JLabel();
        tbEstado = new javax.swing.JToggleButton();
        bModificar = new javax.swing.JButton();
        bAgregar = new javax.swing.JButton();
        bLimpiar = new javax.swing.JButton();
        cbParametro = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        cbEvaluacion = new javax.swing.JComboBox<>();
        rbSi = new javax.swing.JRadioButton();
        rbNo = new javax.swing.JRadioButton();
        rbPendiente = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
<<<<<<< HEAD
<<<<<<< HEAD
=======
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
>>>>>>> YerkoBanda
=======
        jLabel8 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
>>>>>>> Ignacio

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Parámetro:");

        jLabel2.setText("Observación:");

        jScrollPane1.setAutoscrolls(true);

        taObservacion.setColumns(20);
        taObservacion.setLineWrap(true);
        taObservacion.setRows(5);
        jScrollPane1.setViewportView(taObservacion);

        tblEvaluacionParametro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Parámetro", "Evaluación", "Aprueba", "Observación", "Fecha Creación", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Short.class, java.lang.String.class, java.lang.String.class, java.lang.Short.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblEvaluacionParametro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEvaluacionParametroMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblEvaluacionParametro);

        lExito.setForeground(new java.awt.Color(0, 204, 51));

        lError.setForeground(new java.awt.Color(255, 0, 0));

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

        cbParametro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Seleccione Parámetro -" }));

        jLabel3.setText("Evaluación:");

        cbEvaluacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Seleccione Evaluación -" }));

        bgAprueba.add(rbSi);
        rbSi.setText("Sí");

        bgAprueba.add(rbNo);
        rbNo.setText("No");

        bgAprueba.add(rbPendiente);
        rbPendiente.setSelected(true);
        rbPendiente.setText("Pendiente");

        jLabel4.setText("Aprobado:");

<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 0, 102));
        jLabel8.setText("Asignar Parámetro");

>>>>>>> Ignacio
        jMenu1.setText("Cargando...");
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

<<<<<<< HEAD
>>>>>>> YerkoBanda
=======
>>>>>>> Ignacio
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lExito, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lError, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(4, 4, 4)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel1)
                                                .addComponent(jLabel4))
                                            .addGap(18, 18, 18)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(rbSi)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(rbNo)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(rbPendiente))
                                                .addComponent(cbParametro, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addGap(18, 18, 18)
                                            .addComponent(cbEvaluacion, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(39, 39, 39)
                                .addComponent(bAgregar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bModificar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bLimpiar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 61, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbEvaluacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbParametro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bAgregar)
                            .addComponent(bLimpiar)
                            .addComponent(bModificar)
                            .addComponent(tbEstado))
                        .addGap(40, 40, 40))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbSi)
                            .addComponent(rbNo)
                            .addComponent(rbPendiente)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lExito, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setJMenuBar(formsController.getMenu().getMenuBar());
        formsController.getMenu().setjFrame(this);
        this.setLocationRelativeTo(null);
        cargaTabla();
        cargaEvaluacion();
        cargaParametro();
    }//GEN-LAST:event_formWindowOpened

    private void tblEvaluacionParametroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEvaluacionParametroMouseClicked
        limpiarMsgs();
        tbEstado.setEnabled(true);
        bModificar.setEnabled(true);
        DefaultTableModel model = (DefaultTableModel) tblEvaluacionParametro.getModel();
        if (Integer.parseInt(model.getValueAt(tblEvaluacionParametro.getSelectedRow(), 6).toString()) == 1) {
            tbEstado.setSelected(false);
            activarEstado();
        } else {
            tbEstado.setSelected(true);
            desactivarEstado();
        }
        if (model.getValueAt(tblEvaluacionParametro.getSelectedRow(), 3) != null) {
            int aprueba = Integer.parseInt(model.getValueAt(tblEvaluacionParametro.getSelectedRow(), 3).toString());
            switch (aprueba) {
                case 1:
                    rbSi.setSelected(true);
                    break;
                case 0:
                    rbNo.setSelected(true);
                    break;
                default:
                    rbPendiente.setSelected(true);
            }
        } else {
            rbPendiente.setSelected(true);
        }
        if (model.getValueAt(tblEvaluacionParametro.getSelectedRow(), 4) != null) {
            taObservacion.setText(model.getValueAt(tblEvaluacionParametro.getSelectedRow(), 4).toString());
        } else {
            taObservacion.setText("");
        }
        if (model.getValueAt(tblEvaluacionParametro.getSelectedRow(), 1) != null) {
            cbParametro.setSelectedItem(model.getValueAt(tblEvaluacionParametro.getSelectedRow(), 1).toString());
        } else {
            cbParametro.setSelectedIndex(0);
        }
        if (model.getValueAt(tblEvaluacionParametro.getSelectedRow(), 2) != null) {
            cbEvaluacion.setSelectedItem(model.getValueAt(tblEvaluacionParametro.getSelectedRow(), 2).toString());
        } else {
            cbEvaluacion.setSelectedIndex(0);
        }
    }//GEN-LAST:event_tblEvaluacionParametroMouseClicked

    private void bLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLimpiarActionPerformed
        tbEstado.setEnabled(false);
        bModificar.setEnabled(false);
        limpiarMsgs();
        tblEvaluacionParametro.clearSelection();
        taObservacion.setText("");
        cbParametro.setSelectedIndex(0);
        cbEvaluacion.setSelectedIndex(0);
        bgAprueba.clearSelection();
    }//GEN-LAST:event_bLimpiarActionPerformed

    private void tbEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbEstadoActionPerformed
        limpiarMsgs();
        DefaultTableModel model = (DefaultTableModel) tblEvaluacionParametro.getModel();
        epbo = new SsfEvaluacionparametroBO();

        if (tblEvaluacionParametro.getSelectedRow() == -1) {
            tbEstado.setEnabled(false);
            if (tblEvaluacionParametro.getRowCount() == 0) {
                lError.setText("Tabla vacía");
            } else {
                lError.setText("No hay fila seleccionada");
            }
        } else {
            int id = Short.parseShort(model.getValueAt(tblEvaluacionParametro.getSelectedRow(), 0).toString());
            if (!tbEstado.isSelected()) {
                if (epbo.activarSP(id)) {
                    activarEstado();
                    model.setValueAt("1", tblEvaluacionParametro.getSelectedRow(), 6);
                }
            } else {
                if (epbo.desactivarSP(id)) {
                    desactivarEstado();
                    model.setValueAt("0", tblEvaluacionParametro.getSelectedRow(), 6);
                }
            }
        }
    }//GEN-LAST:event_tbEstadoActionPerformed

    private void bAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAgregarActionPerformed
        epbo = new SsfEvaluacionparametroBO();
        limpiarMsgs();
        if (cbParametro.getSelectedIndex() == 0) {
            lError.setText("Seleccione un parámetro");
        } else if (cbEvaluacion.getSelectedIndex() == 0) {
            lError.setText("Seleccione una evaluación");
        } else {
            String ob, idpm, ideval;
            Short aprueba;
            ob = taObservacion.getText();
            idpm = mappm.get(cbParametro.getSelectedItem()).toString();
            ideval = mape.get(cbEvaluacion.getSelectedItem()).toString();
            if (rbSi.isSelected()) {
                aprueba = 1;
            } else if (rbNo.isSelected()) {
                aprueba = 0;
            } else {
                aprueba = -1;
            }
            SsfEvaluacionparametro ep = new SsfEvaluacionparametro();
            ep.setObservacion(ob);
            ep.setAprueba(aprueba);
            ep.setIdEvaluacion(new SsfEvaluacion(BigDecimal.valueOf((long) Long.valueOf(ideval))));
            ep.setIdParametro(new SsfParametro(BigDecimal.valueOf((long) Long.valueOf(idpm))));
            if (epbo.addSP(ep)) {
                lExito.setText("Parámetro evaluación agregado exitosamente.");
                cargaTabla();
            } else {
                lError.setText("No se pudo agregar");
            }
        }
    }//GEN-LAST:event_bAgregarActionPerformed

    private void bModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bModificarActionPerformed
        DefaultTableModel model = (DefaultTableModel) tblEvaluacionParametro.getModel();
        epbo = new SsfEvaluacionparametroBO();
        limpiarMsgs();
        if (tblEvaluacionParametro.getSelectedRow() == -1) {
            tbEstado.setEnabled(false);
            if (tblEvaluacionParametro.getRowCount() == 0) {
                lError.setText("Tabla vacía");
            } else {
                lError.setText("No hay fila seleccionada");
            }
        } else {
            if (cbParametro.getSelectedIndex() == 0) {
                lError.setText("Seleccione un parámetro");
            } else if (cbEvaluacion.getSelectedIndex() == 0) {
                lError.setText("Seleccione una evaluación");
            } else {
                String ob, id, ideval, idpm;
                Short aprueba;
                id = model.getValueAt(tblEvaluacionParametro.getSelectedRow(), 0).toString();
                ob = taObservacion.getText().trim();
                ideval = mape.get(cbEvaluacion.getSelectedItem()).toString();
                idpm = mappm.get(cbParametro.getSelectedItem()).toString();
                if (rbSi.isSelected()) {
                    aprueba = 1;
                } else if (rbNo.isSelected()) {
                    aprueba = 0;
                } else {
                    aprueba = -1;
                }
                SsfEvaluacionparametro ep = new SsfEvaluacionparametro();
                ep.setId(BigDecimal.valueOf(Long.valueOf(id)));
                ep.setObservacion(ob);
                ep.setAprueba(aprueba);
                ep.setIdEvaluacion(new SsfEvaluacion(BigDecimal.valueOf((long) Long.valueOf(ideval))));
                ep.setIdParametro(new SsfParametro(BigDecimal.valueOf((long) Long.valueOf(idpm))));
                if (epbo.updateSP(ep)) {
                    lExito.setText("Parámetro evaluación modificado exitosamente.");
                    // método cargaTabla() no actualiza la tabla por motivos desconocidos
                    model.setValueAt(ob, tblEvaluacionParametro.getSelectedRow(), 4);
                    model.setValueAt(aprueba, tblEvaluacionParametro.getSelectedRow(), 3);
                    model.setValueAt(cbEvaluacion.getSelectedItem(), tblEvaluacionParametro.getSelectedRow(), 2);
                    model.setValueAt(cbParametro.getSelectedItem(), tblEvaluacionParametro.getSelectedRow(), 1);
                } else {
                    lError.setText("No se pudo modificar");
                }
            }
        }
    }//GEN-LAST:event_bModificarActionPerformed

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
            java.util.logging.Logger.getLogger(MantenedorEvaluacionParametro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MantenedorEvaluacionParametro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MantenedorEvaluacionParametro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MantenedorEvaluacionParametro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new MantenedorEvaluacionParametro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAgregar;
    private javax.swing.JButton bLimpiar;
    private javax.swing.JButton bModificar;
    private javax.swing.ButtonGroup bgAprueba;
    private javax.swing.JComboBox<String> cbEvaluacion;
    private javax.swing.JComboBox<String> cbParametro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
<<<<<<< HEAD
<<<<<<< HEAD
=======
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
>>>>>>> YerkoBanda
=======
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
>>>>>>> Ignacio
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lError;
    private javax.swing.JLabel lExito;
    private javax.swing.JRadioButton rbNo;
    private javax.swing.JRadioButton rbPendiente;
    private javax.swing.JRadioButton rbSi;
    private javax.swing.JTextArea taObservacion;
    private javax.swing.JToggleButton tbEstado;
    private javax.swing.JTable tblEvaluacionParametro;
    // End of variables declaration//GEN-END:variables

    private SsfEvaluacionparametroBO epbo;
    private HashMap<String, Integer> mape = new HashMap<>();
    private HashMap<String, Integer> mappm = new HashMap<>();
    private FormsController formsController;

    public void setFormsController(FormsController formsController) {
        this.formsController = formsController;
    }

    public void cargaEvaluacion() {
        SsfEvaluacionBO ebo = new SsfEvaluacionBO();
        List<SsfEvaluacion> elist = ebo.getAllSP();
        elist.forEach((e) -> {
            mape.put(e.getNombre(), e.getId().intValue());
        });
        elist.forEach((e) -> {
            cbEvaluacion.addItem(e.getNombre());
        });
    }

    public void cargaParametro() {
        SsfParametroBO pmbo = new SsfParametroBO();
        List<SsfParametro> pmlist = pmbo.getAllSP();
        pmlist.forEach((pm) -> {
            mappm.put(pm.getParametro(), pm.getId().intValue());
        });
        pmlist.forEach((pm) -> {
            cbParametro.addItem(pm.getParametro());
        });
    }

    private void cargaTabla() {
        borrarTabla();
        DefaultTableModel model = (DefaultTableModel) tblEvaluacionParametro.getModel();
        epbo = new SsfEvaluacionparametroBO();
        List<SsfEvaluacionparametro> lep = epbo.getAllSP();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        lep.forEach((ep) -> {
            model.addRow(new Object[]{ep.getId(), ep.getIdParametro().getParametro(), ep.getIdEvaluacion().getNombre(), ep.getAprueba(), ep.getObservacion(), sdf.format(ep.getFechCreacion()), ep.getEstado()});
        });
        tblEvaluacionParametro.setModel(model);

    }

    private void borrarTabla() {
        tblEvaluacionParametro.removeAll();
        tblEvaluacionParametro.repaint();
        DefaultTableModel model = (DefaultTableModel) tblEvaluacionParametro.getModel();
        model.fireTableDataChanged();
        tblEvaluacionParametro.repaint();
        tblEvaluacionParametro.removeAll();
        int rows = model.getRowCount();
        for (int i = rows - 1; i >= 0; i--) {
            model.removeRow(i);
        }

        tblEvaluacionParametro.removeAll();
        model.setRowCount(0);
        model.fireTableDataChanged();
        tblEvaluacionParametro.repaint();
        tblEvaluacionParametro.setModel(model);
        tblEvaluacionParametro.repaint();
        tblEvaluacionParametro.removeAll();
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

}
