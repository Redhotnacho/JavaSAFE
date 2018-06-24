/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duoc.cl.safe.presentacion.capacitaciones;

import duoc.cl.safe.entity.SsfCapacitaciontipo;
import duoc.cl.safe.entity.SsfCapacitacion;
import duoc.cl.safe.herramientas.FormsController;
import duoc.cl.safe.negocio.SsfCapacitaciontipoBO;
import duoc.cl.safe.negocio.SsfCapacitacionBO;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
public class MantenedorCapacitacion extends javax.swing.JFrame {

    /**
     * Creates new form MantenedorCapacitación
     */
    public MantenedorCapacitacion() {
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
        tfHoras = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCapacitacion = new javax.swing.JTable();
        lExito = new javax.swing.JLabel();
        lError = new javax.swing.JLabel();
        tbEstado = new javax.swing.JToggleButton();
        bModificar = new javax.swing.JButton();
        bAgregar = new javax.swing.JButton();
        bLimpiar = new javax.swing.JButton();
        cbTipoCap = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        tfFechaTerm = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tfCap = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tfFechaIni = new javax.swing.JTextField();
        bRefrescar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Horas:");

        jLabel2.setText("Fecha término:");

        tblCapacitacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Capacitación", "Horas", "Tipo", "Fecha Inicio", "Fecha Término", "Fecha Creación", "Estado"
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
        tblCapacitacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCapacitacionMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblCapacitacion);

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

        cbTipoCap.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Seleccione Tipo Capacitación -" }));

        jLabel3.setText("Tipo Capacitación:");

        tfFechaTerm.setText("dd-MM-aaaa");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 0, 102));
        jLabel8.setText("Mantenedor Capacitación");

        jLabel6.setText("Capacitación:");

        jLabel7.setText("Fecha inicio:");

        tfFechaIni.setText("dd-MM-aaaa");

        bRefrescar.setText("Refrescar");
        bRefrescar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRefrescarActionPerformed(evt);
            }
        });

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
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cbTipoCap, 0, 256, Short.MAX_VALUE)
                                    .addComponent(tfCap))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel1)
                                                .addComponent(jLabel2)
                                                .addComponent(jLabel7))
                                            .addGap(18, 18, 18)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(tfFechaIni, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                                                .addComponent(tfHoras, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(tfFechaTerm))
                                            .addGap(94, 94, 94)))
                                    .addComponent(lExito, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
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
                                    .addComponent(lError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 86, Short.MAX_VALUE))
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbTipoCap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfCap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(bRefrescar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bAgregar)
                            .addComponent(bLimpiar)
                            .addComponent(bModificar)
                            .addComponent(tbEstado)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(tfFechaIni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(tfFechaTerm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfHoras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lExito, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lError, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
        this.setJMenuBar(formsController.getMenu().getMenuBar());
        formsController.getMenu().setjFrame(this);
        this.setLocationRelativeTo(null);
        cargaTabla();
        cargaTipo();
    }//GEN-LAST:event_formWindowOpened

    private void tblCapacitacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCapacitacionMouseClicked
        limpiarMsgs();
        tbEstado.setEnabled(true);
        bModificar.setEnabled(true);
        DefaultTableModel model = (DefaultTableModel) tblCapacitacion.getModel();
        if (Integer.parseInt(model.getValueAt(tblCapacitacion.getSelectedRow(), 7).toString()) == 1) {
            tbEstado.setSelected(false);
            activarEstado();
        } else {
            tbEstado.setSelected(true);
            desactivarEstado();
        }
        if (model.getValueAt(tblCapacitacion.getSelectedRow(), 1) != null) {
            tfCap.setText(model.getValueAt(tblCapacitacion.getSelectedRow(), 1).toString());
        } else {
            tfCap.setText("");
        }
        if (model.getValueAt(tblCapacitacion.getSelectedRow(), 2) != null) {
            tfHoras.setText(model.getValueAt(tblCapacitacion.getSelectedRow(), 2).toString());
        } else {
            tfHoras.setText("");
        }
        if (model.getValueAt(tblCapacitacion.getSelectedRow(), 3) != null) {
            cbTipoCap.setSelectedItem(model.getValueAt(tblCapacitacion.getSelectedRow(), 3).toString());
        } else {
            cbTipoCap.setSelectedIndex(0);
        }
        if (model.getValueAt(tblCapacitacion.getSelectedRow(), 4) != null) {
            if (model.getValueAt(tblCapacitacion.getSelectedRow(), 4).toString().trim().isEmpty()) {
                tfFechaIni.setText("dd-MM-aaaa");
            } else {
                tfFechaIni.setText(model.getValueAt(tblCapacitacion.getSelectedRow(), 4).toString());
            }
        } else {
            tfFechaIni.setText("dd-MM-aaaa");
        }
        if (model.getValueAt(tblCapacitacion.getSelectedRow(), 5) != null) {
            if (model.getValueAt(tblCapacitacion.getSelectedRow(), 5).toString().isEmpty()) {
                tfFechaTerm.setText("dd-MM-aaaa");
            } else {
                tfFechaTerm.setText(model.getValueAt(tblCapacitacion.getSelectedRow(), 5).toString());
            }
        } else {
            tfFechaTerm.setText("dd-MM-aaaa");
        }

    }//GEN-LAST:event_tblCapacitacionMouseClicked

    private void bLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLimpiarActionPerformed
        tbEstado.setEnabled(false);
        bModificar.setEnabled(false);
        limpiarMsgs();
        tblCapacitacion.clearSelection();
        tfHoras.setText("");
        tfCap.setText("");
        tfFechaIni.setText("dd-MM-aaaa");
        tfFechaTerm.setText("dd-MM-aaaa");
        cbTipoCap.setSelectedIndex(0);
    }//GEN-LAST:event_bLimpiarActionPerformed

    private void tbEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbEstadoActionPerformed
        limpiarMsgs();
        DefaultTableModel model = (DefaultTableModel) tblCapacitacion.getModel();
        cbo = new SsfCapacitacionBO();

        if (tblCapacitacion.getSelectedRow() == -1) {
            tbEstado.setEnabled(false);
            if (tblCapacitacion.getRowCount() == 0) {
                lError.setText("Tabla vacía");
            } else {
                lError.setText("No hay fila seleccionada");
            }
        } else {
            int id = Short.parseShort(model.getValueAt(tblCapacitacion.getSelectedRow(), 0).toString());
            if (!tbEstado.isSelected()) {
                if (cbo.activarSP(id)) {
                    activarEstado();
                    model.setValueAt("1", tblCapacitacion.getSelectedRow(), 7);
                }
            } else {
                if (cbo.desactivarSP(id)) {
                    desactivarEstado();
                    model.setValueAt("0", tblCapacitacion.getSelectedRow(), 7);
                }
            }
        }
    }//GEN-LAST:event_tbEstadoActionPerformed

    private void bAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAgregarActionPerformed
        cbo = new SsfCapacitacionBO();
        limpiarMsgs();
        if (tfCap.getText().trim().equals("")) {
            lError.setText("Nombre Capacitación no puede quedar en blanco");
        } else if (cbTipoCap.getSelectedIndex() == 0) {
            lError.setText("Seleccione un tipo capacitación");
        } else {
            String sfech, sfech2, nom, idtipocap, horas;
            Date fecha = null;
            Date fecha2 = null;
            horas = tfHoras.getText();
            nom = tfCap.getText();
            sfech = tfFechaIni.getText();
            sfech2 = tfFechaTerm.getText();
            idtipocap = mapct.get(cbTipoCap.getSelectedItem()).toString();
            SsfCapacitacion c = new SsfCapacitacion();
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
            try {
                if (!horas.isEmpty()) {
                    Long nlong = Long.parseLong(horas);
                    c.setHoras(nlong);
                }
            } catch (NumberFormatException e) {
                log.log(Level.ERROR, "Error al ingresar horas", e);
                lError.setText("Error al ingresar horas");
            }
            try {
                if (!sfech.isEmpty() && !sfech.toLowerCase().equals("dd-MM-aaaa".toLowerCase())) {
                    if (sfech.length() < 10) {
                        sdf = new SimpleDateFormat("dd-MM-yy");
                    }
                    fecha = sdf.parse(sfech);
                    c.setFechaInicio(fecha);
                }
            } catch (ParseException ex) {
                log.log(Level.ERROR, "Error en formato de fecha inicio", ex);
                lError.setText("Error en formato de fecha inicio");
            }
            try {
                if (!sfech2.isEmpty() && !sfech2.toLowerCase().equals("dd-MM-aaaa".toLowerCase())) {
                    if (sfech2.length() < 10) {
                        sdf = new SimpleDateFormat("dd-MM-yy");
                    }
                    fecha2 = sdf.parse(sfech2);
                    c.setFechaTermino(fecha2);
                }
            } catch (ParseException ex) {
                log.log(Level.ERROR, "Error en formato de fecha término", ex);
                lError.setText("Error en formato de fecha término");
            }
            c.setNombre(nom);
            c.setIdCapacitaciontipo(new SsfCapacitaciontipo(BigDecimal.valueOf((long) Long.valueOf(idtipocap))));
            if (cbo.addSP(c)) {
                lExito.setText("Capacitación agregada exitosamente.");
                cargaTabla();
            } else {
                lError.setText("No se pudo agregar");
            }
        }
    }//GEN-LAST:event_bAgregarActionPerformed

    private void bModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bModificarActionPerformed
        DefaultTableModel model = (DefaultTableModel) tblCapacitacion.getModel();
        cbo = new SsfCapacitacionBO();
        limpiarMsgs();
        if (tblCapacitacion.getSelectedRow() == -1) {
            tbEstado.setEnabled(false);
            if (tblCapacitacion.getRowCount() == 0) {
                lError.setText("Tabla vacía");
            } else {
                lError.setText("No hay fila seleccionada");
            }
        } else {
            if (tfCap.getText().trim().equals("")) {
                lError.setText("Nombre Capacitación no puede quedar en blanco");
            } else if (cbTipoCap.getSelectedIndex() == 0) {
                lError.setText("Seleccione un tipo capacitación");
            } else {
                String sfech, sfech2, nom, id, idtipocap, horas;
                id = model.getValueAt(tblCapacitacion.getSelectedRow(), 0).toString();
                horas = tfHoras.getText();
                nom = tfCap.getText().trim();
                sfech = tfFechaIni.getText().trim();
                sfech2 = tfFechaTerm.getText().trim();
                idtipocap = mapct.get(cbTipoCap.getSelectedItem()).toString();
                SsfCapacitacion c = cbo.findSP(Integer.valueOf(id));
                Date fecha = null;
                Date fecha2 = null;
                SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
                if (!sfech.isEmpty() && !sfech.toLowerCase().equals("dd-MM-aaaa".toLowerCase())) {
                    try {

                        if (sfech.length() < 10) {
                            sdf = new SimpleDateFormat("dd-MM-yy");
                        }
                        fecha = sdf.parse(sfech);
                        c.setFechaInicio(fecha);

                    } catch (ParseException ex) {
                        log.log(Level.ERROR, "Error en formato de fecha inicio", ex);
                        sfech = "error";
                        lError.setText("Error en formato de fecha inicio");
                    }
                }
                if (!sfech2.isEmpty() && !sfech2.toLowerCase().equals("dd-MM-aaaa".toLowerCase())) {
                    try {

                        if (sfech2.length() < 10) {
                            sdf = new SimpleDateFormat("dd-MM-yy");
                        }
                        fecha2 = sdf.parse(sfech2);
                        c.setFechaTermino(fecha2);

                    } catch (ParseException ex) {
                        log.log(Level.ERROR, "Error en formato de fecha término", ex);
                        sfech2 = "error";
                        lError.setText("Error en formato de fecha término");
                    }
                }
                try {
                    if (!horas.isEmpty()) {
                        Long nlong = Long.parseLong(horas);
                        c.setHoras(nlong);
                    }
                } catch (NumberFormatException e) {
                    log.log(Level.ERROR, "Error al ingresar horas", e);
                    horas = "error";
                    lError.setText("Error al ingresar horas");
                }
                //c.setId(BigDecimal.valueOf(Long.valueOf(id)));
                c.setNombre(nom);
                c.setIdCapacitaciontipo(new SsfCapacitaciontipo(BigDecimal.valueOf((long) Long.valueOf(idtipocap))));
                if (cbo.updateSP(c)) {
                    lExito.setText("Capacitación modificada exitosamente.");
                    model.setValueAt(nom, tblCapacitacion.getSelectedRow(), 1);
                    if (!horas.equalsIgnoreCase("error")) {
                        model.setValueAt(horas, tblCapacitacion.getSelectedRow(), 2);
                    }
                    model.setValueAt(cbTipoCap.getSelectedItem(), tblCapacitacion.getSelectedRow(), 3);
                    if (!sfech.equals("error") && !sfech.isEmpty() && fecha != null) {
                        sdf = new SimpleDateFormat("dd-MM-yyyy");
                        model.setValueAt(sdf.format(fecha), tblCapacitacion.getSelectedRow(), 4);
                    }
                    if (!sfech2.equals("error") && !sfech2.isEmpty() && fecha2 != null) {
                        sdf = new SimpleDateFormat("dd-MM-yyyy");
                        model.setValueAt(sdf.format(fecha2), tblCapacitacion.getSelectedRow(), 5);
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
        tblCapacitacion.clearSelection();
        tfHoras.setText("");
        tfCap.setText("");
        tfFechaIni.setText("dd-MM-aaaa");
        tfFechaTerm.setText("dd-MM-aaaa");
        cbTipoCap.setSelectedIndex(0);
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
            java.util.logging.Logger.getLogger(MantenedorCapacitacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MantenedorCapacitacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MantenedorCapacitacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MantenedorCapacitacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MantenedorCapacitacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAgregar;
    private javax.swing.JButton bLimpiar;
    private javax.swing.JButton bModificar;
    private javax.swing.JButton bRefrescar;
    private javax.swing.JComboBox<String> cbTipoCap;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lError;
    private javax.swing.JLabel lExito;
    private javax.swing.JToggleButton tbEstado;
    private javax.swing.JTable tblCapacitacion;
    private javax.swing.JTextField tfCap;
    private javax.swing.JTextField tfFechaIni;
    private javax.swing.JTextField tfFechaTerm;
    private javax.swing.JTextField tfHoras;
    // End of variables declaration//GEN-END:variables

    private SsfCapacitacionBO cbo;
    private HashMap<String, Integer> mapct = new HashMap<>();
    private static Logger log = Logger.getLogger(MantenedorCapacitacion.class.getName());
    private FormsController formsController;
    
    public void cargaTipo() {
        SsfCapacitaciontipoBO ctbo = new SsfCapacitaciontipoBO();
        List<SsfCapacitaciontipo> ctlist = ctbo.getAllSP();
        ctlist.forEach((c) -> {
            mapct.put(c.getTipo(), c.getId().intValue());
        });
        ctlist.forEach((c) -> {
            cbTipoCap.addItem(c.getTipo());
        });
    }

    private void cargaTabla() {
        DefaultTableModel model = (DefaultTableModel) tblCapacitacion.getModel();
        model.setRowCount(0);
        cbo = new SsfCapacitacionBO();
        List<SsfCapacitacion> lc = cbo.getAllSP();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        String sfecha = null;
        String sfecha2 = null;
        for (SsfCapacitacion c : lc) {
            if (c.getFechaInicio() != null) {
                sfecha = sdf.format(c.getFechaInicio());
            } else {
                sfecha = "";
            }
            if (c.getFechaTermino() != null) {
                sfecha2 = sdf.format(c.getFechaTermino());
            } else {
                sfecha2 = "";
            }
            model.addRow(new Object[]{c.getId(), c.getNombre(), c.getHoras(), c.getIdCapacitaciontipo().getTipo(), sfecha, sfecha2, sdf.format(c.getFechCreacion()), c.getEstado()});
        }
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
        tblCapacitacion.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        tblCapacitacion.getColumnModel().getColumn(0).setMaxWidth(40);
        tblCapacitacion.getColumnModel().getColumn(1).setMaxWidth(200);
        tblCapacitacion.getColumnModel().getColumn(2).setMaxWidth(50);
        tblCapacitacion.getColumnModel().getColumn(3).setMaxWidth(200);
        tblCapacitacion.getColumnModel().getColumn(4).setMaxWidth(80);
        tblCapacitacion.getColumnModel().getColumn(5).setMaxWidth(120);
        tblCapacitacion.getColumnModel().getColumn(6).setMaxWidth(120);
        tblCapacitacion.getColumnModel().getColumn(7).setMaxWidth(50);
    }
}
