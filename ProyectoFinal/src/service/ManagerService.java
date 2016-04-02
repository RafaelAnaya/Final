/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dao.espec.ManagerDaoEspec;
import dao.impl.ManagerDaoImpl;

/**
 *
 * @author RAFAEL
 */
public class ManagerService {
    private ManagerDaoEspec managerDao;
    public ManagerService(){
    managerDao = new ManagerDaoImpl();
    
    }
    public void procesoIngNotas(double Parcial_1, double Parcial_2, double Cuaderno, double Prom_Tar, double Ex_Final, String DNI, String Codigo){
    if(DNI==null || DNI.isEmpty()){
    throw new RuntimeException(" DNI no es correcto");
    }
    if(Codigo==null || Codigo.isEmpty()){
    throw new RuntimeException("Codigo no es correcto");
    }
    if(Parcial_1<=0.0){
    throw new RuntimeException("Error, numero no valido");
    }
    if(Parcial_2<=0.0){
    throw new RuntimeException("Error, numero no valido");
    }
    if(Cuaderno<=0.0){
    throw new RuntimeException("Error, numero no valido");
    }
    if(Prom_Tar<=0.0){
    throw new RuntimeException("Error, numero no valido");
    }
    if(Ex_Final<=0.0){
    throw new RuntimeException("Error, numero no valido");
    }
    
    managerDao.procesoIngNotas(Parcial_1, Parcial_2, Cuaderno, Prom_Tar, Ex_Final, DNI, Codigo);
    }
    
}
