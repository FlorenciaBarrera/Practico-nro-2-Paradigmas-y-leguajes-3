/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.edu.unlar.object;

import java.util.Date;

/**
 *
 * @author FlorBarrera
 */
public class Pedido {
    private Integer cantidad;
    private Date fecha;
    private String estado;

    public Pedido() {
    }

    public Pedido(Integer cantidad, Date fecha, String estado) {
        this.cantidad = cantidad;
        this.fecha = fecha;
        this.estado = estado;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
    
}
