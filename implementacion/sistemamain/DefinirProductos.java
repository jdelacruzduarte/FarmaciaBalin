/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemamain;

import java.awt.Frame;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import servicios.conexion;

/**
 *
 * @author JesusMini
 */
public class DefinirProductos extends javax.swing.JFrame {

    /**
     * Creates new form DefinirProductos
     */
    public DefinirProductos() {
        initComponents();
        setLocationRelativeTo(null);
         setExtendedState(Frame.MAXIMIZED_BOTH);
        
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/icon2.png"));
        setIconImage(icon);
        setVisible(true);
        codigosclientes();
    }
 void codigosclientes(){
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
        } catch (SQLException ex) {
           Logger.getLogger(DefinirProductos.class.getName()).log(Level.SEVERE, null, ex);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
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
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txtStockProducto = new javax.swing.JFormattedTextField();
        jPanel1 = new javax.swing.JPanel();
        buttActualizar = new javax.swing.JButton();
        buttCerrar = new javax.swing.JButton();
        buttAceptar = new javax.swing.JButton();
        buttModificar = new javax.swing.JButton();
        buttLimpiar = new javax.swing.JButton();
        labProveedor = new javax.swing.JLabel();
        comboBoxProveedor = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Farmacia Balin");
        setPreferredSize(new java.awt.Dimension(1024, 591));
        setResizable(false);

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
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Reportes");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Crear Reportes");
        treeNode2.add(treeNode3);
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
        DesktopPanelDefinirProductos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        DesktopPanelDefinirProductos.setPreferredSize(new java.awt.Dimension(750, 453));

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

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Codigo", "Nombre", "Precio", "Stock"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
        }

        txtStockProducto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        buttActualizar.setText("Actualizar");

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

        buttModificar.setText("Modificar");

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
                .addGap(62, 62, 62)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buttActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttAceptar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttCerrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(buttAceptar)
                .addGap(18, 18, 18)
                .addComponent(buttActualizar)
                .addGap(18, 18, 18)
                .addComponent(buttModificar)
                .addGap(18, 18, 18)
                .addComponent(buttLimpiar)
                .addGap(18, 18, 18)
                .addComponent(buttCerrar)
                .addContainerGap(92, Short.MAX_VALUE))
        );

        labProveedor.setText("Proveedor");

        comboBoxProveedor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

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
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(DesktopPanelDefinirProductosLayout.createSequentialGroup()
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
                                    .addComponent(comboBoxProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        DesktopPanelDefinirProductosLayout.setVerticalGroup(
            DesktopPanelDefinirProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DesktopPanelDefinirProductosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labTituloProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(DesktopPanelDefinirProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DesktopPanelDefinirProductosLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(57, Short.MAX_VALUE))
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
                                    .addComponent(comboBoxProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(3, 3, 3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))))
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
        DesktopPanelDefinirProductos.setLayer(jScrollPane3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DesktopPanelDefinirProductos.setLayer(txtStockProducto, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DesktopPanelDefinirProductos.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DesktopPanelDefinirProductos.setLayer(labProveedor, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DesktopPanelDefinirProductos.setLayer(comboBoxProveedor, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/LOGO-FARMACIA_2.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 1012, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(DesktopPanelDefinirProductos, javax.swing.GroupLayout.DEFAULT_SIZE, 816, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DesktopPanelDefinirProductos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTree1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTree1MouseClicked
        String menu = jTree1.getLastSelectedPathComponent().toString();

       if (menu.equals("Definir Productos")){
            DefinirProductos DefPro = new DefinirProductos();
            DefPro.setVisible(true);
            dispose();  
        }
        if (menu.equals("Definir Proveedores")){
            DefinirProveedores DefProv = new DefinirProveedores();
            DefProv.setVisible(true);
            dispose();
        }
        if (menu.equals("Definir Clientes")){
            DefinirClientes DefCli = new DefinirClientes();
            DefCli.setVisible(true);
            dispose();        
        }
        if (menu.equals("Definir Usuario")){
            DefinirUsuarios DefEmp = new DefinirUsuarios();
            DefEmp.setVisible(true);
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
            ModificarProveedores ModProv = new ModificarProveedores();
            ModProv.setVisible(true);
            dispose();         
        }
        if (menu.equals("Modificar Productos")){
            ModificarProductos ModProd = new ModificarProductos();
            ModProd.setVisible(true);
            dispose(); 
        
        }
        if (menu.equals("Modificar Usuario")){
            ModificarUsuario ModUsu = new ModificarUsuario();
            ModUsu.setVisible(true);
            dispose();         
        }
        if (menu.equals("Modificar Clientes")){
            ModificarClientes ModCli = new ModificarClientes();
            ModCli.setVisible(true);
            dispose();
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
        if (menu.equals("Buscar Proveedores")){
            BuscarProveedores BusProv = new BuscarProveedores();
            BusProv.setVisible(true);
            dispose();
        }
        if (menu.equals("Crear Reportes")){
            CrearReportes CreRep = new CrearReportes();
            CreRep.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_jTree1MouseClicked

    private void buttCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttCerrarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_buttCerrarActionPerformed

    private void buttLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttLimpiarActionPerformed
            //txtCodigoProductos.setText("");
            txtNombreProducto.setText("");
            txtPrecioProducto.setText("");
            txtStockProducto.setText("");
            txtAreaDescripcionProducto.setText("");
            
    }//GEN-LAST:event_buttLimpiarActionPerformed

    private void buttAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttAceptarActionPerformed
        String cod,des,pre,stock, nom;
            String sql="";
            cod=txtCodigoProductos.getText();
            nom=txtNombreProducto.getText();
            pre=txtPrecioProducto.getText();
            stock=txtStockProducto.getText();
            des=txtAreaDescripcionProducto.getText();
            sql="INSERT INTO productos (idProductos,idProveedor,precio,Stock,idtip) VALUES (?,?,?,?,?)";
        try {
            PreparedStatement pst  = cn.prepareStatement(sql);
            pst.setString(1, cod);
            pst.setString(2, des);
            pst.setString(3, pre);
            pst.setString(4, stock);
            
            
            int n=pst.executeUpdate();
            if(n>0){
            JOptionPane.showMessageDialog(null, "Registro Guardado con Exito");
            }
        } catch (SQLException ex) {
            Logger.getLogger(DefinirProductos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buttAceptarActionPerformed

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
            java.util.logging.Logger.getLogger(DefinirProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DefinirProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DefinirProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DefinirProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DefinirProductos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane DesktopPanelDefinirProductos;
    private javax.swing.JButton buttAceptar;
    private javax.swing.JButton buttActualizar;
    private javax.swing.JButton buttCerrar;
    private javax.swing.JButton buttLimpiar;
    private javax.swing.JButton buttModificar;
    private javax.swing.JComboBox comboBoxProveedor;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTree jTree1;
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

conexion cc = new conexion();
        Connection cn = cc.obtener();

}