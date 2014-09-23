/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sge.vistas;

import java.awt.Component;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import org.jdesktop.beansbinding.AutoBinding;
import org.jdesktop.beansbinding.BeanProperty;
import org.jdesktop.observablecollections.ObservableCollections;
import org.jdesktop.swingbinding.JTableBinding;
import org.jdesktop.swingbinding.SwingBindings;
import org.sge.controladores.EmpresaControlador;
import org.sge.entidades.Empresa;

/**
 *
 * @author RyuujiMD
 */
public class SeleccionarEmpresa extends JDialog {

    /**
     * Creates new form SeleccionarEmpresa
     *
     * @param component
     * @param empresa
     */
    private Empresa empresa;
    private List<Empresa> lista;
    private final EmpresaControlador empresaControlador;

    public SeleccionarEmpresa(Component component) {
        super(JOptionPane.getFrameForComponent(component), true);
        this.empresaControlador = new EmpresaControlador();
        initComponents();
        this.setLocationRelativeTo(component);
        this.listar();

    }

    private final void listar() {
        lista = ObservableCollections.observableList(this.empresaControlador.buscarTodos());

        BeanProperty pRUC = BeanProperty.create("ruc");
        BeanProperty pNombre = BeanProperty.create("nombre");

        JTableBinding binding = SwingBindings.createJTableBinding(AutoBinding.UpdateStrategy.READ_ONCE, lista, tblTabla);

        binding.addColumnBinding(pRUC).setColumnName("RUC").setEditable(false);
        binding.addColumnBinding(pNombre).setColumnName("NOMBRE").setEditable(false);

        binding.bind();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblTabla = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("SELECCIONAR EMPRESA");
        setAlwaysOnTop(true);

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
        tblTabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblTablaMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tblTabla);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblTablaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTablaMouseReleased
        // TODO add your handling code here:
        if (evt.getClickCount() == 2) {
            int fila = tblTabla.getSelectedRow();
            this.empresa = lista.get(fila);
            this.dispose();
        }
    }//GEN-LAST:event_tblTablaMouseReleased

    public Empresa getEmpresa(){
        this.setVisible(true);
        return this.empresa;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblTabla;
    // End of variables declaration//GEN-END:variables
}
