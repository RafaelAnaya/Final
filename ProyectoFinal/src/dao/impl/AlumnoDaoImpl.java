/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import accesoDB1.ConexionDB;
import dao.espec.AlumnoDaoEspec;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author RAFAEL
 */
public class AlumnoDaoImpl implements AlumnoDaoEspec{

    @Override
    public void ProcesoIngAlumno(String DNI, String Nombre, String ApePaterno, String ApeMaterno, String Direccion, String Telefono) {
        
        Connection cn = null;
        try{
        cn = ConexionDB.getConnection();
        cn.setAutoCommit(false);
        
        //Ingresar nuevo alumno
        String sql ="insert into Alumno(DNI,Nombre,ApePaterno, "
                + "ApeMaterno,Direccion, Telefono) values(?,?,?,?,?,?)";
            PreparedStatement pstm = cn.prepareStatement(sql);
            pstm.setString(1, DNI);
            pstm.setString(2, Nombre);
            pstm.setString(3, ApePaterno);
            pstm.setString(4, ApeMaterno);
            pstm.setString(5, Direccion);
            pstm.setString(6, Telefono);
            pstm.executeUpdate();
            pstm.close();
            
            //Confirmar transaccion
            
            cn.commit();
            
        }catch(SQLException e){
        try{
        cn.rollback();
        }catch(Exception e1){
        }
        throw new RuntimeException(e.getMessage());
        
       }catch(Exception e){
       try{
       cn.rollback();
       }catch(Exception e1){
       }
       throw new RuntimeException("Error en el proceso, intentelo mas tarde");
       }finally{
        try{
        cn.close();
        }catch(Exception e){
        }
        }
    }
    
}
