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
