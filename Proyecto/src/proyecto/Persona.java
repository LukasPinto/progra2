/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

/**
 *
 * @author Raigou
 */
public class Persona {
    //atributos
    private String nombre;
    private String codigo;
    private Vehiculo vehiculo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Persona(String nombre, String codigo, Vehiculo vehiculo) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.vehiculo = vehiculo;
    }

    public Persona() {
        
    }  
}
