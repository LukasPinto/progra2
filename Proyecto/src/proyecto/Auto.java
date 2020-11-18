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
    public int calcularPrecio() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int calcularDescuento() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int obtenerIVA() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int obtenerTotal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
