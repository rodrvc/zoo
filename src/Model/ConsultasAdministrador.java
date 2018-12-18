/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
 * @author silve
 */
public class ConsultasAdministrador extends Conexion{
    public boolean inicioSesion(Administrador adm){
        PreparedStatement ps = null ; 
        ResultSet rs = null ;
        Connection con = getConexion();
      
        String sql = "SELECT nombre FROM administrador Where correo = ? and password = ? " ;
        
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, adm.getCorreo());
            ps.setString(2, adm.getRutAdministrador());
            
            rs = ps.executeQuery(); 
            
            if (rs.next()) {
                adm.setNombre(rs.getString("nombre"));
                return true; 
            }
            return  false ;
            
        } catch (SQLException e) {
            System.err.print(e);
            return false ;
        }finally {
                try {
                    con.close();
            } catch (SQLException e) {
                System.err.println(e);             
            }
        } 
    }
}
