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
public class Administrador {
    private String rutAdministrador;
    private String nombre;
    private String apellido;
    private String correo;

    public Administrador() {
    }

    public Administrador(String rutAdministrador, String nombre, String apellido, String correo) {
        this.rutAdministrador = rutAdministrador;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
    }

    public String getRutAdministrador() {
        return rutAdministrador;
    }

    public void setRutAdministrador(String rutAdministrador) {
        this.rutAdministrador = rutAdministrador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
