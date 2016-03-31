/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import accesoDB1.ConexionDB;
import dao.espec.UsuarioDaoEspec;
import domain.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author RAFAEL
 */
public class UsuarioDaoImpl implements UsuarioDaoEspec{

    @Override
    public Usuario validar(String cuenta, String clave) {
        Usuario bean = null;
        Connection cn = null;
        try{
        cn = ConexionDB.getConnection();
        String sql = "select DNI_U, Nombre, ApePaterno, Cuenta "
                    + "from usuario "
                    + "where Cuenta = ? "
                    + "and Clave = ? ";
            PreparedStatement ptsm = cn.prepareStatement(sql);
            ptsm.setString(1, cuenta);
            ptsm.setString(2, clave);
            ResultSet rs = ptsm.executeQuery();
            if(rs.next()){
            bean = mapRow(rs);
            }
            rs.close();
            ptsm.close();
        }catch (SQLException e){
        throw new RuntimeException(e.getMessage());
        }catch (Exception e){
        throw new RuntimeException("Error  de acceso al servidor. ");
        }finally{
        try{
        cn.close();
        }catch(Exception e){
        
        }
        }
        
        return bean;
    }

    @Override
    public Usuario getForId(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Usuario> getForAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Usuario> getForCriteria(Usuario bean) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insert(Usuario bean) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Usuario bean) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private Usuario mapRow(ResultSet rs) throws SQLException {
        Usuario bean = new Usuario();
        bean.setDni_u(rs.getString("DNI_U"));
        bean.setNombre(rs.getString("Nombre"));
        bean.setApePaterno(rs.getString("ApePaterno"));
        bean.setCuenta(rs.getString("Cuenta"));
        return bean;
    }
    
}
