/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duoc.cl.safe.forms;

import duoc.cl.safe.entity.SsfMenu;
import duoc.cl.safe.negocio.SsfMenuBO;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Nacho
 */
public class MantenedorMenu extends javax.swing.JFrame {

    /**
     * Creates new form MantenedorMenu
     */
    public MantenedorMenu() {
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

        jLabel1 = new javax.swing.JLabel();
        tfNombre = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMenu = new javax.swing.JTable();
        lExito = new javax.swing.JLabel();
        lError = new javax.swing.JLabel();
        tbEstado = new javax.swing.JToggleButton();
        bLimpiar = new javax.swing.JButton();
        bModificar = new javax.swing.JButton();
        bAgregar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Nombre Menu:");

        tblMenu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre Menú", "Fecha Creación", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.String.class, java.lang.String.class, java.lang.Short.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMenuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblMenu);

        lExito.setForeground(new java.awt.Color(0, 255, 51));

        lError.setForeground(new java.awt.Color(153, 0, 0));

        tbEstado.setText("Activo");
        tbEstado.setEnabled(false);
        tbEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbEstadoActionPerformed(evt);
            }
        });

        bLimpiar.setText("Limpiar");
        bLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bLimpiarActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lExito, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lError, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bAgregar)
                            .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bModificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bLimpiar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbEstado)
                    .addComponent(bLimpiar)
                    .addComponent(bModificar)
                    .addComponent(bAgregar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lExito, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lError, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 357, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbEstadoActionPerformed
        limpiarMsgs();
        DefaultTableModel model = (DefaultTableModel) tblMenu.getModel();
        mbo = new SsfMenuBO();

        if (tblMenu.getSelectedRow() == -1) {
            tbEstado.setEnabled(false);
            if (tblMenu.getRowCount() == 0) {
                lError.setText("Tabla vacía");
            } else {
                lError.setText("No hay fila seleccionada");
            }
        } else {
            int id = Short.parseShort(model.getValueAt(tblMenu.getSelectedRow(), 0).toString());
            if (!tbEstado.isSelected()) {
                if (mbo.activarSP(id)) {
                    activarEstado();
                    model.setValueAt("1", tblMenu.getSelectedRow(), 3);
                }
            } else {
                if (mbo.desactivarSP(id)) {
                    desactivarEstado();
                    model.setValueAt("0", tblMenu.getSelectedRow(), 3);
                }
            }
        }
    }//GEN-LAST:event_tbEstadoActionPerformed

    private void bLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLimpiarActionPerformed
        tbEstado.setEnabled(false);
        bModificar.setEnabled(false);
        limpiarMsgs();
        tblMenu.clearSelection();
        tfNombre.setText("");
    }//GEN-LAST:event_bLimpiarActionPerformed

    private void bAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAgregarActionPerformed
        mbo = new SsfMenuBO();
        limpiarMsgs();
        if (tfNombre.getText().trim().equals("")) {
            lError.setText("Ingrese un nombre para el Menú");
        } else {
            String nom;
            nom = tfNombre.getText();
            SsfMenu menu = new SsfMenu();
            menu.setNombre(nom);
            if (mbo.addSP(menu)) {
                lExito.setText("Menú agregado exitosamente.");
                cargaTabla();
            } else {
                lError.setText("No se pudo agregar");
            }
        }
    }//GEN-LAST:event_bAgregarActionPerformed

    private void bModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bModificarActionPerformed
        DefaultTableModel model = (DefaultTableModel) tblMenu.getModel();
        mbo = new SsfMenuBO();
        limpiarMsgs();
        if (tblMenu.getSelectedRow() == -1) {
            tbEstado.setEnabled(false);
            if (tblMenu.getRowCount() == 0) {
                lError.setText("Tabla vacía");
            } else {
                lError.setText("No hay fila seleccionada");
            }
        } else {
            if (tfNombre.getText().trim().equals("")) {
                lError.setText("Nombre Menú no puede estar en blanco");
            } else {
                String nom,id;
                id = model.getValueAt(tblMenu.getSelectedRow(), 0).toString();
                nom = tfNombre.getText().trim();
                SsfMenu menu = new SsfMenu();
                menu.setId(BigDecimal.valueOf(Long.valueOf(id)));
                menu.setNombre(nom);
                if (mbo.updateSP(menu)) {
                    lExito.setText("Menú modificado exitosamente.");
                    // método cargaTabla() no actualiza la tabla por motivos desconocidos
                    model.setValueAt(nom, tblMenu.getSelectedRow(), 1);
                } else {
                    lError.setText("No se pudo modificar");
                }
            }
        }
    }//GEN-LAST:event_bModificarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        cargaTabla();
    }//GEN-LAST:event_formWindowOpened

    private void tblMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMenuMouseClicked
        limpiarMsgs();
        tbEstado.setEnabled(true);
        bModificar.setEnabled(true);
        DefaultTableModel model = (DefaultTableModel) tblMenu.getModel();
        if (Integer.parseInt(model.getValueAt(tblMenu.getSelectedRow(), 3).toString()) == 1) {
            tbEstado.setSelected(false);
            activarEstado();
        } else {
            tbEstado.setSelected(true);
            desactivarEstado();
        }
        if (model.getValueAt(tblMenu.getSelectedRow(), 1) != null) {
            tfNombre.setText(model.getValueAt(tblMenu.getSelectedRow(), 1).toString());
        } else {
            tfNombre.setText("");
        }
    }//GEN-LAST:event_tblMenuMouseClicked

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
            java.util.logging.Logger.getLogger(MantenedorMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MantenedorMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MantenedorMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MantenedorMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MantenedorMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAgregar;
    private javax.swing.JButton bLimpiar;
    private javax.swing.JButton bModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lError;
    private javax.swing.JLabel lExito;
    private javax.swing.JToggleButton tbEstado;
    private javax.swing.JTable tblMenu;
    private javax.swing.JTextField tfNombre;
    // End of variables declaration//GEN-END:variables
    private SsfMenuBO mbo;

    private void cargaTabla() {
        borrarTabla();
        DefaultTableModel model = (DefaultTableModel) tblMenu.getModel();
        mbo = new SsfMenuBO();
        List<SsfMenu> lm = mbo.getAllSP();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        lm.forEach((m) -> {
            model.addRow(new Object[]{m.getId(), m.getNombre(), sdf.format(m.getFechCreacion()), m.getEstado()});
        });
        tblMenu.setModel(model);

    }

    private void borrarTabla() {
        tblMenu.removeAll();
        tblMenu.repaint();
        DefaultTableModel model = (DefaultTableModel) tblMenu.getModel();
        model.fireTableDataChanged();
        tblMenu.repaint();
        tblMenu.removeAll();
        int rows = model.getRowCount();
        for (int i = rows - 1; i >= 0; i--) {
            model.removeRow(i);
        }

        tblMenu.removeAll();
        model.setRowCount(0);
        model.fireTableDataChanged();
        tblMenu.repaint();
        tblMenu.setModel(model);
        tblMenu.repaint();
        tblMenu.removeAll();
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

    private boolean existeIdMenu(List<SsfMenu> mm, SsfMenu m) {
        for (SsfMenu menu : mm) {
            if (menu.getId() == m.getId()) {
                return true;
            }
        }
        return false;
    }

    private void cargaMenus(List<SsfMenu> mm) {
        borrarTabla();
        DefaultTableModel model = (DefaultTableModel) tblMenu.getModel();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        for (SsfMenu m : mm) {
            model.addRow(new Object[]{m.getId(), m.getNombre(),
                sdf.format(m.getFechCreacion()), m.getEstado()});
        }
        tblMenu.setModel(model);
    }



}
