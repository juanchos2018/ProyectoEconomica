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
public class ClsDetalleBoleta {
    
    String  SerieBoleta;
    String  NumeroBoleta;
    String idproducto;
    String descripcion;
    double precio;
    int cantidad;
    double subtotal;
    String idcliente;
    String nombrecliente;

    public String getSerieBoleta() {
        return SerieBoleta;
    }

    public void setSerieBoleta(String SerieBoleta) {
        this.SerieBoleta = SerieBoleta;
    }

    public String getNumeroBoleta() {
        return NumeroBoleta;
    }

    public void setNumeroBoleta(String NumeroBoleta) {
        this.NumeroBoleta = NumeroBoleta;
    }

    public String getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(String idproducto) {
        this.idproducto = idproducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public String getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(String idcliente) {
        this.idcliente = idcliente;
    }

    public String getNombrecliente() {
        return nombrecliente;
    }

    public void setNombrecliente(String nombrecliente) {
        this.nombrecliente = nombrecliente;
    }
    
    

}
