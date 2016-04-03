/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dao.espec.ProfesorDaoEspec;
import dao.impl.ProfesorDaoImpl;

/**
 *
 * @author RAFAEL
 */
public class ProfesorService {
     private ProfesorDaoEspec profesorDao;
    public ProfesorService(){
    profesorDao = new ProfesorDaoImpl();
    }
     public void ProcesoIngAlumno(String DNI_P, String Nombre, String ApePaterno, String ApeMaterno, String Codigo) {
     if(DNI_P == null || DNI_P.isEmpty()){
     throw new RuntimeException("DNI no es correcto");
     }
     if(Nombre == null || Nombre.isEmpty()){
     throw new RuntimeException("Nombre no es correcto");
     }
     if(ApePaterno == null || ApePaterno.isEmpty()){
     throw new RuntimeException("Apellido Paterno no es correcto");
     }
     if(ApeMaterno == null || ApeMaterno.isEmpty()){
     throw new RuntimeException("Apellido Materno no es correcto");
     }
     if(Codigo == null || Codigo.isEmpty()){
     throw new RuntimeException("Direccion no es correcta");
     }
    profesorDao.procesoIngProfesor(DNI_P, Nombre, ApePaterno, ApeMaterno, Codigo);
}
}
