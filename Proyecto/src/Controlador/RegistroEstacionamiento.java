/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Auto;
import Modelo.Caja;
import Modelo.Camion;
import Modelo.Camioneta;
import Modelo.Moto;
import Modelo.Vehiculo;
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

    static  List<Camion> listaCamiones;
    static  List<Vehiculo> listaAutosCamionetas;
    static  List<Moto> listaMotos;
    static int cantBoletasMotos;
    static int cantBoletasCamiones;
    static int cantBoletasAutosCamionetas;

    public RegistroEstacionamiento() {
        this.listaCamiones = new ArrayList<>();
        this.listaAutosCamionetas = new ArrayList<>();
        this.listaMotos = new ArrayList<>();
    }

    public static boolean validarAutoCamioneta(Vehiculo vehiculo) {
        for (Vehiculo listaAutosCamioneta : listaAutosCamionetas) {
            if (listaAutosCamioneta.patente.equals(vehiculo.patente)) {
                return true;
            }
        }
        return false;
    }

    public static boolean validarMoto(Moto moto) {
        for (Moto listaMoto : listaMotos) {
            if (listaMoto.patente.equals(moto.patente)) {
                return true;
            }
        }
        return false;
    }

    public static boolean validarCamion(Camion camion) {
        for (Camion listaCamion : listaCamiones) {
            if (listaCamion.patente.equals(camion.patente)) {
                return true;
            }
        }
        return false;
    }

    public static boolean ingresarAutoCamioneta(Vehiculo vehiculo) {
        return listaAutosCamionetas.add(vehiculo);
    }
    public static boolean ingresarAutoCamioneta(Auto auto){
        return listaAutosCamionetas.add(auto);
    }
    public static boolean ingresarAutoCamioneta(Camioneta camioneta){
        return listaAutosCamionetas.add(camioneta);
    }

    public static boolean ingresarCamion(Camion camion) {
        return listaCamiones.add(camion);
    }
    

    public static boolean ingresarMoto(Moto moto) {
        return listaMotos.add(moto);
    }

    public static boolean retirarAutoCamioneta(Vehiculo vehiculo) {   
        int index=0;
         for (Vehiculo listaCamione : listaAutosCamionetas) {
            if(vehiculo.patente==listaCamione.patente ){
                index=listaAutosCamionetas.indexOf(listaCamione);
            }
        }
         return listaAutosCamionetas.remove(listaAutosCamionetas.get(index));
    }
    
    

    public static boolean retirarCamion(Camion camion) {
        return listaCamiones.remove(camion);
    }

    public static boolean retirarMoto(Moto moto) {
        return listaMotos.remove(moto);
    }

    public static boolean disponibilidadVehiculos() {
        // true si hay disponibilidad
        //falso si no hay disponibilidad
        return listaAutosCamionetas.size() < Caja.LIMITE_AUTOS_CAMIONETAS;

    }

    public static boolean disponibilidadCamion() {
        return listaCamiones.size() < Caja.LIMITE_CAMIONES;
    }

    public static boolean disponibilidadMoto() {
        return listaMotos.size() < Caja.LIMITE_MOTOS;
    }

    public static Calendar getCalendar(Date date) {
        Calendar cal = Calendar.getInstance(Locale.US);
        cal.setTime(date);
        return cal;
    }

    public static List getListaAutosCamiones() {
        return RegistroEstacionamiento.listaAutosCamionetas;
    }

    public static List getListaCamiones() {
        return RegistroEstacionamiento.listaCamiones;
    }

    public static List getListaMotos() {
        return RegistroEstacionamiento.listaMotos;
    }
    public static void vaciarListaMotos(){
        RegistroEstacionamiento.listaMotos.clear();
    }
    public static void vaciarListaCamiones(){
        RegistroEstacionamiento.listaCamiones.clear();
    }
    public static void vaciarListaAutoCamionetas(){
        RegistroEstacionamiento.listaAutosCamionetas.clear();
    }
    

    public static void generarBoletaAutoCamionetas(Vehiculo vehiculo) throws IOException {// se recibe el vehiculo, para sacarlo del sistema y generar la boleta
        int horasContabilizadas;
        listaAutosCamionetas.get(listaAutosCamionetas.indexOf(vehiculo)).setHoraSalida(new Date(120, 10, 24, 23, 59, 59));
        Calendar a = getCalendar(vehiculo.getHoraIngreso());
        Calendar b = getCalendar(vehiculo.getHoraSalida());
        int horas = (b.get(Calendar.HOUR_OF_DAY) - a.get(Calendar.HOUR_OF_DAY));
        int minutos = b.get(Calendar.MINUTE) - a.get(Calendar.MINUTE);
        int minutosTotales = horas * 60 + minutos;
        ArchivoEstacionamiento n = new ArchivoEstacionamiento();
        String BoletaArchivo;
        int index=0;
        minutosTotales = minutosTotales - 10;// se descuentas los primeros 10 min gratis
        for (Vehiculo vehiculo1 : listaAutosCamionetas) {
            if(vehiculo.patente==vehiculo1.patente){
                index=listaAutosCamionetas.indexOf(vehiculo1);
            }
        }
        horasContabilizadas = (int) (minutosTotales / 60);// Se toman en cuenta las exactas que estuvo para el calculo
        if (listaAutosCamionetas.get(index).trabajador) {

            BoletaArchivo = "Patente: " + listaAutosCamionetas.get(index).patente + " marca: " + listaAutosCamionetas.get(index).Marca + " modelo" + listaAutosCamionetas.get(index).modelo + "\nhora de entrada: " + listaAutosCamionetas.get(index).horaIngreso + "\nhora de salida: " + listaAutosCamionetas.get(index).horaSalida + "\nTiempo de estadia: " + horas + "h " + minutos + "m" + "\nValor hora: " + Caja.VALOR_HORA_AUTO + "\nValor horas totales : " + listaAutosCamionetas.get(index).calcularPrecio(horasContabilizadas) + "\nvehiculo perteneciente a trabjador";

            n.registrarBoletas("registroBoletas.txt", BoletaArchivo);
            retirarAutoCamioneta(vehiculo);
        } else {
            if (vehiculo instanceof Auto) {
                BoletaArchivo = "Patente: " + listaAutosCamionetas.get(index).patente + " marca: " + listaAutosCamionetas.get(index).Marca + " modelo" + listaAutosCamionetas.get(index).modelo + "\nhora de entrada: " + listaAutosCamionetas.get(index).horaIngreso + "\nhora de salida: " + listaAutosCamionetas.get(index).horaSalida + "\nTiempo de estadia: " + horas + "h " + minutos + "m" + "\nValor hora: " + Caja.VALOR_HORA_AUTO + "\nValor horas totales : " + listaAutosCamionetas.get(index).calcularPrecio(horasContabilizadas) + "\nIva                 : " + listaAutosCamionetas.get(index).obtenerIVA(horasContabilizadas) + "\nDescuento           : " + listaAutosCamionetas.get(index).calcularDescuento(minutosTotales, horasContabilizadas) + " (" + Caja.DESC_MIN + "x" + (int) (horas / 0.5) + ")" + "\nA pagar             : " + listaAutosCamionetas.get(index).obtenerTotal(minutosTotales, horasContabilizadas);

                n.registrarBoletas("registroBoletas.txt", BoletaArchivo);
            } else {
                BoletaArchivo = "Patente: " + listaAutosCamionetas.get(index).patente + " marca: " + listaAutosCamionetas.get(index).Marca + " modelo" + listaAutosCamionetas.get(index).modelo + "\nhora de entrada: " + listaAutosCamionetas.get(index).horaIngreso + "\nhora de salida: " + listaAutosCamionetas.get(index).horaSalida + "\nTiempo de estadia: " + horas + "h " + minutos + "m" + "\nValor hora: " + Caja.VALOR_HORA_CAMIONETA + "\nValor horas totales : " + listaAutosCamionetas.get(index).calcularPrecio(horasContabilizadas) + "\nIva                 : " + listaAutosCamionetas.get(index).obtenerIVA(horasContabilizadas) + "\nDescuento           : " + listaAutosCamionetas.get(index).calcularDescuento(minutosTotales, horasContabilizadas) + " (" + Caja.DESC_MIN + "x" + (int) (horas / 0.5) + ")" + "\nA pagar             : " + listaAutosCamionetas.get(index).obtenerTotal(minutosTotales, horasContabilizadas);

                n.registrarBoletas("registroBoletas.txt", BoletaArchivo);

            }
            retirarAutoCamioneta(vehiculo);
            cantBoletasAutosCamionetas = cantBoletasAutosCamionetas + 1;

        }

    }

    public static void generarBoletaCamion(Camion camion) throws IOException {// se recibe el vehiculo, para sacarlo del sistema y generar la boleta
        int horasContabilizadas;
        listaCamiones.get(listaCamiones.indexOf(camion)).setHoraSalida(new Date(120, 10, 24, 23, 59, 59));
        Calendar a = getCalendar(camion.getHoraIngreso());
        Calendar b = getCalendar(camion.getHoraSalida());
       
        int horas = (b.get(Calendar.HOUR_OF_DAY) - a.get(Calendar.HOUR_OF_DAY));
        int minutos = b.get(Calendar.MINUTE) - a.get(Calendar.MINUTE);
        int minutosTotales = horas * 60 + minutos;
        minutosTotales = minutosTotales - 10;// se descuentas los primeros 10 min gratis
        horasContabilizadas = (int) (minutosTotales / 60);// Se toman en cuenta las exactas que estuvo para el calculo
        String BoletaArchivo = "Patente: " + listaCamiones.get(listaCamiones.indexOf(camion)).patente + " marca: " + listaCamiones.get(listaCamiones.indexOf(camion)).Marca + " modelo" + listaCamiones.get(listaCamiones.indexOf(camion)).modelo + "\nhora de entrada: " + listaCamiones.get(listaCamiones.indexOf(camion)).horaIngreso + "\nhora de salida: " + listaCamiones.get(listaCamiones.indexOf(camion)).horaSalida + "\nTiempo de estadia: " + horas + "h " + minutos + "m" + "\nValor hora: " + Caja.VALOR_HORA_CAMION + "\nValor horas totales : " + listaCamiones.get(listaCamiones.indexOf(camion)).calcularPrecio(horasContabilizadas) + "\nIva                 : " + listaCamiones.get(listaCamiones.indexOf(camion)).obtenerIVA(horasContabilizadas) + "\nDescuento           : " + listaCamiones.get(listaCamiones.indexOf(camion)).calcularDescuento(minutosTotales, horasContabilizadas) + " (" + Caja.DESC_MIN + "x" + (int) (horas / 0.5) + ")" + "\nA pagar             : " + listaCamiones.get(listaCamiones.indexOf(camion)).obtenerTotal(minutosTotales, horasContabilizadas);
        ArchivoEstacionamiento n = new ArchivoEstacionamiento();
        n.registrarBoletas("registroBoletas.txt", BoletaArchivo);
        retirarCamion(camion);
        cantBoletasCamiones = cantBoletasCamiones + 1;

    }

    public static void generarBoletaMotos(Moto moto) throws IOException {// se recibe el vehiculo, para sacarlo del sistema y generar la boleta
        int horasContabilizadas;
        listaMotos.get(listaMotos.indexOf(moto)).setHoraSalida(new Date(120, 10, 24, 23, 59, 59));
        Calendar a = getCalendar(moto.getHoraIngreso());
        Calendar b = getCalendar(moto.getHoraSalida());
        int horas = (b.get(Calendar.HOUR_OF_DAY) - a.get(Calendar.HOUR_OF_DAY));
        int minutos = b.get(Calendar.MINUTE) - a.get(Calendar.MINUTE);
        int minutosTotales = horas * 60 + minutos;
        horasContabilizadas = (int) (minutosTotales / 60);// Se toman en cuenta las exactas que estuvo para el calculo
        minutosTotales = minutosTotales - 10;// se descuentas los primeros 10 min gratis
        String BoletaArchivo = "Patente: " + listaMotos.get(listaMotos.indexOf(moto)).patente + " marca: " + listaMotos.get(listaMotos.indexOf(moto)).Marca + " modelo" + listaMotos.get(listaMotos.indexOf(moto)).modelo + "\nhora de entrada: " + listaMotos.get(listaMotos.indexOf(moto)).horaIngreso + "\nhora de salida: " + listaMotos.get(listaMotos.indexOf(moto)).horaSalida + "\nTiempo de estadia: " + horas + "h " + minutos + "m" + "\nValor hora: " + Caja.VALOR_HORA_MOTO + "\nValor horas totales : " + listaMotos.get(listaMotos.indexOf(moto)).calcularPrecio(horasContabilizadas) + "\nIva                 : " + listaMotos.get(listaMotos.indexOf(moto)).obtenerIVA(horasContabilizadas) + "\nDescuento           : " + listaMotos.get(listaMotos.indexOf(moto)).calcularDescuento(minutosTotales, horasContabilizadas) + " (" + Caja.DESC_MIN + "x" + (int) (horas / 0.5) + ")" + "\nA pagar             : " + listaMotos.get(listaMotos.indexOf(moto)).obtenerTotal(minutosTotales, horasContabilizadas);
        ArchivoEstacionamiento n = new ArchivoEstacionamiento();
        n.registrarBoletas("registroBoletas.txt", BoletaArchivo);

        retirarMoto(moto);
        cantBoletasMotos = cantBoletasMotos + 1;
    }

    public static void cerrarEstacionamineto(Vehiculo vehiculo) throws IOException {
        String BoletaArchivo;
        int horasContabilizadas;
        Calendar a;
        Calendar b;
        if (vehiculo instanceof Auto || vehiculo instanceof Camioneta) {
            if (listaAutosCamionetas.size() > 0) {
                ArchivoEstacionamiento archivo = new ArchivoEstacionamiento();
                listaAutosCamionetas.get(listaAutosCamionetas.indexOf(vehiculo)).setHoraSalida(new Date(120, 10, 24, 23, 59, 59));
                if (listaAutosCamionetas.get(listaAutosCamionetas.indexOf(vehiculo)).trabajador) {
                    a = getCalendar(vehiculo.getHoraIngreso());
                    b = getCalendar(vehiculo.getHoraSalida());
                    int horas = (b.get(Calendar.HOUR_OF_DAY) - a.get(Calendar.HOUR_OF_DAY));
                    int minutos = b.get(Calendar.MINUTE) - a.get(Calendar.MINUTE);
                    int minutosTotales = horas * 60 + minutos;
                    minutosTotales = minutosTotales - 10;// se descuentas los primeros 10 min gratis
                    horasContabilizadas = (int) (minutosTotales / 60);
                    BoletaArchivo = "Patente: " + listaAutosCamionetas.get(listaAutosCamionetas.indexOf(vehiculo)).patente + " marca: " + listaAutosCamionetas.get(listaAutosCamionetas.indexOf(vehiculo)).Marca + " modelo" + listaAutosCamionetas.get(listaAutosCamionetas.indexOf(vehiculo)).modelo + "\nhora de entrada: " + listaAutosCamionetas.get(listaAutosCamionetas.indexOf(vehiculo)).horaIngreso + "\nhora de salida: " + listaAutosCamionetas.get(listaAutosCamionetas.indexOf(vehiculo)).horaSalida + "\nTiempo de estadia: " + horas + "h " + minutos + "m" + "\nValor hora: " + Caja.VALOR_HORA_AUTO + "\nValor horas totales : " + listaAutosCamionetas.get(listaAutosCamionetas.indexOf(vehiculo)).calcularPrecio(horasContabilizadas) + "\nvehiculo perteneciente a trabjador";
                    archivo.registrarBoletas("registroBoletas.txt", BoletaArchivo);

                } else {

                    a = getCalendar(vehiculo.getHoraIngreso());
                    b = getCalendar(vehiculo.getHoraSalida());
                    int horas = (b.get(Calendar.HOUR_OF_DAY) - a.get(Calendar.HOUR_OF_DAY));
                    int minutos = b.get(Calendar.MINUTE) - a.get(Calendar.MINUTE);
                    int minutosTotales = horas * 60 + minutos;
                    minutosTotales = minutosTotales - 10;// se descuentas los primeros 10 min gratis
                    horasContabilizadas = (int) (minutosTotales / 60);
                    BoletaArchivo = "Patente: " + listaAutosCamionetas.get(listaAutosCamionetas.indexOf(vehiculo)).patente + " marca: " + listaAutosCamionetas.get(listaAutosCamionetas.indexOf(vehiculo)).Marca + " modelo" + listaAutosCamionetas.get(listaAutosCamionetas.indexOf(vehiculo)).modelo + "\nhora de entrada: " + listaAutosCamionetas.get(listaAutosCamionetas.indexOf(vehiculo)).horaIngreso + "\nhora de salida: " + listaAutosCamionetas.get(listaAutosCamionetas.indexOf(vehiculo)).horaSalida + "\nTiempo de estadia: " + horas + "h " + minutos + "m" + "\nValor hora: " + Caja.VALOR_HORA_MOTO + "\nValor horas totales : " + listaAutosCamionetas.get(listaAutosCamionetas.indexOf(vehiculo)).calcularPrecio(horasContabilizadas) + "\nIva                 : " + listaAutosCamionetas.get(listaAutosCamionetas.indexOf(vehiculo)).obtenerIVA(horasContabilizadas) + "\nDescuento           : " + listaAutosCamionetas.get(listaAutosCamionetas.indexOf(vehiculo)).calcularDescuento(minutosTotales, horasContabilizadas) + " (" + Caja.DESC_MIN + "x" + (int) (horas / 0.5) + ")" + "\nA pagar             : " + listaAutosCamionetas.get(listaAutosCamionetas.indexOf(vehiculo)).obtenerTotal(minutosTotales, horasContabilizadas);
                    archivo.registrarBoletas("registroBoletas.txt", BoletaArchivo);
                    cantBoletasAutosCamionetas = cantBoletasAutosCamionetas + 1;
                    if (vehiculo instanceof Auto) {
                        BoletaArchivo = "Patente: " + listaAutosCamionetas.get(listaAutosCamionetas.indexOf(vehiculo)).patente + " marca: " + listaAutosCamionetas.get(listaAutosCamionetas.indexOf(vehiculo)).Marca + " modelo" + listaAutosCamionetas.get(listaAutosCamionetas.indexOf(vehiculo)).modelo + "\nhora de entrada: " + listaAutosCamionetas.get(listaAutosCamionetas.indexOf(vehiculo)).horaIngreso + "\nhora de salida: " + listaAutosCamionetas.get(listaAutosCamionetas.indexOf(vehiculo)).horaSalida + "\nTiempo de estadia: " + horas + "h " + minutos + "m" + "\nValor hora: " + Caja.VALOR_HORA_AUTO + "\nValor horas totales : " + listaAutosCamionetas.get(listaAutosCamionetas.indexOf(vehiculo)).calcularPrecio(horasContabilizadas) + "\nIva                 : " + listaAutosCamionetas.get(listaAutosCamionetas.indexOf(vehiculo)).obtenerIVA(horasContabilizadas) + "\nDescuento           : " + listaAutosCamionetas.get(listaAutosCamionetas.indexOf(vehiculo)).calcularDescuento(minutosTotales, horasContabilizadas) + " (" + Caja.DESC_MIN + "x" + (int) (horas / 0.5) + ")" + "\nA pagar             : " + listaAutosCamionetas.get(listaAutosCamionetas.indexOf(vehiculo)).obtenerTotal(minutosTotales, horasContabilizadas);

                        archivo.registrarBoletas("registroBoletas.txt", BoletaArchivo);
                    } else {
                        BoletaArchivo = "Patente: " + listaAutosCamionetas.get(listaAutosCamionetas.indexOf(vehiculo)).patente + " marca: " + listaAutosCamionetas.get(listaAutosCamionetas.indexOf(vehiculo)).Marca + " modelo" + listaAutosCamionetas.get(listaAutosCamionetas.indexOf(vehiculo)).modelo + "\nhora de entrada: " + listaAutosCamionetas.get(listaAutosCamionetas.indexOf(vehiculo)).horaIngreso + "\nhora de salida: " + listaAutosCamionetas.get(listaAutosCamionetas.indexOf(vehiculo)).horaSalida + "\nTiempo de estadia: " + horas + "h " + minutos + "m" + "\nValor hora: " + Caja.VALOR_HORA_CAMIONETA + "\nValor horas totales : " + listaAutosCamionetas.get(listaAutosCamionetas.indexOf(vehiculo)).calcularPrecio(horasContabilizadas) + "\nIva                 : " + listaAutosCamionetas.get(listaAutosCamionetas.indexOf(vehiculo)).obtenerIVA(horasContabilizadas) + "\nDescuento           : " + listaAutosCamionetas.get(listaAutosCamionetas.indexOf(vehiculo)).calcularDescuento(minutosTotales, horasContabilizadas) + " (" + Caja.DESC_MIN + "x" + (int) (horas / 0.5) + ")" + "\nA pagar             : " + listaAutosCamionetas.get(listaAutosCamionetas.indexOf(vehiculo)).obtenerTotal(minutosTotales, horasContabilizadas);

                        archivo.registrarBoletas("registroBoletas.txt", BoletaArchivo);

                    }

                }

            }
        } else if (vehiculo instanceof Camion) {
            if (listaCamiones.size() > 0) {
                ArchivoEstacionamiento archivo = new ArchivoEstacionamiento();

                listaCamiones.get(listaCamiones.indexOf(vehiculo)).setHoraSalida(new Date(120, 10, 24, 23, 59, 59));
                a = getCalendar(vehiculo.getHoraIngreso());
                b = getCalendar(vehiculo.getHoraSalida());

                int horas = (b.get(Calendar.HOUR_OF_DAY) - a.get(Calendar.HOUR_OF_DAY));
                int minutos = b.get(Calendar.MINUTE) - a.get(Calendar.MINUTE);
                int minutosTotales = horas * 60 + minutos;

                minutosTotales = minutosTotales - 10;// se descuentas los primeros 10 min gratis

                horasContabilizadas = (int) (minutosTotales / 60);// Se toman en cuenta las exactas que estuvo para el calculo

                BoletaArchivo = "Patente: " + listaCamiones.get(listaCamiones.indexOf(vehiculo)).patente + " marca: " + listaCamiones.get(listaCamiones.indexOf(vehiculo)).Marca + " modelo" + listaCamiones.get(listaCamiones.indexOf(vehiculo)).modelo + "\nhora de entrada: " + listaCamiones.get(listaCamiones.indexOf(vehiculo)).horaIngreso + "\nhora de salida: " + listaCamiones.get(listaCamiones.indexOf(vehiculo)).horaSalida + "\nTiempo de estadia: " + horas + "h " + minutos + "m" + "\nValor hora: " + Caja.VALOR_HORA_CAMION + "\nValor horas totales : " + listaCamiones.get(listaCamiones.indexOf(vehiculo)).calcularPrecio(horasContabilizadas) + "\nIva                 : " + listaCamiones.get(listaCamiones.indexOf(vehiculo)).obtenerIVA(horasContabilizadas) + "\nDescuento           : " + listaCamiones.get(listaCamiones.indexOf(vehiculo)).calcularDescuento(minutosTotales, horasContabilizadas) + " (" + Caja.DESC_MIN + "x" + (int) (horas / 0.5) + ")" + "\nA pagar             : " + listaCamiones.get(listaCamiones.indexOf(vehiculo)).obtenerTotal(minutosTotales, horasContabilizadas);
                archivo.registrarBoletas("registroBoletas.txt", BoletaArchivo);

                cantBoletasCamiones = cantBoletasCamiones + 1;

            }
        } else if (vehiculo instanceof Moto) {
            if (listaMotos.size() > 0) {

                ArchivoEstacionamiento archivo = new ArchivoEstacionamiento();
                listaMotos.get(listaMotos.indexOf(vehiculo)).setHoraSalida(new Date(120, 10, 24, 23, 59, 59));
                a = getCalendar(vehiculo.getHoraIngreso());
                b = getCalendar(vehiculo.getHoraSalida());
                int horas = (b.get(Calendar.HOUR_OF_DAY) - a.get(Calendar.HOUR_OF_DAY));
                int minutos = b.get(Calendar.MINUTE) - a.get(Calendar.MINUTE);
                int minutosTotales = horas * 60 + minutos;
                horasContabilizadas = (int) (minutosTotales / 60);// Se toman en cuenta las exactas que estuvo para el calculo
                minutosTotales = minutosTotales - 10;// se descuentas los primeros 10 min gratis
                BoletaArchivo = "Patente: " + listaMotos.get(listaMotos.indexOf(vehiculo)).patente + " marca: " + listaMotos.get(listaMotos.indexOf(vehiculo)).Marca + " modelo" + listaMotos.get(listaMotos.indexOf(vehiculo)).modelo + "\nhora de entrada: " + listaMotos.get(listaMotos.indexOf(vehiculo)).horaIngreso + "\nhora de salida: " + listaMotos.get(listaMotos.indexOf(vehiculo)).horaSalida + "\nTiempo de estadia: " + horas + "h " + minutos + "m" + "\nValor hora: " + Caja.VALOR_HORA_MOTO + "\nValor horas totales : " + listaMotos.get(listaMotos.indexOf(vehiculo)).calcularPrecio(horasContabilizadas) + "\nIva                 : " + listaMotos.get(listaMotos.indexOf(vehiculo)).obtenerIVA(horasContabilizadas) + "\nDescuento           : " + listaMotos.get(listaMotos.indexOf(vehiculo)).calcularDescuento(minutosTotales, horasContabilizadas) + " (" + Caja.DESC_MIN + "x" + (int) (horas / 0.5) + ")" + "\nA pagar             : " + listaMotos.get(listaMotos.indexOf(vehiculo)).obtenerTotal(minutosTotales, horasContabilizadas);
                archivo.registrarBoletas("registroBoletas.txt", BoletaArchivo);

                cantBoletasMotos = cantBoletasMotos + 1;

            }
        }

    }

}
