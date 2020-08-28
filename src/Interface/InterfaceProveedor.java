/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Entidad.ClsProveedor;
import Entidad.ClsVendedor;

/**
 *
 * @author usuario
 */
public interface InterfaceProveedor {
    
        
   public   void  Registar(ClsProveedor o);
   
   public boolean Existe(String ruc);
      
    public int CantidadRegistro();
}
