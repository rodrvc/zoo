/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import static Controller.ControllerComidas.vegetales;
import Model.ConsultasAnimal;
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
    private static int Agua = 1000 ;
    
    public static int cantHervivoros;
    public static int cantCarnivoros;
    public static int cantOmnivoros;
    public static int cantAnimales;
    
    
    public static void actualizarCantidadAnimales(){
        cantHervivoros = ObtenerCantidadDeHervivores();
        cantCarnivoros = ObtenerCantidadDeCarnivores();
        cantOmnivoros = ObtenerCantidadDeOmnivoros();
        cantAnimales = ObtenerCantidadDeAnimales();
    }
    

    
      
    public static void comidaSeAcaba(){
        
       a  = new ActionListener(){
           
            @Override
            public void actionPerformed(ActionEvent e ) {
                if (vegetales > 0) {
                    vegetales = vegetales - cantAnimales; 
                }
                if (Carnes > 0) {
                    Carnes = Carnes - cantCarnivoros;
                }
                if (FrutosSecos > 0) {
                    FrutosSecos = FrutosSecos -cantOmnivoros;
                }
                if (Agua > 0) {
                    Agua = Agua - cantAnimales;
                }
            }
        };
       
      
        t = new Timer(3000, a);
        t.start();
    }
    
    
    
        public static int ObtenerCantidadDeHervivores(){
       ConsultasAnimal conA = new ConsultasAnimal();
       return conA.cargarCantidadDeAnimalesHervivoros();
    }
    
    public static int ObtenerCantidadDeCarnivores(){
       ConsultasAnimal conA = new ConsultasAnimal();
       return conA.cargarCantidadDeAnimalesCarnivoros();
    }
    public static int ObtenerCantidadDeOmnivoros(){
       ConsultasAnimal conA = new ConsultasAnimal();
       return conA.cargarCantidadDeAnimalesObnivoros();
    }
    public static int ObtenerCantidadDeAnimales(){
       ConsultasAnimal conA = new ConsultasAnimal();
       return conA.cargarCantidadDeAnimales();
    }
    
    
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
                if ((vegetales+cantidad)>700) {
                    return 0;
                }
                vegetales = vegetales + cantidad;
                return vegetales;
                
            case "Carnes":
                if ((Carnes+cantidad)>200) {
                    return 0;
                }
                Carnes = Carnes + cantidad;
                return Carnes;
                
            case "Frutos secos":
                if ((FrutosSecos+cantidad)>300) {
                    return 0;
                }
                FrutosSecos  = FrutosSecos + cantidad;
                return FrutosSecos;
                
            case "Agua":
                if ((Agua+cantidad)>1500) {
                    return 0;
                }
                Agua = Agua + cantidad;
                return Agua;
            default:
                return 0;
        }
        
        
    }
}
