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
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import servicios.conexion;

/**
 *
 * @author JesusMini
 */
public final class DefinirProveedores extends javax.swing.JFrame {

    /**
     * Creates new form DefinirProductos
     */
    DefaultTableModel model;
    public DefinirProveedores() {
        initComponents();
        setLocationRelativeTo(null); 
       // setExtendedState(Frame.MAXIMIZED_BOTH);
        //setState(Frame.NORMAL);
        
        setExtendedState(Frame.MAXIMIZED_BOTH);
       
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/icon2.png"));
        setIconImage(icon);
        setVisible(true); 
        cargar("");
        codigos();
        
    }
    void codigos(){
     int j;
        int cont=1;
        String num="";
        String c="";
         String SQL="select max(idProveedores) from proveedores";
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
                txtCodigoProveedor.setText("CPV0001");
            }
            else{
                char r1=c.charAt(3);
                char r2=c.charAt(4);
                char r3=c.charAt(5);
                char r4=c.charAt(6);
                //char r5=c.charAt(7);
                String r="";
                r=""+r1+r2+r3+r4;
            
                 j=Integer.parseInt(r);
                 GenerarCodigos gen= new GenerarCodigos();
                 gen.generar(j);
                 txtCodigoProveedor.setText("CPV"+gen.serie());
            }
        } catch (SQLException ex) {
           Logger.getLogger(DefinirProveedores.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    void cargar(String valor) {
        try{
            String [] titulos={"Codigo","Nombre","Telefono","RNC","Estado"};
            String [] registros= new String[6];
            model=new DefaultTableModel(null,titulos);
            
            String cons="select * from proveedores";
            Statement st= cn.createStatement();
            ResultSet rs = st.executeQuery(cons);
            while(rs.next()){
                registros[0]=rs.getString("idProveedores");
                registros[1]=rs.getString("NombreProveedores");
                registros[2]=rs.getString("TelefonoProveedores");
                registros[3]=rs.getString("RNCProveedores");
                registros[4]=rs.getString("EstadoProveedores");
             
                
                model.addRow(registros);      
                }
            tableProveedores.setModel(model);
            tableProveedores.getColumnModel().getColumn(0).setPreferredWidth(150);
            tableProveedores.getColumnModel().getColumn(1).setPreferredWidth(200);
            tableProveedores.getColumnModel().getColumn(2).setPreferredWidth(150);
            tableProveedores.getColumnModel().getColumn(3).setPreferredWidth(150);
            }catch(Exception e){
                System.out.println(e.getMessage());
                 }     
    }
    
    void BuscarProductoEditar(String cod) {
        
        try{
           
            String codi="",nom="",tel="",rnc="", desc="", estado="";
            String cons="select * from proveedores WHERE idProveedores='"+cod+"'";
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(cons);
            while(rs.next())
            {
            codi=rs.getString(1);
            nom=rs.getString(2);
            tel=rs.getString(3);
            rnc=rs.getString(4);
            desc=rs.getString(5);
            estado=rs.getString(6);
           
            }
            txtCodigoProveedor.setText(codi);
            txtNombreProveedor.setText(nom);
            txtTelefono.setText(tel);
            txtRNC.setText(rnc);
            txtDescripcion.setText(desc);
            cmbEstado.setSelectedItem(estado.toString());          
            
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

        DesktopPanelDefinirProductos = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        labDescripcion = new javax.swing.JLabel();
        txtCodigoProveedor = new javax.swing.JTextField();
        txtNombreProveedor = new javax.swing.JTextField();
        cmbEstado = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        txtTelefono = new javax.swing.JFormattedTextField();
        txtRNC = new javax.swing.JFormattedTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableProveedores = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        buttGuardar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        buttActualizar = new javax.swing.JButton();
        buttCerrar = new javax.swing.JButton();
        buttLimpiar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Farmacia Balin");
        setPreferredSize(new java.awt.Dimension(1042, 430));

        DesktopPanelDefinirProductos.setBackground(java.awt.SystemColor.activeCaption);
        DesktopPanelDefinirProductos.setPreferredSize(new java.awt.Dimension(794, 450));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Definir Proveedores");

        jLabel3.setText("Codigo");

        jLabel4.setText("Nombre");

        jLabel5.setText("Telefono");

        jLabel6.setText("RNC");

        jLabel7.setText("Estado");

        labDescripcion.setText("Descripcion");

        txtCodigoProveedor.setEnabled(false);

        cmbEstado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Activo", "Inactivo" }));

        txtDescripcion.setColumns(20);
        txtDescripcion.setRows(5);
        jScrollPane2.setViewportView(txtDescripcion);

        try {
            txtTelefono.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###-###-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtRNC.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        tableProveedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tableProveedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableProveedoresMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tableProveedores);

        javax.swing.GroupLayout DesktopPanelDefinirProductosLayout = new javax.swing.GroupLayout(DesktopPanelDefinirProductos);
        DesktopPanelDefinirProductos.setLayout(DesktopPanelDefinirProductosLayout);
        DesktopPanelDefinirProductosLayout.setHorizontalGroup(
            DesktopPanelDefinirProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DesktopPanelDefinirProductosLayout.createSequentialGroup()
                .addGroup(DesktopPanelDefinirProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(DesktopPanelDefinirProductosLayout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(DesktopPanelDefinirProductosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(DesktopPanelDefinirProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(27, 27, 27)
                        .addGroup(DesktopPanelDefinirProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCodigoProveedor)
                            .addComponent(txtNombreProveedor)
                            .addComponent(txtTelefono)
                            .addComponent(txtRNC, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(72, 72, 72)
                        .addGroup(DesktopPanelDefinirProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labDescripcion)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(DesktopPanelDefinirProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(DesktopPanelDefinirProductosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3)))
                .addContainerGap(225, Short.MAX_VALUE))
        );
        DesktopPanelDefinirProductosLayout.setVerticalGroup(
            DesktopPanelDefinirProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DesktopPanelDefinirProductosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(DesktopPanelDefinirProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DesktopPanelDefinirProductosLayout.createSequentialGroup()
                        .addGroup(DesktopPanelDefinirProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(DesktopPanelDefinirProductosLayout.createSequentialGroup()
                                .addComponent(labDescripcion)
                                .addGap(76, 76, 76))
                            .addComponent(jScrollPane2))
                        .addGap(10, 10, 10)
                        .addGroup(DesktopPanelDefinirProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)))
                    .addGroup(DesktopPanelDefinirProductosLayout.createSequentialGroup()
                        .addGroup(DesktopPanelDefinirProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtCodigoProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(DesktopPanelDefinirProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtNombreProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(DesktopPanelDefinirProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(DesktopPanelDefinirProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtRNC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(77, Short.MAX_VALUE))
        );
        DesktopPanelDefinirProductos.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DesktopPanelDefinirProductos.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DesktopPanelDefinirProductos.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DesktopPanelDefinirProductos.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DesktopPanelDefinirProductos.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DesktopPanelDefinirProductos.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DesktopPanelDefinirProductos.setLayer(labDescripcion, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DesktopPanelDefinirProductos.setLayer(txtCodigoProveedor, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DesktopPanelDefinirProductos.setLayer(txtNombreProveedor, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DesktopPanelDefinirProductos.setLayer(cmbEstado, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DesktopPanelDefinirProductos.setLayer(jScrollPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DesktopPanelDefinirProductos.setLayer(txtTelefono, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DesktopPanelDefinirProductos.setLayer(txtRNC, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DesktopPanelDefinirProductos.setLayer(jScrollPane3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        getContentPane().add(DesktopPanelDefinirProductos, java.awt.BorderLayout.CENTER);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/LOGO-FARMACIA_2.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(77, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        buttGuardar.setText("Guardar");
        buttGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttGuardarActionPerformed(evt);
            }
        });

        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        buttActualizar.setText("Actualizar");
        buttActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttActualizarActionPerformed(evt);
            }
        });

        buttCerrar.setText("Cerrar");
        buttCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttCerrarActionPerformed(evt);
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
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttCerrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buttGuardar)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(buttActualizar)
                .addGap(18, 18, 18)
                .addComponent(buttCerrar)
                .addGap(18, 18, 18)
                .addComponent(buttLimpiar)
                .addContainerGap(248, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.LINE_END);

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.setPreferredSize(new java.awt.Dimension(205, 400));

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

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4, java.awt.BorderLayout.LINE_START);

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
            RegistrarFacturas DefProv = new RegistrarFacturas();
            DefProv.setVisible(true);
            dispose();
        }
        if (menu.equals("Definir Clientes")){
            DefinirClientes DefCli = new DefinirClientes();
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

    private void buttCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttCerrarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_buttCerrarActionPerformed

    private void buttLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttLimpiarActionPerformed
            //txtCodigoProveedor.setText("");
            txtNombreProveedor.setText("");
            txtTelefono.setText("");
            txtRNC.setText("");
            txtDescripcion.setText("");            
    }//GEN-LAST:event_buttLimpiarActionPerformed

    private void buttGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttGuardarActionPerformed
        String cod, des,nom,tel,RNC,estado;
       
            String sql="";
            cod=txtCodigoProveedor.getText();           
            nom=txtNombreProveedor.getText();            
            tel=txtTelefono.getText();
            RNC=txtRNC.getText();            
            des=txtDescripcion.getText();
            estado=cmbEstado.getSelectedItem().toString();
            if (cod.equals("") || nom.equals("") || tel.equals("   -   -    ") || RNC.equals("         ") || des.equals("") || estado.equals("")){
                
            JOptionPane.showMessageDialog(null, "Todos los campos son obligatorio, Favor verificar");
            }
            else{
            sql="INSERT INTO proveedores (idProveedores,NombreProveedores,TelefonoProveedores,RNCProveedores,DescripcionProveedores,EstadoProveedores) VALUES (?,?,?,?,?,?)";
        try {
            PreparedStatement pst  = cn.prepareStatement(sql);
            pst.setString(1, cod);
            //pst.setInt(2, comboBoxTipoCuenta.getSelectedIndex() + 1);
           // pst.setString(2, tipoCuenta);
            pst.setString(2, nom);
            pst.setString(3, tel);
            pst.setString(4, RNC);
            pst.setString(5, des);
            pst.setString(6, estado);           
            
            int n=pst.executeUpdate();
            if(n>0){
            JOptionPane.showMessageDialog(null, "Registro Guardado con Exito");
            //txtCodigoProveedor.setText("");
            txtNombreProveedor.setText("");
            txtTelefono.setText("");
            txtRNC.setText("");
            txtDescripcion.setText("");
            pst.close();
            codigos();

            }
            cargar("");
        } catch (SQLException ex) {
            Logger.getLogger(DefinirProveedores.class.getName()).log(Level.SEVERE, null, ex);
        }
        
            } 
    }//GEN-LAST:event_buttGuardarActionPerformed

    
    private void buttActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttActualizarActionPerformed
        String sql="UPDATE proveedores SET NombreProveedores = '"+txtNombreProveedor.getText()+"',TelefonoProveedores ='"+txtTelefono.getText()+"',RNCProveedores = '"+txtRNC.getText()+"',DescripcionProveedores = '"+txtDescripcion.getText()+"',EstadoProveedores = '"+cmbEstado.getSelectedItem().toString()+"' WHERE idProveedores = '"+txtCodigoProveedor.getText()+"'"; 
    try {
        PreparedStatement pst = cn.prepareStatement(sql);
        pst.executeUpdate();
       JOptionPane.showMessageDialog(null, "Registro actualizado");
       cargar("");
       //bloquear();
       //limpiar();
    } catch (Exception e) {
         JOptionPane.showMessageDialog(null, e);
    }
    }//GEN-LAST:event_buttActualizarActionPerformed

    private void tableProveedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableProveedoresMouseClicked
        // TODO add your handling code here:
        int filaseleccionada;

     try{
     
         filaseleccionada= tableProveedores.getSelectedRow();
         
         if (filaseleccionada==-1){         
             JOptionPane.showMessageDialog(null, "No se ha seleccionado ninguna fila");

         }else{

             DefaultTableModel modelotabla=(DefaultTableModel) tableProveedores.getModel();
             
               String cod=(String)tableProveedores.getValueAt(filaseleccionada, 0);
              BuscarProductoEditar(cod);
          
          }

       }catch (HeadlessException ex){

             JOptionPane.showMessageDialog(null, "Error: "+ex+"\nInténtelo nuevamente", " .::Error En la Operacion::." ,JOptionPane.ERROR_MESSAGE);

       }     
    }//GEN-LAST:event_tableProveedoresMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
    private javax.swing.JDesktopPane DesktopPanelDefinirProductos;
    private javax.swing.JButton buttActualizar;
    private javax.swing.JButton buttCerrar;
    private javax.swing.JButton buttGuardar;
    private javax.swing.JButton buttLimpiar;
    private javax.swing.JComboBox cmbEstado;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTree jTree1;
    private javax.swing.JLabel labDescripcion;
    private javax.swing.JTable tableProveedores;
    private javax.swing.JTextField txtCodigoProveedor;
    private javax.swing.JTextArea txtDescripcion;
    private javax.swing.JTextField txtNombreProveedor;
    private javax.swing.JFormattedTextField txtRNC;
    private javax.swing.JFormattedTextField txtTelefono;
    // End of variables declaration//GEN-END:variables

conexion cc = new conexion();
    Connection cn = cc.obtener();
    
    
}
