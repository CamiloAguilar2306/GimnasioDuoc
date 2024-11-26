/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package User;

import bd.Conexion;

/**
 *
 * @author Cetecom
 */
public class socio {
    private int rut;
    private String nombre;
    private int fechaNacimiento;
    private String direccion;
    private String membresiaActiva;

public socio() {
        
        Conexion cx;
        cx = new Conexion();
 
    
        
    }
 public class conectar{
     

 }

    public socio(int rut, String nombre, int fechaNacimiento, String direccion, String membresiaActiva) {
        this.rut = rut;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
        this.membresiaActiva = membresiaActiva;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(int fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getMembresiaActiva() {
        return membresiaActiva;
    }

    public void setMembresiaActiva(String membresiaActiva) {
        this.membresiaActiva = membresiaActiva;
    }
 

}
