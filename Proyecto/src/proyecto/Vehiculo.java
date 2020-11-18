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
public abstract class Vehiculo implements Caja{

    protected String patente;
    protected String Marca;
    protected String modelo;
    protected boolean trabajador;//si es un vehiculo de un trabajador no se le cobra

    //contructores
    public Vehiculo() {
    }

    public Vehiculo(String patente, String Marca, String modelo, boolean trabajador) {
        this.patente = patente;
        this.Marca = Marca;
        this.modelo = modelo;
        this.trabajador = trabajador;
    }

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

    public boolean isTrabajador() {
        return trabajador;
    }

    public void setTrabajador(boolean trabajador) {
        this.trabajador = trabajador;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "patente=" + patente + ", Marca=" + Marca + ", modelo=" + modelo + ", trabajador=" + trabajador + '}';
    }
    
    public abstract int calcularPrecio();

    
}
