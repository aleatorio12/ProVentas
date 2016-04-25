/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.pixhan.proventas.vista;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import net.pixhan.negocio.UtilNegocio;
import net.pixhan.utilidades.DatosProducto;
import net.pixhan.utilidades.DatosUsuario;
import net.pixhan.utilidades.ModificadorCadenas;
import net.pixhan.utilidades.ValidacionCadenas;

/**
 *
 * Autor: Victor Matías <vitomany@reproducir.net>
 * Fecha: 20/04/2016 
 * Hora: 02:33:38 AM
 * Web: https://reproducir.net
 */
public class JFRealizarVentas extends javax.swing.JFrame {

    private int cantidad;
    private Connection conexionNegocio;
    private ValidacionCadenas validacion = new ValidacionCadenas();
    private DatosUsuario datosUsuario;
    private DatosProducto datosProducto;
    private static final int TAMANIO_MAX_NOMBRE_PRODUCTO = 30;
    
    /** Creates new form JFRealizarVentas */
    public JFRealizarVentas( Connection conexionNegocio, DatosUsuario datosUsuario ) {
        this.conexionNegocio = conexionNegocio;
        this.datosUsuario = datosUsuario;
        initComponents();
        validacion.validarNumerosYPuntos(txtCodigoProducto);
        validacion.validarSoloLetras(txtNombreProducto);
        validacion.validarSoloNumeros(txtCantidad);
        validacion.limitarCaracteres(txtNombreProducto, TAMANIO_MAX_NOMBRE_PRODUCTO);

    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtCodigoProducto = new javax.swing.JTextField();
        txtNombreProducto = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVentaProductos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnAnadirProducto = new javax.swing.JButton();
        btnBuscarProducto = new javax.swing.JButton();
        btnProcesarVenta = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        txtCantidad = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtNombreProducto.setEnabled(false);
        txtNombreProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreProductoActionPerformed(evt);
            }
        });

        tblVentaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código Producto", "Nombrel Producto", "Cantidad", "Precio", "Descuento (%)", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Float.class, java.lang.Float.class, java.lang.Float.class
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
        jScrollPane1.setViewportView(tblVentaProductos);

        jLabel1.setText("Código del producto");

        jLabel2.setText("Nombre del producto");

        jLabel3.setText("Cantidad");

        btnAnadirProducto.setText("Añadir Producto");
        btnAnadirProducto.setEnabled(false);
        btnAnadirProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnadirProductoActionPerformed(evt);
            }
        });

        btnBuscarProducto.setText("Buscar Producto");
        btnBuscarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProductoActionPerformed(evt);
            }
        });

        btnProcesarVenta.setText("Procesar Venta");
        btnProcesarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcesarVentaActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNombreProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                    .addComponent(txtCodigoProducto))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBuscarProducto)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAnadirProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtCantidad))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 642, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnProcesarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCodigoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtNombreProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                        .addComponent(btnAnadirProducto)
                        .addComponent(btnBuscarProducto))
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnProcesarVenta))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProductoActionPerformed
        // TODO add your handling code here:

        DatosProducto datos = null;
        int idProducto = 0;
        
        if ( this.txtCodigoProducto.getText().isEmpty() ){
            System.out.println("No ha ingresado datos");
        }
        else{
            idProducto = ModificadorCadenas.cadenaAEntero( ModificadorCadenas.eliminaCaracteres(txtCodigoProducto.getText(), ".") );
            System.out.println("Vamos a iniciar el análisis: Id: "+ idProducto);
            System.out.println("Hasta aquí todo bien");
            datos = UtilNegocio.cargarDatosProducto(idProducto, null,conexionNegocio);
            System.out.println("Perdimos conexion");
            if ( datos != null ){
                this.datosProducto = datos;
                this.datosProducto.setCodProducto( this.txtCodigoProducto.getText() );
                this.btnAnadirProducto.setEnabled(true);
                System.out.println("Deberia habilitarse el boton");
            }
            else{
                System.out.println("Ha ocurrido un error al obtener la información");
            }
        }
    }//GEN-LAST:event_btnBuscarProductoActionPerformed

    private void btnAnadirProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnadirProductoActionPerformed
        int cant;
        if ( this.datosProducto != null && !this.txtCantidad.getText().isEmpty() && !this.txtCodigoProducto.getText().isEmpty() ){
        cant = ModificadorCadenas.cadenaAEntero(ModificadorCadenas.eliminaCaracteres(this.txtCantidad.getText(), "."));
            if ( ( cant ) <= ( this.datosProducto.getCantidad() ) ){
                float total = 0.00f;
                DefaultTableModel modelo = (DefaultTableModel) tblVentaProductos.getModel();
                Object [] fila = new Object[6];

                fila[0] = txtCodigoProducto.getText();
                fila[1]= datosProducto.getNombreProducto();
                fila[2]= Integer.parseInt(ModificadorCadenas.eliminaCaracteres(txtCantidad.getText(),"."));
                fila[3]= datosProducto.getPrecio();
                fila[4]= datosProducto.getDescuento();
                total = ModificadorCadenas.cadenaAEntero(ModificadorCadenas.eliminaCaracteres(txtCantidad.getText(),"."))
                        * (datosProducto.getPrecio() - ( datosProducto.getPrecio() / 100 * datosProducto.getDescuento()));
                fila[5]= total;

                modelo.addRow(fila);

                tblVentaProductos.setModel(modelo);
            }else{
                System.out.println("Cantidad más grande que existencia");
            }        
        }else{
            System.out.println("Campos no válidos");
        }
        
    }//GEN-LAST:event_btnAnadirProductoActionPerformed

    private void btnProcesarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcesarVentaActionPerformed
        // TODO add your handling code here:
        boolean ocurreError = true;
        DefaultTableModel model = (DefaultTableModel) tblVentaProductos.getModel();

        for ( int fila = 0; fila < model.getRowCount(); fila++ ){

            try {
                ocurreError = UtilNegocio.venderProducto(
                        ModificadorCadenas.cadenaAEntero(ModificadorCadenas.eliminaCaracteres(this.tblVentaProductos.getValueAt(fila, 0).toString(),".")),
                        datosUsuario.getUsuario(),
                        ModificadorCadenas.cadenaAEntero(ModificadorCadenas.eliminaCaracteres(this.tblVentaProductos.getValueAt(fila, 2).toString(),".")),
                        conexionNegocio
                );
            } catch (SQLException ex) {
                Logger.getLogger(JFRealizarVentas.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            if ( ocurreError == true ){
                System.out.println("Ha ocurrido un error eliminando las cosas");
                break;
                
            }
            
            model.removeRow(fila);
            fila-=1;
        }
        System.out.println("Todos los artículos procesados");

    }//GEN-LAST:event_btnProcesarVentaActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tblVentaProductos.getModel();        
        for ( int fila = 0; fila < model.getRowCount(); fila++ ){
            model.removeRow(fila);
            fila-=1;
        }
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtNombreProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreProductoActionPerformed

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
            java.util.logging.Logger.getLogger(JFRealizarVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFRealizarVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFRealizarVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFRealizarVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new JFRealizarVentas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnadirProducto;
    private javax.swing.JButton btnBuscarProducto;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnProcesarVenta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblVentaProductos;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCodigoProducto;
    private javax.swing.JTextField txtNombreProducto;
    // End of variables declaration//GEN-END:variables

}
