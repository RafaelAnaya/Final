/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import service.CursoService;

/**
 *
 * @author RAFAEL
 */
public class CursoController {
    private CursoService cursoService;
    public CursoController(){
    cursoService = new CursoService();
    } 
    public void procesoIngCurso(String Codigo,String Nom_Curso,double Costo){
    cursoService.procesoIngCurso(Codigo, Nom_Curso, Costo);
    }
}
