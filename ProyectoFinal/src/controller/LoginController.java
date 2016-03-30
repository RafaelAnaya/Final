/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import domain.Usuario;
import service.LoginService;
import util.Memoria;

/**
 *
 * @author RAFAEL
 */
public class LoginController {
    public void validar(String cuenta, String clave){
   LoginService service = new LoginService();
   Usuario bean = service.validar(cuenta, clave);
   Memoria.put("cuenta", bean);
   }
    
}
