/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import accesoDB1.ConexionDB;
import java.sql.Connection;

/**
 *
 * @author RAFAEL
 */
public class Prueba1 {
    public static void main(String[] args) {
        try{
        Connection cn = ConexionDB.getConnection();
            System.out.println("Conexion OK");
            cn.close();
        }catch(Exception e){
            System.err.println(e.getMessage());
        
        }
    }
    
}
