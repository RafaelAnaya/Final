/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import accesoDB1.ConexionDB;
import dao.espec.CursosDaoEspec;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author RAFAEL
 */
public class CursoDaoImpl implements CursosDaoEspec{

    @Override
    public void procesoIngCursos(String Codigo, String Nom_Curso, double Costo) {
        Connection cn = null;
        try{
        cn = ConexionDB.getConnection();
        cn.setAutoCommit(false);
        //Ingresar Datos
        
        String sql = "insert into Curso(Codigo, Nom_Curso,"
                + " Costo) values(?,?,?)";
            PreparedStatement pstm= cn.prepareStatement(sql);
            pstm.setString(1, Codigo);
            pstm.setString(2, Nom_Curso);
            pstm.setDouble(3, Costo);
            pstm.executeUpdate();
            pstm.close();
            
            //Confirmando transaccion
            cn.commit();
            
        }catch (SQLException e){
       try{
           cn.rollback();
       } catch(Exception e1){
       
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
        }catch (Exception e){
        }
        }
    }
    
}
