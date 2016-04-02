/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dao.espec.CursosDaoEspec;
import dao.impl.CursoDaoImpl;

/**
 *
 * @author RAFAEL
 */
public class CursoService {
    private CursosDaoEspec cursoDao;
    public CursoService(){
    cursoDao = new CursoDaoImpl();
    }

   
    public void procesoIngCurso(String Codigo,String Nom_Curso,double Costo){
    if(Codigo == null || Codigo.isEmpty()){
    throw new RuntimeException("El codigo no es el valido");
    }
    if(Nom_Curso == null || Nom_Curso.isEmpty()){
    throw new RuntimeException("El codigo no es el valido");
    }
    if(Costo<=0.0){
    throw new RuntimeException("Error, numero no valido");
    }
    cursoDao.procesoIngCursos(Codigo, Nom_Curso, Costo);
    }
    
    
}
