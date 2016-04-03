/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import accesoDB1.ConexionDB;
import dao.espec.ProfesorDaoEspec;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author RAFAEL
 */
public class ProfesorDaoImpl implements ProfesorDaoEspec{

    @Override
    public void procesoIngProfesor(String DNI_P, String Nombre, String ApePaterno, String ApeMaterno, String Codigo) {
        
        Connection cn = null;
        try{
        cn = ConexionDB.getConnection();
        cn.setAutoCommit(false);
        
        //Ingresar nuevo alumno
        String sql ="insert into Profesor(DNI_P,Nombre,ApePaterno, "
                + "ApeMaterno,Codigo) values(?,?,?,?,?)";
            PreparedStatement pstm = cn.prepareStatement(sql);
            pstm.setString(1, DNI_P);
            pstm.setString(2, Nombre);
            pstm.setString(3, ApePaterno);
            pstm.setString(4, ApeMaterno);
            pstm.setString(5, Codigo);
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
