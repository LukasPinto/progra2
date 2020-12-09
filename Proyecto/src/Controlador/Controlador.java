/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Vehiculo;
import Modelo.Auto;
import Modelo.Moto;
import Modelo.Camion;
import Modelo.Camioneta;
import Modelo.RegistroEstacionamiento;
import Modelo.ArchivoEstacionamiento;
import Modelo.Caja;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Benjamin
 */
public class Controlador {
    private static List<Vehiculo> lista;

    public Controlador() {
        lista = new ArrayList<>();
    }
    
    public static boolean agregar(Vehiculo vehiculo) {
        return lista.add(vehiculo);
    }
    public static List<Vehiculo> getLista() {
        return lista;
    }
    
    public static boolean eliminar(int patente) {
        for (Vehiculo vehiculo : lista) {
            if (vehiculo.getPatente() == patente) {
                return lista.remove(vehiculo);
            }
        }
        return false;
    }
}
