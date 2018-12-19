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
import java.util.ArrayList;

/**
 *
 * @author silve
 */
public class ConsultasSector extends Conexion{
        public static ArrayList<Sector> listaBaseDeSectores = new ArrayList<Sector>();
    
        public ArrayList cargarTablaSectoresDesdeSql() {//se encargar de manipular la listaBase
        listaBaseDeSectores.removeAll(listaBaseDeSectores);
        
        PreparedStatement ps = null ; 
        ResultSet rs = null ;
        Connection con = getConexion();
      
        String sql = "SELECT * FROM sector " ;
        
        
        try {
            
            ps = con.prepareStatement(sql);
  
            rs = ps.executeQuery(); 
            
            
            while (rs.next()) {  
                Sector s = new Sector();
                s.setIdSector(rs.getString(1));
                s.setNombreSector(rs.getString(2));
                listaBaseDeSectores.add(s);
            }
            
        } catch (SQLException e) {
            System.err.print(e);
    
        }finally {
                try {
                    con.close();
            } catch (SQLException e) {
                System.err.println(e);             
            }
        } 
       return listaBaseDeSectores;
    }
}
