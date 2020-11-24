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
public class Camion extends Vehiculo {

    private String tipoCamion;
    private String tamanoCamion;

    public Camion() {
        super();
    }

    public Camion(String tipoCamion, String tamanoCamion, String patente, String Marca, String modelo, boolean trabajador) {
        super(patente, Marca, modelo, trabajador);
        this.tipoCamion = tipoCamion;
        this.tamanoCamion = tamanoCamion;
    }

   

   

    public String getTipoCamion() {
        return tipoCamion;
    }

    public void setTipoCamion(String tipoCamion) {
        this.tipoCamion = tipoCamion;
    }

  

  @Override
    public int calcularPrecio(int cantHoras) {
        if (cantHoras == 0) {
            cantHoras = 1;
            return cantHoras * Caja.VALOR_HORA_CAMION;
        } else if (cantHoras < 0) {//si estuvo -x minutos significa que estuvo menos de 10 minutos por lo tanto es gratis
            cantHoras = 0;
            return cantHoras * Caja.VALOR_HORA_CAMION;
        } else {
            return cantHoras * Caja.VALOR_HORA_CAMION;
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
