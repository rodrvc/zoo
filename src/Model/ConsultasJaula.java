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
public class ConsultasJaula extends Conexion{
    public static ArrayList<Jaula> ListaBaseJaulas = new ArrayList<Jaula>();
    
    public ArrayList cargarTablaJaulaDesdeSql() {//se encargar de manipular la listaBase
        
        ListaBaseJaulas.removeAll(ListaBaseJaulas);
        
        PreparedStatement ps = null ; 
        ResultSet rs = null ;
        Connection con = getConexion();
      
        String sql = "SELECT * FROM jaula " ;
    
        
        try {
            
            ps = con.prepareStatement(sql);
  
            rs = ps.executeQuery(); 
            
            
            while (rs.next()) {  
                Jaula j = new Jaula();
                j.setIdJaula(rs.getString(1));
                j.setIdTipoJuala(rs.getString(2));
                j.setTamanio(rs.getString(3));
                 j.setIdSector(rs.getString(4));
                j.setIdcapacidad(rs.getString(5));
               
                ListaBaseJaulas.add(j);
                
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
       return ListaBaseJaulas;
    }
    
    
    
}
