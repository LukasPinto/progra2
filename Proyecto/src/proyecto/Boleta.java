
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.util.Date;

/**
 *
 * @author Lukas
 */
public class Boleta {

    private Date horaEntrada;
    private Date horaSalida;
    private int total;
    private int codigo;
    private int descuento;
    private boolean estado;
    private int fila;
    private int columna;//fila y columna son el lugar de estacionamiento
    /*private Vehiculo vehiculo*/;

    //constructores
    public Boleta() {
    }

    public Boleta(Date horaEntrada, Date horaSalida, int total, int codigo, int descuento, boolean estado, int fila, int columna) {
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
        this.total = total;
        this.codigo = codigo;
        this.descuento = descuento;
        this.estado = estado;
        this.fila = fila;
        this.columna = columna;
    }

    public Date getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(Date horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public Date getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(Date horaSalida) {
        this.horaSalida = horaSalida;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

    
    
}
