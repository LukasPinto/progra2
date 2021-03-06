/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Lukas
 */
public class Auto extends Vehiculo {

    private String tipoDeAuto;//sedan, deportivo, de lujo

    public Auto() {
        super();
    }

    public Auto(String tipoDeAuto, String patente, String Marca, String modelo, boolean trabajador) {
        super(patente, Marca, modelo, trabajador);
        this.tipoDeAuto = tipoDeAuto;
    }

    public String getTipoDeAuto() {
        return tipoDeAuto;
    }

    public void setTipoDeAuto(String tipoDeAuto) {
        this.tipoDeAuto = tipoDeAuto;
    }

    @Override
    public int calcularPrecio(int cantHoras) {
        if (cantHoras == 0) {
            cantHoras = 1;
            return cantHoras * Caja.VALOR_HORA_AUTO;
        } else if (cantHoras < 0) {//si estuvo -x minutos significa que estuvo menos de 10 minutos por lo tanto es gratis
            cantHoras = 0;
            return cantHoras * Caja.VALOR_HORA_AUTO;
        } else {
            return cantHoras * Caja.VALOR_HORA_AUTO;
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
