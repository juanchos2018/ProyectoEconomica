/*

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Entidad.ClsVendedor;
import Interface.Metodos;
import Presentacion.Principal;

/**
 *
 * @author usuario
 */
public class ClsNegVendedor implements Metodos {

    @Override
    public void Registar(ClsVendedor o) {
    
        Principal.listaVendedor.add(o);                
        
    }

    @Override
    public boolean Existe(String cedula) {
        
        boolean exite_cedula=false;
        for (ClsVendedor item :  Principal.listaVendedor) {
         
            if (cedula.equals(item.getCedula())) {
                exite_cedula=true;
            }
            else{
            exite_cedula=false;
          }
        }
        return exite_cedula;
    }

    @Override
    public int CantidadRegistro() {
         return  Principal.listaVendedor.size();
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
 
     public ClsVendedor ObtenerRegistro(int i){
        return (ClsVendedor)Principal.listaVendedor.get(i);
    }

  
 
    
    
    
    
}
