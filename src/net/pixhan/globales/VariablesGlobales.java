/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.pixhan.globales;

/**
 *
 * Autor: Victor Matías <vitomany@reproducir.net>
 * Fecha: 12/04/2016 
 * Hora: 12:33:03 AM
 * Web: https://reproducir.net
 */

public class VariablesGlobales {

    private String negocioBD = null;
    private String negocioUser = null;
    private String negocioPass = null;
    private String negocioHost = null;
    private String seguridadBD = null;
    private String seguridadUser = null;
    private String seguridadPass = null;
    private String seguridadHost = null;

    public VariablesGlobales(){
    
    }
    
    public VariablesGlobales( String negocioBD,String negocioUser, String negocioPass,
                                String negocioHost, String seguridadBD, String seguridadUser,
                                String seguridadPass,String seguridadHost) {

        this.negocioBD = negocioBD;
        this.negocioUser = negocioUser;
        this.negocioPass = negocioPass;
        this.negocioHost = negocioHost;
        this.seguridadBD = seguridadBD;
        this.seguridadUser = seguridadUser;
        this.seguridadPass = seguridadPass;
        this.seguridadHost = seguridadHost;
    }

    
    /**
     * @return the negocioBD
     */
    public String getNegocioBD() {
        return negocioBD;
    }

    /**
     * @param negocioBD the negocioBD to set
     */
    public void setNegocioBD(String negocioBD) {
        this.negocioBD = negocioBD;
    }

    /**
     * @return the negocioUser
     */
    public String getNegocioUser() {
        return negocioUser;
    }

    /**
     * @param negocioUser the negocioUser to set
     */
    public void setNegocioUser(String negocioUser) {
        this.negocioUser = negocioUser;
    }

    /**
     * @return the negocioPass
     */
    public String getNegocioPass() {
        return negocioPass;
    }

    /**
     * @param negocioPass the negocioPass to set
     */
    public void setNegocioPass(String negocioPass) {
        this.negocioPass = negocioPass;
    }

    /**
     * @return the negocioHost
     */
    public String getNegocioHost() {
        return negocioHost;
    }

    /**
     * @param negocioHost the negocioHost to set
     */
    public void setNegocioHost(String negocioHost) {
        this.negocioHost = negocioHost;
    }

    /**
     * @return the seguridadBD
     */
    public String getSeguridadBD() {
        return seguridadBD;
    }

    /**
     * @param seguridadBD the seguridadBD to set
     */
    public void setSeguridadBD(String seguridadBD) {
        this.seguridadBD = seguridadBD;
    }

    /**
     * @return the seguridadUser
     */
    public String getSeguridadUser() {
        return seguridadUser;
    }

    /**
     * @param seguridadUser the seguridadUser to set
     */
    public void setSeguridadUser(String seguridadUser) {
        this.seguridadUser = seguridadUser;
    }

    /**
     * @return the seguridadPass
     */
    public String getSeguridadPass() {
        return seguridadPass;
    }

    /**
     * @param seguridadPass the seguridadPass to set
     */
    public void setSeguridadPass(String seguridadPass) {
        this.seguridadPass = seguridadPass;
    }

    /**
     * @return the seguridadHost
     */
    public String getSeguridadHost() {
        return seguridadHost;
    }

    /**
     * @param seguridadHost the seguridadHost to set
     */
    public void setSeguridadHost(String seguridadHost) {
        this.seguridadHost = seguridadHost;
    }
        
}
