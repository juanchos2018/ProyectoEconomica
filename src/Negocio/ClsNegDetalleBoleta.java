/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Entidad.ClsBoleta;
import Entidad.ClsDetalleBoleta;
import Presentacion.Principal;

/**
 *
 * @author usuario
 */
public class ClsNegDetalleBoleta {
        
     public void Registar(ClsDetalleBoleta o) {
        
        Principal.listaDetalleBoletas.add(o);        
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
         public int CantidadRegistro() {
         return  Principal.listaDetalleBoletas.size();
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
      public ClsDetalleBoleta ObtenerRegistro(int  i){
        return (ClsDetalleBoleta)Principal.listaDetalleBoletas.get(i);
    }
}
