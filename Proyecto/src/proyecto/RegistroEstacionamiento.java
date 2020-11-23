/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/**
 *
 * @author Benjamin
 */
public class RegistroEstacionamiento {

    private final List<Camion> listaCamiones;
    private final List<Vehiculo> listaAutosCamionetas;
    private final List<Moto> listaMotos;
    private Vehiculo vehiculo;

    public RegistroEstacionamiento() {
        this.listaCamiones = new ArrayList<>();
        this.listaAutosCamionetas = new ArrayList<>();
        this.listaMotos = new ArrayList<>();
    }

    public boolean validarAutoCamioneta(Vehiculo vehiculo) {
        for (Vehiculo listaAutosCamioneta : listaAutosCamionetas) {
            if (listaAutosCamioneta.patente.equals(vehiculo.patente)) {
                return true;
            }
        }
        return false;
    }

    public boolean validarMoto(Moto moto) {
        for (Moto listaMoto : listaMotos) {
            if (listaMoto.patente.equals(moto.patente)) {
                return true;
            }
        }
        return false;
    }

    public boolean validarCamion(Camion camion) {
        for (Camion listaCamion : listaCamiones) {
            if (listaCamion.patente.equals(camion.patente)) {
                return true;
            }
        }
        return false;
    }

    public boolean ingresarAutoCamioneta(Vehiculo vehiculo) {
        return this.listaAutosCamionetas.add(vehiculo);
    }

    public boolean ingresarCamion(Camion camion) {
        return this.listaCamiones.add(camion);
    }

    public boolean ingresarMoto(Moto moto) {
        return this.listaMotos.add(moto);
    }

    public boolean retirarAutoCamioneta(Vehiculo vehiculo) {
        return this.listaAutosCamionetas.remove(vehiculo);
    }

    public boolean retirarCamion(Camion camion) {
        return this.listaCamiones.remove(camion);
    }

    public boolean retirarMoto(Moto moto) {
        return this.listaMotos.remove(moto);
    }

    public boolean disponibilidadVehiculos() {
        // true si hay disponibilidad
        //falso si no hay disponibilidad
        return listaAutosCamionetas.size() < Caja.LIMITE_AUTOS_CAMIONETAS;

    }

    public boolean disponibilidadCamion() {
        return listaCamiones.size() < Caja.LIMITE_CAMIONES;
    }

    public boolean disponibilidadMoto() {
        return listaMotos.size() < Caja.LIMITE_MOTOS;
    }

    public Calendar getCalendar(Date date) {
        Calendar cal = Calendar.getInstance(Locale.US);
        cal.setTime(date);
        return cal;
    }

    public void generarBoleta(Vehiculo vehiculo) {// se recibe el vehiculo, para sacarlo del sistema y generar la boleta
        Calendar a = getCalendar(vehiculo.getHoraIngreso());
        Calendar b = getCalendar(vehiculo.getHoraSalida());
        //System.out.println(a.toString()+"  "+b.toString());
        int diff_horas = (b.get(Calendar.HOUR_OF_DAY) - a.get(Calendar.HOUR_OF_DAY));
        int diff_minutos = b.get(Calendar.MINUTE) - a.get(Calendar.MINUTE);
        int minutos_diff = diff_horas * 60 + diff_minutos;
        System.out.println(diff_horas + "    " + diff_minutos + "   " + minutos_diff);
    }

}
