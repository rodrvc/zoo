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
      
        String sql = "SELECT * FROM animal order by idJaula asc" ;
    
        
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
            String sql = "insert into animal values( ?,?, ?, ?,?)";
            CallableStatement cs = con.prepareCall(sql);
            cs.setString(1, a.getIdAnimal());
            cs.setString(2, a.getNombre());
            cs.setString(3, a.getSexo());
            cs.setInt(4, Integer.parseInt(a.getIdTIpo()));
            cs.setInt(5,Integer.parseInt(a.getIdJaula()));
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
    
    public int cargarCantidadDeAnimalesHervivoros() {//se encargar de manipular la listaBase

        PreparedStatement ps = null ; 
        ResultSet rs = null ;
        Connection con = getConexion();
        int resultado = 0 ;
      
        String sql = "select count(*) from tipoanimal where idTipo between 1 and 9 and tipo is not null;" ;
    
        
        try {
            
            ps = con.prepareStatement(sql);
  
            rs = ps.executeQuery(); 
            
            
            while (rs.next()) {  
                 int a;
                a = rs.getInt(1);
               
               
           
                resultado = a ; 
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
       return resultado;
       
    }
    
    public int cargarCantidadDeAnimalesCarnivoros() {//se encargar de manipular la listaBase

        PreparedStatement ps = null ; 
        ResultSet rs = null ;
        Connection con = getConexion();
        int resultado = 0 ;
      
        String sql = "select count(*) from tipoanimal where idTipo between 10 and 19 and tipo is not null;" ;
    
        
        try {
            
            ps = con.prepareStatement(sql);
  
            rs = ps.executeQuery(); 
            
            
            while (rs.next()) {  
                 int a;
                a = rs.getInt(1);
               
               
           
                resultado = a ; 
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
   
       return resultado;
       
    }
    
    public int cargarCantidadDeAnimalesObnivoros() {//se encargar de manipular la listaBase

        PreparedStatement ps = null ; 
        ResultSet rs = null ;
        Connection con = getConexion();
        int resultado = 0 ;
      
        String sql = "select count(*) from tipoanimal where idTipo between 30 and 39 and tipo is not null;" ;
    
        
        try {
            
            ps = con.prepareStatement(sql);
  
            rs = ps.executeQuery(); 
            
            
            while (rs.next()) {  
                 int a;
                a = rs.getInt(1);
               
               
           
                resultado = a ; 
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

       return resultado;
       
    }
    
    public int cargarCantidadDeAnimales() {//se encargar de manipular la listaBase

        PreparedStatement ps = null ; 
        ResultSet rs = null ;
        Connection con = getConexion();
        int resultado = 0 ;
      
        String sql = "select count(*) from tipoanimal where tipo is not null;" ;
    
        
        try {
            
            ps = con.prepareStatement(sql);
  
            rs = ps.executeQuery(); 
            
            
            while (rs.next()) {  
                 int a;
                a = rs.getInt(1);
               
               
           
                resultado = a ; 
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
      
       return resultado;
       
    }
    
    
    
}
