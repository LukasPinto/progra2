/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

/**
 *
 * @author Lukas
 */
public class Vehiculo {

    private String patente;
    private String Marca;
    private String modelo;
    private Persona propietario;

    //contructores
    public Vehiculo() {
    }

    public Vehiculo(String patente, String Marca, String modelo, Persona propietario) {
        this.patente = patente;
        this.Marca = Marca;
        this.modelo = modelo;
        this.propietario = propietario;
    }

    //getters y setters 
    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Persona getPropietario() {
        return propietario;
    }

    public void setPropietario(Persona propietario) {
        this.propietario = propietario;
    }

    //customers
}
