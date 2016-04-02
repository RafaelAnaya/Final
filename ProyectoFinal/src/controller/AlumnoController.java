/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import service.AlumnoService;

/**
 *
 * @author RAFAEL
 */
public class AlumnoController {
    private AlumnoService alumnoService;
    public AlumnoController(){
    alumnoService = new AlumnoService();
    }
    public void procesoIngAlumno(String DNI, String Nombre, String ApePaterno, String ApeMaterno, String Direccion, String Telefono){
    alumnoService.ProcesoIngAlumno(DNI, Nombre, ApePaterno, ApeMaterno, Direccion, Telefono);
    }
    
}
