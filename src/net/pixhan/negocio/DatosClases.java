/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.pixhan.negocio;

/**
 *
 * Autor: Victor Matías <vitomany@reproducir.net>
 * Fecha: 22/04/2016 
 * Hora: 04:07:44 PM
 * Web: https://reproducir.net
 */

public class DatosClases {
    
    private String nombreClase;
    private int idClase;

    public DatosClases(String nombreClase, int idClase) {
        this.nombreClase = nombreClase;
        this.idClase = idClase;
    }

    /**
     * @return the nombreClase
     */
    public String getNombreClase() {
        return nombreClase;
    }

    /**
     * @param nombreClase the nombreClase to set
     */
    public void setNombreClase(String nombreClase) {
        this.nombreClase = nombreClase;
    }

    /**
     * @return the idClase
     */
    public int getIdClase() {
        return idClase;
    }

    /**
     * @param idClase the idClase to set
     */
    public void setIdClase(int idClase) {
        this.idClase = idClase;
    }
    
}
