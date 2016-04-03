/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import service.ProfesorService;

/**
 *
 * @author RAFAEL
 */
public class ProfesorController {
    private ProfesorService profesorService;
    public ProfesorController(){
    profesorService = new ProfesorService();
    }
    public void procesoIngProfesor(String DNI_P,String Nombre,String ApePaterno,String ApeMaterno,String Codigo){
    profesorService.ProcesoIngAlumno(DNI_P, Nombre, ApePaterno, ApeMaterno, Codigo);
    }
}
