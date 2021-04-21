/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Entidad.ClsClientes;
import Entidad.ClsProducto;
import static Paneles.PnlRegistrarProveedor.contador;
import Presentacion.Principal;

public class ClsNegProducto {
       public void Registar(ClsProducto o) {        
        Principal.listaProductos.add(o);        
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public boolean Existe(String id) {                
        boolean exite_pro=false;
        for (ClsProducto item :  Principal.listaProductos) {         
            if (id.equals(item.getIdproducto())) {
                exite_pro=true;
                return exite_pro;
            }
            else{
                exite_pro=false;
          }
        }
        return exite_pro;
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public int CantidadRegistro() {
         return  Principal.listaProductos.size();
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }     
     public ClsProducto ObtenerRegistro(int  i){
        return (ClsProducto)Principal.listaProductos.get(i);
    }
     
     public ClsProducto Registro(ClsProducto o){
         ClsProducto objeto = new ClsProducto();
         for (ClsProducto item : Principal.listaProductos) {
             if (o.getIdproducto().equals(item.getIdproducto())) {
                 objeto.setIdproducto(item.getIdproducto());
                 objeto.setDescripcion(item.getDescripcion());
                 objeto.setPrecio(item.getPrecio());
                break;
             }
         }
         return objeto;
     }
     
//      for(int i = 0; i < objNegVendedor.CantidadRegistro(); i++)
//            {
//            objVendedor = objNegVendedor.ObtenerRegistro(i);
//            cedulas[i]=objVendedor.getDni();
//            contador++;
//            combomdel.addElement(objVendedor.getNombre()+" "+objVendedor.getApellido());                
//            
//           }  
}
