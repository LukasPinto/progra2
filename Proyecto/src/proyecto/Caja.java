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
public interface Caja {

    public static final double IVA= 0.19;
    double DESC_MIN=0.05;
    int VALOR_HORA=2000;
    
    int calcularDescuento();
    public int obtenerIVA();
    public int obtenerTotal();
    
    
    
}
