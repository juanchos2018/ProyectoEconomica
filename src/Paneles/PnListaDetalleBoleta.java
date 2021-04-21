/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paneles;

import Entidad.ClsDetalleBoleta;
import Negocio.ClsNegDetalleBoleta;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author usuario
 */
public class PnListaDetalleBoleta extends javax.swing.JPanel {

    String titulo[]= {"codigo","Descripcionm","precio","Cantidad","Sub"};      
    DefaultTableModel dtm=new DefaultTableModel(null,titulo);
    public PnListaDetalleBoleta(String serie,String numero) {
        initComponents();
        ListarDetalle(serie,numero);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblProvedores = new javax.swing.JTable();

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
                .addGap(0, 20, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 863, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tblProvedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProvedoresMouseClicked
        // MtdSeleccionarTablaManteniemto();
    }//GEN-LAST:event_tblProvedoresMouseClicked

    public void  ListarDetalle(String serie,String numero){
        ClsDetalleBoleta o  =  new ClsDetalleBoleta();     
        ClsNegDetalleBoleta ob = new  ClsNegDetalleBoleta();
         Object fila[] = new Object[dtm.getColumnCount()];
        for(int i = 0; i < ob.CantidadRegistro(); i++){
            o = ob.ObtenerRegistro(i);
            if (o.getSerieBoleta().equals(serie) && o.getNumeroBoleta().equals(numero)) {
                fila[0] = o.getIdproducto();
                fila[1] = o.getDescripcion();
                fila[2] = o.getPrecio();
                fila[3] = o.getCantidad();     
                fila[4] = o.getSubtotal();    
                dtm.addRow(fila);
            }
          
        }
        tblProvedores.setModel(dtm);  
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblProvedores;
    // End of variables declaration//GEN-END:variables
}
