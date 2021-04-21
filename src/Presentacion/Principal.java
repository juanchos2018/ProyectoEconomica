/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Entidad.ClsBoleta;
import Entidad.ClsClientes;
import Entidad.ClsDetalleBoleta;
import Entidad.ClsProducto;
import Entidad.ClsProveedor;
import Entidad.ClsVendedor;
import Paneles.ClsCambiarPanel;
import Paneles.PnlBoleta;
import Paneles.PnlClientes;
import Paneles.PnlInicio;
import Paneles.PnlListaBoletas;
import Paneles.PnlProductos;
import Paneles.PnlProveedores;
import Paneles.PnlVendedor;
import java.awt.BorderLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class Principal extends javax.swing.JFrame {

   
    
  public static  ArrayList<ClsVendedor> listaVendedor =new ArrayList<ClsVendedor>(); 
    
  public static  ArrayList<ClsProveedor> listaProveedor =new ArrayList<ClsProveedor>();
  
   public static  ArrayList<ClsClientes> listaClientes =new ArrayList<ClsClientes>();
  
   public static  ArrayList<ClsProducto> listaProductos =new ArrayList<ClsProducto>();
   
     public static  ArrayList<ClsBoleta> listaBoletas =new ArrayList<ClsBoleta>();
  public static  ArrayList<ClsDetalleBoleta> listaDetalleBoletas =new ArrayList<ClsDetalleBoleta>();
    public Principal() {
        initComponents();
        
        new ClsCambiarPanel(pnlPrincipalPaneles, new Paneles.PnlInicio());
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pnlPrincipalGeneral = new javax.swing.JPanel();
        pnlMenuBotones = new javax.swing.JPanel();
        lblTituloMenu1 = new javax.swing.JLabel();
        lblTituloMenu2 = new javax.swing.JLabel();
        iconInicio = new javax.swing.JLabel();
        iconClientes = new javax.swing.JLabel();
        btnshVendedor = new rscomponentshade.RSButtonShade();
        iconSuministros = new javax.swing.JLabel();
        iconFacturacion = new javax.swing.JLabel();
        iconEnviarComunicado = new javax.swing.JLabel();
        iconMantenimiento = new javax.swing.JLabel();
        iconEmpleados = new javax.swing.JLabel();
        pnlHoraFechaActual = new javax.swing.JPanel();
        rSLabelHora1 = new rojeru_san.RSLabelHora();
        rSLabelFecha1 = new rojeru_san.RSLabelFecha();
        iconReportes = new javax.swing.JLabel();
        btnshProveedor = new rscomponentshade.RSButtonShade();
        btnshdInicio = new rscomponentshade.RSButtonShade();
        btnshdClientes1 = new rscomponentshade.RSButtonShade();
        btnshBoleta = new rscomponentshade.RSButtonShade();
        btnshListaBoletas = new rscomponentshade.RSButtonShade();
        btnshProducto = new rscomponentshade.RSButtonShade();
        pnlMenuSuperior = new javax.swing.JPanel();
        lblTituloPrincipal = new javax.swing.JLabel();
        iconUser = new javax.swing.JLabel();
        lblUserConectado = new javax.swing.JLabel();
        btnshdIconMenu = new rscomponentshade.RSButtonShade();
        pnlLecturaGeneral = new javax.swing.JPanel();
        lblInicio = new javax.swing.JLabel();
        btnshdCerrarSesion = new rscomponentshade.RSButtonShade();
        pnlContenedor = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pnlPrincipalPaneles = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        pnlMenuBotones.setBackground(new java.awt.Color(0, 51, 102));
        pnlMenuBotones.setForeground(new java.awt.Color(255, 255, 255));

        lblTituloMenu1.setFont(new java.awt.Font("Tahoma", 1, 26)); // NOI18N
        lblTituloMenu1.setForeground(new java.awt.Color(255, 255, 255));
        lblTituloMenu1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTituloMenu1.setText("MENÚ");

        lblTituloMenu2.setFont(new java.awt.Font("Tahoma", 1, 26)); // NOI18N
        lblTituloMenu2.setForeground(new java.awt.Color(255, 255, 255));
        lblTituloMenu2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTituloMenu2.setText("PRINCIPAL");

        iconClientes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconClientes.setMaximumSize(new java.awt.Dimension(35, 45));
        iconClientes.setMinimumSize(new java.awt.Dimension(35, 45));
        iconClientes.setPreferredSize(new java.awt.Dimension(40, 45));

        btnshVendedor.setBackground(new java.awt.Color(0, 51, 102));
        btnshVendedor.setText("Vendedor");
        btnshVendedor.setBgHover(new java.awt.Color(204, 204, 204));
        btnshVendedor.setBgShade(new java.awt.Color(0, 51, 102));
        btnshVendedor.setBgShadeHover(new java.awt.Color(0, 51, 102));
        btnshVendedor.setFont(new java.awt.Font("Tahoma", 0, 23)); // NOI18N
        btnshVendedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnshVendedorMousePressed(evt);
            }
        });
        btnshVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnshVendedorActionPerformed(evt);
            }
        });

        iconSuministros.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconSuministros.setMaximumSize(new java.awt.Dimension(35, 45));
        iconSuministros.setPreferredSize(new java.awt.Dimension(40, 45));

        iconFacturacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconFacturacion.setMaximumSize(new java.awt.Dimension(35, 45));
        iconFacturacion.setPreferredSize(new java.awt.Dimension(40, 45));

        iconEnviarComunicado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconEnviarComunicado.setMaximumSize(new java.awt.Dimension(35, 45));
        iconEnviarComunicado.setMinimumSize(new java.awt.Dimension(40, 45));
        iconEnviarComunicado.setPreferredSize(new java.awt.Dimension(40, 45));

        iconMantenimiento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconMantenimiento.setMaximumSize(new java.awt.Dimension(35, 45));
        iconMantenimiento.setMinimumSize(new java.awt.Dimension(44, 45));
        iconMantenimiento.setPreferredSize(new java.awt.Dimension(40, 45));

        iconEmpleados.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconEmpleados.setMaximumSize(new java.awt.Dimension(35, 45));
        iconEmpleados.setMinimumSize(new java.awt.Dimension(40, 45));
        iconEmpleados.setPreferredSize(new java.awt.Dimension(40, 45));

        pnlHoraFechaActual.setBackground(new java.awt.Color(0, 51, 102));
        pnlHoraFechaActual.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.white, java.awt.Color.blue));

        rSLabelHora1.setForeground(new java.awt.Color(255, 255, 255));
        rSLabelHora1.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N

        rSLabelFecha1.setForeground(new java.awt.Color(255, 255, 255));
        rSLabelFecha1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        javax.swing.GroupLayout pnlHoraFechaActualLayout = new javax.swing.GroupLayout(pnlHoraFechaActual);
        pnlHoraFechaActual.setLayout(pnlHoraFechaActualLayout);
        pnlHoraFechaActualLayout.setHorizontalGroup(
            pnlHoraFechaActualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlHoraFechaActualLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rSLabelHora1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
            .addGroup(pnlHoraFechaActualLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rSLabelFecha1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlHoraFechaActualLayout.setVerticalGroup(
            pnlHoraFechaActualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHoraFechaActualLayout.createSequentialGroup()
                .addComponent(rSLabelHora1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rSLabelFecha1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        iconReportes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconReportes.setMaximumSize(new java.awt.Dimension(35, 45));
        iconReportes.setMinimumSize(new java.awt.Dimension(40, 45));
        iconReportes.setPreferredSize(new java.awt.Dimension(40, 45));

        btnshProveedor.setBackground(new java.awt.Color(0, 51, 102));
        btnshProveedor.setText("Proveedores");
        btnshProveedor.setBgHover(new java.awt.Color(204, 204, 204));
        btnshProveedor.setBgShade(new java.awt.Color(0, 51, 102));
        btnshProveedor.setBgShadeHover(new java.awt.Color(0, 51, 102));
        btnshProveedor.setFont(new java.awt.Font("Tahoma", 0, 23)); // NOI18N
        btnshProveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnshProveedorMousePressed(evt);
            }
        });
        btnshProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnshProveedorActionPerformed(evt);
            }
        });

        btnshdInicio.setBackground(new java.awt.Color(0, 51, 102));
        btnshdInicio.setText("Inicio");
        btnshdInicio.setBgHover(new java.awt.Color(204, 204, 204));
        btnshdInicio.setBgShade(new java.awt.Color(0, 51, 102));
        btnshdInicio.setBgShadeHover(new java.awt.Color(0, 51, 102));
        btnshdInicio.setFont(new java.awt.Font("Tahoma", 0, 23)); // NOI18N
        btnshdInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnshdInicioMousePressed(evt);
            }
        });
        btnshdInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnshdInicioActionPerformed(evt);
            }
        });

        btnshdClientes1.setBackground(new java.awt.Color(0, 51, 102));
        btnshdClientes1.setText("Clientes");
        btnshdClientes1.setBgHover(new java.awt.Color(204, 204, 204));
        btnshdClientes1.setBgShade(new java.awt.Color(0, 51, 102));
        btnshdClientes1.setBgShadeHover(new java.awt.Color(0, 51, 102));
        btnshdClientes1.setFont(new java.awt.Font("Tahoma", 0, 23)); // NOI18N
        btnshdClientes1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnshdClientes1MousePressed(evt);
            }
        });
        btnshdClientes1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnshdClientes1ActionPerformed(evt);
            }
        });

        btnshBoleta.setBackground(new java.awt.Color(0, 51, 102));
        btnshBoleta.setText("Boleta");
        btnshBoleta.setBgHover(new java.awt.Color(204, 204, 204));
        btnshBoleta.setBgShade(new java.awt.Color(0, 51, 102));
        btnshBoleta.setBgShadeHover(new java.awt.Color(0, 51, 102));
        btnshBoleta.setFont(new java.awt.Font("Tahoma", 0, 23)); // NOI18N
        btnshBoleta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnshBoletaMousePressed(evt);
            }
        });
        btnshBoleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnshBoletaActionPerformed(evt);
            }
        });

        btnshListaBoletas.setBackground(new java.awt.Color(0, 51, 102));
        btnshListaBoletas.setText("ListaBoletas");
        btnshListaBoletas.setBgHover(new java.awt.Color(204, 204, 204));
        btnshListaBoletas.setBgShade(new java.awt.Color(0, 51, 102));
        btnshListaBoletas.setBgShadeHover(new java.awt.Color(0, 51, 102));
        btnshListaBoletas.setFont(new java.awt.Font("Tahoma", 0, 23)); // NOI18N
        btnshListaBoletas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnshListaBoletasMousePressed(evt);
            }
        });
        btnshListaBoletas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnshListaBoletasActionPerformed(evt);
            }
        });

        btnshProducto.setBackground(new java.awt.Color(0, 51, 102));
        btnshProducto.setText("Productos");
        btnshProducto.setBgHover(new java.awt.Color(204, 204, 204));
        btnshProducto.setBgShade(new java.awt.Color(0, 51, 102));
        btnshProducto.setBgShadeHover(new java.awt.Color(0, 51, 102));
        btnshProducto.setFont(new java.awt.Font("Tahoma", 0, 23)); // NOI18N
        btnshProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnshProductoMousePressed(evt);
            }
        });
        btnshProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnshProductoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlMenuBotonesLayout = new javax.swing.GroupLayout(pnlMenuBotones);
        pnlMenuBotones.setLayout(pnlMenuBotonesLayout);
        pnlMenuBotonesLayout.setHorizontalGroup(
            pnlMenuBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuBotonesLayout.createSequentialGroup()
                .addComponent(iconInicio)
                .addGroup(pnlMenuBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMenuBotonesLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(btnshdInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlMenuBotonesLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnshdClientes1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(pnlMenuBotonesLayout.createSequentialGroup()
                .addGroup(pnlMenuBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMenuBotonesLayout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(lblTituloMenu1))
                    .addGroup(pnlMenuBotonesLayout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(lblTituloMenu2))
                    .addGroup(pnlMenuBotonesLayout.createSequentialGroup()
                        .addGap(289, 289, 289)
                        .addComponent(iconSuministros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(pnlMenuBotonesLayout.createSequentialGroup()
                .addGroup(pnlMenuBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(iconEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iconEnviarComunicado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iconFacturacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlMenuBotonesLayout.createSequentialGroup()
                        .addGroup(pnlMenuBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlMenuBotonesLayout.createSequentialGroup()
                                .addComponent(iconMantenimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMenuBotonesLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(pnlHoraFechaActual, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)))
                        .addComponent(iconReportes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlMenuBotonesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnshListaBoletas, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnshProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(iconClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnlMenuBotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlMenuBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMenuBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnshProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnshVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnshBoleta, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlMenuBotonesLayout.setVerticalGroup(
            pnlMenuBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuBotonesLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblTituloMenu1)
                .addGap(6, 6, 6)
                .addComponent(lblTituloMenu2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlMenuBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMenuBotonesLayout.createSequentialGroup()
                        .addComponent(iconInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMenuBotonesLayout.createSequentialGroup()
                        .addComponent(btnshdInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnshdClientes1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnshVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlMenuBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMenuBotonesLayout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(btnshProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(231, 231, 231)
                        .addComponent(iconSuministros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlMenuBotonesLayout.createSequentialGroup()
                        .addGroup(pnlMenuBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnshProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(iconClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnshBoleta, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btnshListaBoletas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40)
                .addComponent(iconFacturacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79)
                .addComponent(iconEnviarComunicado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnlMenuBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMenuBotonesLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(iconReportes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(iconMantenimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(iconEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlMenuBotonesLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(pnlHoraFechaActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlMenuSuperior.setBackground(new java.awt.Color(0, 51, 102));
        pnlMenuSuperior.setForeground(new java.awt.Color(255, 255, 255));
        pnlMenuSuperior.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                pnlMenuSuperiorMouseDragged(evt);
            }
        });
        pnlMenuSuperior.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlMenuSuperiorMousePressed(evt);
            }
        });

        lblTituloPrincipal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTituloPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        lblTituloPrincipal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTituloPrincipal.setText("Tienda");

        iconUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconUser.setPreferredSize(new java.awt.Dimension(40, 32));

        lblUserConectado.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        lblUserConectado.setForeground(new java.awt.Color(255, 255, 255));
        lblUserConectado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUserConectado.setText("Usuario: [Administrador]");

        btnshdIconMenu.setBackground(new java.awt.Color(0, 51, 102));
        btnshdIconMenu.setBgHover(new java.awt.Color(204, 204, 204));
        btnshdIconMenu.setBgShade(new java.awt.Color(0, 51, 102));
        btnshdIconMenu.setBgShadeHover(new java.awt.Color(0, 51, 102));
        btnshdIconMenu.setPreferredSize(new java.awt.Dimension(40, 40));
        btnshdIconMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnshdIconMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlMenuSuperiorLayout = new javax.swing.GroupLayout(pnlMenuSuperior);
        pnlMenuSuperior.setLayout(pnlMenuSuperiorLayout);
        pnlMenuSuperiorLayout.setHorizontalGroup(
            pnlMenuSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuSuperiorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnshdIconMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblTituloPrincipal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 811, Short.MAX_VALUE)
                .addComponent(iconUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUserConectado, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );
        pnlMenuSuperiorLayout.setVerticalGroup(
            pnlMenuSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuSuperiorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTituloPrincipal)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnlMenuSuperiorLayout.createSequentialGroup()
                .addGroup(pnlMenuSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(iconUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblUserConectado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlMenuSuperiorLayout.createSequentialGroup()
                        .addComponent(btnshdIconMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pnlLecturaGeneral.setBackground(new java.awt.Color(255, 255, 255));
        pnlLecturaGeneral.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnlLecturaGeneral.setPreferredSize(new java.awt.Dimension(1028, 58));

        lblInicio.setFont(new java.awt.Font("Tahoma", 1, 21)); // NOI18N
        lblInicio.setForeground(new java.awt.Color(0, 51, 102));
        lblInicio.setText("Inicio");

        btnshdCerrarSesion.setBackground(new java.awt.Color(255, 255, 255));
        btnshdCerrarSesion.setForeground(new java.awt.Color(0, 51, 102));
        btnshdCerrarSesion.setText("Cerrar");
        btnshdCerrarSesion.setBgHover(new java.awt.Color(204, 204, 204));
        btnshdCerrarSesion.setBgShade(new java.awt.Color(0, 51, 102));
        btnshdCerrarSesion.setBgShadeHover(new java.awt.Color(0, 51, 102));
        btnshdCerrarSesion.setFgText(new java.awt.Color(0, 51, 102));
        btnshdCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnshdCerrarSesionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlLecturaGeneralLayout = new javax.swing.GroupLayout(pnlLecturaGeneral);
        pnlLecturaGeneral.setLayout(pnlLecturaGeneralLayout);
        pnlLecturaGeneralLayout.setHorizontalGroup(
            pnlLecturaGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLecturaGeneralLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblInicio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnshdCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlLecturaGeneralLayout.setVerticalGroup(
            pnlLecturaGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLecturaGeneralLayout.createSequentialGroup()
                .addGroup(pnlLecturaGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnshdCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblInicio))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pnlContenedor.setBackground(new java.awt.Color(255, 255, 255));
        pnlContenedor.setPreferredSize(new java.awt.Dimension(1028, 100));

        pnlPrincipalPaneles.setBackground(new java.awt.Color(102, 102, 102));
        pnlPrincipalPaneles.setLayout(new javax.swing.BoxLayout(pnlPrincipalPaneles, javax.swing.BoxLayout.LINE_AXIS));
        jScrollPane1.setViewportView(pnlPrincipalPaneles);

        javax.swing.GroupLayout pnlContenedorLayout = new javax.swing.GroupLayout(pnlContenedor);
        pnlContenedor.setLayout(pnlContenedorLayout);
        pnlContenedorLayout.setHorizontalGroup(
            pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContenedorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        pnlContenedorLayout.setVerticalGroup(
            pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlContenedorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );

        javax.swing.GroupLayout pnlPrincipalGeneralLayout = new javax.swing.GroupLayout(pnlPrincipalGeneral);
        pnlPrincipalGeneral.setLayout(pnlPrincipalGeneralLayout);
        pnlPrincipalGeneralLayout.setHorizontalGroup(
            pnlPrincipalGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalGeneralLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPrincipalGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlMenuSuperior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlPrincipalGeneralLayout.createSequentialGroup()
                        .addComponent(pnlMenuBotones, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlPrincipalGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlLecturaGeneral, javax.swing.GroupLayout.DEFAULT_SIZE, 983, Short.MAX_VALUE)
                            .addComponent(pnlContenedor, javax.swing.GroupLayout.DEFAULT_SIZE, 983, Short.MAX_VALUE))))
                .addContainerGap())
        );
        pnlPrincipalGeneralLayout.setVerticalGroup(
            pnlPrincipalGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalGeneralLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlMenuSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnlPrincipalGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPrincipalGeneralLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(pnlLecturaGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlContenedor, javax.swing.GroupLayout.PREFERRED_SIZE, 633, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlPrincipalGeneralLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(pnlMenuBotones, javax.swing.GroupLayout.PREFERRED_SIZE, 631, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(1244, 1244, 1244)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlPrincipalGeneral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlPrincipalGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pnlMenuSuperiorMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlMenuSuperiorMouseDragged
//        Point mueve = MouseInfo.getPointerInfo().getLocation();
//        this.setLocation(mueve.x - x, mueve.y - y);
    }//GEN-LAST:event_pnlMenuSuperiorMouseDragged

    private void pnlMenuSuperiorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlMenuSuperiorMousePressed
//        x = evt.getX();
//        y = evt.getY();
    }//GEN-LAST:event_pnlMenuSuperiorMousePressed

    private void btnshdCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnshdCerrarSesionActionPerformed
        if (JOptionPane.showConfirmDialog(null, "¿Está seguro de Cerrar ?!!", "Message", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
//            frmLogin Login = new frmLogin();
//            Login.setVisible(true);
//            Login.pack();
//            this.setVisible(false);

  System.exit(0);
        }
    }//GEN-LAST:event_btnshdCerrarSesionActionPerformed

    private void btnshdIconMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnshdIconMenuActionPerformed
//        int posicion = pnlMenuBotones.getX();
//        if(posicion > -1){
//            Animacion.Animacion.mover_izquierda(0, -264, 2, 2, pnlMenuBotones);
//        }else{
//            Animacion.Animacion.mover_derecha(-264, 0, 2, 2, pnlMenuBotones);
//        }
    }//GEN-LAST:event_btnshdIconMenuActionPerformed

    private void btnshProveedorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnshProveedorMousePressed
       // this.btnshdInicio.setSelected(true);
       // this.btnshdClientes.setSelected(false);
       // this.btnshdSuministros.setSelected(false);
       
    }//GEN-LAST:event_btnshProveedorMousePressed

    private void btnshProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnshProveedorActionPerformed
        // new ClsCambiarPanel(pnlPrincipalPaneles, new Paneles.pnlInicio());
      
        if(this.btnshProveedor.isSelected()){
            lblInicio.setText("Gestión de Proveedor");
            
            PnlProveedores objCli = new PnlProveedores();
            objCli.setSize(968, 635);
            objCli.setLocation(0, 0);
            
            pnlPrincipalPaneles.removeAll();
            pnlPrincipalPaneles.add(objCli, BorderLayout.CENTER);
            pnlPrincipalPaneles.revalidate();
            pnlPrincipalPaneles.repaint();
        }
        else    {
            
        }
    }//GEN-LAST:event_btnshProveedorActionPerformed

    private void btnshVendedorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnshVendedorMousePressed
        this.btnshProveedor.setSelected(false);
        this.btnshVendedor.setSelected(true);
        this.btnshdInicio.setSelected(false);
        
    }//GEN-LAST:event_btnshVendedorMousePressed

    private void btnshVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnshVendedorActionPerformed
        // new ClsCambiarPanel(pnlPrincipalPaneles, new Paneles.pnlClientes());
 if(this.btnshVendedor.isSelected()){
            lblInicio.setText("Gestión de Vendedor");
            
            PnlVendedor objCli = new PnlVendedor();
            objCli.setSize(968, 635);
            objCli.setLocation(0, 0);
            
            pnlPrincipalPaneles.removeAll();
            pnlPrincipalPaneles.add(objCli, BorderLayout.CENTER);
            pnlPrincipalPaneles.revalidate();
            pnlPrincipalPaneles.repaint();
        }
        else    {
            
        }
    }//GEN-LAST:event_btnshVendedorActionPerformed

    private void btnshdInicioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnshdInicioMousePressed
        this.btnshProveedor.setSelected(false);
        this.btnshVendedor.setSelected(false);
        this.btnshdInicio.setSelected(true);
        
    }//GEN-LAST:event_btnshdInicioMousePressed

    private void btnshdInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnshdInicioActionPerformed
    if(this.btnshdInicio.isSelected()){
            lblInicio.setText("Inicio");
            
            PnlInicio objIni = new PnlInicio();
            objIni.setSize(968, 635);
            objIni.setLocation(0, 0);
            
            pnlPrincipalPaneles.removeAll();
            pnlPrincipalPaneles.add(objIni, BorderLayout.CENTER);
            pnlPrincipalPaneles.revalidate();
            pnlPrincipalPaneles.repaint();
        }else{
            
        }
    }//GEN-LAST:event_btnshdInicioActionPerformed

    private void btnshdClientes1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnshdClientes1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnshdClientes1MousePressed

    private void btnshdClientes1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnshdClientes1ActionPerformed
        // TODO add your handling code here: fffffffffffffffff
        
     ///   JOptionPane.showMessageDialog(null, "Registrado","alto",1);
       
       //  if(this.btnshdClientes1.isSelected()){
            lblInicio.setText("Gestión de Cliente");
           
            PnlClientes objCli = new PnlClientes();
            objCli.setSize(968, 635);
            objCli.setLocation(0, 0);            
            pnlPrincipalPaneles.removeAll();
            pnlPrincipalPaneles.add(objCli, BorderLayout.CENTER);
            pnlPrincipalPaneles.revalidate();
            pnlPrincipalPaneles.repaint();
      //  }
//        else    {
//             JOptionPane.showMessageDialog(null, "no llega","alto",1);
//        }
    }//GEN-LAST:event_btnshdClientes1ActionPerformed

    private void btnshBoletaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnshBoletaMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnshBoletaMousePressed

    private void btnshBoletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnshBoletaActionPerformed
        // TODO add your handling code here:
        
            lblInicio.setText("Gestión de boleta");
           
            PnlBoleta objCli = new PnlBoleta();
            objCli.setSize(968, 635);
            objCli.setLocation(0, 0);            
            pnlPrincipalPaneles.removeAll();
            pnlPrincipalPaneles.add(objCli, BorderLayout.CENTER);
            pnlPrincipalPaneles.revalidate();
            pnlPrincipalPaneles.repaint();
    }//GEN-LAST:event_btnshBoletaActionPerformed

    private void btnshListaBoletasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnshListaBoletasMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnshListaBoletasMousePressed

    private void btnshListaBoletasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnshListaBoletasActionPerformed
        // TODO add your handling code here:
        
          lblInicio.setText("Lista de boleta");
           
            PnlListaBoletas objCli = new PnlListaBoletas();
            objCli.setSize(968, 635);
            objCli.setLocation(0, 0);            
            pnlPrincipalPaneles.removeAll();
            pnlPrincipalPaneles.add(objCli, BorderLayout.CENTER);
            pnlPrincipalPaneles.revalidate();
            pnlPrincipalPaneles.repaint();
    }//GEN-LAST:event_btnshListaBoletasActionPerformed

    private void btnshProductoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnshProductoMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnshProductoMousePressed

    private void btnshProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnshProductoActionPerformed
        // TODO add your handling code here:
        
            lblInicio.setText("Gestión de Producto");
           
            PnlProductos objCli = new PnlProductos();
            objCli.setSize(968, 635);
            objCli.setLocation(0, 0);            
            pnlPrincipalPaneles.removeAll();
            pnlPrincipalPaneles.add(objCli, BorderLayout.CENTER);
            pnlPrincipalPaneles.revalidate();
            pnlPrincipalPaneles.repaint();
    }//GEN-LAST:event_btnshProductoActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rscomponentshade.RSButtonShade btnshBoleta;
    private rscomponentshade.RSButtonShade btnshListaBoletas;
    private rscomponentshade.RSButtonShade btnshProducto;
    private rscomponentshade.RSButtonShade btnshProveedor;
    private rscomponentshade.RSButtonShade btnshVendedor;
    private rscomponentshade.RSButtonShade btnshdCerrarSesion;
    private rscomponentshade.RSButtonShade btnshdClientes1;
    private rscomponentshade.RSButtonShade btnshdIconMenu;
    private rscomponentshade.RSButtonShade btnshdInicio;
    private javax.swing.JLabel iconClientes;
    private javax.swing.JLabel iconEmpleados;
    private javax.swing.JLabel iconEnviarComunicado;
    private javax.swing.JLabel iconFacturacion;
    private javax.swing.JLabel iconInicio;
    private javax.swing.JLabel iconMantenimiento;
    private javax.swing.JLabel iconReportes;
    private javax.swing.JLabel iconSuministros;
    private javax.swing.JLabel iconUser;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JLabel lblInicio;
    private javax.swing.JLabel lblTituloMenu1;
    private javax.swing.JLabel lblTituloMenu2;
    private javax.swing.JLabel lblTituloPrincipal;
    private javax.swing.JLabel lblUserConectado;
    private javax.swing.JPanel pnlContenedor;
    private javax.swing.JPanel pnlHoraFechaActual;
    private javax.swing.JPanel pnlLecturaGeneral;
    private javax.swing.JPanel pnlMenuBotones;
    private javax.swing.JPanel pnlMenuSuperior;
    private javax.swing.JPanel pnlPrincipalGeneral;
    public static javax.swing.JPanel pnlPrincipalPaneles;
    private rojeru_san.RSLabelFecha rSLabelFecha1;
    private rojeru_san.RSLabelHora rSLabelHora1;
    // End of variables declaration//GEN-END:variables
}
