/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemamain;

import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import servicios.conexion;

/**
 *
 * @author JesusMini
 */
public class DefinirProductos2 extends javax.swing.JFrame {

    /**
     * Creates new form DefinirProductos2
     */
    conexion cc = new conexion();
    Connection cn = cc.obtener();
    
    public DefinirProductos2() {
        initComponents();
        setLocationRelativeTo(null);
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/icon2.png"));
        setIconImage(icon);
        setVisible(true);
        codigosProductos();
        cardarCMB();
    }
    void codigosProductos(){
     int j;
        int cont=1;
        String num="";
        String c="";
         String SQL="select max(idProductos) from productos";
       // String SQL="select count(*) from factura";
        //String SQL="SELECT MAX(cod_emp) AS cod_emp FROM empleado";
        //String SQL="SELECT @@identity AS ID";
        try {
            Statement st = cn.createStatement();
            ResultSet rs=st.executeQuery(SQL);
            if(rs.next())
            {              
                 c=rs.getString(1);
            }
                             
            if(c==null){
                txtCodigoProductos.setText("CP0001");
            }
            else{
                char r1=c.charAt(2);
                char r2=c.charAt(3);
                char r3=c.charAt(4);
                char r4=c.charAt(5);
                String r="";
                r=""+r1+r2+r3+r4;
            
                 j=Integer.parseInt(r);
                 GenerarCodigos gen= new GenerarCodigos();
                 gen.generar(j);
                 txtCodigoProductos.setText("CP"+gen.serie());
            }
          //  cn.close();
        } catch (SQLException ex) {
           Logger.getLogger(DefinirProductos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    void cardarCMB() {
        
        try {
            Statement st=cn.createStatement();
            ResultSet rs = st.executeQuery("select idProveedores from proveedores");
            comboBoxProductos.removeAllItems();
            while(rs.next()){
                comboBoxProductos.addItem(rs.getString(1));                 
            }
           // cn.close();
        } catch (SQLException ex) {
            Logger.getLogger(DefinirProductos2.class.getName()).log(Level.SEVERE, null, ex);
        }    
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DesktopPanelDefinirProductos = new javax.swing.JDesktopPane();
        labTituloProducto = new javax.swing.JLabel();
        labCodigoProducto = new javax.swing.JLabel();
        labNombreProducto = new javax.swing.JLabel();
        labDescripcionProducto = new javax.swing.JLabel();
        labPrecioProducto = new javax.swing.JLabel();
        labSock = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAreaDescripcionProducto = new javax.swing.JTextArea();
        txtCodigoProductos = new javax.swing.JTextField();
        txtNombreProducto = new javax.swing.JTextField();
        txtPrecioProducto = new javax.swing.JTextField();
        txtStockProducto = new javax.swing.JFormattedTextField();
        jPanel1 = new javax.swing.JPanel();
        buttCerrar = new javax.swing.JButton();
        buttAceptar = new javax.swing.JButton();
        buttLimpiar = new javax.swing.JButton();
        labProveedor = new javax.swing.JLabel();
        comboBoxProductos = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Farmacia Balin");
        setResizable(false);

        DesktopPanelDefinirProductos.setBackground(java.awt.SystemColor.activeCaption);
        DesktopPanelDefinirProductos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        DesktopPanelDefinirProductos.setPreferredSize(new java.awt.Dimension(753, 380));

        labTituloProducto.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labTituloProducto.setForeground(new java.awt.Color(153, 255, 255));
        labTituloProducto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labTituloProducto.setText("Definir Productos");

        labCodigoProducto.setText("Codigo Producto");

        labNombreProducto.setText("Nombre");

        labDescripcionProducto.setText("Descripcion");

        labPrecioProducto.setText("Precio");

        labSock.setText("Stock");

        txtAreaDescripcionProducto.setColumns(20);
        txtAreaDescripcionProducto.setLineWrap(true);
        txtAreaDescripcionProducto.setRows(5);
        jScrollPane2.setViewportView(txtAreaDescripcionProducto);

        txtCodigoProductos.setEditable(false);

        txtStockProducto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        buttCerrar.setText("Cerrar");
        buttCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttCerrarActionPerformed(evt);
            }
        });

        buttAceptar.setText("Aceptar");
        buttAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttAceptarActionPerformed(evt);
            }
        });

        buttLimpiar.setText("Limpiar");
        buttLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buttAceptar, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                    .addComponent(buttCerrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buttAceptar)
                .addGap(18, 18, 18)
                .addComponent(buttLimpiar)
                .addGap(18, 18, 18)
                .addComponent(buttCerrar)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        labProveedor.setText("Proveedor");

        javax.swing.GroupLayout DesktopPanelDefinirProductosLayout = new javax.swing.GroupLayout(DesktopPanelDefinirProductos);
        DesktopPanelDefinirProductos.setLayout(DesktopPanelDefinirProductosLayout);
        DesktopPanelDefinirProductosLayout.setHorizontalGroup(
            DesktopPanelDefinirProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DesktopPanelDefinirProductosLayout.createSequentialGroup()
                .addGroup(DesktopPanelDefinirProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DesktopPanelDefinirProductosLayout.createSequentialGroup()
                        .addGap(280, 280, 280)
                        .addComponent(labTituloProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(DesktopPanelDefinirProductosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(DesktopPanelDefinirProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labCodigoProducto)
                            .addComponent(labNombreProducto)
                            .addComponent(labPrecioProducto)
                            .addComponent(labSock))
                        .addGap(18, 18, 18)
                        .addGroup(DesktopPanelDefinirProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCodigoProductos, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(txtNombreProducto)
                            .addComponent(txtPrecioProducto)
                            .addComponent(txtStockProducto))
                        .addGap(18, 18, 18)
                        .addGroup(DesktopPanelDefinirProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labDescripcionProducto)
                            .addComponent(labProveedor))
                        .addGap(18, 18, 18)
                        .addGroup(DesktopPanelDefinirProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboBoxProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        DesktopPanelDefinirProductosLayout.setVerticalGroup(
            DesktopPanelDefinirProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DesktopPanelDefinirProductosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labTituloProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(DesktopPanelDefinirProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DesktopPanelDefinirProductosLayout.createSequentialGroup()
                        .addGroup(DesktopPanelDefinirProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(DesktopPanelDefinirProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(DesktopPanelDefinirProductosLayout.createSequentialGroup()
                                    .addGroup(DesktopPanelDefinirProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(labCodigoProducto)
                                        .addComponent(txtCodigoProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(DesktopPanelDefinirProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(labNombreProducto)
                                        .addComponent(txtNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(DesktopPanelDefinirProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(labPrecioProducto)
                                        .addComponent(txtPrecioProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(labDescripcionProducto))
                        .addGap(15, 15, 15)
                        .addGroup(DesktopPanelDefinirProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtStockProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labSock)
                            .addGroup(DesktopPanelDefinirProductosLayout.createSequentialGroup()
                                .addGroup(DesktopPanelDefinirProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(labProveedor)
                                    .addComponent(comboBoxProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(3, 3, 3))))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        DesktopPanelDefinirProductos.setLayer(labTituloProducto, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DesktopPanelDefinirProductos.setLayer(labCodigoProducto, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DesktopPanelDefinirProductos.setLayer(labNombreProducto, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DesktopPanelDefinirProductos.setLayer(labDescripcionProducto, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DesktopPanelDefinirProductos.setLayer(labPrecioProducto, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DesktopPanelDefinirProductos.setLayer(labSock, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DesktopPanelDefinirProductos.setLayer(jScrollPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DesktopPanelDefinirProductos.setLayer(txtCodigoProductos, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DesktopPanelDefinirProductos.setLayer(txtNombreProducto, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DesktopPanelDefinirProductos.setLayer(txtPrecioProducto, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DesktopPanelDefinirProductos.setLayer(txtStockProducto, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DesktopPanelDefinirProductos.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DesktopPanelDefinirProductos.setLayer(labProveedor, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DesktopPanelDefinirProductos.setLayer(comboBoxProductos, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 711, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(DesktopPanelDefinirProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 691, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 244, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(DesktopPanelDefinirProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttCerrarActionPerformed
        dispose();
    }//GEN-LAST:event_buttCerrarActionPerformed

    private void buttAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttAceptarActionPerformed
        String cod,des,pre,stock, nom, prov;
        String sql="";
        productos productos = new productos(cod=txtCodigoProductos.getText(),
                                            prov=comboBoxProductos.getSelectedItem().toString(),
                                            nom=txtNombreProducto.getText(),
                                            des=txtAreaDescripcionProducto.getText(),
                                            pre=txtPrecioProducto.getText(),
                                            stock=txtStockProducto.getText() );
        
        /*
        cod=txtCodigoProductos.getText();
        prov=comboBoxProductos.getSelectedItem().toString();
        nom=txtNombreProducto.getText();
        pre=txtPrecioProducto.getText();
        stock=txtStockProducto.getText();        
        des=txtAreaDescripcionProducto.getText(); */
        if (    productos.getCodigo().equals("") || productos.getNombre().equals("") || 
                productos.getProveedor().equals("") || productos.getPrecio().equals("") || 
                productos.getDescripcion().equals("")|| productos.getStock().equals("") ){
///*cod.equals("") || nom.equals("") || prov.equals("") || pre.equals("") || des.equals("") || stock.equals("")*/
            JOptionPane.showMessageDialog(null, "Todos los campos son obligatorio, Favor verificar");
        }
        else{        
        sql="INSERT INTO productos (idProductos,idProveedor,NombreProductos,DescripcionProductos, PrecioProductos,Stock) VALUES (?,?,?,?,?,?)";
        try {
            PreparedStatement pst  = cn.prepareStatement(sql);
            
            /*productos.setCodigo(cod);
            productos.setProveedor(prov);
            productos.setNombre(nom);
            productos.setDescripcion(des);
            productos.setPrecio(pre);
            productos.setStock(stock);  */
            
                       
            pst.setString(1, productos.getCodigo());
            pst.setString(2, productos.getProveedor());
            pst.setString(3, productos.getNombre());
            pst.setString(4, productos.getDescripcion());
            pst.setString(5, productos.getPrecio());
            pst.setString(6, productos.getStock());
            

            int n=pst.executeUpdate();
            if(n>0){
                JOptionPane.showMessageDialog(null, "Registro Guardado con Exito");
                txtNombreProducto.setText("");
                txtPrecioProducto.setText("");
                txtStockProducto.setText("");
                txtAreaDescripcionProducto.setText("");
                 codigosProductos();
            }
        } catch (SQLException ex) {
            Logger.getLogger(DefinirProductos.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }//GEN-LAST:event_buttAceptarActionPerformed

    private void buttLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttLimpiarActionPerformed
        //txtCodigoProductos.setText("");
        txtNombreProducto.setText("");
        txtPrecioProducto.setText("");
        txtStockProducto.setText("");
        txtAreaDescripcionProducto.setText("");

    }//GEN-LAST:event_buttLimpiarActionPerformed

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
            java.util.logging.Logger.getLogger(DefinirProductos2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DefinirProductos2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DefinirProductos2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DefinirProductos2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DefinirProductos2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane DesktopPanelDefinirProductos;
    private javax.swing.JButton buttAceptar;
    private javax.swing.JButton buttCerrar;
    private javax.swing.JButton buttLimpiar;
    private javax.swing.JComboBox comboBoxProductos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labCodigoProducto;
    private javax.swing.JLabel labDescripcionProducto;
    private javax.swing.JLabel labNombreProducto;
    private javax.swing.JLabel labPrecioProducto;
    private javax.swing.JLabel labProveedor;
    private javax.swing.JLabel labSock;
    private javax.swing.JLabel labTituloProducto;
    private javax.swing.JTextArea txtAreaDescripcionProducto;
    private javax.swing.JTextField txtCodigoProductos;
    private javax.swing.JTextField txtNombreProducto;
    private javax.swing.JTextField txtPrecioProducto;
    private javax.swing.JFormattedTextField txtStockProducto;
    // End of variables declaration//GEN-END:variables
}