/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.ConsultasCuidador;
import Model.Cuidador;

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
    
}
