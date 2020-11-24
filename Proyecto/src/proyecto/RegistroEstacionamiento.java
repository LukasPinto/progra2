/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.io.IOException;
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
    private int cantBoletasMotos;
    private int cantBoletasCamiones;
    private int cantBoletasAutosCamionetas;
    
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
        listaAutosCamionetas.get(listaAutosCamionetas.indexOf(vehiculo)).setHoraSalida(new Date(120, 10, 24, 23, 59, 59));
        Calendar a = getCalendar(vehiculo.getHoraIngreso());
        Calendar b = getCalendar(vehiculo.getHoraSalida());
        int horas = (b.get(Calendar.HOUR_OF_DAY) - a.get(Calendar.HOUR_OF_DAY));
        int minutos = b.get(Calendar.MINUTE) - a.get(Calendar.MINUTE);
        int minutosTotales = horas * 60 + minutos;
        ArchivoEstacionamiento n= new ArchivoEstacionamiento();
        
        minutosTotales = minutosTotales - 10;// se descuentas los primeros 10 min gratis
    
        horasContabilizadas = (int) (minutosTotales / 60);// Se toman en cuenta las exactas que estuvo para el calculo
        if (listaAutosCamionetas.get(listaAutosCamionetas.indexOf(vehiculo)).trabajador) {

            System.out.println("Patente: " + listaAutosCamionetas.get(listaAutosCamionetas.indexOf(vehiculo)).patente + " marca: " + listaAutosCamionetas.get(listaAutosCamionetas.indexOf(vehiculo)).Marca + " modelo: " + listaAutosCamionetas.get(listaAutosCamionetas.indexOf(vehiculo)).modelo);
            System.out.println("hora de entrada: " + listaAutosCamionetas.get(listaAutosCamionetas.indexOf(vehiculo)).horaIngreso);
            System.out.println("hora de salida: " + listaAutosCamionetas.get(listaAutosCamionetas.indexOf(vehiculo)).horaSalida);
            System.out.println("Tiempo de estadia: " + horas + "h " + minutos + "m");
            System.out.println("Auto perteneciente a trabjador");
            retirarAutoCamioneta(vehiculo);
        } else {
            if (vehiculo instanceof Auto) {
                System.out.println("Patente: " + listaAutosCamionetas.get(listaAutosCamionetas.indexOf(vehiculo)).patente + " marca: " + listaAutosCamionetas.get(listaAutosCamionetas.indexOf(vehiculo)).Marca + " modelo: " + listaAutosCamionetas.get(listaAutosCamionetas.indexOf(vehiculo)).modelo);
                System.out.println("hora de entrada: " + listaAutosCamionetas.get(listaAutosCamionetas.indexOf(vehiculo)).horaIngreso);
                System.out.println("hora de salida: " + listaAutosCamionetas.get(listaAutosCamionetas.indexOf(vehiculo)).horaSalida);
                System.out.println("Tiempo de estadia: " + horas + "h " + minutos + "m");
                System.out.println("Valor hora: " + Caja.VALOR_HORA_AUTO);
                System.out.println("Valor horas totales : " + listaAutosCamionetas.get(listaAutosCamionetas.indexOf(vehiculo)).calcularPrecio(horasContabilizadas));
                System.out.println("Iva                 : " + listaAutosCamionetas.get(listaAutosCamionetas.indexOf(vehiculo)).obtenerIVA(horasContabilizadas));
                System.out.println("Descuento           : " + listaAutosCamionetas.get(listaAutosCamionetas.indexOf(vehiculo)).calcularDescuento(minutosTotales,horasContabilizadas) + " (" + Caja.DESC_MIN + "x" + (int) (horas / 0.5) + ")");
                System.out.println("A pagar             : " + listaAutosCamionetas.get(listaAutosCamionetas.indexOf(vehiculo)).obtenerTotal(minutosTotales,horasContabilizadas));
            } else {
                System.out.println("Patente: " + listaAutosCamionetas.get(listaAutosCamionetas.indexOf(vehiculo)).patente + " marca: " + listaAutosCamionetas.get(listaAutosCamionetas.indexOf(vehiculo)).Marca + " modelo: " + listaAutosCamionetas.get(listaAutosCamionetas.indexOf(vehiculo)).modelo);
                System.out.println("hora de entrada: " + listaAutosCamionetas.get(listaAutosCamionetas.indexOf(vehiculo)).horaIngreso);
                System.out.println("hora de salida: " + listaAutosCamionetas.get(listaAutosCamionetas.indexOf(vehiculo)).horaSalida);
                System.out.println("Tiempo de estadia: " + horas + "h " + minutos + "m");
                System.out.println("Valor hora: " + Caja.VALOR_HORA_CAMIONETA);
                System.out.println("Valor horas totales : " + listaAutosCamionetas.get(listaAutosCamionetas.indexOf(vehiculo)).calcularPrecio(horasContabilizadas));
                System.out.println("Iva                 : " + listaAutosCamionetas.get(listaAutosCamionetas.indexOf(vehiculo)).obtenerIVA(horasContabilizadas));
                System.out.println("Descuento           : " + listaAutosCamionetas.get(listaAutosCamionetas.indexOf(vehiculo)).calcularDescuento(minutosTotales,horasContabilizadas) + " (" + Caja.DESC_MIN + "x" + (int) (horas / 0.5) + ")");
                System.out.println("A pagar             : " + listaAutosCamionetas.get(listaAutosCamionetas.indexOf(vehiculo)).obtenerTotal(minutosTotales,horasContabilizadas));

            }
            retirarAutoCamioneta(vehiculo);
            this.cantBoletasAutosCamionetas = this.cantBoletasAutosCamionetas + 1;

        }

    }

    public void generarBoletaCamion(Camion camion) throws IOException {// se recibe el vehiculo, para sacarlo del sistema y generar la boleta
        int horasContabilizadas;
        listaCamiones.get(listaCamiones.indexOf(camion)).setHoraSalida(new Date(120, 10, 24, 23, 59, 59));
        Calendar a = getCalendar(camion.getHoraIngreso());
        Calendar b = getCalendar(camion.getHoraSalida());
        //System.out.println(a.toString()+"  "+b.toString());
        int horas = (b.get(Calendar.HOUR_OF_DAY) - a.get(Calendar.HOUR_OF_DAY));
        int minutos = b.get(Calendar.MINUTE) - a.get(Calendar.MINUTE);
        int minutosTotales = horas * 60 + minutos;
      
        minutosTotales = minutosTotales - 10;// se descuentas los primeros 10 min gratis

        horasContabilizadas = (int) (minutosTotales / 60);// Se toman en cuenta las exactas que estuvo para el calculo

        String BoletaArchivo="Patente: " + listaCamiones.get(listaCamiones.indexOf(camion)).patente + "\n marca: " + listaCamiones.get(listaCamiones.indexOf(camion)).Marca + "\n modelo" + listaCamiones.get(listaCamiones.indexOf(camion)).modelo + "\nhora de entrada: " + listaCamiones.get(listaCamiones.indexOf(camion)).horaIngreso+"\nhora de salida: " + listaCamiones.get(listaCamiones.indexOf(camion)).horaSalida+"\nTiempo de estadia: " + horas + "h " + minutos + "m"+"\nValor hora: " + Caja.VALOR_HORA_CAMION+"\nValor horas totales : " + listaCamiones.get(listaCamiones.indexOf(camion)).calcularPrecio(horasContabilizadas)+"\nIva                 : " + listaCamiones.get(listaCamiones.indexOf(camion)).obtenerIVA(horasContabilizadas)+"\nDescuento           : " + listaCamiones.get(listaCamiones.indexOf(camion)).calcularDescuento(minutosTotales,horasContabilizadas) + " (" + Caja.DESC_MIN + "x" + (int) (horas / 0.5) + ")"+"\nA pagar             : " + listaCamiones.get(listaCamiones.indexOf(camion)).obtenerTotal( minutosTotales,horasContabilizadas);
        ///////////////////////
        ArchivoEstacionamiento n= new ArchivoEstacionamiento();
        n.registrarBoletas("registroBoletas.txt",BoletaArchivo);
         retirarCamion(camion);
         this.cantBoletasAutosCamionetas = this.cantBoletasAutosCamionetas + 1;

    }

    public void generarBoletaMotos(Moto moto) throws IOException {// se recibe el vehiculo, para sacarlo del sistema y generar la boleta
        int horasContabilizadas;
        listaMotos.get(listaMotos.indexOf(moto)).setHoraSalida(new Date(120, 10, 24, 23, 59, 59));
        Calendar a = getCalendar(moto.getHoraIngreso());
        Calendar b = getCalendar(moto.getHoraSalida());
        int horas = (b.get(Calendar.HOUR_OF_DAY) - a.get(Calendar.HOUR_OF_DAY));
        int minutos = b.get(Calendar.MINUTE) - a.get(Calendar.MINUTE);
        int minutosTotales = horas * 60 + minutos;
        horasContabilizadas = (int) (minutosTotales / 60);// Se toman en cuenta las exactas que estuvo para el calculo
        minutosTotales = minutosTotales - 10;// se descuentas los primeros 10 min gratis
        String BoletaArchivo="Patente: " + listaMotos.get(listaMotos.indexOf(moto)).patente + "\n marca: " + listaMotos.get(listaMotos.indexOf(moto)).Marca + "\n modelo" + listaMotos.get(listaMotos.indexOf(moto)).modelo + "\nhora de entrada: " + listaMotos.get(listaMotos.indexOf(moto)).horaIngreso+"\nhora de salida: " + listaMotos.get(listaMotos.indexOf(moto)).horaSalida+"\nTiempo de estadia: " + horas + "h " + minutos + "m"+"\nValor hora: " + Caja.VALOR_HORA_MOTO+"\nValor horas totales : " + listaMotos.get(listaMotos.indexOf(moto)).calcularPrecio(horasContabilizadas)+"\nIva                 : " + listaMotos.get(listaMotos.indexOf(moto)).obtenerIVA(horasContabilizadas)+"\nDescuento           : " + listaMotos.get(listaMotos.indexOf(moto)).calcularDescuento(minutosTotales,horasContabilizadas) + " (" + Caja.DESC_MIN + "x" + (int) (horas / 0.5) + ")"+"\nA pagar             : " + listaMotos.get(listaMotos.indexOf(moto)).obtenerTotal( minutosTotales,horasContabilizadas);
        ArchivoEstacionamiento n= new ArchivoEstacionamiento();
        n.registrarBoletas(BoletaArchivo, BoletaArchivo);
        
        retirarMoto(moto);
        this.cantBoletasMotos = this.cantBoletasMotos + 1;
    }

}
