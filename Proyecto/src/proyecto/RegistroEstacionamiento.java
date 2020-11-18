/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Benjamin
 */
public class RegistroEstacionamiento {
    private List<Estacionamiento> listaEstacionamiento;
    // constructor
    public RegistroEstacionamiento() {
        listaEstacionamiento = new ArrayList<>();
    }
    // se añaden productos a la lista
    public boolean agregarVehiculo(Estacionamiento autoNuevo) {
        return listaEstacionamiento.add(autoNuevo);
    }
    
    public boolean validarVehiculo(String patente) {
        for (Estacionamiento vehiculo : listaEstacionamiento) {
            if (vehiculo.getPatente() == patente) {
                return true;
            }
        }
        return false;
    }
    public void listarVehiculos() {
        for (Estacionamiento vehiculo : listaEstacionamiento) {
            System.out.println(vehiculo.toString());
        }
    }
    
    
    
}
