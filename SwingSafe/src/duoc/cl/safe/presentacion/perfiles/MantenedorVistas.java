/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duoc.cl.safe.presentacion.perfiles;

import duoc.cl.safe.entity.SsfMenu;
import duoc.cl.safe.entity.SsfVista;
<<<<<<< HEAD
=======
import duoc.cl.safe.herramientas.FormsController;
>>>>>>> YerkoBanda
import duoc.cl.safe.negocio.SsfMenuBO;
import duoc.cl.safe.negocio.SsfVistaBO;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Nacho
 */
public class MantenedorVistas extends javax.swing.JFrame {

    /**
     * Creates new form MantenedorVistas
     */
    public MantenedorVistas() {
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
        cbMenu = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        tfNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfURL = new javax.swing.JTextField();
        tbEstado = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVista = new javax.swing.JTable();
        bLimpiar = new javax.swing.JButton();
        bModificar = new javax.swing.JButton();
        bAgregar = new javax.swing.JButton();
        lError = new javax.swing.JLabel();
        lExito = new javax.swing.JLabel();
<<<<<<< HEAD
=======
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
>>>>>>> YerkoBanda

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Menu:");

        cbMenu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Seleccione Menú -" }));

        jLabel2.setText("Nombre:");

        jLabel3.setText("URL:");

        tbEstado.setText("Activado");
        tbEstado.setEnabled(false);
        tbEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbEstadoActionPerformed(evt);
            }
        });

        tblVista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "URL", "Menú", "Fecha Creación", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblVista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblVistaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblVista);

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

        lError.setForeground(new java.awt.Color(255, 0, 0));

        lExito.setForeground(new java.awt.Color(0, 204, 0));

<<<<<<< HEAD
=======
        jMenu1.setText("Cargando...");
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

>>>>>>> YerkoBanda
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbMenu, 0, 160, Short.MAX_VALUE)
                            .addComponent(tfNombre))
                        .addGap(36, 36, 36)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfURL, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lExito, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bAgregar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bModificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bLimpiar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(78, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(450, 450, 450))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(tfURL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
<<<<<<< HEAD
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
=======
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
>>>>>>> YerkoBanda
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lExito, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tbEstado)
                        .addComponent(bLimpiar)
                        .addComponent(bModificar)
                        .addComponent(bAgregar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lError, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(176, 176, 176))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
<<<<<<< HEAD
=======
        this.setJMenuBar(formsController.getMenu().getMenuBar());
        formsController.getMenu().setjFrame(this);
        this.setLocationRelativeTo(null);
>>>>>>> YerkoBanda
        cargaMenu();
        cargaTabla();
    }//GEN-LAST:event_formWindowOpened

    private void tblVistaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblVistaMouseClicked
        limpiarMsgs();
        tbEstado.setEnabled(true);
        bModificar.setEnabled(true);
        DefaultTableModel model = (DefaultTableModel) tblVista.getModel();
        if (Short.parseShort(model.getValueAt(tblVista.getSelectedRow(), 5).toString()) == 1) {
            tbEstado.setSelected(false);
            activarEstado();
        } else {
            tbEstado.setSelected(true);
            desactivarEstado();
        }
        if (model.getValueAt(tblVista.getSelectedRow(), 1) != null) {
            tfNombre.setText(model.getValueAt(tblVista.getSelectedRow(), 1).toString());
        } else {
            tfNombre.setText("");
        }
        if (model.getValueAt(tblVista.getSelectedRow(), 2) != null) {
            tfURL.setText(model.getValueAt(tblVista.getSelectedRow(), 2).toString());
        } else {
            tfURL.setText("");
        }
        if (model.getValueAt(tblVista.getSelectedRow(), 3) != null) {
            cbMenu.setSelectedItem(model.getValueAt(tblVista.getSelectedRow(), 3).toString());
        } else {
            cbMenu.setSelectedIndex(0);
        }
    }//GEN-LAST:event_tblVistaMouseClicked

    private void tbEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbEstadoActionPerformed
        limpiarMsgs();
        DefaultTableModel model = (DefaultTableModel) tblVista.getModel();
        vbo = new SsfVistaBO();

        if (tblVista.getSelectedRow() == -1) {
            tbEstado.setEnabled(false);
            if (tblVista.getRowCount() == 0) {
                lError.setText("Tabla vacía");
            } else {
                lError.setText("No hay fila seleccionada");
            }
        } else {
            int id = Short.parseShort(model.getValueAt(tblVista.getSelectedRow(), 0).toString());
            if (!tbEstado.isSelected()) {
                if (vbo.activarSP(id)) {
                    activarEstado();
                    model.setValueAt("1", tblVista.getSelectedRow(), 5);
                }
            } else {
                if (vbo.desactivarSP(id)) {
                    desactivarEstado();
                    model.setValueAt("0", tblVista.getSelectedRow(), 5);
                }
            }
        }
    }//GEN-LAST:event_tbEstadoActionPerformed

    private void bLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLimpiarActionPerformed
        tbEstado.setEnabled(false);
        bModificar.setEnabled(false);
        limpiarMsgs();
        tblVista.clearSelection();
        tfNombre.setText("");
        tfURL.setText("");
        cbMenu.setSelectedIndex(0);
    }//GEN-LAST:event_bLimpiarActionPerformed

    private void bAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAgregarActionPerformed
        vbo = new SsfVistaBO();
        limpiarMsgs();
        if (tfNombre.getText().trim().equals("")) {
            lError.setText("Ingrese un nombre para la Vista");
        } else if (cbMenu.getSelectedIndex() == 0) {
            lError.setText("Seleccione un Menú");
        } else {
            String nom, url, idmenu;
            nom = tfNombre.getText();
            url = tfURL.getText();
            idmenu = mapm.get(cbMenu.getSelectedItem()).toString();
            SsfVista vista = new SsfVista();
            vista.setNombre(nom);
            vista.setUrl(url);
            vista.setIdMenu(new SsfMenu(BigDecimal.valueOf((long) Long.valueOf(idmenu))));
            if (vbo.addSP(vista)) {
                lExito.setText("Vista agregada exitosamente.");
                cargaTabla();
            } else {
                lError.setText("No se pudo agregar");
            }
        }
    }//GEN-LAST:event_bAgregarActionPerformed

    private void bModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bModificarActionPerformed
        DefaultTableModel model = (DefaultTableModel) tblVista.getModel();
        vbo = new SsfVistaBO();
        limpiarMsgs();
        if (tblVista.getSelectedRow() == -1) {
            tbEstado.setEnabled(false);
            if (tblVista.getRowCount() == 0) {
                lError.setText("Tabla vacía");
            } else {
                lError.setText("No hay fila seleccionada");
            }
        } else {
            if (tfNombre.getText().trim().equals("")) {
                lError.setText("Nombre Vista no puede estar en blanco");
            } else if (cbMenu.getSelectedIndex() == 0) {
                lError.setText("Seleccione un Menú");
            } else {
                String nom, url, id, idmenu;
                id = model.getValueAt(tblVista.getSelectedRow(), 0).toString();
                nom = tfNombre.getText().trim();
                url = tfURL.getText().trim();
                idmenu = mapm.get(cbMenu.getSelectedItem()).toString();
                SsfVista vista = new SsfVista();
                vista.setId(BigDecimal.valueOf((long)Long.valueOf(id)));
                vista.setNombre(nom);
                vista.setUrl(url);
                vista.setIdMenu(new SsfMenu(BigDecimal.valueOf((long)Long.valueOf(idmenu))));
                if (vbo.updateSP(vista)) {
                    lExito.setText("Vista modificada exitosamente.");
                    // método cargaTabla() no actualiza la tabla por motivos desconocidos
                    model.setValueAt(nom, tblVista.getSelectedRow(), 1);
                    model.setValueAt(url, tblVista.getSelectedRow(), 2);
                    model.setValueAt(cbMenu.getSelectedItem(), tblVista.getSelectedRow(), 3);
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
            java.util.logging.Logger.getLogger(MantenedorVistas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MantenedorVistas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MantenedorVistas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MantenedorVistas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MantenedorVistas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAgregar;
    private javax.swing.JButton bLimpiar;
    private javax.swing.JButton bModificar;
    private javax.swing.JComboBox<String> cbMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
<<<<<<< HEAD
=======
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
>>>>>>> YerkoBanda
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lError;
    private javax.swing.JLabel lExito;
    private javax.swing.JToggleButton tbEstado;
    private javax.swing.JTable tblVista;
    private javax.swing.JTextField tfNombre;
    private javax.swing.JTextField tfURL;
    // End of variables declaration//GEN-END:variables

    private SsfVistaBO vbo;
    private HashMap<String, Integer> mapm = new HashMap<>();
<<<<<<< HEAD
=======
    private FormsController formsController;
>>>>>>> YerkoBanda

    private void cargaTabla() {
        borrarTabla();
        DefaultTableModel model = (DefaultTableModel) tblVista.getModel();
        vbo = new SsfVistaBO();
        List<SsfVista> lv = vbo.getAllSP();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        lv.forEach((v) -> {
<<<<<<< HEAD
            model.addRow(new Object[]{v.getId(), v.getNombre(), v.getUrl(), v.getIdMenu().getNombre(), sdf.format(v.getFechCreacion()), v.getEstado()});
=======
            String fecha = "";
            if(v.getFechCreacion().toString() != null && v.getFechCreacion().toString() != ""){
                fecha = sdf.format(v.getFechCreacion());
            }
            model.addRow(new Object[]{v.getId(), 
                v.getNombre(), 
                v.getUrl(), 
                v.getIdMenu().getNombre(), 
                fecha, 
                v.getEstado()});
>>>>>>> YerkoBanda
        });
        tblVista.setModel(model);

    }

    private void borrarTabla() {
        tblVista.removeAll();
        tblVista.repaint();
        DefaultTableModel model = (DefaultTableModel) tblVista.getModel();
        model.fireTableDataChanged();
        tblVista.repaint();
        tblVista.removeAll();
        int rows = model.getRowCount();
        for (int i = rows - 1; i >= 0; i--) {
            model.removeRow(i);
        }

        tblVista.removeAll();
        model.setRowCount(0);
        model.fireTableDataChanged();
        tblVista.repaint();
        tblVista.setModel(model);
        tblVista.repaint();
        tblVista.removeAll();
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

    public void cargaMenu() {
        SsfMenuBO mbo = new SsfMenuBO();
        List<SsfMenu> mlist = mbo.getAllSP();
        mlist.forEach((m) -> {
            mapm.put(m.getNombre(), m.getId().intValue());
        });
        mlist.forEach((m) -> {
            cbMenu.addItem(m.getNombre());
        });
    }
<<<<<<< HEAD

=======
    
    public FormsController getFormsController() {
        return formsController;
    }

    public void setFormsController(FormsController formsController) {
        this.formsController = formsController;
    }
>>>>>>> YerkoBanda
}
