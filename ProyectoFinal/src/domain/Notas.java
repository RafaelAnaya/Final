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
public class Notas {
    private String DNI;
    private String Codigo;
    private double Parcial_1;
    private double Parcial_2;
    private double Cuaderno;
    private double Prom_Tar;
    private double Ex_Final;
    
    public Notas(){
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
     * @return the Parcial_1
     */
    public double getParcial_1() {
        return Parcial_1;
    }

    /**
     * @param Parcial_1 the Parcial_1 to set
     */
    public void setParcial_1(double Parcial_1) {
        this.Parcial_1 = Parcial_1;
    }

    /**
     * @return the Parcial_2
     */
    public double getParcial_2() {
        return Parcial_2;
    }

    /**
     * @param Parcial_2 the Parcial_2 to set
     */
    public void setParcial_2(double Parcial_2) {
        this.Parcial_2 = Parcial_2;
    }

    /**
     * @return the Cuaderno
     */
    public double getCuaderno() {
        return Cuaderno;
    }

    /**
     * @param Cuaderno the Cuaderno to set
     */
    public void setCuaderno(double Cuaderno) {
        this.Cuaderno = Cuaderno;
    }

    /**
     * @return the Prom_Tar
     */
    public double getProm_Tar() {
        return Prom_Tar;
    }

    /**
     * @param Prom_Tar the Prom_Tar to set
     */
    public void setProm_Tar(double Prom_Tar) {
        this.Prom_Tar = Prom_Tar;
    }

    /**
     * @return the Exam_Final
     */
    public double getEx_Final() {
        return Ex_Final;
    }

    /**
     * @param Exam_Final the Exam_Final to set
     */
    public void setEx_Final(double Ex_Final) {
        this.Ex_Final = Ex_Final;
    }
   
    
}
