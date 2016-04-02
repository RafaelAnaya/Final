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
public class Cursos {
    private String Codigo;
    private String Nom_Curso;
    private double Costo;
    
    public Cursos(){
    
    }

    /**
     * @return the Codigo
     */
    public String getCodigo() {
        return Codigo;
    }

    /**
     * @param Codigo the Codigo to set
     */
    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    /**
     * @return the Nom_Curso
     */
    public String getNom_Curso() {
        return Nom_Curso;
    }

    /**
     * @param Nom_Curso the Nom_Curso to set
     */
    public void setNom_Curso(String Nom_Curso) {
        this.Nom_Curso = Nom_Curso;
    }

    /**
     * @return the Costo
     */
    public double getCosto() {
        return Costo;
    }

    /**
     * @param Costo the Costo to set
     */
    public void setCosto(double Costo) {
        this.Costo = Costo;
    }
    
}
