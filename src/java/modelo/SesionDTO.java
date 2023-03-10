/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.Objects;

/**
 *
 * @author ESTUDIANTE
 */
public class SesionDTO {
    private String correo;
    private String clave;
    private String nombre;    
    private String telefono;


    public SesionDTO() {
    }

    public SesionDTO(String correo, String clave) {
        this.correo = correo;
        this.clave = clave;
    }

    public SesionDTO(String correo, String clave, String nombre, String telefono) {
        this.correo = correo;
        this.clave = clave;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    
    
    
    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
}
