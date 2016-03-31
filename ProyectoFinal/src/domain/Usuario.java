/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author RAFAEL
 */
public class Usuario {
    
    private String Dni_u; 			
    private String Nombre;			
    private String ApePaterno;		
    private String Cuenta;			
    private String Clave;
    
    public Usuario(){
    
    }

    /**
     * @return the dni_u
     */
    public String getDni_u() {
        return Dni_u;
    }

    /**
     * @param dni_u the dni_u to set
     */
    public void setDni_u(String dni_u) {
        this.Dni_u = dni_u;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    /**
     * @return the apePaterno
     */
    public String getApePaterno() {
        return ApePaterno;
    }

    /**
     * @param apePaterno the apePaterno to set
     */
    public void setApePaterno(String apePaterno) {
        this.ApePaterno = apePaterno;
    }

    /**
     * @return the cuenta
     */
    public String getCuenta() {
        return Cuenta;
    }

    /**
     * @param cuenta the cuenta to set
     */
    public void setCuenta(String cuenta) {
        this.Cuenta = cuenta;
    }

    /**
     * @return the clave
     */
    public String getClave() {
        return Clave;
    }

    /**
     * @param clave the clave to set
     */
    public void setClave(String clave) {
        this.Clave = clave;
    }

}
