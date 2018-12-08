/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Administrador;
import Model.ConsultasAdministrador;

/**
 *
 * @author silve
 */
public class ControllerAdministrativo {
    public static String iniciarSesionAdministrativo(String user, String pass){
        ConsultasAdministrador conA = new ConsultasAdministrador(); 
        
        Administrador a = new Administrador(); 
        a.setCorreo(user);
        a.setRutAdministrador(pass);
        
        if(conA.inicioSesion(a)){
            return a.getNombre();
        }else{
            return null; 
        }
    } 
}
