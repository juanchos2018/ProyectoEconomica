/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paneles;

import Entidad.ClsProveedor;
import Entidad.ClsVendedor;
import Negocio.ClsNegProveedor;
import Negocio.ClsNegVendedor;
import Presentacion.Principal;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class PnlRegistrarProveedor extends javax.swing.JPanel {

    /**
     * Creates new form PnlRegistrarProveedor
     */
    
      ClsVendedor objVendedor;
    ClsNegVendedor objNegVendedor;
    
    
    public PnlRegistrarProveedor() {
        initComponents();
        
       
         objNegVendedor=new ClsNegVendedor();
        llenarcombo();
        
    }

   
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtruc = new rscomponentshade.RSTextFieldShade();
        txtrazonsocial = new rscomponentshade.RSTextFieldShade();
        btnshdCancelar = new rscomponentshade.RSButtonShade();
        btnshdRegistrar = new rscomponentshade.RSButtonShade();
        jLabel7 = new javax.swing.JLabel();
        cmbProducto = new javax.swing.JComboBox<>();
        jPanel5 = new javax.swing.JPanel();
        cmboVendedor = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("REGISTRAR PROVEEDOR");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Ruc");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 102));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Razon Social");

        txtruc.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtruc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtruc.setPlaceholder("Ingrese Ruc");
        txtruc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtrucKeyTyped(evt);
            }
        });

        txtrazonsocial.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtrazonsocial.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtrazonsocial.setPlaceholder("Ingrese Razon Social");
        txtrazonsocial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtrazonsocialKeyTyped(evt);
            }
        });

        btnshdCancelar.setBackground(new java.awt.Color(0, 51, 102));
        btnshdCancelar.setText("Cancelar");
        btnshdCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnshdCancelarActionPerformed(evt);
            }
        });

        btnshdRegistrar.setBackground(new java.awt.Color(0, 51, 102));
        btnshdRegistrar.setText("Registrar");
        btnshdRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnshdRegistrarActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 102));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Producto");

        cmbProducto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmbProducto.setForeground(new java.awt.Color(0, 51, 102));
        cmbProducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<<Seleccione>>", "Bebidas", "Aborrtes", " " }));
        cmbProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbProductoActionPerformed(evt);
            }
        });

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Vendedor"));

        cmboVendedor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmboVendedor.setForeground(new java.awt.Color(0, 51, 102));
        cmboVendedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<<Seleccione>>" }));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 51, 102));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Vendedor");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(34, 34, 34)
                .addComponent(cmboVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(377, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmboVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addContainerGap(74, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtrazonsocial, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
                            .addComponent(txtruc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(63, 63, 63)
                        .addComponent(jLabel7)
                        .addGap(26, 26, 26)
                        .addComponent(cmbProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnshdRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnshdCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtruc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(cmbProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtrazonsocial, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnshdRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnshdCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(102, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnshdCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnshdCancelarActionPerformed
        new ClsCambiarPanel(Principal.pnlPrincipalPaneles, new Paneles.PnlProveedores());
        Principal.lblInicio.setText("Gestión Proveedor");
    }//GEN-LAST:event_btnshdCancelarActionPerformed

    String  cedulas[] = new String [100];
 public static   int contador =0;
    
    private void llenarcombo() {
             
         DefaultComboBoxModel combomdel=new DefaultComboBoxModel();
            for(int i = 0; i < objNegVendedor.CantidadRegistro(); i++)
            {
            objVendedor = objNegVendedor.ObtenerRegistro(i);
            cedulas[i]=objVendedor.getDni();
            contador++;
            combomdel.addElement(objVendedor.getNombre()+" "+objVendedor.getApellido());                
            
           }           
            cmboVendedor.setModel(combomdel);
            
    }
    private void btnshdRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnshdRegistrarActionPerformed
        
          int cantidad=txtruc.getText().length();
            if (cantidad<13  || cantidad>13 ) {
              JOptionPane.showMessageDialog(null, "Ruc incorrecta","alto",1);
              return;
            }
                
       String ruc=txtruc.getText().toString();
       String razon=txtrazonsocial.getText().toString();
       String tipo=cmbProducto.getSelectedItem().toString();
       String vendedor=cmboVendedor.getSelectedItem().toString();
       int pos = cmboVendedor.getSelectedIndex();
       String cedula =cedulas[pos];
              
       String ced="";
       String nombre="";
       String  apellido="";
       String telefono="";
       String genero="";       
        for (ClsVendedor item : Principal.listaVendedor) {            
            if (cedula.equals(item.getDni())) {                
                ced=item.getDni();
                nombre=item.getNombre();
                apellido=item.getApellido();
                telefono=item.getCelular();
                genero=item.getGenero();
                break;
            }
        }
       
       Registrar(ruc,razon,tipo,ced,vendedor,apellido,telefono,genero);
    }//GEN-LAST:event_btnshdRegistrarActionPerformed

     private void Registrar(String ruc, String razon, String tipo, String cedul,String vendedor,String apellido,String telefono,String sexo) {
               
         
        ClsProveedor  o = new ClsProveedor();
        ClsNegProveedor ob = new  ClsNegProveedor();
        
        if (ob.Existe(ruc)) {
            
            JOptionPane.showMessageDialog(null, "existe", "Existe Ruc", 1);
        }
        else{
            
            o.setRuc(ruc);
            o.setRazonsocial(razon);
            o.setTipo(tipo);
            o.setVendedor(vendedor);
            o.setCedula_vendedor(cedul);
            o.setApellido_vendedor(apellido);
            o.setTelefono_vendedor(telefono);
            o.setGenero_vendedor(sexo);
            
            ob.Registar(o);
            
             JOptionPane.showMessageDialog(null, "Registrado", "Registado Vendedor", 1);
        }
         
    }
     
    private void cmbProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbProductoActionPerformed

    private void txtrazonsocialKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtrazonsocialKeyTyped
        // TODO add your handling code here:
        
         char validar=evt.getKeyChar();
        if (Character.isDigit(validar)) {
            getToolkit().beep();
            evt.consume();
             JOptionPane.showMessageDialog(null, "Solo Letras", "No", 1);
            
        }
    }//GEN-LAST:event_txtrazonsocialKeyTyped

    private void txtrucKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtrucKeyTyped
        // TODO add your handling code here:
        
         char validar =evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo Numeros", "No", 1);
            
        }
    }//GEN-LAST:event_txtrucKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rscomponentshade.RSButtonShade btnshdCancelar;
    private rscomponentshade.RSButtonShade btnshdRegistrar;
    private javax.swing.JComboBox<String> cmbProducto;
    private javax.swing.JComboBox<String> cmboVendedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel5;
    private rscomponentshade.RSTextFieldShade txtrazonsocial;
    private rscomponentshade.RSTextFieldShade txtruc;
    // End of variables declaration//GEN-END:variables

   

   
}
