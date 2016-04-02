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
public class Alumno {
private String DNI;
private String Nombre;	
private String ApePaterno;
private String ApeMaterno;
private String Direccion;
private String Telefono;

public Alumno(){
}

    /**
     * @return the DNI
     */
    public String getDNI() {
        return DNI;
    }

    /**
     * @param DNI the DNI to set
     */
    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    /**
     * @return the Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * @return the ApePaterno
     */
    public String getApePaterno() {
        return ApePaterno;
    }

    /**
     * @param ApePaterno the ApePaterno to set
     */
    public void setApePaterno(String ApePaterno) {
        this.ApePaterno = ApePaterno;
    }

    /**
     * @return the ApeMaterno
     */
    public String getApeMaterno() {
        return ApeMaterno;
    }

    /**
     * @param ApeMaterno the ApeMaterno to set
     */
    public void setApeMaterno(String ApeMaterno) {
        this.ApeMaterno = ApeMaterno;
    }

    /**
     * @return the Direccion
     */
    public String getDireccion() {
        return Direccion;
    }

    /**
     * @param Direccion the Direccion to set
     */
    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    /**
     * @return the Telefono
     */
    public String getTelefono() {
        return Telefono;
    }

    /**
     * @param Telefono the Telefono to set
     */
    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }
}
