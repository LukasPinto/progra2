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
    int VALOR_HORA_AUTO=2000;
    int VALOR_HORA_CAMIONETA=2100;
    int VALOR_HORA_MOTO=1500;
    int VALOR_HORA_CAMION=3000;
    int LIMITE_AUTOS_CAMIONETAS=250;
    int LIMITE_MOTOS=100;
    int LIMITE_CAMIONES=50;
    
    int calcularDescuento();
    public int obtenerIVA();
    public int obtenerTotal();
    
    
    
}