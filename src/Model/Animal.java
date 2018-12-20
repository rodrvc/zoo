/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author silve
 */
public class Animal {
    private String idAnimal;
    private String nombre;
    private String sexo ;
    private String idTIpo;
    private String idJaula;

    public Animal(String idAnimal, String nombre, String sexo, String idTIpo, String idJaula) {
        this.idAnimal = idAnimal;
        this.nombre = nombre;
        this.sexo = sexo;
        this.idTIpo = idTIpo;
        this.idJaula = idJaula;
    }

    public Animal(String nombre, String sexo, String idTIpo, String idJaula) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.idTIpo = idTIpo;
        this.idJaula = idJaula;
    }
    
    
    
    

    public Animal() {
    }
    
    

    public String getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(String idAnimal) {
        this.idAnimal = idAnimal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getIdTIpo() {
        return idTIpo;
    }

    public void setIdTIpo(String idTIpo) {
        this.idTIpo = idTIpo;
    }

    public String getIdJaula() {
        return idJaula;
    }

    public void setIdJaula(String idJaula) {
        this.idJaula = idJaula;
    }
    
    

}
