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
    private int precio;
    private float descuento;
    private String nombreProducto;


    public DatosProducto(int cantidad, int precio, float descuento, String nombreProducto) {
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
    public int getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(int precio) {
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
    


}
