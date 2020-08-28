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
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author usuario
 */
public class PnlProveedores extends javax.swing.JPanel {

    
    ClsProveedor objProveedor;
    ClsNegProveedor objNegProveedor;
    
     String []Titulos={"Ruc","Razon Socual","Producto","Vendedor","Apellido","Contacto","Genero"};
    DefaultTableModel dtm=new DefaultTableModel(null,Titulos);
    
    public PnlProveedores() {
        initComponents();
        
          objNegProveedor=new ClsNegProveedor();
        ListarRegistro();
        
        
    }

     public String leerBusqueda(){
        String busca=txtfldshdFiltrarDatos.getText().trim().replace("", "");
        return busca;
    }
     
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnshdAgregar = new rscomponentshade.RSButtonShade();
        txtfldshdFiltrarDatos = new rscomponentshade.RSTextFieldShade();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProvedores = new javax.swing.JTable();

        btnshdAgregar.setBackground(new java.awt.Color(0, 51, 102));
        btnshdAgregar.setText("Agregar");
        btnshdAgregar.setBgHover(new java.awt.Color(204, 204, 204));
        btnshdAgregar.setBgShade(new java.awt.Color(0, 51, 102));
        btnshdAgregar.setBgShadeHover(new java.awt.Color(0, 51, 102));
        btnshdAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnshdAgregarActionPerformed(evt);
            }
        });

        txtfldshdFiltrarDatos.setForeground(new java.awt.Color(0, 51, 102));
        txtfldshdFiltrarDatos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtfldshdFiltrarDatos.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        txtfldshdFiltrarDatos.setPlaceholder("Filtrar Datos");
        txtfldshdFiltrarDatos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtfldshdFiltrarDatosKeyTyped(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnshdAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 482, Short.MAX_VALUE)
                        .addComponent(txtfldshdFiltrarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnshdAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtfldshdFiltrarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnshdAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnshdAgregarActionPerformed
        //        ClsCambiarPanel objCambiaPanel = new ClsCambiarPanel();
        //        objCambiaPanel.MtdCambiaPanel(frmPrincipal.pnlPrincipalPaneles, new Paneles.pnlRegistrarCliente());
        //        frmPrincipal.lblInicio.setText("Registro de Nuevo Cliente");
        

//        new ClsCambiarPanel(frmPrincipal.pnlPrincipalPaneles, new Paneles.pnlRegistrarCliente());
//        frmPrincipal.lblInicio.setText("Registro de Nuevo Cliente");



        //        frmPrincipal f = new frmPrincipal();
        //        pnlRegistrarCliente jpnale = new pnlRegistrarCliente();
        //
        //        f.meterPanel(jpnale);
        //        f.show();
        
         new ClsCambiarPanel(Principal.pnlPrincipalPaneles, new Paneles.PnlRegistrarProveedor());
     //   frmPrincipal.lblInicio.setText("Registro de Nuevo Suministro");
        

    }//GEN-LAST:event_btnshdAgregarActionPerformed

    private void tblProvedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProvedoresMouseClicked
       // MtdSeleccionarTablaManteniemto();
       
       
    }//GEN-LAST:event_tblProvedoresMouseClicked

     TableRowSorter trs;
    private void txtfldshdFiltrarDatosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfldshdFiltrarDatosKeyTyped
        // TODO add your handling code here:
        // TableRowSorter trs;
         txtfldshdFiltrarDatos.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent ke) {
                trs.setRowFilter(RowFilter.regexFilter("(?i)"+leerBusqueda(), 0,1,2,3)); //Filtra datos
            }
        });
        trs=new TableRowSorter(dtm);
        tblProvedores.setRowSorter(trs);
    }//GEN-LAST:event_txtfldshdFiltrarDatosKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rscomponentshade.RSButtonShade btnshdAgregar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblProvedores;
    private rscomponentshade.RSTextFieldShade txtfldshdFiltrarDatos;
    // End of variables declaration//GEN-END:variables

    private void ListarRegistro() {
      
         Object fila[] = new Object[dtm.getColumnCount()];
        for(int i = 0; i < objNegProveedor.CantidadRegistro(); i++){
            objProveedor = objNegProveedor.ObtenerRegistro(i);
            fila[0] = objProveedor.getRuc();
            fila[1] = objProveedor.getRazonsocial();
            fila[2] = objProveedor.getTipo();
            fila[3] = objProveedor.getVendedor();     
            fila[4] = objProveedor.getApellido_vendedor();
            fila[5] = objProveedor.getTelefono_vendedor();
            fila[6] = objProveedor.getGenero_vendedor();     
                  
            dtm.addRow(fila);
        }
        tblProvedores.setModel(dtm);  
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
