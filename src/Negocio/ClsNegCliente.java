/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;


import Entidad.ClsClientes;
import Entidad.ClsProducto;
import Entidad.ClsProveedor;
import Entidad.ClsVendedor;

import Presentacion.Principal;

/**
 *
 * @author usuario
 */
public class ClsNegCliente {
    
    public void Registar(ClsClientes o) {
        
        Principal.listaClientes.add(o);        
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public boolean Existe(String ruc) {
                
        boolean exite_cliente=false;
        for (ClsClientes item :  Principal.listaClientes) {
         
            if (ruc.equals(item.getDni())) {
                exite_cliente=true;
            }
            else{
            exite_cliente=false;
          }
        }
        return exite_cliente;
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public int CantidadRegistro() {
         return  Principal.listaClientes.size();
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
 
     public ClsClientes ObtenerRegistro(int  i){
        return (ClsClientes)Principal.listaClientes.get(i);
    }

    public ClsClientes Registro(ClsClientes o){
         ClsClientes objeto = new ClsClientes();
         for (ClsClientes item : Principal.listaClientes) {
             if (o.getDni().equals(item.getDni())) {
                 objeto.setDni(item.getDni());
                 objeto.setNombre(item.getNombre());
                 objeto.setDireccion(item.getDireccion());
                break;
             }
         }
         return objeto;
     }
}
