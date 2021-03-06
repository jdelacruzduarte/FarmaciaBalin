/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemamain;

import java.awt.Frame;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author JesusMini
 */
public class RegistrarOrdenCompra extends javax.swing.JFrame {

    /**
     * Creates new form DefinirProductos
     */
    public RegistrarOrdenCompra() {
        initComponents();
        
        setLocationRelativeTo(null); 
        setExtendedState(Frame.MAXIMIZED_BOTH);
        
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

        ButtSexo = new javax.swing.ButtonGroup();
        DesktopPanelDefinirProductos = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        LabNombre = new javax.swing.JLabel();
        LabApellido = new javax.swing.JLabel();
        LabTelefono = new javax.swing.JLabel();
        LabSexo = new javax.swing.JLabel();
        LabCelular = new javax.swing.JLabel();
        txtEmpleado = new javax.swing.JTextField();
        txtNombre1 = new javax.swing.JTextField();
        txtNombre2 = new javax.swing.JTextField();
        txtNombre3 = new javax.swing.JTextField();
        txtNombre5 = new javax.swing.JTextField();
        ButtAgregar = new javax.swing.JButton();
        ButtLimpiar = new javax.swing.JButton();
        ButtCerrar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        ButtFacturar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        LabDescripcion = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        labNickConectado = new javax.swing.JLabel();
        labNick = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Farmacia Balin");
        setIconImages(null);
        setResizable(false);

        DesktopPanelDefinirProductos.setBackground(java.awt.SystemColor.activeCaption);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Registrar Orden de Compras");

        LabNombre.setText("Empleado");

        LabApellido.setText("Cantidad Producto");

        LabTelefono.setText("Importe");

        LabSexo.setText("Precio");

        LabCelular.setText("Fecha");

        txtEmpleado.setEnabled(false);
        txtEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmpleadoActionPerformed(evt);
            }
        });

        txtNombre1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombre1ActionPerformed(evt);
            }
        });

        txtNombre2.setEnabled(false);
        txtNombre2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombre2ActionPerformed(evt);
            }
        });

        txtNombre3.setEnabled(false);
        txtNombre3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombre3ActionPerformed(evt);
            }
        });

        txtNombre5.setEnabled(false);
        txtNombre5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombre5ActionPerformed(evt);
            }
        });

        ButtAgregar.setText("Agregar");

        ButtLimpiar.setText("Cerrar");

        ButtCerrar.setText("Cerrar");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre Producto", "Descripcion", "Precio", "Cantidad", "Importe"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable1);

        ButtFacturar.setText("Facturar");
        ButtFacturar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtFacturarActionPerformed(evt);
            }
        });

        jLabel3.setText("Codigo Producto");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Nombre");

        jTextField2.setEnabled(false);

        LabDescripcion.setText("Descripcion");

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jButton1.setText("Aceptar");

        labNickConectado.setText("Usuario Conectado");

        labNick.setText("Nick");

        javax.swing.GroupLayout DesktopPanelDefinirProductosLayout = new javax.swing.GroupLayout(DesktopPanelDefinirProductos);
        DesktopPanelDefinirProductos.setLayout(DesktopPanelDefinirProductosLayout);
        DesktopPanelDefinirProductosLayout.setHorizontalGroup(
            DesktopPanelDefinirProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DesktopPanelDefinirProductosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DesktopPanelDefinirProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DesktopPanelDefinirProductosLayout.createSequentialGroup()
                        .addGroup(DesktopPanelDefinirProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(DesktopPanelDefinirProductosLayout.createSequentialGroup()
                                .addGroup(DesktopPanelDefinirProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LabNombre)
                                    .addComponent(jLabel3))
                                .addGap(10, 10, 10)
                                .addGroup(DesktopPanelDefinirProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(DesktopPanelDefinirProductosLayout.createSequentialGroup()
                                .addGroup(DesktopPanelDefinirProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(DesktopPanelDefinirProductosLayout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(52, 52, 52))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, DesktopPanelDefinirProductosLayout.createSequentialGroup()
                                        .addComponent(LabSexo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(DesktopPanelDefinirProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNombre3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1))))
                        .addGroup(DesktopPanelDefinirProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(DesktopPanelDefinirProductosLayout.createSequentialGroup()
                                .addGroup(DesktopPanelDefinirProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(DesktopPanelDefinirProductosLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ButtAgregar))
                                    .addGroup(DesktopPanelDefinirProductosLayout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addComponent(LabApellido))
                                    .addGroup(DesktopPanelDefinirProductosLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(DesktopPanelDefinirProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(LabCelular)
                                            .addComponent(LabTelefono))))
                                .addGap(8, 8, 8)
                                .addGroup(DesktopPanelDefinirProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(DesktopPanelDefinirProductosLayout.createSequentialGroup()
                                        .addComponent(ButtFacturar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(ButtLimpiar))
                                    .addComponent(txtNombre2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNombre5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(DesktopPanelDefinirProductosLayout.createSequentialGroup()
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(LabDescripcion)))
                                .addGroup(DesktopPanelDefinirProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(DesktopPanelDefinirProductosLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(DesktopPanelDefinirProductosLayout.createSequentialGroup()
                                        .addGap(35, 35, 35)
                                        .addComponent(ButtCerrar))))
                            .addGroup(DesktopPanelDefinirProductosLayout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 744, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(DesktopPanelDefinirProductosLayout.createSequentialGroup()
                        .addComponent(labNickConectado)
                        .addGap(29, 29, 29)
                        .addComponent(labNick)))
                .addContainerGap(128, Short.MAX_VALUE))
        );
        DesktopPanelDefinirProductosLayout.setVerticalGroup(
            DesktopPanelDefinirProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DesktopPanelDefinirProductosLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(DesktopPanelDefinirProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DesktopPanelDefinirProductosLayout.createSequentialGroup()
                        .addGroup(DesktopPanelDefinirProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(DesktopPanelDefinirProductosLayout.createSequentialGroup()
                                .addGroup(DesktopPanelDefinirProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(LabNombre)
                                    .addComponent(txtEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(11, 11, 11)
                                .addGroup(DesktopPanelDefinirProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addComponent(LabTelefono))
                                .addGap(18, 18, 18)
                                .addGroup(DesktopPanelDefinirProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LabCelular)))
                            .addGroup(DesktopPanelDefinirProductosLayout.createSequentialGroup()
                                .addGroup(DesktopPanelDefinirProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LabDescripcion)
                                    .addComponent(LabApellido))
                                .addGap(11, 11, 11)
                                .addComponent(txtNombre2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtNombre5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(DesktopPanelDefinirProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabSexo)
                            .addComponent(txtNombre3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(DesktopPanelDefinirProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(ButtAgregar)
                    .addComponent(ButtFacturar)
                    .addComponent(ButtLimpiar)
                    .addComponent(ButtCerrar))
                .addGap(45, 45, 45)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(DesktopPanelDefinirProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labNickConectado)
                    .addComponent(labNick))
                .addGap(41, 41, 41))
        );
        DesktopPanelDefinirProductos.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DesktopPanelDefinirProductos.setLayer(LabNombre, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DesktopPanelDefinirProductos.setLayer(LabApellido, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DesktopPanelDefinirProductos.setLayer(LabTelefono, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DesktopPanelDefinirProductos.setLayer(LabSexo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DesktopPanelDefinirProductos.setLayer(LabCelular, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DesktopPanelDefinirProductos.setLayer(txtEmpleado, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DesktopPanelDefinirProductos.setLayer(txtNombre1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DesktopPanelDefinirProductos.setLayer(txtNombre2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DesktopPanelDefinirProductos.setLayer(txtNombre3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DesktopPanelDefinirProductos.setLayer(txtNombre5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DesktopPanelDefinirProductos.setLayer(ButtAgregar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DesktopPanelDefinirProductos.setLayer(ButtLimpiar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DesktopPanelDefinirProductos.setLayer(ButtCerrar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DesktopPanelDefinirProductos.setLayer(jScrollPane3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DesktopPanelDefinirProductos.setLayer(ButtFacturar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DesktopPanelDefinirProductos.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DesktopPanelDefinirProductos.setLayer(jTextField1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DesktopPanelDefinirProductos.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DesktopPanelDefinirProductos.setLayer(jTextField2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DesktopPanelDefinirProductos.setLayer(LabDescripcion, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DesktopPanelDefinirProductos.setLayer(jScrollPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DesktopPanelDefinirProductos.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DesktopPanelDefinirProductos.setLayer(labNickConectado, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DesktopPanelDefinirProductos.setLayer(labNick, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/LOGO-FARMACIA_2.jpg"))); // NOI18N

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1012, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DesktopPanelDefinirProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(120, 120, 120))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DesktopPanelDefinirProductos)
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
            RegistrarOrdenCompra DefCli = new RegistrarOrdenCompra();
            DefCli.setVisible(true);
            dispose();        
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

    private void txtEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmpleadoActionPerformed

    private void txtNombre1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombre1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombre1ActionPerformed

    private void txtNombre2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombre2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombre2ActionPerformed

    private void txtNombre3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombre3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombre3ActionPerformed

    private void txtNombre5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombre5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombre5ActionPerformed

    private void ButtFacturarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtFacturarActionPerformed
      //  DefinirLibro DL = new DefinirLibro();
      //  DL.setVisible(true);
      //  dispose();
    }//GEN-LAST:event_ButtFacturarActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

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
    private javax.swing.JButton ButtAgregar;
    private javax.swing.JButton ButtCerrar;
    private javax.swing.JButton ButtFacturar;
    private javax.swing.JButton ButtLimpiar;
    private javax.swing.ButtonGroup ButtSexo;
    private javax.swing.JDesktopPane DesktopPanelDefinirProductos;
    private javax.swing.JLabel LabApellido;
    private javax.swing.JLabel LabCelular;
    private javax.swing.JLabel LabDescripcion;
    private javax.swing.JLabel LabNombre;
    private javax.swing.JLabel LabSexo;
    private javax.swing.JLabel LabTelefono;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTree jTree1;
    public static javax.swing.JLabel labNick;
    private javax.swing.JLabel labNickConectado;
    private javax.swing.JTextField txtEmpleado;
    private javax.swing.JTextField txtNombre1;
    private javax.swing.JTextField txtNombre2;
    private javax.swing.JTextField txtNombre3;
    private javax.swing.JTextField txtNombre5;
    // End of variables declaration//GEN-END:variables
}
