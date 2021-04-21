/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paneles;

import Entidad.ClsBoleta;
import Entidad.ClsClientes;
import Negocio.ClsNegBoleta;
import Negocio.ClsNegCliente;
import Presentacion.Principal;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author usuario
 */
public class PnlListaBoletas extends javax.swing.JPanel {

       String []Titulos={"Serie","Numero ","Cliente","Total"};
    DefaultTableModel dtm=new DefaultTableModel(null,Titulos);
    
    
    ClsBoleta objBoleta;
    ClsNegBoleta objNeBoleta;
    public PnlListaBoletas() {
        initComponents();
        
        objNeBoleta= new ClsNegBoleta();
        ListarRegistro();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblProvedores = new javax.swing.JTable();
        txtfldshdFiltrarDatos = new rscomponentshade.RSTextFieldShade();
        btnCancelar = new rscomponentshade.RSButtonShade();

        jScrollPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jScrollPane1MouseClicked(evt);
            }
        });

        tblProvedores.setBackground(new java.awt.Color(0, 51, 102));
        tblProvedores.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tblProvedores.setForeground(new java.awt.Color(255, 255, 255));
        tblProvedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblProvedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProvedoresMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblProvedores);

        txtfldshdFiltrarDatos.setForeground(new java.awt.Color(0, 51, 102));
        txtfldshdFiltrarDatos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtfldshdFiltrarDatos.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        txtfldshdFiltrarDatos.setPlaceholder("Filtrar Datos");
        txtfldshdFiltrarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfldshdFiltrarDatosActionPerformed(evt);
            }
        });
        txtfldshdFiltrarDatos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtfldshdFiltrarDatosKeyTyped(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(6, 20, 51));
        btnCancelar.setText("Detalle");
        btnCancelar.setBgHover(new java.awt.Color(10, 36, 95));
        btnCancelar.setBgShade(new java.awt.Color(255, 255, 255));
        btnCancelar.setBgShadeHover(new java.awt.Color(242, 187, 10));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtfldshdFiltrarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(93, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtfldshdFiltrarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tblProvedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProvedoresMouseClicked
        // MtdSeleccionarTablaManteniemto();
        Selecionartabla();
    }//GEN-LAST:event_tblProvedoresMouseClicked

    private void txtfldshdFiltrarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfldshdFiltrarDatosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfldshdFiltrarDatosActionPerformed
 private void ListarRegistro() {
      
        Object fila[] = new Object[dtm.getColumnCount()];
        for(int i = 0; i < objNeBoleta.CantidadRegistro(); i++){
            objBoleta = objNeBoleta.ObtenerRegistro(i);
            fila[0] = objBoleta.getSerieBoleta();
            fila[1] = objBoleta.getNumeroBoleta();
            fila[2] = objBoleta.getNombreCliente();
            fila[3] = objBoleta.getTotal();     
          //  fila[4] = objCliente.getDireccion();    
            dtm.addRow(fila);
        }
        tblProvedores.setModel(dtm);  
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private void txtfldshdFiltrarDatosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfldshdFiltrarDatosKeyTyped
        // TODO add your handling code here:
        // TableRowSorter trs;
        //        txtfldshdFiltrarDatos.addKeyListener(new KeyAdapter() {
            //            @Override
            //            public void keyReleased(KeyEvent ke) {
                //                trs.setRowFilter(RowFilter.regexFilter("(?i)"+leerBusqueda(), 0,1,2,3)); //Filtra datos
                //            }
            //        });
    //        trs=new TableRowSorter(dtm);
    //        tblProvedores.setRowSorter(trs);
    }//GEN-LAST:event_txtfldshdFiltrarDatosKeyTyped

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:        
//           int rpta;
//       rpta=JOptionPane.showConfirmDialog(null,"¿Estas seguro de eliminar registro?","Eliminar registro",0);
//       if(rpta==0)
//       {
        if (!Serie.equals("") && !Numero.equals("")) {
            new ClsCambiarPanel(Principal.pnlPrincipalPaneles, new Paneles.PnListaDetalleBoleta(Serie,Numero));
        }
     //  }
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void jScrollPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane1MouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jScrollPane1MouseClicked
   int registro;
       // String codigo;
        String Serie;
        String Numero;
 void Selecionartabla()
     {
         DefaultTableModel dtm1=new DefaultTableModel();
         registro=tblProvedores.getSelectedRow();
         if(registro==-1)
         {
             JOptionPane.showMessageDialog(null,"Se debe selecionar regsitro","Tabla Usuario",0);
          }
         else{
             dtm1=(DefaultTableModel) tblProvedores.getModel();
             Serie=(String)dtm1.getValueAt(registro,0);
            Numero=(String)dtm1.getValueAt(registro,1);
           
            
         }
     }
     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rscomponentshade.RSButtonShade btnCancelar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblProvedores;
    private rscomponentshade.RSTextFieldShade txtfldshdFiltrarDatos;
    // End of variables declaration//GEN-END:variables
}
