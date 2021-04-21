/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Entidad.ClsProveedor;
import Entidad.ClsVendedor;
import Interface.InterfaceProveedor;
import Presentacion.Principal;


public class ClsNegProveedor implements InterfaceProveedor {

    @Override
    public void Registar(ClsProveedor o) {
        
        Principal.listaProveedor.add(o);        
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean Existe(String ruc) {
                
        boolean exite_ruc=false;
        for (ClsProveedor item :  Principal.listaProveedor) {
         
            if (ruc.equals(item.getRuc())) {
                exite_ruc=true;
            }
            else{
            exite_ruc=false;
          }
        }
        return exite_ruc;
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int CantidadRegistro() {
        return  Principal.listaProveedor.size();
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
      public ClsProveedor ObtenerRegistro(int i){
        return (ClsProveedor)Principal.listaProveedor.get(i);
    }

    
}
