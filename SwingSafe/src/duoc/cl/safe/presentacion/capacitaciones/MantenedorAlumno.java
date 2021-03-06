/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duoc.cl.safe.presentacion.capacitaciones;

import duoc.cl.safe.entity.SsfEmpresa;
import duoc.cl.safe.entity.SsfPersona;
import duoc.cl.safe.entity.SsfAlumno;
import duoc.cl.safe.herramientas.Utilidad;
import duoc.cl.safe.negocio.SsfEmpresaBO;
import duoc.cl.safe.negocio.SsfPersonaBO;
import duoc.cl.safe.negocio.SsfAlumnoBO;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;
import javax.swing.table.DefaultTableModel;
import org.apache.log4j.Logger;
import org.apache.log4j.Level;

import org.apache.log4j.PropertyConfigurator;

/**
 *
 * @author Nacho
 */
public class MantenedorAlumno extends javax.swing.JFrame {

    /**
     * Creates new form MantenedorUsuario
     */
    public MantenedorAlumno() {
        initComponents();
        PropertyConfigurator.configure("log4j.properties");
        model = (DefaultTableModel) tblAlumno.getModel();
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

        pMantenedorUsuario = new javax.swing.JPanel();
        bModificar = new javax.swing.JButton();
        bLimpiar = new javax.swing.JButton();
        bBuscarPersona = new javax.swing.JButton();
        lExito = new javax.swing.JLabel();
        cbPersona = new javax.swing.JComboBox<>();
        tfBuscarPersona = new javax.swing.JTextField();
        lError = new javax.swing.JLabel();
        tfBuscarAlumno = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAlumno = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        bAgregar = new javax.swing.JButton();
        tbEstado = new javax.swing.JToggleButton();
        bRefrescar = new javax.swing.JButton();
        bBuscarAlumno = new javax.swing.JButton();
        cbEmpresa = new javax.swing.JComboBox<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(800, 100));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        pMantenedorUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Mantenedor Alumno", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(204, 0, 153))); // NOI18N
        pMantenedorUsuario.setName(""); // NOI18N

        bModificar.setText("Modificar");
        bModificar.setEnabled(false);
        bModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bModificarActionPerformed(evt);
            }
        });

        bLimpiar.setText("Limpiar");
        bLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bLimpiarActionPerformed(evt);
            }
        });

        bBuscarPersona.setText("Buscar Persona");
        bBuscarPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBuscarPersonaActionPerformed(evt);
            }
        });

        lExito.setForeground(new java.awt.Color(0, 102, 0));

        cbPersona.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Seleccione Persona -" }));
        cbPersona.setEnabled(false);

        lError.setForeground(new java.awt.Color(204, 0, 0));

        tblAlumno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Rut", "Nombre", "Apellidos", "Empresa", "Fecha Creación", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Short.class
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
        tblAlumno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAlumnoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblAlumno);

        jLabel4.setText("Empresa:");

        bAgregar.setText("Agregar");
        bAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAgregarActionPerformed(evt);
            }
        });

        tbEstado.setBackground(new java.awt.Color(0, 204, 102));
        tbEstado.setText("Activo");
        tbEstado.setEnabled(false);
        tbEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbEstadoActionPerformed(evt);
            }
        });

        bRefrescar.setText("Refrescar");
        bRefrescar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRefrescarActionPerformed(evt);
            }
        });

        bBuscarAlumno.setText("Buscar Alumno");
        bBuscarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBuscarAlumnoActionPerformed(evt);
            }
        });

        cbEmpresa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Seleccione Empresa -" }));

        javax.swing.GroupLayout pMantenedorUsuarioLayout = new javax.swing.GroupLayout(pMantenedorUsuario);
        pMantenedorUsuario.setLayout(pMantenedorUsuarioLayout);
        pMantenedorUsuarioLayout.setHorizontalGroup(
            pMantenedorUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pMantenedorUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pMantenedorUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pMantenedorUsuarioLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(pMantenedorUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(pMantenedorUsuarioLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(lExito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(lError, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pMantenedorUsuarioLayout.createSequentialGroup()
                                .addGroup(pMantenedorUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pMantenedorUsuarioLayout.createSequentialGroup()
                                        .addComponent(tfBuscarPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(bBuscarPersona, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(pMantenedorUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(pMantenedorUsuarioLayout.createSequentialGroup()
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(cbEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(cbPersona, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(pMantenedorUsuarioLayout.createSequentialGroup()
                                            .addComponent(tfBuscarAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(bBuscarAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(18, 18, 18)
                                .addComponent(bAgregar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bLimpiar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bModificar)
                                .addGap(5, 5, 5)
                                .addGroup(pMantenedorUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(bRefrescar, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                                    .addComponent(tbEstado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        pMantenedorUsuarioLayout.setVerticalGroup(
            pMantenedorUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pMantenedorUsuarioLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(pMantenedorUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfBuscarPersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bBuscarPersona))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbPersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pMantenedorUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pMantenedorUsuarioLayout.createSequentialGroup()
                        .addGroup(pMantenedorUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(cbEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pMantenedorUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pMantenedorUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(bAgregar)
                                .addComponent(bLimpiar)
                                .addComponent(bModificar))
                            .addGroup(pMantenedorUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(bBuscarAlumno)
                                .addComponent(tfBuscarAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pMantenedorUsuarioLayout.createSequentialGroup()
                        .addComponent(bRefrescar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tbEstado)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pMantenedorUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lExito, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lError, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE))
        );

        jMenu1.setText("Cargando...");
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pMantenedorUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addComponent(pMantenedorUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        /*
        this.setJMenuBar(formsController.getMenu().getMenuBar());
        formsController.getMenu().setjFrame(this);*/
        this.setLocationRelativeTo(null);
        cargaEmpresa();
        cargaTabla();
    }//GEN-LAST:event_formWindowOpened

    private void bBuscarPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBuscarPersonaActionPerformed
        String busqueda = tfBuscarPersona.getText().trim();
        //split(Pattern.quote(".")) - str.split("\\s+");
        if (busqueda.isEmpty()) {
            tfBuscarPersona.setText("Búsqueda no puede ser vacío");
        } else {
            String[] palabras = busqueda.split("\\s+");
            String[] palabras2 = busqueda.split(Pattern.quote("."));
            List<SsfPersona> pp = new LinkedList<>();
            if (ppall==null) {
                SsfPersonaBO persBO = new SsfPersonaBO();
                ppall = persBO.getAllSP();
            }
            for (String s : palabras) {
                for (SsfPersona pers : ppall) {
                    if (pers.getRut() != null) {
                        if (!pp.isEmpty()) {
                            if (!existeIdPers(pp, pers) && pers.getRut().contains(s)) {
                                pp.add(pers);
                            }
                        } else {
                            if (pers.getRut().contains(s)) {
                                pp.add(pers);
                            }
                        }
                    }
                    if (pers.getNombre() != null) {
                        if (!pp.isEmpty()) {
                            if (!existeIdPers(pp, pers) && pers.getNombre().toLowerCase().contains(s.toLowerCase())) {
                                pp.add(pers);
                            }
                        } else {
                            if (pers.getNombre().toLowerCase().contains(s.toLowerCase())) {
                                pp.add(pers);
                            }
                        }
                    }
                    if (pers.getApPaterno() != null) {
                        if (!pp.isEmpty()) {
                            if (!existeIdPers(pp, pers) && pers.getApPaterno().toLowerCase().contains(s.toLowerCase())) {
                                pp.add(pers);
                            }
                        } else {
                            if (pers.getApPaterno().toLowerCase().contains(s.toLowerCase())) {
                                pp.add(pers);
                            }
                        }
                    }
                    if (pers.getApMaterno() != null) {
                        if (!pp.isEmpty()) {
                            if (!existeIdPers(pp, pers) && pers.getApMaterno().toLowerCase().contains(s.toLowerCase())) {
                                pp.add(pers);
                            }
                        } else {
                            if (pers.getApMaterno().toLowerCase().contains(s.toLowerCase())) {
                                pp.add(pers);
                            }
                        }
                    }
                }
            }
            for (String s : palabras2) {
                for (SsfPersona pers : ppall) {
                    if (pers.getRut() != null) {
                        if (!pp.isEmpty()) {
                            if (!existeIdPers(pp, pers) && pers.getRut().contains(s)) {
                                pp.add(pers);
                            }
                        } else {
                            if (pers.getRut().contains(s)) {
                                pp.add(pers);
                            }
                        }
                    }
                }
            }
            if (!pp.isEmpty()) {
                cargaPersonas(pp);
            } else {
                tfBuscarPersona.setText("Búsqueda sin resultados");
                cbPersona.setEnabled(false);
            }
        }
    }//GEN-LAST:event_bBuscarPersonaActionPerformed

    private void tbEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbEstadoActionPerformed
        limpiarMsgs();
        //model = (DefaultTableModel) tblAlumno.getModel();
        abo = new SsfAlumnoBO();

        if (tblAlumno.getSelectedRow() == -1) {
            tbEstado.setEnabled(false);
            if (tblAlumno.getRowCount() == 0) {
                lError.setText("Tabla vacía");
            } else {
                lError.setText("No hay fila seleccionada");
            }
        } else {
            int id = Short.parseShort(model.getValueAt(tblAlumno.getSelectedRow(), 0).toString());
            if (!tbEstado.isSelected()) {
                if (abo.activarSP(id)) {
                    activarEstado();
                    model.setValueAt("1", tblAlumno.getSelectedRow(), 6);
                }
            } else {
                if (abo.desactivarSP(id)) {
                    desactivarEstado();
                    model.setValueAt("0", tblAlumno.getSelectedRow(), 6);
                }
            }
        }
    }//GEN-LAST:event_tbEstadoActionPerformed

    private void tblAlumnoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAlumnoMouseClicked
        limpiarMsgs();
        tbEstado.setEnabled(true);
        bModificar.setEnabled(true);
        model = (DefaultTableModel) tblAlumno.getModel();
        if (Short.parseShort(model.getValueAt(tblAlumno.getSelectedRow(), 6).toString()) == 1) {
            tbEstado.setSelected(false);
            activarEstado();
        } else {
            tbEstado.setSelected(true);
            desactivarEstado();
        }
        if (model.getValueAt(tblAlumno.getSelectedRow(), 1) != null) {
            cbPersona.setEnabled(true);
            cargaPersona();
            //cbPersona.setSelectedItem(model.getValueAt(tblAlumno.getSelectedRow(), 1).toString());
        } else {
            cbPersona.setSelectedIndex(0);
        }
        if (model.getValueAt(tblAlumno.getSelectedRow(), 4) != null) {
            cbEmpresa.setSelectedItem(model.getValueAt(tblAlumno.getSelectedRow(), 4).toString());
        } else {
            cbEmpresa.setSelectedIndex(0);
        }
    }//GEN-LAST:event_tblAlumnoMouseClicked

    private void bLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLimpiarActionPerformed
        tbEstado.setEnabled(false);
        bModificar.setEnabled(false);
        cbPersona.setEnabled(false);
        limpiarMsgs();
        tblAlumno.clearSelection();
        tfBuscarPersona.setText("");
        tfBuscarAlumno.setText("");
        cbEmpresa.setSelectedIndex(0);
    }//GEN-LAST:event_bLimpiarActionPerformed

    private void bAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAgregarActionPerformed
        abo = new SsfAlumnoBO();
        limpiarMsgs();
        if (cbEmpresa.getSelectedIndex() == 0) {
            lError.setText("Seleccione una Empresa");
        } else if (!cbPersona.isEnabled()) {
            lError.setText("¡Debe seleccionar una persona!");
        } else {
            String idpersona, idempresa;
            idpersona = mappers.get(cbPersona.getSelectedItem()).toString();
            idempresa = mape.get(cbEmpresa.getSelectedItem()).toString();
            SsfAlumno a = new SsfAlumno();
            a.setIdPersona(new SsfPersona(BigDecimal.valueOf((long) Long.valueOf(idpersona))));
            a.setIdEmpresa(new SsfEmpresa(BigDecimal.valueOf((long) Long.valueOf(idempresa))));
            if (abo.addSP(a)) {
                lExito.setText("Persona agregada exitosamente.");
                cargaTabla();
            } else {
                lError.setText("No se pudo agregar");
                log.log(Level.INFO, "No se pudo agregar");
            }
        }
    }//GEN-LAST:event_bAgregarActionPerformed

    private void bModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bModificarActionPerformed
        abo = new SsfAlumnoBO();
        limpiarMsgs();

        if (tblAlumno.getSelectedRow() == -1) {
            tbEstado.setEnabled(false);
            if (tblAlumno.getRowCount() == 0) {
                lError.setText("Tabla vacía");
            } else {
                lError.setText("No hay fila seleccionada");
            }
        } else {
            if (cbEmpresa.getSelectedIndex() == 0) {
                lError.setText("Seleccione una Empresa");
            } else if (!cbPersona.isEnabled()) {
                lError.setText("¡Debe seleccionar una persona!");
            } else {
                String id, idpersona, idempresa;
                id = model.getValueAt(tblAlumno.getSelectedRow(), 0).toString();
                idpersona = mappers.get(cbPersona.getSelectedItem()).toString();
                idempresa = mape.get(cbEmpresa.getSelectedItem()).toString();
                SsfAlumno a = abo.findSP(Integer.valueOf(id));
                //u.setId(BigDecimal.valueOf((long) Long.valueOf(id)));
                a.setIdPersona(new SsfPersona(BigDecimal.valueOf((long) Long.valueOf(idpersona))));
                a.setIdEmpresa(new SsfEmpresa(BigDecimal.valueOf((long) Long.valueOf(idempresa))));
                if (abo.updateSP(a)) {
                    lExito.setText("Persona modficada exitosamente.");
                    SsfPersona p = getPersona(idpersona);
                    model.setValueAt(p.getRut(), tblAlumno.getSelectedRow(), 1);
                    model.setValueAt(p.getNombre(), tblAlumno.getSelectedRow(), 2);
                    model.setValueAt(p.getApPaterno()+" "+p.getApMaterno(), tblAlumno.getSelectedRow(), 3);
                    model.setValueAt(cbEmpresa.getSelectedItem(), tblAlumno.getSelectedRow(), 4);
                } else {
                    lError.setText("No se pudo modificar");
                    log.log(Level.INFO, "No se pudo modificar");
                }
            }
        }
        //cargaTabla();
    }//GEN-LAST:event_bModificarActionPerformed

    private void bBuscarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBuscarAlumnoActionPerformed
        String busqueda = tfBuscarAlumno.getText().trim();
        //split(Pattern.quote(".")) - str.split("\\s+");
        if (busqueda.trim().isEmpty()) {
            tfBuscarAlumno.setText("Búsqueda no quedar en blanco");
        } else {
            String[] palabras = busqueda.split("\\s+");
            String[] palabras2 = busqueda.split(Pattern.quote("."));
            List<SsfAlumno> aa = new LinkedList<>();
            if (la==null) {
                abo = new SsfAlumnoBO();
                la = abo.getAllSP();
            }
            for (String s : palabras) {
                for (SsfAlumno a : la) {
                    if (a.getIdPersona().getNombre() != null) {
                        if (!aa.isEmpty()) {
                            if (!existeIdAlumno(aa, a) && a.getIdPersona().getNombre().toLowerCase().contains(s.toLowerCase())) {
                                aa.add(a);
                            }
                        } else {
                            if (a.getIdPersona().getNombre().toLowerCase().contains(s.toLowerCase())) {
                                aa.add(a);
                            }
                        }
                    }
                    if (a.getIdPersona().getApPaterno() != null) {
                        if (!aa.isEmpty()) {
                            if (!existeIdAlumno(aa, a) && a.getIdPersona().getApPaterno().toLowerCase().contains(s.toLowerCase())) {
                                aa.add(a);
                            }
                        } else {
                            if (a.getIdPersona().getApPaterno().toLowerCase().contains(s.toLowerCase())) {
                                aa.add(a);
                            }
                        }
                    }
                    if (a.getIdPersona().getApMaterno() != null) {
                        if (!aa.isEmpty()) {
                            if (!existeIdAlumno(aa, a) && a.getIdPersona().getApMaterno().toLowerCase().contains(s.toLowerCase())) {
                                aa.add(a);
                            }
                        } else {
                            if (a.getIdPersona().getApMaterno().toLowerCase().contains(s.toLowerCase())) {
                                aa.add(a);
                            }
                        }
                    }
                    if (a.getIdEmpresa().getNombre() != null) {
                        if (!aa.isEmpty()) {
                            if (!existeIdAlumno(aa, a) && a.getIdEmpresa().getNombre().toLowerCase().contains(s.toLowerCase())) {
                                aa.add(a);
                            }
                        } else {
                            if (a.getIdEmpresa().getNombre().toLowerCase().contains(s.toLowerCase())) {
                                aa.add(a);
                            }
                        }
                    }
                }
            }
            for (String s : palabras2) {
                for (SsfAlumno a : la) {
                    if (a.getIdPersona().getRut() != null) {
                        if (!aa.isEmpty()) {
                            if (!existeIdAlumno(aa, a) && a.getIdPersona().getRut().contains(s)) {
                                aa.add(a);
                            }
                        } else {
                            if (a.getIdPersona().getRut().contains(s)) {
                                aa.add(a);
                            }
                        }
                    }
                }
            }
            if (!aa.isEmpty()) {
                cargaAlumnos(aa);
            } else {
                tfBuscarAlumno.setText("Búsqueda sin resultados");
                cbPersona.setEnabled(false);
            }
        }
    }//GEN-LAST:event_bBuscarAlumnoActionPerformed

    private void bRefrescarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRefrescarActionPerformed
        tbEstado.setEnabled(false);
        bModificar.setEnabled(false);
        cbPersona.setEnabled(false);
        limpiarMsgs();
        tblAlumno.clearSelection();
        tfBuscarPersona.setText("");
        tfBuscarAlumno.setText("");
        cbEmpresa.setSelectedIndex(0);
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
            java.util.logging.Logger.getLogger(MantenedorAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MantenedorAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MantenedorAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MantenedorAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MantenedorAlumno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAgregar;
    private javax.swing.JButton bBuscarAlumno;
    private javax.swing.JButton bBuscarPersona;
    private javax.swing.JButton bLimpiar;
    private javax.swing.JButton bModificar;
    private javax.swing.JButton bRefrescar;
    private javax.swing.JComboBox<String> cbEmpresa;
    private javax.swing.JComboBox<String> cbPersona;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lError;
    private javax.swing.JLabel lExito;
    private javax.swing.JPanel pMantenedorUsuario;
    private javax.swing.JToggleButton tbEstado;
    private javax.swing.JTable tblAlumno;
    private javax.swing.JTextField tfBuscarAlumno;
    private javax.swing.JTextField tfBuscarPersona;
    // End of variables declaration//GEN-END:variables
    private static Logger log = Logger.getLogger(MantenedorAlumno.class.getName());
    private HashMap<String, Integer> mape = new HashMap<>();
    private HashMap<String, Integer> mappers = new HashMap<>();
    private List<SsfPersona> ppall;
    //private FormsController formsController;

    private DefaultTableModel model;
    private List<SsfAlumno> la;
    private SsfAlumnoBO abo;

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

    private void cargaPersonas(List<SsfPersona> pp) {
        mappers = new HashMap<>();
        cbPersona.setEnabled(true);
        cbPersona.removeAllItems();

        pp.forEach((p) -> {
            mappers.put("Rut: " + Utilidad.formatRutSalida(p.getRut()) + " - Nombre: " + p.getNombre() + " " + p.getApPaterno() + " " + p.getApMaterno(), p.getId().intValue());
        });

        mappers.forEach((s, i) -> {
            cbPersona.addItem(s);
            //System.out.println(i);
        });
    }

    private void cargaPersona() {
        mappers = new HashMap<>();
        cbPersona.setEnabled(true);
        cbPersona.removeAllItems();
        Long id = Long.valueOf(model.getValueAt(tblAlumno.getSelectedRow(), 0).toString());
        SsfAlumno a = null;
        for (SsfAlumno a2 : la) {
            if (a2.getId().longValue() == (long) id.longValue()) {
                a = a2;
            }
        }
        if (a != null) {
            mappers.put("Rut: " + Utilidad.formatRutSalida(a.getIdPersona().getRut()) + " - Nombre: " + a.getIdPersona().getNombre()
                    + " " + a.getIdPersona().getApPaterno() + " " + a.getIdPersona().getApMaterno(),
                    a.getIdPersona().getId().intValue());
        }
        if (!mappers.isEmpty()) {
            mappers.forEach((s, i) -> {
                cbPersona.addItem(s);
                cbPersona.setSelectedItem(s);
            });
        }
    }

    private boolean existeIdPers(List<SsfPersona> pp, SsfPersona pers) {
        for (SsfPersona p : pp) {
            if (p.getId() == pers.getId()) {
                return true;
            }
        }
        return false;
    }

    private void cargaTabla() {
        model.setRowCount(0);
        abo = new SsfAlumnoBO();
        la = abo.getAllSP();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        
        la.forEach((a) -> {
            model.addRow(new Object[]{a.getId(),
                Utilidad.formatRutSalida(a.getIdPersona().getRut()), a.getIdPersona().getNombre(), a.getIdPersona().getApPaterno()+" "+a.getIdPersona().getApMaterno(),
                a.getIdEmpresa().getNombre(),
                sdf.format(a.getFechCreacion()), a.getEstado()});
        });
    }

    private void limpiarMsgs() {
        lExito.setText("");
        lError.setText("");
    }

    private void desactivarEstado() {
        tbEstado.setText("Desactivado");
        tbEstado.setBackground(new java.awt.Color(255, 51, 51));
    }

    private void activarEstado() {
        tbEstado.setText("Activo");
        tbEstado.setBackground(new java.awt.Color(0, 204, 102));
    }

    private boolean existeIdAlumno(List<SsfAlumno> aa, SsfAlumno a) {
        for (SsfAlumno usuario : aa) {
            if (usuario.getId() == a.getId()) {
                return true;
            }
        }
        return false;
    }

    private void cargaAlumnos(List<SsfAlumno> aa) {
        model.setRowCount(0);
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        aa.forEach((a) -> {
            model.addRow(new Object[]{a.getId(),
                a.getIdPersona().getRut(), a.getIdPersona().getNombre(), a.getIdPersona().getApPaterno()+" "+a.getIdPersona().getApMaterno(),
                a.getIdEmpresa().getNombre(),
                sdf.format(a.getFechCreacion()), a.getEstado()});
        });
    }

    /*
    public void setFormsController(FormsController formsController) {
        this.formsController = formsController;
    }*/
    
    private void resizeTabla() { 
        tblAlumno.getColumnModel().getColumn(0).setMaxWidth(40);
        tblAlumno.getColumnModel().getColumn(1).setMaxWidth(110);
        tblAlumno.getColumnModel().getColumn(2).setMaxWidth(110);
        tblAlumno.getColumnModel().getColumn(3).setMaxWidth(150);
        tblAlumno.getColumnModel().getColumn(4).setMaxWidth(250);
        tblAlumno.getColumnModel().getColumn(5).setMaxWidth(110);
        tblAlumno.getColumnModel().getColumn(6).setMaxWidth(50);
    }

    private SsfPersona getPersona(String idpersona) {
        for (SsfPersona p : ppall) {
            if (Integer.valueOf(idpersona)==p.getId().intValue()) {
                return p;
            }
        }
        return null;
    }
    
    

}
