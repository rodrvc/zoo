/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import static Controller.ControllerCuidador.AgregarCuidadores;
import static Controller.ControllerCuidador.devolverCuidadores;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author silve
 */
public class ConsultasCuidador extends Conexion {
    private static ArrayList<Cuidador> listaBase = new ArrayList<Cuidador>();  // base de todas las arrays/
    
    public boolean inicioSesion(Cuidador c){
        PreparedStatement ps = null ; 
        ResultSet rs = null ;
        Connection con = getConexion();
      
        String sql = "SELECT nombre FROM cuidador Where correo = ? and password = ? " ;
        
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, c.getCorreo());
            ps.setString(2, c.getPassword());
            
            rs = ps.executeQuery(); 
            
            if (rs.next()) {
                c.setNombre(rs.getString("nombre"));
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
    
    
    public ArrayList cargarTablaCuidadoresDesdeSql() {//se encargar de manipular la listaBase
        listaBase.removeAll(listaBase);
        
        PreparedStatement ps = null ; 
        ResultSet rs = null ;
        Connection con = getConexion();
      
        String sql = "SELECT runCuidador , nombre , correo FROM cuidador " ;
    
        
        try {
            
            ps = con.prepareStatement(sql);
  
            rs = ps.executeQuery(); 
            
            
            while (rs.next()) {  
                Cuidador c = new Cuidador();
                c.setRut(rs.getString(1));
                c.setNombre(rs.getString(2));
                c.setCorreo(rs.getString(3));
                listaBase.add(c);
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
       return listaBase;
    }
    
    
    public void AgregarCuidador(Cuidador c ){
        PreparedStatement ps = null ; 
        
        Connection con = getConexion();
       
        
      
        

        
         try {
            String sql = "insert into cuidador values(?, ?, ?, ?, ?)";
            CallableStatement cs = con.prepareCall(sql);
            cs.setString(1, c.getRut());
            cs.setString(2, c.getNombre());
            cs.setString(3, c.getApellido());
            cs.setString(4, c.getCorreo());
            cs.setString(5, c.getPassword());
            
            
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
