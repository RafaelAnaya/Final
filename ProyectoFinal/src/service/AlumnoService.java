/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dao.espec.AlumnoDaoEspec;
import dao.impl.AlumnoDaoImpl;

/**
 *
 * @author RAFAEL
 */
public class AlumnoService {
    private AlumnoDaoEspec alumnoDao;
    public AlumnoService(){
    alumnoDao = new AlumnoDaoImpl();
    }
     public void ProcesoIngAlumno(String DNI, String Nombre, String ApePaterno, String ApeMaterno, String Direccion, String Telefono) {
     if(DNI == null || DNI.isEmpty()){
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
     if(Direccion == null || Direccion.isEmpty()){
     throw new RuntimeException("Direccion no es correcta");
     }
     if(Telefono.length()>9  || Telefono.length()<9 && Telefono.length()>=1){
     throw new RuntimeException("El numero telefonico no es valido");
     }
alumnoDao.ProcesoIngAlumno(DNI, Nombre, ApePaterno, ApeMaterno, Direccion, Telefono);
}
}
