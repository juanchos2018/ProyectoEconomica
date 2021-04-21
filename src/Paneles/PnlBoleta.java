/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paneles;



import Entidad.ClsBoleta;
import Entidad.ClsClientes;
import Entidad.ClsDetalleBoleta;
import Entidad.ClsProducto;
import        Negocio.ClsNegCliente;import Negocio.ClsNegBoleta;


import Interface.Envia;
import Negocio.ClsNegCliente;
import Negocio.ClsNegDetalleBoleta;
import Negocio.ClsNegProducto;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author usuario
 */
public class PnlBoleta extends javax.swing.JPanel implements Envia{

     String titulo[]= {"codigo","Descripcionm","precio","Cantidad","Sub"};        
        DefaultTableModel dtm4=new DefaultTableModel(null,titulo);
         ClsClientes objCliente;
    ClsNegCliente objNegCliente;
    public PnlBoleta() {
        initComponents();
        
        lbltotal.setText("0");
        lblnumero.setText("000025");
        lblserie.setText("0001");
        Numeracion();
    }    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtnombrecliente = new rscomponentshade.RSTextFieldShade();
        txtdireccion = new rscomponentshade.RSTextFieldShade();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        lblserie = new javax.swing.JLabel();
        lblnumero = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtidproducto = new rscomponentshade.RSTextFieldShade();
        jLabel7 = new javax.swing.JLabel();
        txtdescripcion = new rscomponentshade.RSTextFieldShade();
        jLabel13 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtprecio = new rscomponentshade.RSTextFieldShade();
        jLabel19 = new javax.swing.JLabel();
        txtcantidad = new rscomponentshade.RSTextFieldShade();
        btnagregr = new rscomponentshade.RSButtonShade();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblventa = new javax.swing.JTable();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        lbltotal = new javax.swing.JLabel();
        btnregistrar = new rscomponentshade.RSButtonShade();

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Señor");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 102));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Direccion");

        txtnombrecliente.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtnombrecliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtnombrecliente.setPlaceholder("Ingrese Ruc");
        txtnombrecliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreclienteActionPerformed(evt);
            }
        });
        txtnombrecliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnombreclienteKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnombreclienteKeyTyped(evt);
            }
        });

        txtdireccion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtdireccion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtdireccion.setPlaceholder("Ingrese Razon Social");
        txtdireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdireccionKeyTyped(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 51, 102));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("CHOCOLATES JKR SAC");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 51, 102));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("CALLE GENERAL VAERAL CALLE LAS LOCAS  :V");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jLabel8)))
                .addContainerGap(144, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 102, 102));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 51, 102));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Ruc");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 51, 102));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Boleta");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 51, 102));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("00000");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 51, 102));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Serie");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 51, 102));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Numero");

        lblserie.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lblserie.setForeground(new java.awt.Color(0, 51, 102));
        lblserie.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblserie.setText("001");

        lblnumero.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lblnumero.setForeground(new java.awt.Color(0, 51, 102));
        lblnumero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblnumero.setText("15545");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(37, 37, 37)
                        .addComponent(lblserie)))
                .addGap(17, 17, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel15))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblnumero)
                    .addComponent(jLabel12))
                .addContainerGap(96, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel12)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(lblserie)
                    .addComponent(lblnumero))
                .addContainerGap())
        );

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 102));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Producto");

        txtidproducto.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtidproducto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtidproducto.setPlaceholder("Ingrese Razon Social");
        txtidproducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtidproductoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtidproductoKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 102));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Descipcion");

        txtdescripcion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtdescripcion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtdescripcion.setPlaceholder("Ingrese Razon Social");
        txtdescripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdescripcionKeyTyped(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 51, 102));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("00000");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 51, 102));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Pecio");

        txtprecio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtprecio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtprecio.setPlaceholder("Ingrese Razon Social");
        txtprecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtprecioKeyTyped(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 51, 102));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Cantidad");

        txtcantidad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtcantidad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtcantidad.setPlaceholder("Ingrese Razon Social");
        txtcantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcantidadKeyTyped(evt);
            }
        });

        btnagregr.setBackground(new java.awt.Color(0, 51, 102));
        btnagregr.setText("Agregar");
        btnagregr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregrActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 51, 51));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("[Agregar]");

        tblventa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblventa);

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 51, 51));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("[Buscar]");
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel21MouseClicked(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 51, 102));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Total");

        lbltotal.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lbltotal.setForeground(new java.awt.Color(0, 51, 102));
        lbltotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbltotal.setText("0");

        btnregistrar.setBackground(new java.awt.Color(0, 51, 102));
        btnregistrar.setText("Registrar");
        btnregistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregistrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel20))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtnombrecliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtidproducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel21))
                            .addComponent(txtprecio, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel19)
                                            .addComponent(txtcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(47, 47, 47)
                                        .addComponent(btnagregr, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(3, 3, 3))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtdescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addGap(33, 33, 33)
                        .addComponent(lbltotal)
                        .addGap(60, 60, 60)
                        .addComponent(btnregistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 913, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel20)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel13)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtnombrecliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel21))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtidproducto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtdescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtprecio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnagregr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel22)
                        .addComponent(lbltotal))
                    .addComponent(btnregistrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtnombreclienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombreclienteKeyTyped
        // TODO add your handling code here:

//        char validar =evt.getKeyChar();
//        if (Character.isLetter(validar)) {
//            getToolkit().beep();
//            evt.consume();
//            JOptionPane.showMessageDialog(null, "Solo Numeros", "No", 1);
//
//        }
    }//GEN-LAST:event_txtnombreclienteKeyTyped

    private void txtdireccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdireccionKeyTyped
        // TODO add your handling code here:

//        char validar=evt.getKeyChar();
//        if (Character.isDigit(validar)) {
//            getToolkit().beep();
//            evt.consume();
//            JOptionPane.showMessageDialog(null, "Solo Letras", "No", 1);
//
//        }
    }//GEN-LAST:event_txtdireccionKeyTyped

    private void Numeracion(){
         ClsBoleta objBoleta = new ClsBoleta();
         ClsNegBoleta objNeBoleta =  new ClsNegBoleta();
         int NumeroACtual =objNeBoleta.CantidadRegistro();
         if (NumeroACtual==0) {
            NumeroACtual=1;
         }   else{
            NumeroACtual++;
         }      
        lblnumero.setText(String.format("%06d", NumeroACtual));
    }
    private void txtnombreclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreclienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreclienteActionPerformed

    private void txtidproductoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtidproductoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidproductoKeyTyped

    private void txtdescripcionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdescripcionKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdescripcionKeyTyped

    private void txtprecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtprecioKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtprecioKeyTyped

    private void txtcantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcantidadKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcantidadKeyTyped

    private void btnagregrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregrActionPerformed
       // recibeDAtos(txtdescripcion.getText().toString());
       
        if (txtidproducto.getText().toString().equals("")) {
               JOptionPane.showMessageDialog(null, "falta campo", "No", 1);
        }
        else if (txtdescripcion.getText().toString().equals("")) {
             JOptionPane.showMessageDialog(null, "falta campo", "No", 1);
        }else{
             Object  columna[]=new Object[5];
            double sub =0;
            columna[0]=txtidproducto.getText().toString();            
            columna[1]=txtdescripcion.getText().toString();     
            
            sub=Integer.parseInt(txtcantidad.getText())*Double.parseDouble(txtprecio.getText());
            
            columna[2]=txtprecio.getText().toString();
            columna[3]=txtcantidad.getText().toString();
            columna[4]=sub;
            dtm4.addRow(columna);
            tblventa.setModel(dtm4);
           
            Totalventa();
        }
           
        
    }//GEN-LAST:event_btnagregrActionPerformed

    void Totalventa(){
          double Total =0;
           for (int i = 0; i < tblventa.getRowCount(); i++) {
                 Total += Double.parseDouble(tblventa.getValueAt(i, 4)+"");
           }
         lbltotal.setText(String.valueOf(Total));
    }
    private void btnregistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregistrarActionPerformed
        // TODO add your handling code here:    
        
        if (txtnombrecliente.getText().toString().equals("")) {
               JOptionPane.showMessageDialog(null, "Falta llnear WE", "No", 1);
        }else{
                ClsBoleta objBoleta = new ClsBoleta();
        ClsNegBoleta objNeBoleta =  new ClsNegBoleta();
        
        objBoleta.setSerieBoleta(lblserie.getText().toString());
        objBoleta.setNumeroBoleta(lblnumero.getText().toString());  
        String[] datos = txtnombrecliente.getText().split("-");
        objBoleta.setDniCliente(datos[0]);
        objBoleta.setNombreCliente(datos[1]);        
       objBoleta.setTotal(Double.parseDouble(lbltotal.getText().toString()));
      
        objNeBoleta.Registar(objBoleta);      
        GuardarDetalle();      
       JOptionPane.showMessageDialog(null, "ReGistrado WE", "No", 1);
         Numeracion();
      }
    
        
    }//GEN-LAST:event_btnregistrarActionPerformed
    public void GuardarDetalle()
    {
        // String titulo[]= {"codigo","Descripcionm","precio","Cantidad","Sub"};  
            for (int i = 0; i < tblventa.getRowCount(); i++) {
                 ClsDetalleBoleta o  =  new ClsDetalleBoleta();     
                ClsNegDetalleBoleta ob = new  ClsNegDetalleBoleta();
                o.setSerieBoleta(lblserie.getText().toString());
                o.setNumeroBoleta(lblnumero.getText().toString());
                o.setIdproducto(tblventa.getValueAt(i,0).toString());
                o.setDescripcion(tblventa.getValueAt(i,1).toString());
                o.setPrecio( Double.parseDouble(tblventa.getValueAt(i, 2).toString()));
                o.setCantidad(Integer.parseInt(tblventa.getValueAt(i,3).toString()));
                o.setSubtotal(Double.parseDouble(tblventa.getValueAt(i, 4).toString()));
                ob.Registar(o);
                          
            }   

        }
    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked
        
       // FrmDialogoProducto f = new  FrmDialogoProducto();      
     // FrmDialogoProducto f=     FrmDialogoProducto.GetInstancia();
        //f.show();
       // f.setVisible(true);
    }//GEN-LAST:event_jLabel21MouseClicked

    private void txtidproductoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtidproductoKeyPressed
        // TODO add your handling code here:
      ///  JOptionPane.showMessageDialog(null, "enter", "No", 1);
        ClsNegProducto obnegproducto=new ClsNegProducto();
        ClsProducto    objproducto=new  ClsProducto();       
       // obnegproducto = new ClsNegProducto();
      //  objproducto = new  ClsProducto();        
         String id=txtidproducto.getText().toString();
         if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            if (id!="") {
            if (obnegproducto.Existe(id) ) {
                objproducto.setIdproducto(id);
                objproducto=   obnegproducto.Registro(objproducto);                
                txtidproducto.setText(objproducto.getIdproducto());
                txtdescripcion.setText(objproducto.getDescripcion());
                txtprecio.setText(String.valueOf( objproducto.getPrecio())); 
            }else{
                JOptionPane.showMessageDialog(null, "No Existe", "No", 1);
            }   
              }                 
          }
        
    }//GEN-LAST:event_txtidproductoKeyPressed

    private void txtnombreclienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombreclienteKeyPressed
        // TODO add your handling code here:
         objCliente = new   ClsClientes();
         objNegCliente = new ClsNegCliente();  
          String dni=txtnombrecliente.getText().toString();
         if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            if (dni!="") {
            if (objNegCliente.Existe(dni) ) {
                objCliente.setDni(dni);
                objCliente=   objNegCliente.Registro(objCliente);                
                txtnombrecliente.setText(objCliente.getDni()+"-"+objCliente.getNombre());
                txtdireccion.setText(objCliente.getDireccion());
                
            }else{
                JOptionPane.showMessageDialog(null, "No Existe", "No", 1);
            }   
              }                 
          }
         
    }//GEN-LAST:event_txtnombreclienteKeyPressed

    public void recibeDAtos(String descripcion){
       //   JOptionPane.showMessageDialog(null, descripcion, "No", 1);
             String  columna[]=new String[4];
            columna[0]=descripcion;            
            columna[1]="a";       
            dtm4.addRow(columna);
            tblventa.setModel(dtm4);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rscomponentshade.RSButtonShade btnagregr;
    private rscomponentshade.RSButtonShade btnregistrar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblnumero;
    private javax.swing.JLabel lblserie;
    private javax.swing.JLabel lbltotal;
    private javax.swing.JTable tblventa;
    private rscomponentshade.RSTextFieldShade txtcantidad;
    private rscomponentshade.RSTextFieldShade txtdescripcion;
    private rscomponentshade.RSTextFieldShade txtdireccion;
    private rscomponentshade.RSTextFieldShade txtidproducto;
    private rscomponentshade.RSTextFieldShade txtnombrecliente;
    private rscomponentshade.RSTextFieldShade txtprecio;
    // End of variables declaration//GEN-END:variables

    @Override
    public String CantidadRegistro(String descipcion) {
            String  columna[]=new String[4];
            columna[0]=descipcion;            
            columna[1]="a";       
            dtm4.addRow(columna);
            tblventa.setModel(dtm4);
            return "a";
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
