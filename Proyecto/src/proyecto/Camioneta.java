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
    public int calcularDescuento(int cantHoras) {
        double porcentajeDesc = (cantHoras / 0.5) * Caja.DESC_MIN;
        if (cantHoras == 0) {
            cantHoras = 1;
            return (int) ((calcularPrecio(cantHoras) + obtenerIVA(cantHoras)) * porcentajeDesc);
        } else if (cantHoras < 0) {
            cantHoras = 0;
            return (int) ((calcularPrecio(cantHoras) + obtenerIVA(cantHoras)) * porcentajeDesc);
        } else {
            return (int) ((calcularPrecio(cantHoras) + obtenerIVA(cantHoras)) * porcentajeDesc);

        }
    }

    @Override
    public int obtenerIVA(int cantHoras) {
        if (cantHoras == 0) {
            cantHoras = 1;
            return (int) (calcularPrecio(cantHoras) * Caja.IVA);
        }else if(cantHoras<0){
            cantHoras=0;
            return (int) (calcularPrecio(cantHoras) * Caja.IVA);
        }
        else{
            return (int) (calcularPrecio(cantHoras) * Caja.IVA);
        }
        
    }

    @Override
    public int obtenerTotal(int cantHoras) {
        if (cantHoras == 0) {
            cantHoras = 1;
            return calcularPrecio(cantHoras) + obtenerIVA(cantHoras) - calcularDescuento(cantHoras);
        }
        else if (cantHoras<0) {
            cantHoras = 0;
            return calcularPrecio(cantHoras) + obtenerIVA(cantHoras) - calcularDescuento(cantHoras);
        }
        else{
            return calcularPrecio(cantHoras) + obtenerIVA(cantHoras) - calcularDescuento(cantHoras);
        }
        
    }
    
}
