/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

/**
 *
 * @author silve
 */
public class ControllerComidas {
   
    static int n = 100 ; 
    static Timer t ; 
    static ActionListener a;
    
    static int vegetales =  50;
    private static int Carnes = 30;
    private static int FrutosSecos =  90;
    private static int Agua = 20 ;
    
    public static int consumo(String peso){
        int consumo = 0 ; 
        if (peso.equals("grande")) 
        {
            consumo = 3 ; 
        } 
        else if(peso.equals("mediano"))
        {
            consumo = 2;
        }
        else consumo = 1 ; 
        return consumo;
    }
    
    
    public static void consumoDeComida(int consumo){
       a  = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                n = n-consumo ; 
            }
        };
       
        t = new Timer(4000, a);
        t.start();
    }
    
    public static int ObjenerVegetales(){
        return vegetales;
    }
    public static int ObtenerAgua(){
        return Agua;      
    }
    public static int ObtenerFrutosSecos(){
        return FrutosSecos;
    
    }
    public static int ObtenerCarnes(){
        return Carnes;
    }
    public static int ObjetenerAgua(){
        return Agua;
    }
    
    public static int CargarAlimentos(String ElegirAlimentoACargar ,  int cantidad){
        switch (ElegirAlimentoACargar) {
            case "Vegetales":
                if ((vegetales+cantidad)>100) {
                    return 0;
                }
                vegetales = vegetales + cantidad;
                return vegetales;
                
            case "Carnes":
                if ((Carnes+cantidad)>100) {
                    return 0;
                }
                Carnes = Carnes + cantidad;
                return Carnes;
                
            case "Frutos secos":
                if ((FrutosSecos+cantidad)>100) {
                    return 0;
                }
                FrutosSecos  = FrutosSecos + cantidad;
                return FrutosSecos;
                
            case "Agua":
                if ((Agua+cantidad)>100) {
                    return 0;
                }
                Agua = Agua + cantidad;
                return Agua;
            default:
                return 0;
        }
        
        
    }
}
