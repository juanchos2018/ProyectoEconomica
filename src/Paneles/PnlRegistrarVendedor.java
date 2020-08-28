/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paneles;

import Entidad.ClsVendedor;
import Negocio.ClsNegVendedor;
import Presentacion.Principal;
import javax.swing.JOptionPane;

public class PnlRegistrarVendedor extends javax.swing.JPanel {

    /**
     * Creates new form PnlRegistrarVendedor
     */
    public PnlRegistrarVendedor() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtcedula = new rscomponentshade.RSTextFieldShade();
        jLabel4 = new javax.swing.JLabel();
        txtnombres = new rscomponentshade.RSTextFieldShade();
        jLabel6 = new javax.swing.JLabel();
        txtaepellido = new rscomponentshade.RSTextFieldShade();
        txtcelular = new rscomponentshade.RSTextFieldShade();
        jLabel12 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cmbGenero = new javax.swing.JComboBox<>();
        btnshdRegistrar = new rscomponentshade.RSButtonShade();
        btnshdCancelar = new rscomponentshade.RSButtonShade();
        txtsuma = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("REGISTRAR VENDEDOR");

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Datos del Vendedor"));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 102));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Cedula");

        txtcedula.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtcedula.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtcedula.setPlaceholder("Ingrese Cedula");
        txtcedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcedulaKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 102));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Nombres:");

        txtnombres.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtnombres.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtnombres.setPlaceholder("Ingrese Nombres");
        txtnombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnombresKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 102));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Apellidos");

        txtaepellido.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtaepellido.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtaepellido.setPlaceholder("Ingrese Apellidos");
        txtaepellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtaepellidoKeyTyped(evt);
            }
        });

        txtcelular.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtcelular.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtcelular.setPlaceholder("Ingrese Celular");
        txtcelular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcelularKeyTyped(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 51, 102));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Celular:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 51, 102));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Sexo");

        cmbGenero.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmbGenero.setForeground(new java.awt.Color(0, 51, 102));
        cmbGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<<Seleccione>>", "Masculino", "Femenino" }));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtnombres, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
                            .addComponent(txtcedula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addComponent(txtaepellido, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel8))
                .addGap(32, 32, 32)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtcelular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbGenero, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtcedula, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtcelular, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel12))
                            .addComponent(jLabel5))
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jLabel4))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txtnombres, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(cmbGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(15, 15, 15)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtaepellido, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(105, Short.MAX_VALUE))
        );

        btnshdRegistrar.setBackground(new java.awt.Color(0, 51, 102));
        btnshdRegistrar.setText("Registrar");
        btnshdRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnshdRegistrarActionPerformed(evt);
            }
        });

        btnshdCancelar.setBackground(new java.awt.Color(0, 51, 102));
        btnshdCancelar.setText("Cancelar");
        btnshdCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnshdCancelarActionPerformed(evt);
            }
        });

        txtsuma.setText("jTextField1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(btnshdRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnshdCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(128, 128, 128))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(txtsuma, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(btnshdCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(btnshdRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(txtsuma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnshdRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnshdRegistrarActionPerformed
      
           
            String cedula=txtcedula.getText().toString();
            String nombre=txtnombres.getText().toString();
            String apellido=txtaepellido.getText().toString();
            String celular =txtcelular.getText().toString();
            String sexo =cmbGenero.getSelectedItem().toString();                    
            
             int suma=0; 
             int resta=9;
             int[] arrayCoeficientes= {2,1,2,1,2,1,2,1,2};
             boolean mayoradiez=false;  
             int immediataSuperior=0;
             int digidio1=0;
             int sumaresultado=0;
             int total=0; 
             int ultimodigito=0;
             
            int cantidad=txtcedula.getText().length();
            if (cantidad<9  || cantidad>9 ) {
              JOptionPane.showMessageDialog(null, "cedula incorrecta","alto",1);
              return;
            }
                             
         int cantidadcelular=txtcelular.getText().length();
            if (cantidadcelular<10  || cantidadcelular>10 ) {
              JOptionPane.showMessageDialog(null, "Telefono incorrecta","alto",1);
              return;
            }
            
            String ced=txtcedula.getText().toString();           
          
            int[] arrayint = new int[cantidad];
             int[] arrayResultado = new int[cantidad];
            
           for(int i = 0; i < cantidad; i++){
              //  array[i] = String.valueOf(ced.charAt(i));                
                arrayint[i]=Integer.parseInt(String.valueOf(ced.charAt(i)));      
                
           }
                               
            for (int i = 0; i < arrayint.length; i++) {
                int multi=0;
                multi=arrayint[i] * arrayCoeficientes[i];
                arrayResultado[i] = arrayint[i] * arrayCoeficientes[i];
                if (multi>=10) {
                    mayoradiez=true;
                }
            }
                 
       
        for (int i = 0; i < arrayint.length; i++) {                        
                System.out.println(arrayResultado[i]);  
                suma+=arrayint[i];                
              sumaresultado+=arrayResultado[i];
           }
          
        if (mayoradiez) {
             total=sumaresultado-resta;
         }
        else{
            total =sumaresultado;
        }
        
     
        String numeros =String.valueOf(total);      
        immediataSuperior=total+10;                 
        char n =numeros.charAt(1);
        digidio1=Integer.parseInt(String.valueOf(n));
        immediataSuperior=immediataSuperior-digidio1;       
        ultimodigito=immediataSuperior-total;                 
     
        
//        StringBuilder myName = new StringBuilder(ced);
//        String u =String.valueOf("12"+ultimodigito);
//        
//        char v=u.charAt(2);
//        myName.setCharAt(8, v);
//        System.out.println(myName);
                    
        String nuevocedula =String.valueOf(ced)+String.valueOf(ultimodigito);
     //    txtsuma.setText(""+ suma +","+total  +"," + n+"," +immediataSuperior+", " +  nuevocedula);  
      txtsuma.setVisible(false);
     
         Registrar(nuevocedula,nombre,apellido,celular,sexo);   
            
    }//GEN-LAST:event_btnshdRegistrarActionPerformed

    private void btnshdCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnshdCancelarActionPerformed
        new ClsCambiarPanel(Principal.pnlPrincipalPaneles, new Paneles.PnlVendedor());
          Principal.lblInicio.setText("Gestión Vendedor");
    }//GEN-LAST:event_btnshdCancelarActionPerformed

    private void txtcedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcedulaKeyTyped
        
        char validar =evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo Numeros", "No", 1);
            
        }
    }//GEN-LAST:event_txtcedulaKeyTyped

    private void txtnombresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombresKeyTyped
        // TODO add your handling code here:
        
        char validar=evt.getKeyChar();
        if (Character.isDigit(validar)) {
            getToolkit().beep();
            evt.consume();
             JOptionPane.showMessageDialog(null, "Solo Letras", "No", 1);
            
        }
    }//GEN-LAST:event_txtnombresKeyTyped

    private void txtaepellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtaepellidoKeyTyped
        // TODO add your handling code here:
         char validar=evt.getKeyChar();
        if (Character.isDigit(validar)) {
            getToolkit().beep();
            evt.consume();
             JOptionPane.showMessageDialog(null, "Solo Letras", "No", 1);
            
        }
    }//GEN-LAST:event_txtaepellidoKeyTyped

    private void txtcelularKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcelularKeyTyped
        // TODO add your handling code here:
        
         char validar =evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo Numeros", "No", 1);
            
        }
    }//GEN-LAST:event_txtcelularKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rscomponentshade.RSButtonShade btnshdCancelar;
    private rscomponentshade.RSButtonShade btnshdRegistrar;
    private javax.swing.JComboBox<String> cmbGenero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel5;
    private rscomponentshade.RSTextFieldShade txtaepellido;
    private rscomponentshade.RSTextFieldShade txtcedula;
    private rscomponentshade.RSTextFieldShade txtcelular;
    private rscomponentshade.RSTextFieldShade txtnombres;
    private javax.swing.JTextField txtsuma;
    // End of variables declaration//GEN-END:variables

    private void Registrar(String cedula, String nombre, String apellido, String celular, String sexo) {
        
        ClsVendedor  o = new ClsVendedor();
        ClsNegVendedor ob = new  ClsNegVendedor();
        
        if (ob.Existe(cedula)) {
            
            JOptionPane.showMessageDialog(null, "existe", "Existe vendedor", 1);
        }
        else{
            
            o.setCedula(cedula);
            o.setNombre(nombre);
            o.setApellido(apellido);
            o.setCelular(celular);
            o.setGenero(sexo);
            ob.Registar(o);
            
             JOptionPane.showMessageDialog(null, "Registrado", "Registado Vendedor", 1);
        }
        
       //To change body of generated methods, choose Tools | Templates.
    }
}
