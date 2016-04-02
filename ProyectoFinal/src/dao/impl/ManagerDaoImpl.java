/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import accesoDB1.ConexionDB;
import dao.espec.ManagerDaoEspec;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author RAFAEL
 */
public class ManagerDaoImpl implements ManagerDaoEspec{

    @Override
    public void procesoIngNotas(double Parcial_1, double Parcial_2, double Cuaderno, double Prom_Tar, double Ex_Final, String DNI, String Codigo) {
        Connection cn = null;
        try{
        cn = ConexionDB.getConnection();
        cn.setAutoCommit(false);
        //Actualizar Notas
        String sql = "insert into Notas(Parcial_1,  Parcial_2, Cuaderno, "
                + "Prom_Tar, Ex_Final, DNI, Codigo) values(?,?,?,?,?,?,?)";
                PreparedStatement pstm = cn.prepareStatement(sql);
                pstm.setDouble(1, Parcial_1);
                pstm.setDouble(2, Parcial_2);
                pstm.setDouble(3, Cuaderno);
                pstm.setDouble(4, Prom_Tar);
                pstm.setDouble(5, Ex_Final);
                pstm.setString(6, DNI);
                pstm.setString(7, Codigo);
                pstm.executeUpdate();
                pstm.close();
                // Confirmar transaccion
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
