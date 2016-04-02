/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import domain.Usuario;
import service.ManagerService;
import util.Memoria;

/**
 *
 * @author RAFAEL
 */
public class NotasController {
    private ManagerService managerService;
    public NotasController(){
    managerService = new ManagerService();
    }
   public void  procesoIngNota(double Parcial_1, double Parcial_2, double Cuaderno, double Prom_Tar, double Ex_Final, String DNI, String Codigo){
   managerService.procesoIngNotas(Parcial_1, Parcial_2, Cuaderno, Prom_Tar, Ex_Final, DNI, Codigo );
   }
    
}