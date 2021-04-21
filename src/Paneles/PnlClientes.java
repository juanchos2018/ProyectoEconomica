/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paneles;

import Entidad.ClsClientes;
import Negocio.ClsNegCliente;
import Presentacion.Principal;
import javax.swing.table.DefaultTableModel;

public class PnlClientes extends javax.swing.JPanel {

   String []Titulos={"Dni","Nombre ","Apelkido","TEelfnoi","Direccion"};
    DefaultTableModel dtm=new DefaultTableModel(null,Titulos);
    
    
    ClsClientes objCliente;
    ClsNegCliente objNegCliente;
    public PnlClientes() {
        initComponents();
        objNegCliente= new ClsNegCliente();
        ListarRegistro();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnshdAgregar = new rscomponentshade.RSButtonShade();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProvedores = new javax.swing.JTable();
        txtfldshdFiltrarDatos = new rscomponentshade.RSTextFieldShade();

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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 440, Short.MAX_VALUE)
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 401, Short.MAX_VALUE)
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

        new ClsCambiarPanel(Principal.pnlPrincipalPaneles, new Paneles.PnlRegistrarCliente());
        //   frmPrincipal.lblInicio.setText("Registro de Nuevo Suministro");

    }//GEN-LAST:event_btnshdAgregarActionPerformed
  private void ListarRegistro() {
      
        Object fila[] = new Object[dtm.getColumnCount()];
        for(int i = 0; i < objNegCliente.CantidadRegistro(); i++){
            objCliente = objNegCliente.ObtenerRegistro(i);
            fila[0] = objCliente.getDni();
            fila[1] = objCliente.getNombre();
            fila[2] = objCliente.getApellido();
            fila[3] = objCliente.getTelefono();     
            fila[4] = objCliente.getDireccion();    
            dtm.addRow(fila);
        }
        tblProvedores.setModel(dtm);  
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private void tblProvedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProvedoresMouseClicked
        // MtdSeleccionarTablaManteniemto();

    }//GEN-LAST:event_tblProvedoresMouseClicked

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

    private void txtfldshdFiltrarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfldshdFiltrarDatosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfldshdFiltrarDatosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rscomponentshade.RSButtonShade btnshdAgregar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblProvedores;
    private rscomponentshade.RSTextFieldShade txtfldshdFiltrarDatos;
    // End of variables declaration//GEN-END:variables
}