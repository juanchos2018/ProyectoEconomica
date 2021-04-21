/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.util.Date;


public class ClsBoleta {
    
    String  SerieBoleta;
    String  NumeroBoleta;
    String DniCliente;
    String NombreCliente;
    Date FechaBoleta;
    double total;

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

    public String getDniCliente() {
        return DniCliente;
    }

    public void setDniCliente(String DniCliente) {
        this.DniCliente = DniCliente;
    }

    public String getNombreCliente() {
        return NombreCliente;
    }

    public void setNombreCliente(String NombreCliente) {
        this.NombreCliente = NombreCliente;
    }

    public Date getFechaBoleta() {
        return FechaBoleta;
    }

    public void setFechaBoleta(Date FechaBoleta) {
        this.FechaBoleta = FechaBoleta;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    
    
}
