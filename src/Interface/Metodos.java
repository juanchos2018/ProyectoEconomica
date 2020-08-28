/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Entidad.ClsVendedor;

/**
 *
 * @author usuario
 */
public interface Metodos {
    
   public   void  Registar(ClsVendedor o);
   
   public boolean Existe(String cedula);
      
    public int CantidadRegistro();
      
  
    
}
