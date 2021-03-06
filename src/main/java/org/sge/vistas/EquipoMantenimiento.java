/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sge.vistas;

import java.util.List;
import javax.swing.ImageIcon;
import org.jdesktop.beansbinding.AutoBinding;
import org.jdesktop.beansbinding.BeanProperty;
import org.jdesktop.beansbinding.BindingGroup;
import org.jdesktop.observablecollections.ObservableCollections;
import org.jdesktop.swingbinding.JComboBoxBinding;
import org.jdesktop.swingbinding.JTableBinding;
import org.jdesktop.swingbinding.SwingBindings;
import org.sge.controladores.AbstractControlador;
import org.sge.controladores.EquipoControlador;
import org.sge.controladores.TipoEquipoControlador;
import org.sge.entidades.Equipo;
import org.sge.entidades.TipoEquipo;
import org.sge.util.FormularioUtil;
import org.sge.util.ScrollableLabel;

/**
 *
 * @author RyuujiMD
 */
public class EquipoMantenimiento extends javax.swing.JInternalFrame {

    /**
     * Creates new form TipoEquipoMantenimiento
     */
    private int accion = 0;
    private final EquipoControlador equipoControlador;
    private final TipoEquipoControlador tipoEquipoControlador;
    private static EquipoMantenimiento instancia = null;
    private List<Equipo> listaTabla;
    private List<TipoEquipo> listaCombo;
    private String rutaImagen;
    private final ScrollableLabel lblImagen;

    private EquipoMantenimiento() {
        this.equipoControlador = new EquipoControlador();
        this.tipoEquipoControlador = new TipoEquipoControlador();
        initComponents();
        this.lblImagen = new ScrollableLabel();
        this.scrllImagen.setViewportView(this.lblImagen);
        initDatosTablaTipoEquipo();
        FormularioUtil.activarComponente(pnlDatos, false);
        
    }

    public static EquipoMantenimiento getInstancia() {
        if (instancia == null) {
            instancia = new EquipoMantenimiento();
        }
        return instancia;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlDatos = new javax.swing.JPanel();
        pnlGC = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cboTipoEquipo = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        scrllImagen = new javax.swing.JScrollPane();
        pnlNEE = new javax.swing.JPanel();
        btnNuevo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTabla = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setTitle("MANTENIMIENTO EQUIPO");
        setPreferredSize(new java.awt.Dimension(600, 600));

        pnlDatos.setBorder(javax.swing.BorderFactory.createTitledBorder("DATOS"));

        btnGuardar.setText("GUARDAR");
        btnGuardar.setEnabled(false);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnCancelar.setText("CANCELAR");
        btnCancelar.setEnabled(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlGCLayout = new javax.swing.GroupLayout(pnlGC);
        pnlGC.setLayout(pnlGCLayout);
        pnlGCLayout.setHorizontalGroup(
            pnlGCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGCLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlGCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlGCLayout.setVerticalGroup(
            pnlGCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGCLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setText("NOMBRE:");

        txtNombre.setEditable(false);
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        jLabel2.setText("TIPO:");

        cboTipoEquipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel3.setText("FOTO:");

        jButton3.setText("...");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        scrllImagen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout pnlDatosLayout = new javax.swing.GroupLayout(pnlDatos);
        pnlDatos.setLayout(pnlDatosLayout);
        pnlDatosLayout.setHorizontalGroup(
            pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(8, 8, 8)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cboTipoEquipo, 0, 225, Short.MAX_VALUE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                    .addComponent(scrllImagen))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addGap(18, 18, 18)
                .addComponent(pnlGC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlDatosLayout.setVerticalGroup(
            pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDatosLayout.createSequentialGroup()
                        .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(cboTipoEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(scrllImagen)
                            .addGroup(pnlDatosLayout.createSequentialGroup()
                                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jButton3))
                                .addGap(0, 177, Short.MAX_VALUE))))
                    .addComponent(pnlGC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        btnNuevo.setText("NUEVO");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnEditar.setText("EDITAR");

        btnEliminar.setText("ELIMINAR");

        javax.swing.GroupLayout pnlNEELayout = new javax.swing.GroupLayout(pnlNEE);
        pnlNEE.setLayout(pnlNEELayout);
        pnlNEELayout.setHorizontalGroup(
            pnlNEELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNEELayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlNEELayout.setVerticalGroup(
            pnlNEELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlNEELayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlNEELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevo)
                    .addComponent(btnEditar)
                    .addComponent(btnEliminar))
                .addContainerGap())
        );

        tblTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblTabla);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlNEE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 63, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlNEE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // TODO add your handling code here:
        accion = AbstractControlador.NUEVO;
        equipoControlador.prepararCrear();
        activarComponentes();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        accion = 0;
        FormularioUtil.limpiarComponente(pnlDatos);
        this.lblImagen.setIcon(null);
        activarComponentes();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        this.equipoControlador.getSeleccionado().setNombre(txtNombre.getText());
        if (!rutaImagen.isEmpty()) {
            String imagen = FormularioUtil.guardarImagen(rutaImagen);
            this.equipoControlador.getSeleccionado().setFoto(imagen);
        }
        this.equipoControlador.getSeleccionado().setTipoEquipo(listaCombo.get(cboTipoEquipo.getSelectedIndex()));
        this.equipoControlador.accion(accion);
        if (accion == AbstractControlador.NUEVO) {
            this.listaTabla.add(this.equipoControlador.getSeleccionado());
        } else if (accion == AbstractControlador.MODIFICAR) {
            this.listaTabla.clear();
            this.listaTabla.addAll(this.equipoControlador.buscarTodos());
        }
        this.accion = 0;
        this.rutaImagen = "";
        FormularioUtil.limpiarComponente(pnlDatos);
        this.lblImagen.setIcon(null);
        this.activarComponentes();

    }//GEN-LAST:event_btnGuardarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        rutaImagen = FormularioUtil.chooserImagen(this);
        ImageIcon icono;
        if (rutaImagen.isEmpty()) {
            icono = null;
        } else {
            icono = new ImageIcon(rutaImagen);
        }
        lblImagen.setIcon(icono);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JComboBox cboTipoEquipo;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlDatos;
    private javax.swing.JPanel pnlGC;
    private javax.swing.JPanel pnlNEE;
    private javax.swing.JScrollPane scrllImagen;
    private javax.swing.JTable tblTabla;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables

    private void initDatosTablaTipoEquipo() {
        BindingGroup bindingGroup = new BindingGroup();
        listaTabla = ObservableCollections.observableList(this.equipoControlador.buscarTodos());

        listaCombo = this.tipoEquipoControlador.buscarTodos();

        BeanProperty pNombre = BeanProperty.create("nombre");

        JTableBinding bindingTabla = SwingBindings.createJTableBinding(AutoBinding.UpdateStrategy.READ_ONCE, listaTabla, tblTabla);

        JComboBoxBinding bindingCombo = SwingBindings.createJComboBoxBinding(AutoBinding.UpdateStrategy.READ, listaCombo, cboTipoEquipo);
//        JComboBoxBinding bindingCombo = SwingBindings.createJComboBoxBinding(AutoBinding.UpdateStrategy.READ, listaCombo, this.cboTipoEquipo, pNombre);

//        Binding bindingCombo = new Binding(listaCombo,null,cboTipoEquipo,"elements",);
        bindingTabla.addColumnBinding(pNombre).setColumnName("NOMBRE").setEditable(false);

        bindingGroup.addBinding(bindingTabla);
        bindingGroup.addBinding(bindingCombo);

        bindingGroup.bind();

    }

    private void actualizartabla() {

    }

    private void activarComponentes() {
        boolean nom = (accion == AbstractControlador.NUEVO || accion == AbstractControlador.MODIFICAR);

        FormularioUtil.activarComponente(pnlDatos, nom);
        FormularioUtil.activarComponente(pnlNEE, !nom);
        FormularioUtil.activarComponente(tblTabla, !nom);

    }
    
    private void limpiarFormulario(){
        
    }
    
    private void mostrar(String propiedad){
        
    }
}
