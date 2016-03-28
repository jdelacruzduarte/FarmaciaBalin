/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemamain;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 *
 * @author JesusMini
 */
public class MenuAdmin extends javax.swing.JFrame {

    /**
     * Creates new form MenuAdmin
     */
    private Dimension dim;
    public MenuAdmin() {
        initComponents();        
        setLocationRelativeTo(null);         
        this.setExtendedState(MAXIMIZED_BOTH);        
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/icon2.png"));
        setIconImage(icon);               
        setVisible(true);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        DesktopPanelDefinirProductos = new javax.swing.JDesktopPane();
        labNick = new javax.swing.JLabel();
        labNickConectado = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        labelTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/LOGO-FARMACIA_2.jpg"))); // NOI18N

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Sistema");
        javax.swing.tree.DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Administracion");
        javax.swing.tree.DefaultMutableTreeNode treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Definir Productos");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Definir Proveedores");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Definir Usuario");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Definir Clientes");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Definir Seguros");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Operaciones");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Registrar Factura");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Registrar Devolucion de Factura");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Registrar Orden de Compra");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Proceso");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Anular Factura");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Entrar inventario a almacen");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Modificar Proveedores");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Modificar Productos");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Modificar Usuario");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Modificar Clientes");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Modificar Seguros");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Consultas");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Buscar Clientes");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Buscar Usuarios");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Buscar Proveedores");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Buscar Productos");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Reportes");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Crear Reportes");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Salir");
        treeNode1.add(treeNode2);
        jTree1.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jTree1.setRootVisible(false);
        jTree1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTree1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTree1);

        DesktopPanelDefinirProductos.setBackground(java.awt.SystemColor.activeCaption);
        DesktopPanelDefinirProductos.setPreferredSize(new java.awt.Dimension(725, 450));

        labNick.setText("NICK");

        labNickConectado.setText("Usuario Conectado ");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Menu Principal");

        javax.swing.GroupLayout DesktopPanelDefinirProductosLayout = new javax.swing.GroupLayout(DesktopPanelDefinirProductos);
        DesktopPanelDefinirProductos.setLayout(DesktopPanelDefinirProductosLayout);
        DesktopPanelDefinirProductosLayout.setHorizontalGroup(
            DesktopPanelDefinirProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DesktopPanelDefinirProductosLayout.createSequentialGroup()
                .addGroup(DesktopPanelDefinirProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DesktopPanelDefinirProductosLayout.createSequentialGroup()
                        .addGap(251, 251, 251)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(DesktopPanelDefinirProductosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labNickConectado)
                        .addGap(18, 18, 18)
                        .addComponent(labNick)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        DesktopPanelDefinirProductosLayout.setVerticalGroup(
            DesktopPanelDefinirProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DesktopPanelDefinirProductosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(DesktopPanelDefinirProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labNickConectado)
                    .addComponent(labNick))
                .addGap(22, 22, 22))
        );
        DesktopPanelDefinirProductos.setLayer(labNick, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DesktopPanelDefinirProductos.setLayer(labNickConectado, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DesktopPanelDefinirProductos.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 995, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(DesktopPanelDefinirProductos, javax.swing.GroupLayout.DEFAULT_SIZE, 739, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
                    .addComponent(DesktopPanelDefinirProductos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(231, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTree1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTree1MouseClicked
        String menu = jTree1.getLastSelectedPathComponent().toString();

        if (menu.equals("Definir Productos")){
            DefinirProductos2 DefPro = new DefinirProductos2();
            DefPro.setVisible(true);
            
        }
        if (menu.equals("Definir Proveedores")){
            DefinirProveedor2 DefProv = new DefinirProveedor2();
            DefProv.setVisible(true);
            //dispose();
        }
        if (menu.equals("Definir Clientes")){
            DefinirClientes DefCli = new DefinirClientes();
            DefCli.setVisible(true);
            //dispose();
        }
        if (menu.equals("Definir Usuario")){
            DefinirUsuarios DefUsu = new DefinirUsuarios();
            DefUsu.setVisible(true);
            dispose();
        }
        if (menu.equals("Registrar Factura")){
            RegistrarFacturas RegFac = new RegistrarFacturas();
            RegFac.setVisible(true);
            dispose();
        }
        if (menu.equals("Definir Seguros")){
            DefinirSeguros DefSeg = new DefinirSeguros();
            DefSeg.setVisible(true);
            dispose();
        }
        if (menu.equals("Modificar Proveedores")){
           /* ModificarProveedores ModProv = new ModificarProveedores();
            ModProv.setVisible(true);
            dispose();*/
            
            ModificarProvedor2 ModProv = new ModificarProvedor2();
            ModProv.setVisible(true);
            
        }
        if (menu.equals("Modificar Productos")){
            ModificarProductos2 ModProd = new ModificarProductos2();
            ModProd.setVisible(true);
            
        }
        if (menu.equals("Modificar Usuario")){
            ModificarUsuario ModUsu = new ModificarUsuario();
            ModUsu.setVisible(true);
            dispose();
        }
        if (menu.equals("Modificar Clientes")){
            ModificarClientes ModCli = new ModificarClientes();
            ModCli.setVisible(true);
            //dispose();
        }
        if (menu.equals("Registrar Devolucion de Factura")){
            RegistrarDevolucionFacturas RegDevFac = new RegistrarDevolucionFacturas();
            RegDevFac.setVisible(true);
            dispose();
        }
        if (menu.equals("Modificar Seguros")){
            ModificarSeguros ModSeg = new ModificarSeguros();
            ModSeg.setVisible(true);
            dispose();
        }
        if (menu.equals("Registrar Orden de Compra")){
            RegistrarOrdenCompra  RegOrdComp = new RegistrarOrdenCompra();
            RegOrdComp.setVisible(true);
            dispose();
        }
        if (menu.equals("Anular Factura")){
            AnularFactura AnuFac = new AnularFactura();
            AnuFac.setVisible(true);
            dispose();
        }
        if (menu.equals("Buscar Clientes")){
            BuscarClientes BusCli = new BuscarClientes();
            BusCli.setVisible(true);
            dispose();
        }
        if (menu.equals("Buscar Usuarios")){
            BuscarUsuario BusUsu = new BuscarUsuario();
            BusUsu.setVisible(true);
            dispose();
        }
        if (menu.equals("Buscar Productos")){
            BuscarProductos BusPro = new BuscarProductos();
            BusPro.setVisible(true);
        }
        if (menu.equals("Buscar Proveedores")){
            /*BuscarProveedores BusProv = new BuscarProveedores();
            BusProv.setVisible(true);
            dispose();*/
            
            BuscarProveedor2 BusProv = new BuscarProveedor2();
            BusProv.setVisible(true);
            
        }
        if (menu.equals("Crear Reportes")){
            CrearReportes CreRep = new CrearReportes();
            CreRep.setVisible(true);
            dispose();
        }
        if (menu.equals("Salir")){
            System.exit(0);
        }

    }//GEN-LAST:event_jTree1MouseClicked

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
            java.util.logging.Logger.getLogger(MenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane DesktopPanelDefinirProductos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTree jTree1;
    private javax.swing.JLabel labNick;
    private javax.swing.JLabel labNickConectado;
    private javax.swing.JLabel labelTitulo;
    // End of variables declaration//GEN-END:variables
}
