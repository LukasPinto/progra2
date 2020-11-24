/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

/**
 *
 * @author Benjamin
 */
public class Moto extends Vehiculo{
    private String tipoMoto;

    public Moto() {
        super();
    }

    public Moto(String tipoMoto, String patente, String Marca, String modelo, boolean trabajador) {
        super(patente, Marca, modelo, trabajador);
        this.tipoMoto = tipoMoto;
    }

    public String getTipoMoto() {
        return tipoMoto;
    }

    public void setTipoMoto(String tipoMoto) {
        this.tipoMoto = tipoMoto;
    }
     @Override
    public int calcularPrecio(int cantHoras) {
        if (cantHoras == 0) {
            cantHoras = 1;
            return cantHoras * Caja.VALOR_HORA_MOTO;
        } else if (cantHoras < 0) {//si estuvo -x minutos significa que estuvo menos de 10 minutos por lo tanto es gratis
            cantHoras = 0;
            return cantHoras * Caja.VALOR_HORA_MOTO;
        } else {
            return cantHoras * Caja.VALOR_HORA_MOTO;
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
