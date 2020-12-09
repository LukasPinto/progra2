/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Benjamin
 */
public class Camioneta extends Vehiculo{
    private String tipoCamioneta; // pickup, familiar

    public Camioneta() {
        super();
    }

    public Camioneta(String tipoCamioneta, String patente, String Marca, String modelo, boolean trabajador) {
        super(patente, Marca, modelo, trabajador);
        this.tipoCamioneta = tipoCamioneta;
    }

    public String getTipoCamioneta() {
        return tipoCamioneta;
    }

    public void setTipoCamioneta(String tipoCamioneta) {
        this.tipoCamioneta = tipoCamioneta;
    }

    @Override
    public int calcularPrecio(int cantHoras) {
        if (cantHoras == 0) {
            cantHoras = 1;
            return cantHoras * Caja.VALOR_HORA_CAMIONETA;
        } else if (cantHoras < 0) {//si estuvo -x minutos significa que estuvo menos de 10 minutos por lo tanto es gratis
            cantHoras = 0;
            return cantHoras * Caja.VALOR_HORA_CAMIONETA;
        } else {
            return cantHoras * Caja.VALOR_HORA_CAMIONETA;
        }

    }

    @Override
    public int calcularDescuento(int cantMinutos,int cantHoras) {
        int cantDescuentos = (int) Math.round(cantMinutos / 30);

        double porcentajeDesc = cantDescuentos * Caja.DESC_MIN;

        return (int) ((calcularPrecio(cantHoras) + obtenerIVA(cantHoras)) * porcentajeDesc);
    }

    @Override
    public int obtenerIVA(int cantHoras) {
        if (cantHoras == 0) {
            cantHoras = 1;
            return (int) (calcularPrecio(cantHoras) * Caja.IVA);
        } else if (cantHoras < 0) {
            cantHoras = 0;
            return (int) (calcularPrecio(cantHoras) * Caja.IVA);
        } else {
            return (int) (calcularPrecio(cantHoras) * Caja.IVA);
        }

    }

    @Override
    public int obtenerTotal(int cantMinutos,int cantHoras) {
        if (cantHoras == 0) {
            cantHoras = 1;
            return calcularPrecio(cantHoras) + obtenerIVA(cantHoras) - calcularDescuento(cantMinutos,cantHoras);
        } else if (cantHoras < 0) {
            cantHoras = 0;
            return calcularPrecio(cantHoras) + obtenerIVA(cantHoras) - calcularDescuento(cantMinutos,cantHoras);
        } else {
            return calcularPrecio(cantHoras) + obtenerIVA(cantHoras) - calcularDescuento(cantMinutos,cantHoras);
        }

    }
    
}
