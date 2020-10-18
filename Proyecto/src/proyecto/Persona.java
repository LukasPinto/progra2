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
    private Boleta boleta;

    public Persona() {
    }

    public Persona(String nombre, String codigo, Boleta boleta) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.boleta = boleta;
    }

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

    public Boleta getBoleta() {
        return boleta;
    }

    public void setBoleta(Boleta boleta) {
        this.boleta = boleta;
    }

    

}
