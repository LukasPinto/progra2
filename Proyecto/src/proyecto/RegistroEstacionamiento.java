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
    private int cantBoletasCamiones;
    private final List<Vehiculo> listaAutosCamionetas;
    private int cantBoletasAutosCamionetas;
    private final List<Moto> listaMotos;
    private int cantBoletasMotos;
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

    public void generarBoletaAutoCamionetas(Vehiculo vehiculo) {// se recibe el vehiculo, para sacarlo del sistema y generar la boleta
        int horasContabilizadas;
        Calendar a = getCalendar(vehiculo.getHoraIngreso());
        Calendar b = getCalendar(vehiculo.getHoraSalida());
        //System.out.println(a.toString()+"  "+b.toString());
        int diff_horas = (b.get(Calendar.HOUR_OF_DAY) - a.get(Calendar.HOUR_OF_DAY));
        int diff_minutos = b.get(Calendar.MINUTE) - a.get(Calendar.MINUTE);
        int minutos_diff = diff_horas * 60 + diff_minutos;
        System.out.println(diff_horas + "    " + diff_minutos + "   " + minutos_diff);
        minutos_diff = minutos_diff - 10;// se descuentas los primeros 10 min gratis
        System.out.println(minutos_diff);
        horasContabilizadas = (int) (minutos_diff / 60);// Se toman en cuenta las exactas que estuvo para el calculo
        if (vehiculo instanceof Auto) {
            System.out.println("Patente: " + listaAutosCamionetas.get(listaAutosCamionetas.indexOf(vehiculo)).patente + " marca: " + listaAutosCamionetas.get(listaAutosCamionetas.indexOf(vehiculo)).Marca + " modelo" + listaAutosCamionetas.get(listaAutosCamionetas.indexOf(vehiculo)).modelo);
            System.out.println("hora de entrada: " + listaAutosCamionetas.get(listaAutosCamionetas.indexOf(vehiculo)).horaIngreso);
            System.out.println("hora de salida: " + listaAutosCamionetas.get(listaAutosCamionetas.indexOf(vehiculo)).horaSalida);
            System.out.println("Tiempo de estadia: " + diff_horas + "h " + diff_minutos + "m");
            System.out.println("Valor hora: " + Caja.VALOR_HORA_AUTO);
            System.out.println("Valor horas totales : " + listaAutosCamionetas.get(listaAutosCamionetas.indexOf(vehiculo)).calcularPrecio(horasContabilizadas));
            System.out.println("Iva                 : " + listaAutosCamionetas.get(listaAutosCamionetas.indexOf(vehiculo)).obtenerIVA(horasContabilizadas));
            System.out.println("Descuento           : " + listaAutosCamionetas.get(listaAutosCamionetas.indexOf(vehiculo)).calcularDescuento(horasContabilizadas) + " (" + Caja.DESC_MIN + "x" + (int) (diff_horas / 0.5) + ")");
            System.out.println("A pagar             : " + listaAutosCamionetas.get(listaAutosCamionetas.indexOf(vehiculo)).obtenerTotal(horasContabilizadas));
        } else {
            System.out.println("Patente: " + listaAutosCamionetas.get(listaAutosCamionetas.indexOf(vehiculo)).patente + " marca: " + listaAutosCamionetas.get(listaAutosCamionetas.indexOf(vehiculo)).Marca + " modelo" + listaAutosCamionetas.get(listaAutosCamionetas.indexOf(vehiculo)).modelo);
            System.out.println("hora de entrada: " + listaAutosCamionetas.get(listaAutosCamionetas.indexOf(vehiculo)).horaIngreso);
            System.out.println("hora de salida: " + listaAutosCamionetas.get(listaAutosCamionetas.indexOf(vehiculo)).horaSalida);
            System.out.println("Tiempo de estadia: " + diff_horas + "h " + diff_minutos + "m");
            System.out.println("Valor hora: " + Caja.VALOR_HORA_AUTO);
            System.out.println("Valor horas totales : " + listaAutosCamionetas.get(listaAutosCamionetas.indexOf(vehiculo)).calcularPrecio(horasContabilizadas));
            System.out.println("Iva                 : " + listaAutosCamionetas.get(listaAutosCamionetas.indexOf(vehiculo)).obtenerIVA(horasContabilizadas));
            System.out.println("Descuento           : " + listaAutosCamionetas.get(listaAutosCamionetas.indexOf(vehiculo)).calcularDescuento(horasContabilizadas) + " (" + Caja.DESC_MIN + "x" + (int) (diff_horas / 0.5) + ")");
            System.out.println("A pagar             : " + listaAutosCamionetas.get(listaAutosCamionetas.indexOf(vehiculo)).obtenerTotal(horasContabilizadas));

        }

    }

    public void generarBoletaCamion(Camion camion) {// se recibe el vehiculo, para sacarlo del sistema y generar la boleta
        int horasContabilizadas;
        Calendar a = getCalendar(camion.getHoraIngreso());
        Calendar b = getCalendar(camion.getHoraSalida());
        //System.out.println(a.toString()+"  "+b.toString());
        int diff_horas = (b.get(Calendar.HOUR_OF_DAY) - a.get(Calendar.HOUR_OF_DAY));
        int diff_minutos = b.get(Calendar.MINUTE) - a.get(Calendar.MINUTE);
        int minutos_diff = diff_horas * 60 + diff_minutos;
        System.out.println(diff_horas + "    " + diff_minutos + "   " + minutos_diff);
        minutos_diff = minutos_diff - 10;// se descuentas los primeros 10 min gratis
        System.out.println(minutos_diff);
        horasContabilizadas = (int) (minutos_diff / 60);// Se toman en cuenta las exactas que estuvo para el calculo
        System.out.println("Patente: " + listaCamiones.get(listaCamiones.indexOf(camion)).patente + " marca: " + listaCamiones.get(listaCamiones.indexOf(camion)).Marca + " modelo" + listaCamiones.get(listaCamiones.indexOf(camion)).modelo);
        System.out.println("hora de entrada: " + listaCamiones.get(listaCamiones.indexOf(camion)).horaIngreso);
        System.out.println("hora de salida: " + listaCamiones.get(listaCamiones.indexOf(camion)).horaSalida);
        System.out.println("Tiempo de estadia: " + diff_horas + "h " + diff_minutos + "m");
        System.out.println("Valor hora: " + Caja.VALOR_HORA_AUTO);
        System.out.println("Valor horas totales : " + listaCamiones.get(listaCamiones.indexOf(camion)).calcularPrecio(horasContabilizadas));
        System.out.println("Iva                 : " + listaCamiones.get(listaCamiones.indexOf(camion)).obtenerIVA(horasContabilizadas));
        System.out.println("Descuento           : " + listaCamiones.get(listaCamiones.indexOf(camion)).calcularDescuento(horasContabilizadas) + " (" + Caja.DESC_MIN + "x" + (int) (diff_horas / 0.5) + ")");
        System.out.println("A pagar             : " + listaCamiones.get(listaCamiones.indexOf(camion)).obtenerTotal(horasContabilizadas));

    }
    public void generarBoletaMotos(Moto moto) {// se recibe el vehiculo, para sacarlo del sistema y generar la boleta
        int horasContabilizadas;
        Calendar a = getCalendar(moto.getHoraIngreso());
        Calendar b = getCalendar(moto.getHoraSalida());
        //System.out.println(a.toString()+"  "+b.toString());
        int diff_horas = (b.get(Calendar.HOUR_OF_DAY) - a.get(Calendar.HOUR_OF_DAY));
        int diff_minutos = b.get(Calendar.MINUTE) - a.get(Calendar.MINUTE);
        int minutos_diff = diff_horas * 60 + diff_minutos;
        System.out.println(diff_horas + "    " + diff_minutos + "   " + minutos_diff);
        minutos_diff = minutos_diff - 10;// se descuentas los primeros 10 min gratis
        System.out.println(minutos_diff);
        horasContabilizadas = (int) (minutos_diff / 60);// Se toman en cuenta las exactas que estuvo para el calculo
        System.out.println("Patente: " + listaMotos.get(listaMotos.indexOf(moto)).patente + " marca: " + listaMotos.get(listaMotos.indexOf(moto)).Marca + " modelo" + listaMotos.get(listaMotos.indexOf(moto)).modelo);
        System.out.println("hora de entrada: " + listaMotos.get(listaMotos.indexOf(moto)).horaIngreso);
        System.out.println("hora de salida: " + listaMotos.get(listaMotos.indexOf(moto)).horaSalida);
        System.out.println("Tiempo de estadia: " + diff_horas + "h " + diff_minutos + "m");
        System.out.println("Valor hora: " + Caja.VALOR_HORA_AUTO);
        System.out.println("Valor horas totales : " + listaMotos.get(listaMotos.indexOf(moto)).calcularPrecio(horasContabilizadas));
        System.out.println("Iva                 : " + listaMotos.get(listaMotos.indexOf(moto)).obtenerIVA(horasContabilizadas));
        System.out.println("Descuento           : " + listaMotos.get(listaMotos.indexOf(moto)).calcularDescuento(horasContabilizadas) + " (" + Caja.DESC_MIN + "x" + (int) (diff_horas / 0.5) + ")");
        System.out.println("A pagar             : " + listaMotos.get(listaMotos.indexOf(moto)).obtenerTotal(horasContabilizadas));

    }
    

}
