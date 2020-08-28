/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author usuario
 */
public class ClsProveedor {
    
    String ruc;
    String razonsocial;
    String tipo;

    String cedula_vendedor;
    String vendedor;
    String apellido_vendedor;
    String telefono_vendedor;
    String genero_vendedor;
    
    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getRazonsocial() {
        return razonsocial;
    }

    public String getApellido_vendedor() {
        return apellido_vendedor;
    }

    public void setApellido_vendedor(String apellido_vendedor) {
        this.apellido_vendedor = apellido_vendedor;
    }

    public String getTelefono_vendedor() {
        return telefono_vendedor;
    }

    public void setTelefono_vendedor(String telefono_vendedor) {
        this.telefono_vendedor = telefono_vendedor;
    }

    public String getGenero_vendedor() {
        return genero_vendedor;
    }

    public void setGenero_vendedor(String genero_vendedor) {
        this.genero_vendedor = genero_vendedor;
    }

    public void setRazonsocial(String razonsocial) {
        this.razonsocial = razonsocial;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    public String getCedula_vendedor() {
        return cedula_vendedor;
    }

    public void setCedula_vendedor(String cedula_vendedor) {
        this.cedula_vendedor = cedula_vendedor;
    }
    
    
    
}
