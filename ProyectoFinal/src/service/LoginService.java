/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dao.espec.UsuarioDaoEspec;
import dao.impl.UsuarioDaoImpl;
import domain.Usuario;

/**
 *
 * @author RAFAEL
 */
public class LoginService {
    
    public Usuario validar (String cuenta, String clave){
    if(cuenta == null || cuenta.isEmpty()){
    throw new RuntimeException("Error, Datos incorrectos. ");
    }
    if(clave ==null || clave.isEmpty()){
    throw new RuntimeException("Error, datos incorrectos. ");
    }
    UsuarioDaoEspec dao= new UsuarioDaoImpl();
    Usuario bean = dao.validar(cuenta, clave);
    if(bean== null){
    throw new RuntimeException("Datos son incorrectos");
    }
         return bean;
    }
}
