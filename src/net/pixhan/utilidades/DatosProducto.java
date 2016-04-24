/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.pixhan.utilidades;

/**
 *
 * Autor: Victor Matías <vitomany@reproducir.net>
 * Fecha: 21/04/2016 
 * Hora: 06:39:56 PM
 * Web: https://reproducir.net
 */

public class DatosProducto {

    private int cantidad;
    private int alerta;
    private float descuento;
    private float precio;
    private String nombreProducto;
    private String descripcion;

    public DatosProducto(int cantidad, int precio, int alerta, float descuento, String nombreProducto, String descripcion) {
        this.cantidad = cantidad;
        this.precio = precio;
        this.alerta = alerta;
        this.descuento = descuento;
        this.nombreProducto = nombreProducto;
        this.descripcion = descripcion;
    }
    
    public DatosProducto(int cantidad, float precio, float descuento, String nombreProducto ) {
        this.cantidad = cantidad;
        this.precio = precio;
        this.nombreProducto = nombreProducto;
        this.descuento = descuento;
    }

    /**
     * @return the cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @return the precio
     */
    public float getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(float precio) {
        this.precio = precio;
    }

    /**
     * @return the nombreProducto
     */
    public String getNombreProducto() {
        return nombreProducto;
    }

    /**
     * @param nombreProducto the nombreProducto to set
     */
    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    /**
     * @return the descuento
     */
    public float getDescuento() {
        return descuento;
    }

    /**
     * @param descuento the descuento to set
     */
    public void setDescuento(float descuento) {
        this.descuento = descuento;
    }

    /**
     * @return the alerta
     */
    public int getAlerta() {
        return alerta;
    }

    /**
     * @param alerta the alerta to set
     */
    public void setAlerta(int alerta) {
        this.alerta = alerta;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
