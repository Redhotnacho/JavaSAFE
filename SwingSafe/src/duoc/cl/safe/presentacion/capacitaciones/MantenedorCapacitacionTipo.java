/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duoc.cl.safe.presentacion.capacitaciones;

import duoc.cl.safe.entity.SsfCapacitaciontipo;
import duoc.cl.safe.herramientas.FormsController;
import duoc.cl.safe.negocio.SsfCapacitaciontipoBO;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import org.apache.log4j.Logger;
import org.apache.log4j.Level;
import org.apache.log4j.PropertyConfigurator;

/**
 *
 * @author Nacho
 */
public class MantenedorCapacitacionTipo extends javax.swing.JFrame {

    /**
     * Creates new form MantenedorTipo Capacitación
     */
    public MantenedorCapacitacionTipo() {
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
        jLabel2 = new javax.swing.JLabel();
        tfTipoCap = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        taDescripcion = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCapacitacionTipo = new javax.swing.JTable();
        lExito = new javax.swing.JLabel();
        lError = new javax.swing.JLabel();
        tbEstado = new javax.swing.JToggleButton();
        bModificar = new javax.swing.JButton();
        bAgregar = new javax.swing.JButton();
        bLimpiar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Tipo Capacitación:");

        jLabel2.setText("Descripción:");

        jScrollPane1.setAutoscrolls(true);

        taDescripcion.setColumns(20);
        taDescripcion.setLineWrap(true);
        taDescripcion.setRows(5);
        taDescripcion.setWrapStyleWord(true);
        jScrollPane1.setViewportView(taDescripcion);

        tblCapacitacionTipo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Tipo Capacitación", "Descripción", "Fecha Creación", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Short.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCapacitacionTipo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCapacitacionTipoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblCapacitacionTipo);

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

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 0, 102));
        jLabel8.setText("Mantenedor Tipo Capacitación");

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
                    .addComponent(jScrollPane2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lExito, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfTipoCap))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(39, 39, 39)
                                .addComponent(bAgregar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bModificar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bLimpiar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2))
                        .addGap(0, 113, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfTipoCap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bAgregar)
                            .addComponent(bLimpiar)
                            .addComponent(bModificar)
                            .addComponent(tbEstado))
                        .addGap(29, 29, 29)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
    }//GEN-LAST:event_formWindowOpened

    private void tblCapacitacionTipoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCapacitacionTipoMouseClicked
        limpiarMsgs();
        tbEstado.setEnabled(true);
        bModificar.setEnabled(true);
        DefaultTableModel model = (DefaultTableModel) tblCapacitacionTipo.getModel();
        if (Integer.parseInt(model.getValueAt(tblCapacitacionTipo.getSelectedRow(), 4).toString()) == 1) {
            tbEstado.setSelected(false);
            activarEstado();
        } else {
            tbEstado.setSelected(true);
            desactivarEstado();
        }
        if (model.getValueAt(tblCapacitacionTipo.getSelectedRow(), 1) != null) {
            tfTipoCap.setText(model.getValueAt(tblCapacitacionTipo.getSelectedRow(), 1).toString());
        } else {
            tfTipoCap.setText("");
        }
        if (model.getValueAt(tblCapacitacionTipo.getSelectedRow(), 2) != null) {
            taDescripcion.setText(model.getValueAt(tblCapacitacionTipo.getSelectedRow(), 2).toString());
        } else {
            taDescripcion.setText("");
        }
    }//GEN-LAST:event_tblCapacitacionTipoMouseClicked

    private void bLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLimpiarActionPerformed
        tbEstado.setEnabled(false);
        bModificar.setEnabled(false);
        limpiarMsgs();
        tblCapacitacionTipo.clearSelection();
        tfTipoCap.setText("");
        taDescripcion.setText("");
    }//GEN-LAST:event_bLimpiarActionPerformed

    private void tbEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbEstadoActionPerformed
        limpiarMsgs();
        DefaultTableModel model = (DefaultTableModel) tblCapacitacionTipo.getModel();
        ctbo = new SsfCapacitaciontipoBO();

        if (tblCapacitacionTipo.getSelectedRow() == -1) {
            tbEstado.setEnabled(false);
            if (tblCapacitacionTipo.getRowCount() == 0) {
                lError.setText("Tabla vacía");
                Logger.getLogger(MantenedorCapacitacionTipo.class.getName()).log(Level.WARN, "Tabla vacía");
            } else {
                lError.setText("No hay fila seleccionada");
                Logger.getLogger(MantenedorCapacitacionTipo.class.getName()).log(Level.WARN, "No hay fila seleccionada");
            }
        } else {
            int id = Short.parseShort(model.getValueAt(tblCapacitacionTipo.getSelectedRow(), 0).toString());
            if (!tbEstado.isSelected()) {
                if (ctbo.activarSP(id)) {
                    activarEstado();
                    model.setValueAt("1", tblCapacitacionTipo.getSelectedRow(), 4);
                }
            } else {
                if (ctbo.desactivarSP(id)) {
                    desactivarEstado();
                    model.setValueAt("0", tblCapacitacionTipo.getSelectedRow(), 4);
                }
            }
        }
    }//GEN-LAST:event_tbEstadoActionPerformed

    private void bAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAgregarActionPerformed
        ctbo = new SsfCapacitaciontipoBO();
        limpiarMsgs();
        if (tfTipoCap.getText().trim().equals("")) {
            lError.setText("Ingrese un nombre para el Tipo de Capacitación");
        } else {
            String nom, desc;
            nom = tfTipoCap.getText();
            desc = taDescripcion.getText();
            SsfCapacitaciontipo ct = new SsfCapacitaciontipo();
            ct.setTipo(nom);
            ct.setDescripcion(desc);
            if (ctbo.addSP(ct)) {
                lExito.setText("Menú agregado exitosamente.");
                cargaTabla();
            } else {
                lError.setText("No se pudo agregar");
            }
        }
    }//GEN-LAST:event_bAgregarActionPerformed

    private void bModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bModificarActionPerformed
        DefaultTableModel model = (DefaultTableModel) tblCapacitacionTipo.getModel();
        ctbo = new SsfCapacitaciontipoBO();
        limpiarMsgs();
        if (tblCapacitacionTipo.getSelectedRow() == -1) {
            tbEstado.setEnabled(false);
            if (tblCapacitacionTipo.getRowCount() == 0) {
                lError.setText("Tabla vacía");
            } else {
                lError.setText("No hay fila seleccionada");
            }
        } else {
            if (tfTipoCap.getText().trim().equals("")) {
                lError.setText("Nombre Tipo Capacitación no puede estar en blanco");
            } else {
                String desc, nom, id;
                id = model.getValueAt(tblCapacitacionTipo.getSelectedRow(), 0).toString();
                nom = tfTipoCap.getText().trim();
                desc = taDescripcion.getText().trim();
                SsfCapacitaciontipo tipocap = new SsfCapacitaciontipo();
                tipocap.setId(BigDecimal.valueOf(Long.valueOf(id)));
                tipocap.setTipo(nom);
                tipocap.setDescripcion(desc);
                if (ctbo.updateSP(tipocap)) {
                    lExito.setText("Tipo Capacitación modificada exitosamente.");
                    model.setValueAt(nom, tblCapacitacionTipo.getSelectedRow(), 1);
                    model.setValueAt(desc, tblCapacitacionTipo.getSelectedRow(), 2);
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
            java.util.logging.Logger.getLogger(MantenedorCapacitacionTipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MantenedorCapacitacionTipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MantenedorCapacitacionTipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MantenedorCapacitacionTipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MantenedorCapacitacionTipo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAgregar;
    private javax.swing.JButton bLimpiar;
    private javax.swing.JButton bModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lError;
    private javax.swing.JLabel lExito;
    private javax.swing.JTextArea taDescripcion;
    private javax.swing.JToggleButton tbEstado;
    private javax.swing.JTable tblCapacitacionTipo;
    private javax.swing.JTextField tfTipoCap;
    // End of variables declaration//GEN-END:variables

    private SsfCapacitaciontipoBO ctbo;
    
    private FormsController formsController;

    public void setFormsController(FormsController formsController) {
        this.formsController = formsController;
    }

    private void cargaTabla() {
        
        DefaultTableModel model = (DefaultTableModel) tblCapacitacionTipo.getModel();
        model.setRowCount(0);
        ctbo = new SsfCapacitaciontipoBO();
        List<SsfCapacitaciontipo> let = ctbo.getAllSP();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        let.forEach((et) -> {
            model.addRow(new Object[]{et.getId(), et.getTipo(), et.getDescripcion(), sdf.format(et.getFechCreacion()), et.getEstado()});
        });
        tblCapacitacionTipo.setModel(model);

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

    private void resizeTabla() {
        tblCapacitacionTipo.getColumnModel().getColumn(0).setMaxWidth(40);
        tblCapacitacionTipo.getColumnModel().getColumn(1).setMaxWidth(200);
        tblCapacitacionTipo.getColumnModel().getColumn(2).setMaxWidth(400);
        tblCapacitacionTipo.getColumnModel().getColumn(3).setMaxWidth(120);
        tblCapacitacionTipo.getColumnModel().getColumn(4).setMaxWidth(50);
    }
    
    
}