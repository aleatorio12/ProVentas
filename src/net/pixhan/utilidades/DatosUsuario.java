/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.pixhan.utilidades;

/**
 *
 * Autor: Victor Matías <vitomany@reproducir.net>
 * Fecha: 10/04/2016 
 * Hora: 01:28:55 AM
 * Web: https://reproducir.net
 */

public class DatosUsuario {
    
    private int usuario;
    private int rol;
    private String username;
    private String primerNombre;
    private String primerApellido;

    public DatosUsuario() {
    }
    
    public DatosUsuario(int usuario, int rol, String username, String primerNombre, String primerApellido) {
        this.usuario = usuario;
        this.rol = rol;
        this.username = username;
        this.primerNombre = primerNombre;
        this.primerApellido = primerApellido;
    }

    /**
     * @return the usuario
     */
    public int getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(int usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the rol
     */
    public int getRol() {
        return rol;
    }

    /**
     * @param rol the rol to set
     */
    public void setRol(int rol) {
        this.rol = rol;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the primerNombre
     */
    public String getPrimerNombre() {
        return primerNombre;
    }

    /**
     * @param primerNombre the primerNombre to set
     */
    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    /**
     * @return the primerApellido
     */
    public String getPrimerApellido() {
        return primerApellido;
    }

    /**
     * @param primerApellido the primerApellido to set
     */
    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }
    
}
