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
        if (cantHoras==0) {
            cantHoras=1;
        }
      return cantHoras*Caja.VALOR_HORA_CAMIONETA;
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
