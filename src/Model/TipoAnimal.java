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
public class TipoAnimal {
    private String idTipo;
    private String tipo;

    public TipoAnimal(String idTipo, String tipo) {
        this.idTipo = idTipo;
        this.tipo = tipo;
    }

    public TipoAnimal() {
    }

    public String getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(String idTipo) {
        this.idTipo = idTipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
}
