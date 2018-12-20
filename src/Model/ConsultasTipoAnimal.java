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
public class ConsultasTipoAnimal extends Conexion{
    public static ArrayList<TipoAnimal> ListaBaseTipoAnimal= new ArrayList<TipoAnimal>();
    
    public ArrayList cargarTipoesSql() {//se encargar de manipular la listaBase
        
        ListaBaseTipoAnimal.removeAll(ListaBaseTipoAnimal);
        
        PreparedStatement ps = null ; 
        ResultSet rs = null ;
        Connection con = getConexion();
      
        String sql = "SELECT * FROM tipoAnimal" ;
    
        
        try {
            
            ps = con.prepareStatement(sql);
  
            rs = ps.executeQuery(); 
            
            
            while (rs.next()) {  
                TipoAnimal t = new TipoAnimal();
                t.setIdTipo(rs.getString(1));
                t.setTipo(rs.getString(2));
                ListaBaseTipoAnimal.add(t);
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
       return ListaBaseTipoAnimal;
    }
    
}
