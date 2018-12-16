/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.ConsultasCuidador;
import Model.Cuidador;
import java.util.ArrayList;

/**
 *
 * @author silve
 */
public class ControllerCuidador {
     
      
      public static String iniciarSesionCuidador(String user, String pass){
        ConsultasCuidador conA = new ConsultasCuidador(); 
        
        Cuidador a =  new Cuidador();
        a.setCorreo(user);
        a.setPassword(pass);
        
        if(conA.inicioSesion(a)){
            return a.getNombre();
        }else{
            return null; 
        }
    }
      
      public static void cargarLista(){
          
      }
      
      
      public static ArrayList devolverCuidadores(){ // conseguirArray
          ConsultasCuidador conA = new ConsultasCuidador(); 
          
          return conA.cargarTablaCuidadoresDesdeSql();
      }
      
      public static void AgregarCuidadores(String run , String nombre , String Apellido , String correo , String password){
          ConsultasCuidador conA = new ConsultasCuidador();
         
          Cuidador c = new Cuidador(run , nombre , Apellido , correo , password);
           
          conA.AgregarCuidador(c);
          conA.cargarTablaCuidadoresDesdeSql();
          
      }
    
}
