/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duoc.cl.safe.presentacion.perfiles;

import duoc.cl.safe.entity.SsfPerfil;
import duoc.cl.safe.entity.SsfPerfilvista;
import duoc.cl.safe.entity.SsfUsuario;
import duoc.cl.safe.entity.SsfVista;
<<<<<<< HEAD
=======
import duoc.cl.safe.herramientas.FormsController;
>>>>>>> YerkoBanda
import duoc.cl.safe.negocio.SsfPerfilBO;
import duoc.cl.safe.negocio.SsfPerfilvistaBO;
import duoc.cl.safe.negocio.SsfVistaBO;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Nacho
 */
public class MantenedorPerfilVistas extends javax.swing.JFrame {

    /**
     * Creates new form MantenedorPerfil
     */
    public MantenedorPerfilVistas() {
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
        cbPerfil = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        cbVista = new javax.swing.JComboBox<>();
        tfBuscarVista = new javax.swing.JTextField();
        bBuscarVista = new javax.swing.JButton();
        lExito = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfURL = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPerfilVista = new javax.swing.JTable();
        lError = new javax.swing.JLabel();
        lErrorBuscarVista = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfMenu = new javax.swing.JTextField();
        bAgregar = new javax.swing.JButton();
        bLimpiar = new javax.swing.JButton();
        tbEstado = new javax.swing.JToggleButton();
        tfBuscarVistaPerfil = new javax.swing.JTextField();
        bBuscarVistaPerfil = new javax.swing.JButton();
        bRefrescar = new javax.swing.JButton();
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

        jLabel1.setText("Perfil:");

        cbPerfil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Seleccione Perfil -" }));

        jLabel2.setText("Vista:");

        cbVista.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Seleccione Vista -" }));
        cbVista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbVistaActionPerformed(evt);
            }
        });

        bBuscarVista.setText("Buscar Vista");
        bBuscarVista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBuscarVistaActionPerformed(evt);
            }
        });

        lExito.setForeground(new java.awt.Color(0, 153, 51));

        jLabel3.setText("URL Vista:");

        tfURL.setEditable(false);
        tfURL.setBackground(new java.awt.Color(204, 204, 255));

        tblPerfilVista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Vista Perfil", "Perfil", "Vista", "Menu", "Fecha Creación", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Short.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblPerfilVista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPerfilVistaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPerfilVista);

        lError.setForeground(new java.awt.Color(153, 0, 0));

        jLabel4.setText("Menú Vista:");

        tfMenu.setEditable(false);
        tfMenu.setBackground(new java.awt.Color(204, 204, 255));

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

        tbEstado.setText("Activo");
        tbEstado.setEnabled(false);
        tbEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbEstadoActionPerformed(evt);
            }
        });

        bBuscarVistaPerfil.setText("Buscar Vista Perfil");
        bBuscarVistaPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBuscarVistaPerfilActionPerformed(evt);
            }
        });

        bRefrescar.setText("Refrescar");
        bRefrescar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRefrescarActionPerformed(evt);
            }
        });

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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lExito, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lError, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfBuscarVista, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bBuscarVista, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lErrorBuscarVista, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(tfURL, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(207, 207, 207)
                                .addComponent(bAgregar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bLimpiar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tbEstado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cbPerfil, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbVista, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfBuscarVistaPerfil)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bBuscarVistaPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bRefrescar))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfBuscarVistaPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bBuscarVistaPerfil))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbVista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(tfMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bRefrescar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfBuscarVista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bBuscarVista))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(lErrorBuscarVista, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfURL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bAgregar)
                    .addComponent(bLimpiar)
                    .addComponent(tbEstado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lExito, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lError, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAgregarActionPerformed
        SsfPerfilvistaBO pvbo = new SsfPerfilvistaBO();
        limpiarMsgs();
        if (cbPerfil.getSelectedIndex() == 0) {
            lError.setText("Seleccione un Perfil");
        } else if (cbVista.getSelectedIndex() == 0) {
            lError.setText("Seleccione una Vista");
        } else {
            String idvista, idperfil;
            idperfil = mapp.get(cbPerfil.getSelectedItem()).toString();
            idvista = mapv.get(cbVista.getSelectedItem()).getId().toString();
            SsfPerfilvista pv = new SsfPerfilvista();
            pv.setIdPerfil(new SsfPerfil(BigDecimal.valueOf((long) Long.valueOf(idperfil))));
            pv.setIdVista(new SsfVista(BigDecimal.valueOf((long) Long.valueOf(idvista))));
            if (pvbo.addSP(pv)) {
                lExito.setText("Perfil Vista agregada exitosamente.");
                cargaTabla();
            } else {
                lError.setText("No se pudo agregar");
            }
        }
    }//GEN-LAST:event_bAgregarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
<<<<<<< HEAD
=======
        this.setJMenuBar(formsController.getMenu().getMenuBar());
        formsController.getMenu().setjFrame(this);
        this.setLocationRelativeTo(null);
>>>>>>> YerkoBanda
        cargaVista();
        cargaPerfil();
        cargaTabla();
    }//GEN-LAST:event_formWindowOpened

    private void cbVistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbVistaActionPerformed
        if (cbVista.getSelectedIndex() != 0 && !mapv.isEmpty()) {
            //int id = Integer.valueOf(mapv.get(cbVista.getSelectedItem()).toString());
            //SsfVista v = findVista(id);
            SsfVista v = mapv.get(cbVista.getSelectedItem().toString());
            if (v != null) {
                tfMenu.setText(v.getIdMenu().getNombre());
                tfURL.setText(v.getUrl());
            }
        } else {
            tfURL.setText("");
            tfMenu.setText("");
        }
    }//GEN-LAST:event_cbVistaActionPerformed

    private void bLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLimpiarActionPerformed
        tbEstado.setEnabled(false);
        limpiarMsgs();
        tblPerfilVista.clearSelection();
        tfBuscarVista.setText("");
        tfBuscarVistaPerfil.setText("");
        tfMenu.setText("");
        tfURL.setText("");
        cargaVista();
        cbVista.setSelectedIndex(0);
        cbPerfil.setSelectedIndex(0);
    }//GEN-LAST:event_bLimpiarActionPerformed

    private void tblPerfilVistaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPerfilVistaMouseClicked
        limpiarMsgs();
        tbEstado.setEnabled(true);
        model = (DefaultTableModel) tblPerfilVista.getModel();
        if (Short.parseShort(model.getValueAt(tblPerfilVista.getSelectedRow(), 5).toString()) == 1) {
            tbEstado.setSelected(false);
            activarEstado();
        } else {
            tbEstado.setSelected(true);
            desactivarEstado();
        }
        if (model.getValueAt(tblPerfilVista.getSelectedRow(), 1) != null) {
            cbPerfil.setSelectedItem(model.getValueAt(tblPerfilVista.getSelectedRow(), 1).toString());
        } else {
            cbPerfil.setSelectedIndex(0);
        }
        if (model.getValueAt(tblPerfilVista.getSelectedRow(), 2) != null) {
            cbVista.setSelectedItem(model.getValueAt(tblPerfilVista.getSelectedRow(), 2).toString());
            tfURL.setText(mapv.get(cbVista.getSelectedItem()).getUrl());
        } else {
            cbVista.setSelectedIndex(0);
            tfURL.setText("");
        }
        if (model.getValueAt(tblPerfilVista.getSelectedRow(), 3) != null) {
            tfMenu.setText(model.getValueAt(tblPerfilVista.getSelectedRow(), 3).toString());
        } else {
            tfMenu.setText("");
        }
    }//GEN-LAST:event_tblPerfilVistaMouseClicked

    private void tbEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbEstadoActionPerformed
        limpiarMsgs();
        model = (DefaultTableModel) tblPerfilVista.getModel();
        SsfPerfilvistaBO pvbo = new SsfPerfilvistaBO();

        if (tblPerfilVista.getSelectedRow() == -1) {
            tbEstado.setEnabled(false);
            if (tblPerfilVista.getRowCount() == 0) {
                lError.setText("Tabla vacía");
            } else {
                lError.setText("No hay fila seleccionada");
            }
        } else {
            int id = Short.parseShort(model.getValueAt(tblPerfilVista.getSelectedRow(), 0).toString());
            if (!tbEstado.isSelected()) {
                if (pvbo.activarSP(id)) {
                    activarEstado();
                    model.setValueAt("1", tblPerfilVista.getSelectedRow(), 5);
                }
            } else {
                if (pvbo.desactivarSP(id)) {
                    desactivarEstado();
                    model.setValueAt("0", tblPerfilVista.getSelectedRow(), 5);
                }
            }
        }
    }//GEN-LAST:event_tbEstadoActionPerformed

    private void bBuscarVistaPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBuscarVistaPerfilActionPerformed
        String busqueda = tfBuscarVistaPerfil.getText().trim();
        //split(Pattern.quote(".")) - str.split("\\s+");
        if (busqueda.equals("")) {
            tfBuscarVistaPerfil.setText("Búsqueda no puede ser vacía");
        } else {
            String[] palabras = busqueda.split("\\s+");
            //String[] palabras2 = busqueda.split(Pattern.quote("."));
            List<SsfPerfilvista> pvv = new LinkedList<>();
            SsfPerfilvistaBO pvbo = new SsfPerfilvistaBO();
            List<SsfPerfilvista> pvvall = pvbo.getAllSP();
            for (String s : palabras) {
                for (SsfPerfilvista pv : pvvall) {
                    if (pv.getIdPerfil().getPerfil() != null) {
                        if (!pvv.isEmpty()) {
                            if (!existeIdPerfilVista(pvv, pv) && pv.getIdPerfil().getPerfil().toLowerCase().contains(s.toLowerCase())) {
                                pvv.add(pv);
                            }
                        } else {
                            if (pv.getIdPerfil().getPerfil().toLowerCase().contains(s.toLowerCase())) {
                                pvv.add(pv);
                            }
                        }
                    }
                    if (pv.getIdVista().getNombre() != null) {
                        if (!pvv.isEmpty()) {
                            if (!existeIdPerfilVista(pvv, pv) && pv.getIdVista().getNombre().toLowerCase().contains(s.toLowerCase())) {
                                pvv.add(pv);
                            }
                        } else {
                            if (pv.getIdVista().getNombre().toLowerCase().contains(s.toLowerCase())) {
                                pvv.add(pv);
                            }
                        }
                    }
                    if (pv.getIdVista().getIdMenu().getNombre() != null) {
                        if (!pvv.isEmpty()) {
                            if (!existeIdPerfilVista(pvv, pv) && pv.getIdVista().getIdMenu().getNombre().toLowerCase().contains(s.toLowerCase())) {
                                pvv.add(pv);
                            }
                        } else {
                            if (pv.getIdVista().getIdMenu().getNombre().toLowerCase().contains(s.toLowerCase())) {
                                pvv.add(pv);
                            }
                        }
                    }

                }
            }
            if (!pvv.isEmpty()) {
                tblPerfilVista.removeAll();
                cargaPerfilvistas(pvv);
            } else {
                tfBuscarVistaPerfil.setText("Búsqueda sin resultados");
            }

        }
    }//GEN-LAST:event_bBuscarVistaPerfilActionPerformed

    private void bRefrescarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRefrescarActionPerformed
        cargaTabla();
    }//GEN-LAST:event_bRefrescarActionPerformed

    private void bBuscarVistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBuscarVistaActionPerformed
        String busqueda = tfBuscarVista.getText().trim();
        //split(Pattern.quote(".")) - str.split("\\s+");
        if (busqueda.equals("")) {
            tfBuscarVista.setText("Búsqueda no puede ser vacío");
        } else {
            String[] palabras = busqueda.split("\\s+");
            //String[] palabras2 = busqueda.split(Pattern.quote("."));
            List<SsfVista> vv = new LinkedList<>();
            SsfVistaBO vistaBO = new SsfVistaBO();
            List<SsfVista> vvall = vistaBO.getAllSP();
            for (String s : palabras) {
                for (SsfVista v : vvall) {
                    if (v.getNombre() != null) {
                        if (!vv.isEmpty()) {
                            if (!existeIdVista(vv, v) && v.getNombre().toLowerCase().contains(s.toLowerCase())) {
                                vv.add(v);
                            }
                        } else {
                            if (v.getNombre().toLowerCase().contains(s.toLowerCase())) {
                                vv.add(v);
                            }
                        }
                    }
                    if (v.getIdMenu().getNombre() != null) {
                        if (!vv.isEmpty()) {
                            if (!existeIdVista(vv, v) && v.getIdMenu().getNombre().toLowerCase().contains(s.toLowerCase())) {
                                vv.add(v);
                            }
                        } else {
                            if (v.getIdMenu().getNombre().toLowerCase().contains(s.toLowerCase())) {
                                vv.add(v);
                            }
                        }
                    }
                }
            }
            if (!vv.isEmpty()) {
                cargaVistas(vv);
            } else {
                tfBuscarVista.setText("Búsqueda sin resultados");
                cargaVista();
            }

        }
    }//GEN-LAST:event_bBuscarVistaActionPerformed

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
            java.util.logging.Logger.getLogger(MantenedorPerfilVistas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MantenedorPerfilVistas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MantenedorPerfilVistas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MantenedorPerfilVistas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MantenedorPerfilVistas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAgregar;
    private javax.swing.JButton bBuscarVista;
    private javax.swing.JButton bBuscarVistaPerfil;
    private javax.swing.JButton bLimpiar;
    private javax.swing.JButton bRefrescar;
    private javax.swing.JComboBox<String> cbPerfil;
    private javax.swing.JComboBox<String> cbVista;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
<<<<<<< HEAD
=======
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
>>>>>>> YerkoBanda
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lError;
    private javax.swing.JLabel lErrorBuscarVista;
    private javax.swing.JLabel lExito;
    private javax.swing.JToggleButton tbEstado;
    private javax.swing.JTable tblPerfilVista;
    private javax.swing.JTextField tfBuscarVista;
    private javax.swing.JTextField tfBuscarVistaPerfil;
    private javax.swing.JTextField tfMenu;
    private javax.swing.JTextField tfURL;
    // End of variables declaration//GEN-END:variables
    private HashMap<String, SsfVista> mapv;
    private HashMap<String, Integer> mapp;
    private SsfUsuario usuarioSesion;
    private List<SsfVista> vlist;
    private DefaultTableModel model;
<<<<<<< HEAD
=======
    private FormsController formsController;
>>>>>>> YerkoBanda

    public void cargaVista() {
        mapv = new HashMap<>();
        cbVista.removeAllItems();
        cbVista.addItem("- Seleccione Vista -");
        SsfVistaBO vbo = new SsfVistaBO();
        if (vlist==null) {
            vlist = vbo.getAllSP();
        }
        
        vlist.forEach((v) -> {
            mapv.put(v.getNombre(), v);
        });
        vlist.forEach((v) -> {
            cbVista.addItem(v.getNombre());
        });
    }

    public void cargaPerfil() {
        mapp = new HashMap<>();
        SsfPerfilBO pbo = new SsfPerfilBO();
        List<SsfPerfil> plist = pbo.getAllSP();
        plist.forEach((p) -> {
            mapp.put(p.getPerfil(), p.getId().intValue());
        });
        plist.forEach((p) -> {
            cbPerfil.addItem(p.getPerfil());
        });
    }

    private void cargaVistas(List<SsfVista> vv) {
        mapv = new HashMap<>();
        //cbVista.setEnabled(true);
        cbVista.removeAllItems();
        vv.forEach((v) -> {
            mapv.put(v.getNombre(), v);
        });

        mapv.forEach((s, i) -> {
            cbVista.addItem(s);
            //System.out.println(i);
        });
    }

    private void cargaPerfilvistas(List<SsfPerfilvista> pvv) {
        borrarTabla();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        for (SsfPerfilvista pv : pvv) {

            model.addRow(new Object[]{pv.getId(), pv.getIdPerfil().getPerfil(), pv.getIdVista().getNombre(),
                pv.getIdVista().getIdMenu().getNombre(),
                sdf.format(pv.getFechCreacion()), pv.getEstado()});
        }
        tblPerfilVista.setModel(model);
    }

    private boolean existeIdVista(List<SsfVista> vv, SsfVista vista) {
        for (SsfVista v : vv) {
            if (v.getId() == vista.getId()) {
                return true;
            }
        }
        return false;
    }

    private boolean existeIdPerfilVista(List<SsfPerfilvista> pvv, SsfPerfilvista vista) {
        for (SsfPerfilvista pv : pvv) {
            if (pv.getId() == vista.getId()) {
                return true;
            }
        }
        return false;
    }

    private void cargaTabla() {
        borrarTabla();
        SsfPerfilvistaBO pvbo = new SsfPerfilvistaBO();
        List<SsfPerfilvista> lpv = pvbo.getAllSP();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

        for (SsfPerfilvista pv : lpv) {
            model.addRow(new Object[]{pv.getId(), pv.getIdPerfil().getPerfil(), pv.getIdVista().getNombre(),
                pv.getIdVista().getIdMenu().getNombre(), sdf.format(pv.getFechCreacion()),
                pv.getEstado()});
        }
        tblPerfilVista.setModel(model);
    }

    private void borrarTabla() {
        tblPerfilVista.removeAll();
        tblPerfilVista.repaint();
        model = (DefaultTableModel) tblPerfilVista.getModel();
        model.fireTableDataChanged();
        tblPerfilVista.repaint();
        tblPerfilVista.removeAll();
        int rows = model.getRowCount();
        for (int i = rows - 1; i >= 0; i--) {
            model.removeRow(i);
        }

        tblPerfilVista.removeAll();
        model.setRowCount(0);
        model.fireTableDataChanged();
        tblPerfilVista.repaint();
        tblPerfilVista.setModel(model);
        tblPerfilVista.repaint();
        tblPerfilVista.removeAll();
    }

    private void limpiarMsgs() {
        lExito.setText("");
        lError.setText("");
        lErrorBuscarVista.setText("");
    }

    private void desactivarEstado() {
        tbEstado.setText("Desactivado");
        tbEstado.setBackground(new java.awt.Color(255, 51, 51));
    }

    private void activarEstado() {
        tbEstado.setText("Activo");
        tbEstado.setBackground(new java.awt.Color(0, 204, 102));
    }

    /* Opción para datos de vista ddl: URL y Menu
    private SsfVista findVista(int id) {
        SsfVista v = null;
        if (vlist != null) {
            if (!vlist.isEmpty()) {
                for (SsfVista vista : vlist) {
                    if (id == vista.getId().intValue()) {
                        v = vista;
                        break;
                    }
                }
            }
        }
        return v;
    }
     */
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
