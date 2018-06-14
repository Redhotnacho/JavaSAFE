/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duoc.cl.safe.presentacion.capacitaciones;

import duoc.cl.safe.entity.SsfEstadocapaempresa;
import duoc.cl.safe.herramientas.FormsController;
import duoc.cl.safe.negocio.SsfEstadocapaempresaBO;
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
public class MantenedorEstadoCapacitacion extends javax.swing.JFrame {

    /**
     * Creates new form MantenedorEstado Capacitación
     */
    public MantenedorEstadoCapacitacion() {
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
        tfEstadoCap = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        taDescripcion = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCapacitacionEstado = new javax.swing.JTable();
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
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Estado Capacitación:");

        jLabel2.setText("Descripción:");

        jScrollPane1.setAutoscrolls(true);

        taDescripcion.setColumns(20);
        taDescripcion.setLineWrap(true);
        taDescripcion.setRows(5);
        jScrollPane1.setViewportView(taDescripcion);

        tblCapacitacionEstado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Estado Capacitación", "Descripción", "Fecha Creación", "Estado"
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
        tblCapacitacionEstado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCapacitacionEstadoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblCapacitacionEstado);

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

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 0, 102));
        jLabel8.setText("Mantenedor Estado Capacitación");

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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfEstadoCap))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addComponent(bAgregar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bModificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bLimpiar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 113, Short.MAX_VALUE))
                    .addComponent(jScrollPane2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lExito, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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
                    .addComponent(tfEstadoCap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void tblCapacitacionEstadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCapacitacionEstadoMouseClicked
        limpiarMsgs();
        tbEstado.setEnabled(true);
        bModificar.setEnabled(true);
        DefaultTableModel model = (DefaultTableModel) tblCapacitacionEstado.getModel();
        if (Integer.parseInt(model.getValueAt(tblCapacitacionEstado.getSelectedRow(), 4).toString()) == 1) {
            tbEstado.setSelected(false);
            activarEstado();
        } else {
            tbEstado.setSelected(true);
            desactivarEstado();
        }
        if (model.getValueAt(tblCapacitacionEstado.getSelectedRow(), 1) != null) {
            tfEstadoCap.setText(model.getValueAt(tblCapacitacionEstado.getSelectedRow(), 1).toString());
        } else {
            tfEstadoCap.setText("");
        }
        if (model.getValueAt(tblCapacitacionEstado.getSelectedRow(), 2) != null) {
            taDescripcion.setText(model.getValueAt(tblCapacitacionEstado.getSelectedRow(), 2).toString());
        } else {
            taDescripcion.setText("");
        }
    }//GEN-LAST:event_tblCapacitacionEstadoMouseClicked

    private void bLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLimpiarActionPerformed
        tbEstado.setEnabled(false);
        bModificar.setEnabled(false);
        limpiarMsgs();
        tblCapacitacionEstado.clearSelection();
        tfEstadoCap.setText("");
        taDescripcion.setText("");
    }//GEN-LAST:event_bLimpiarActionPerformed

    private void tbEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbEstadoActionPerformed
        limpiarMsgs();
        DefaultTableModel model = (DefaultTableModel) tblCapacitacionEstado.getModel();
        ecebo = new SsfEstadocapaempresaBO();

        if (tblCapacitacionEstado.getSelectedRow() == -1) {
            tbEstado.setEnabled(false);
            if (tblCapacitacionEstado.getRowCount() == 0) {
                lError.setText("Tabla vacía");
                Logger.getLogger(MantenedorEstadoCapacitacion.class.getName()).log(Level.WARN, "Tabla vacía");
            } else {
                lError.setText("No hay fila seleccionada");
                Logger.getLogger(MantenedorEstadoCapacitacion.class.getName()).log(Level.WARN, "No hay fila seleccionada");
            }
        } else {
            int id = Short.parseShort(model.getValueAt(tblCapacitacionEstado.getSelectedRow(), 0).toString());
            if (!tbEstado.isSelected()) {
                if (ecebo.activarSP(id)) {
                    activarEstado();
                    model.setValueAt("1", tblCapacitacionEstado.getSelectedRow(), 4);
                }
            } else {
                if (ecebo.desactivarSP(id)) {
                    desactivarEstado();
                    model.setValueAt("0", tblCapacitacionEstado.getSelectedRow(), 4);
                }
            }
        }
    }//GEN-LAST:event_tbEstadoActionPerformed

    private void bAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAgregarActionPerformed
        ecebo = new SsfEstadocapaempresaBO();
        limpiarMsgs();
        if (tfEstadoCap.getText().trim().equals("")) {
            lError.setText("Ingrese un nombre para el Estado de Capacitación");
        } else {
            String nom, desc;
            nom = tfEstadoCap.getText();
            desc = taDescripcion.getText();
            SsfEstadocapaempresa ece = new SsfEstadocapaempresa();
            ece.setEstadocapaemp(nom);
            ece.setDescripcion(desc);
            if (ecebo.addSP(ece)) {
                lExito.setText("Estado agregado exitosamente.");
                cargaTabla();
            } else {
                lError.setText("No se pudo agregar");
            }
        }
    }//GEN-LAST:event_bAgregarActionPerformed

    private void bModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bModificarActionPerformed
        DefaultTableModel model = (DefaultTableModel) tblCapacitacionEstado.getModel();
        ecebo = new SsfEstadocapaempresaBO();
        limpiarMsgs();
        if (tblCapacitacionEstado.getSelectedRow() == -1) {
            tbEstado.setEnabled(false);
            if (tblCapacitacionEstado.getRowCount() == 0) {
                lError.setText("Tabla vacía");
            } else {
                lError.setText("No hay fila seleccionada");
            }
        } else {
            if (tfEstadoCap.getText().trim().equals("")) {
                lError.setText("Nombre Estado Capacitación no puede estar en blanco");
            } else {
                String desc, nom, id;
                id = model.getValueAt(tblCapacitacionEstado.getSelectedRow(), 0).toString();
                nom = tfEstadoCap.getText().trim();
                desc = taDescripcion.getText().trim();
                SsfEstadocapaempresa estadocap = new SsfEstadocapaempresa();
                estadocap.setId(BigDecimal.valueOf(Long.valueOf(id)));
                estadocap.setEstadocapaemp(nom);
                estadocap.setDescripcion(desc);
                if (ecebo.updateSP(estadocap)) {
                    lExito.setText("Estado Capacitación modificado exitosamente.");
                    model.setValueAt(nom, tblCapacitacionEstado.getSelectedRow(), 1);
                    model.setValueAt(desc, tblCapacitacionEstado.getSelectedRow(), 2);
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
            java.util.logging.Logger.getLogger(MantenedorEstadoCapacitacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MantenedorEstadoCapacitacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MantenedorEstadoCapacitacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MantenedorEstadoCapacitacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new MantenedorEstadoCapacitacion().setVisible(true);
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
    private javax.swing.JTable tblCapacitacionEstado;
    private javax.swing.JTextField tfEstadoCap;
    // End of variables declaration//GEN-END:variables

    private SsfEstadocapaempresaBO ecebo;
    
    private FormsController formsController;

    public void setFormsController(FormsController formsController) {
        this.formsController = formsController;
    }

    private void cargaTabla() {
        
        DefaultTableModel model = (DefaultTableModel) tblCapacitacionEstado.getModel();
        model.setRowCount(0);
        ecebo = new SsfEstadocapaempresaBO();
        List<SsfEstadocapaempresa> lece = ecebo.getAllSP();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        lece.forEach((ece) -> {
            model.addRow(new Object[]{ece.getId(), ece.getEstadocapaemp(), ece.getDescripcion(), sdf.format(ece.getFechCreacion()), ece.getEstado()});
        });
        tblCapacitacionEstado.setModel(model);

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
        tblCapacitacionEstado.getColumnModel().getColumn(0).setMaxWidth(40);
        tblCapacitacionEstado.getColumnModel().getColumn(1).setMaxWidth(200);
        tblCapacitacionEstado.getColumnModel().getColumn(2).setMaxWidth(400);
        tblCapacitacionEstado.getColumnModel().getColumn(3).setMaxWidth(120);
        tblCapacitacionEstado.getColumnModel().getColumn(4).setMaxWidth(50);
    }
    
}
