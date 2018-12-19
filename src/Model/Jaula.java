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
public class Jaula {
    private String idJaula;
    private String idTipoJuala; 
    private String tamanio;
    private String idSector;
    private String idcapacidad;
    
    
    public Jaula(){
    
    }

    public Jaula(String idJaula, String idTipoJuala, String tamanio, String idSector, String idcapacidad) {
        this.idJaula = idJaula;
        this.idTipoJuala = idTipoJuala;
        this.tamanio = tamanio;
        this.idSector = idSector;
        this.idcapacidad = idcapacidad;
    }

    public String getIdJaula() {
        return idJaula;
    }

    public void setIdJaula(String idJaula) {
        this.idJaula = idJaula;
    }

    public String getIdTipoJuala() {
        return idTipoJuala;
    }

    public void setIdTipoJuala(String idTipoJuala) {
        this.idTipoJuala = idTipoJuala;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public String getIdSector() {
        return idSector;
    }

    public void setIdSector(String idSector) {
        this.idSector = idSector;
    }

    public String getIdcapacidad() {
        return idcapacidad;
    }

    public void setIdcapacidad(String idcapacidad) {
        this.idcapacidad = idcapacidad;
    }
}
