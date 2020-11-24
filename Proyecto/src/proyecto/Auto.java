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
public class Auto extends Vehiculo{
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
        if (cantHoras==0) {
            cantHoras=1;
        }
      return cantHoras*Caja.VALOR_HORA_AUTO;
    }

    @Override
    public int calcularDescuento(int cantHoras) {
         if (cantHoras==0) {
            cantHoras=1;
        }
        double porcentajeDesc=(cantHoras/0.5)*Caja.DESC_MIN;
        
       return (int)((calcularPrecio(cantHoras)+obtenerIVA(cantHoras))*porcentajeDesc);
    }

    @Override
    public int obtenerIVA(int cantHoras) {
         if (cantHoras==0) {
            cantHoras=1;
        }
        return (int)(calcularPrecio(cantHoras)*Caja.IVA);
    }

    @Override
    public int obtenerTotal(int cantHoras) {
         if (cantHoras==0) {
            cantHoras=1;
        }
      return calcularPrecio(cantHoras)+obtenerIVA(cantHoras)-calcularDescuento(cantHoras);
    }

}
