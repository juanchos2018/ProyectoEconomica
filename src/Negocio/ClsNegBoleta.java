/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Entidad.ClsBoleta;
import Entidad.ClsClientes;
import Presentacion.Principal;


public class ClsNegBoleta {
    
    
     public void Registar(ClsBoleta o) {
        
        Principal.listaBoletas.add(o);        
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     
      public int CantidadRegistro() {
         return  Principal.listaBoletas.size();
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
      public ClsBoleta ObtenerRegistro(int  i){
        return (ClsBoleta)Principal.listaBoletas.get(i);
    }
}
