/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemamain;

import java.awt.Frame;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import servicios.conexion;

/**
 *
 * @author JesusMini
 */
public class ModificarClientes extends javax.swing.JFrame {

    /**
     * Creates new form DefinirProductos
     */
    conexion cc = new conexion();
    Connection cn = cc.obtener();
    public ModificarClientes() {
        initComponents();
        ButtSexo.add(RadButtSexMasculino);
        ButtSexo.add(RadButtSexFemenino);
        setLocationRelativeTo(null); 
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/icon2.png"));
        setIconImage(icon);
        setVisible(true);    
        
    }
    DefaultTableModel model;
 void cargar(String valor) {
        try{
            String [] titulos={"Codigo","Nombre","Apellido","Sexo","Cedula", "Telefono", "Celular", "Direccion"};
            String [] registros= new String[8];
            model=new DefaultTableModel(null,titulos);
           //idClientes, NombreCliente,ApellidoCliente,SexoCliente,CedulaCliente,DireccionCliente,EstadoCliente,TelefonoCliente) VALUES (?,?,?,?,?,?,?,?)";
            String cons="select * from clientes";
            Statement st= cn.createStatement();
            ResultSet rs = st.executeQuery(cons);
            while(rs.next()){
                registros[0]=rs.getString("idClientes");
                registros[1]=rs.getString("NombreCliente");
                registros[2]=rs.getString("ApellidoCliente");
                registros[3]=rs.getString("SexoCliente");
                registros[4]=rs.getString("CedulaCliente");
                registros[5]=rs.getString("DireccionCliente");
                registros[6]=rs.getString("EstadoCliente");
                registros[7]=rs.getString("TelefonoCliente");
                model.addRow(registros);      
                }
            tablaCliente.setModel(model);
            tablaCliente.getColumnModel().getColumn(0).setPreferredWidth(150);
            tablaCliente.getColumnModel().getColumn(1).setPreferredWidth(200);
            tablaCliente.getColumnModel().getColumn(2).setPreferredWidth(150);
            tablaCliente.getColumnModel().getColumn(3).setPreferredWidth(150);
            tablaCliente.getColumnModel().getColumn(4).setPreferredWidth(150);
            tablaCliente.getColumnModel().getColumn(5).setPreferredWidth(80);
            tablaCliente.getColumnModel().getColumn(6).setPreferredWidth(150);
            }catch(Exception e){
                System.out.println(e.getMessage());
                 }     
    }//corregir esta parte
void BuscarClientesEditar(String cod) {        
        try{
           
            String codi="",nom="",ape="",sex="",ced="", tel="", estado="",dir="";
            String cons="select * from clientes WHERE idCliente='"+cod+"'";
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(cons);
            while(rs.next())
            {
            codi=rs.getString(1);
            nom=rs.getString(2);
            ape=rs.getString(3);
            sex=rs.getString(4);
            ced=rs.getString(5);
            tel=rs.getString(6);
            estado=rs.getString(7);
            dir=rs.getString(8);
           
            }
           
            
            txtCodigo.setText(codi);
            txtNombre.setText(nom);
            txtApellido.setText(ape);
            ButtSexo.setSelected(null, rootPaneCheckingEnabled);
            txtCedula.setText(ced);;
            txtAreaDireccion.setText(dir);
            cbEstado.setSelectedItem(estado);
            txtTelefono.setText(tel);
            }catch(Exception e)
            {
            System.out.println(e.getMessage());
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

        ButtSexo = new javax.swing.ButtonGroup();
        DesktopPanelDefinirProductos = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        LabNombre = new javax.swing.JLabel();
        LabApellido = new javax.swing.JLabel();
        LabTelefono = new javax.swing.JLabel();
        LabSexo = new javax.swing.JLabel();
        LabCedula = new javax.swing.JLabel();
        LabCelular = new javax.swing.JLabel();
        LabDireccion = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtCedula = new javax.swing.JTextField();
        txtCelular = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAreaDireccion = new javax.swing.JTextArea();
        RadButtSexMasculino = new javax.swing.JRadioButton();
        RadButtSexFemenino = new javax.swing.JRadioButton();
        ButtGuardar = new javax.swing.JButton();
        ButtLimpiar = new javax.swing.JButton();
        ButtCerrar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaCliente = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        cbEstado = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Farmacia Balin");
        setIconImages(null);
        setResizable(false);

        DesktopPanelDefinirProductos.setBackground(java.awt.SystemColor.activeCaption);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Modificar Clientes");

        LabNombre.setText("Nombre");

        LabApellido.setText("Apellido");

        LabTelefono.setText("Telefono");

        LabSexo.setText("Sexo");

        LabCedula.setText("Cedula");

        LabCelular.setText("Celular");

        LabDireccion.setText("Direccion");

        txtNombre.setEditable(false);
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        txtApellido.setEditable(false);
        txtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoActionPerformed(evt);
            }
        });

        txtTelefono.setEditable(false);
        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });

        txtCedula.setEditable(false);
        txtCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaActionPerformed(evt);
            }
        });

        txtCelular.setEditable(false);
        txtCelular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCelularActionPerformed(evt);
            }
        });

        txtAreaDireccion.setEditable(false);
        txtAreaDireccion.setColumns(20);
        txtAreaDireccion.setRows(5);
        jScrollPane2.setViewportView(txtAreaDireccion);

        RadButtSexMasculino.setText("M");

        RadButtSexFemenino.setText("F");

        ButtGuardar.setText("Aceptar");

        ButtLimpiar.setText("Limpiar");

        ButtCerrar.setText("Cerrar");
        ButtCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtCerrarActionPerformed(evt);
            }
        });

        jLabel3.setText("Codigo Cliente");

        txtCodigo.setEnabled(false);

        tablaCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tablaCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaClienteMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tablaCliente);

        jLabel2.setText("Estado");

        cbEstado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Activo", "Inactivo" }));

        javax.swing.GroupLayout DesktopPanelDefinirProductosLayout = new javax.swing.GroupLayout(DesktopPanelDefinirProductos);
        DesktopPanelDefinirProductos.setLayout(DesktopPanelDefinirProductosLayout);
        DesktopPanelDefinirProductosLayout.setHorizontalGroup(
            DesktopPanelDefinirProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DesktopPanelDefinirProductosLayout.createSequentialGroup()
                .addGroup(DesktopPanelDefinirProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DesktopPanelDefinirProductosLayout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(DesktopPanelDefinirProductosLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(DesktopPanelDefinirProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabSexo)
                            .addGroup(DesktopPanelDefinirProductosLayout.createSequentialGroup()
                                .addGroup(DesktopPanelDefinirProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LabNombre)
                                    .addComponent(LabCelular)
                                    .addComponent(LabTelefono)
                                    .addComponent(LabCedula)
                                    .addComponent(LabApellido)
                                    .addComponent(jLabel3))
                                .addGap(32, 32, 32)
                                .addGroup(DesktopPanelDefinirProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtTelefono)
                                    .addComponent(txtCelular)
                                    .addComponent(txtNombre)
                                    .addComponent(txtApellido)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DesktopPanelDefinirProductosLayout.createSequentialGroup()
                                        .addComponent(RadButtSexMasculino)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(RadButtSexFemenino))
                                    .addComponent(txtCedula)
                                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(34, 34, 34)
                        .addGroup(DesktopPanelDefinirProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabDireccion)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(DesktopPanelDefinirProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(DesktopPanelDefinirProductosLayout.createSequentialGroup()
                                .addComponent(ButtGuardar)
                                .addGap(27, 27, 27)
                                .addComponent(ButtLimpiar)
                                .addGap(39, 39, 39)
                                .addComponent(ButtCerrar))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DesktopPanelDefinirProductosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 576, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        DesktopPanelDefinirProductosLayout.setVerticalGroup(
            DesktopPanelDefinirProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DesktopPanelDefinirProductosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(DesktopPanelDefinirProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DesktopPanelDefinirProductosLayout.createSequentialGroup()
                        .addGroup(DesktopPanelDefinirProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabDireccion))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(DesktopPanelDefinirProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabNombre)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(DesktopPanelDefinirProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabApellido)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(DesktopPanelDefinirProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabSexo)
                            .addComponent(RadButtSexMasculino)
                            .addComponent(RadButtSexFemenino))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(DesktopPanelDefinirProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(DesktopPanelDefinirProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(LabCedula)
                                .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(DesktopPanelDefinirProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(cbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(DesktopPanelDefinirProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LabTelefono)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DesktopPanelDefinirProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LabCelular)
                    .addGroup(DesktopPanelDefinirProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ButtCerrar)
                        .addComponent(ButtLimpiar)
                        .addComponent(ButtGuardar)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        DesktopPanelDefinirProductos.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DesktopPanelDefinirProductos.setLayer(LabNombre, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DesktopPanelDefinirProductos.setLayer(LabApellido, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DesktopPanelDefinirProductos.setLayer(LabTelefono, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DesktopPanelDefinirProductos.setLayer(LabSexo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DesktopPanelDefinirProductos.setLayer(LabCedula, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DesktopPanelDefinirProductos.setLayer(LabCelular, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DesktopPanelDefinirProductos.setLayer(LabDireccion, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DesktopPanelDefinirProductos.setLayer(txtNombre, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DesktopPanelDefinirProductos.setLayer(txtApellido, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DesktopPanelDefinirProductos.setLayer(txtTelefono, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DesktopPanelDefinirProductos.setLayer(txtCedula, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DesktopPanelDefinirProductos.setLayer(txtCelular, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DesktopPanelDefinirProductos.setLayer(jScrollPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DesktopPanelDefinirProductos.setLayer(RadButtSexMasculino, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DesktopPanelDefinirProductos.setLayer(RadButtSexFemenino, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DesktopPanelDefinirProductos.setLayer(ButtGuardar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DesktopPanelDefinirProductos.setLayer(ButtLimpiar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DesktopPanelDefinirProductos.setLayer(ButtCerrar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DesktopPanelDefinirProductos.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DesktopPanelDefinirProductos.setLayer(txtCodigo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DesktopPanelDefinirProductos.setLayer(jScrollPane3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DesktopPanelDefinirProductos.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DesktopPanelDefinirProductos.setLayer(cbEstado, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DesktopPanelDefinirProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DesktopPanelDefinirProductos)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoActionPerformed

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoActionPerformed

    private void txtCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaActionPerformed

    private void txtCelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCelularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCelularActionPerformed

    private void ButtCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtCerrarActionPerformed
        dispose();
    }//GEN-LAST:event_ButtCerrarActionPerformed

    private void tablaClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaClienteMouseClicked
        int filaseleccionada;
        try{

            filaseleccionada= tablaCliente.getSelectedRow();

            if (filaseleccionada==-1){
                JOptionPane.showMessageDialog(null, "No se ha seleccionado ninguna fila");

            }else{

                DefaultTableModel modelotabla=(DefaultTableModel) tablaCliente.getModel();

                String cod=(String)tablaCliente.getValueAt(filaseleccionada, 0);
                BuscarClientesEditar(cod);
            }

        }catch (HeadlessException ex){

            JOptionPane.showMessageDialog(null, "Error: "+ex+"\nInténtelo nuevamente", " .::Error En la Operacion::." ,JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_tablaClienteMouseClicked

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
            java.util.logging.Logger.getLogger(DefinirProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DefinirProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DefinirProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DefinirProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DefinirProveedores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtCerrar;
    private javax.swing.JButton ButtGuardar;
    private javax.swing.JButton ButtLimpiar;
    private javax.swing.ButtonGroup ButtSexo;
    private javax.swing.JDesktopPane DesktopPanelDefinirProductos;
    private javax.swing.JLabel LabApellido;
    private javax.swing.JLabel LabCedula;
    private javax.swing.JLabel LabCelular;
    private javax.swing.JLabel LabDireccion;
    private javax.swing.JLabel LabNombre;
    private javax.swing.JLabel LabSexo;
    private javax.swing.JLabel LabTelefono;
    private javax.swing.JRadioButton RadButtSexFemenino;
    private javax.swing.JRadioButton RadButtSexMasculino;
    private javax.swing.JComboBox cbEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tablaCliente;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextArea txtAreaDireccion;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
