package com.Profundizacion_JPA.Views;

import com.Profundizacion_JPA.Controllers.ClientesJpaController;
import com.Profundizacion_JPA.Controllers.FacturasJpaController;
import com.Profundizacion_JPA.Entities.Clientes;
import com.Profundizacion_JPA.Entities.Facturas;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class FacturaFinal extends javax.swing.JFrame {

    ClientesJpaController CClientes = new ClientesJpaController();
   FacturasJpaController CFacturas = new FacturasJpaController();
   Clientes EClientes = new Clientes();
   Facturas EFacturas = new Facturas();
    //List rs;
    DefaultTableModel modelo;

    int idcli;

    public FacturaFinal() {
        initComponents();
        setData_cliente();
        setData_factura();
    }

    public FacturaFinal(ArrayList<List<String>> articulos, String identificacion, String total) {
        initComponents();
        //txtIdentificacion.setText(identificacion);
        //txtTotal.setText(total);
        setData_cliente();
        setData_compra(articulos);
        setData_factura();
        
    }

    void setData_cliente() {

        //String identificación = txtIdentificacion.getText();
        idcli = CClientes.ultimoId();
        try {
            Clientes clientes = CClientes.findClientes(idcli);
                       String nombre = clientes.getNombres();
                       String apellido = clientes.getApellidos();
                       String identificacion = clientes.getIdentificacion();
                       String correo = clientes.getCorreo();
                       String telefono = clientes.getTelefono();
                       String ciudad = clientes.getCiudad();
                       String direccion = clientes.getDireccion();
                       txtNombre.setText(nombre);
                       txtApellido.setText(apellido);
                       txtIdentificacion.setText(identificacion);
                       txtCorreo.setText(correo);
                       txtTelefono.setText(telefono);
                       txtCiudad.setText(ciudad);
                       txtDireccion.setText(direccion);
                       
        } catch (Exception e) {
        }

    }

    void setData_compra(ArrayList<List<String>> articulos) {

        modelo = (DefaultTableModel) tablaCompra.getModel();
        Object[] articulo = new Object[6];
        for (int i = 0; i < articulos.size(); i++) {
            
            for (int j = 0; j < articulos.get(i).size(); j++) {
                
                articulo[j] = articulos.get(i).get(j);
            }
            
            modelo.addRow(articulo);
            
        }
        
        tablaCompra.setModel(modelo);

    }
    
    void setData_factura(){
        
        try {
            int idFac = CFacturas.ultimoId();
            
            Facturas facturas = CFacturas.findFacturas(idFac);
                       String fecha = facturas.getFecha();
                       String total = facturas.getTotal();
                       txtFecha.setText(fecha);
                       txtIdFactura.setText(Integer.toString(idFac));
                       txtTotal.setText(total);
        

        } catch (Exception e) {
        }
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtIdFactura = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaCompra = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JLabel();
        txtApellido = new javax.swing.JLabel();
        txtIdentificacion = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JLabel();
        txtCiudad = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Raleway Black", 0, 36)); // NOI18N
        jLabel1.setText("GRACIAS POR SU COMPRA");

        jLabel2.setFont(new java.awt.Font("Raleway SemiBold", 1, 15)); // NOI18N
        jLabel2.setText("FACTURA DE VENTA N°:");

        txtIdFactura.setFont(new java.awt.Font("Raleway SemiBold", 1, 15)); // NOI18N
        txtIdFactura.setText("txtIdFactura");

        jLabel3.setFont(new java.awt.Font("Raleway SemiBold", 1, 15)); // NOI18N
        jLabel3.setText("FECHA - HORA:");

        txtFecha.setFont(new java.awt.Font("Raleway SemiBold", 1, 15)); // NOI18N
        txtFecha.setText("txtFecha");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(207, 207, 207)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFecha)
                            .addComponent(txtIdFactura)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(jLabel1)))
                .addContainerGap(175, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtIdFactura))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtFecha))
                .addGap(18, 18, 18))
        );

        jLabel4.setFont(new java.awt.Font("Raleway SemiBold", 1, 18)); // NOI18N
        jLabel4.setText("RESUMEN DE TU COMPRA:");

        jLabel5.setFont(new java.awt.Font("Raleway SemiBold", 0, 15)); // NOI18N
        jLabel5.setText("VALOR A PAGAR:    $");

        txtTotal.setFont(new java.awt.Font("Raleway SemiBold", 0, 15)); // NOI18N
        txtTotal.setText("txtTotal");

        tablaCompra.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "CÓDIGO", "NOMBRE", "DESCRIPCIÓN", "PRECIO", "CANTIDAD"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaCompra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaCompraMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablaCompra);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 721, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 16, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTotal)
                .addGap(31, 31, 31))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtTotal))
                .addGap(0, 29, Short.MAX_VALUE))
        );

        jLabel6.setFont(new java.awt.Font("Raleway SemiBold", 1, 18)); // NOI18N
        jLabel6.setText("DATOS DEL CLIENTE:");

        jLabel7.setFont(new java.awt.Font("Raleway Medium", 1, 15)); // NOI18N
        jLabel7.setText("NOMBRE:");

        jLabel8.setFont(new java.awt.Font("Raleway Medium", 1, 15)); // NOI18N
        jLabel8.setText("IDENTIFICACIÓN:");

        jLabel9.setFont(new java.awt.Font("Raleway Medium", 1, 15)); // NOI18N
        jLabel9.setText("CORREO:");

        jLabel10.setFont(new java.awt.Font("Raleway Medium", 1, 15)); // NOI18N
        jLabel10.setText("TELÉFONO:");

        jLabel11.setFont(new java.awt.Font("Raleway Medium", 1, 15)); // NOI18N
        jLabel11.setText("CIUDAD:");

        jLabel12.setFont(new java.awt.Font("Raleway Medium", 1, 15)); // NOI18N
        jLabel12.setText("DIRECCIÓN:");

        txtNombre.setFont(new java.awt.Font("Raleway Medium", 0, 15)); // NOI18N
        txtNombre.setText("txtNombre");

        txtApellido.setFont(new java.awt.Font("Raleway Medium", 0, 15)); // NOI18N
        txtApellido.setText("txtApellido");

        txtIdentificacion.setFont(new java.awt.Font("Raleway Medium", 0, 15)); // NOI18N
        txtIdentificacion.setText("txtIdentificacion");

        txtCorreo.setFont(new java.awt.Font("Raleway Medium", 0, 15)); // NOI18N
        txtCorreo.setText("txtCorreo");

        txtTelefono.setFont(new java.awt.Font("Raleway Medium", 0, 15)); // NOI18N
        txtTelefono.setText("txtTelefono");

        txtCiudad.setFont(new java.awt.Font("Raleway Medium", 0, 15)); // NOI18N
        txtCiudad.setText("txtCiudad");

        txtDireccion.setFont(new java.awt.Font("Raleway Medium", 0, 15)); // NOI18N
        txtDireccion.setText("txtDireccion");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txtNombre)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtApellido))
                            .addComponent(txtIdentificacion)
                            .addComponent(txtCorreo))
                        .addGap(49, 49, 49)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(txtTelefono))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel11))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCiudad)
                                    .addComponent(txtDireccion)))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel6)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel10)
                    .addComponent(txtNombre)
                    .addComponent(txtApellido)
                    .addComponent(txtTelefono))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel11)
                    .addComponent(txtIdentificacion)
                    .addComponent(txtCiudad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel12)
                    .addComponent(txtCorreo)
                    .addComponent(txtDireccion)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 46, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(121, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void tablaCompraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaCompraMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_tablaCompraMouseClicked

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
            java.util.logging.Logger.getLogger(FacturaFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FacturaFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FacturaFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FacturaFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FacturaFinal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablaCompra;
    private javax.swing.JLabel txtApellido;
    private javax.swing.JLabel txtCiudad;
    private javax.swing.JLabel txtCorreo;
    private javax.swing.JLabel txtDireccion;
    private javax.swing.JLabel txtFecha;
    private javax.swing.JLabel txtIdFactura;
    private javax.swing.JLabel txtIdentificacion;
    private javax.swing.JLabel txtNombre;
    private javax.swing.JLabel txtTelefono;
    private javax.swing.JLabel txtTotal;
    // End of variables declaration//GEN-END:variables
}
