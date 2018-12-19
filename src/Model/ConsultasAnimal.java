/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author silve
 */
public class ConsultasAnimal extends Conexion{
    public static ArrayList<Animal> listaBaseAnimal = new ArrayList<Animal>();
    
    
    
    
    
    public ArrayList cargarTablaAnimalesDesdeSql() {//se encargar de manipular la listaBase
        listaBaseAnimal.removeAll(listaBaseAnimal);
        
        PreparedStatement ps = null ; 
        ResultSet rs = null ;
        Connection con = getConexion();
      
        String sql = "SELECT * FROM animal " ;
    
        
        try {
            
            ps = con.prepareStatement(sql);
  
            rs = ps.executeQuery(); 
            
            
            while (rs.next()) {  
                Animal a = new Animal();
                a.setIdAnimal(rs.getString(1));
                a.setNombre(rs.getString(2));
                a.setSexo(rs.getString(3));
                a.setIdTIpo(rs.getString(4));
                a.setIdJaula(rs.getString(5));
               
           
                listaBaseAnimal.add(a);
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
       return listaBaseAnimal;
    }
    
    
    
    
    public void agregarAnimal(Animal a){
       
        PreparedStatement ps = null ; 
        
        Connection con = getConexion();
       
        
         try {
            String sql = "insert into cuidador values(?, ?, ?, ?, ?)";
            CallableStatement cs = con.prepareCall(sql);
            cs.setString(1, a.getIdAnimal());
            cs.setString(2, a.getNombre());
            cs.setString(3, a.getSexo());
            cs.setString(4, a.getIdTIpo());
            cs.setString(5, a.getIdJaula());
            //podria agregar peso// 
            
            cs.executeUpdate(); 
            
        } catch (SQLException e) {
            System.err.print(e);
      
        }finally {
                try {
                    con.close();
            } catch (SQLException e) {
                System.err.println(e);             
            }
        } 
    }
}
