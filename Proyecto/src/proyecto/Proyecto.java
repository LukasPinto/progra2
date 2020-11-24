/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.util.Date;

/**
 *
 * @author Lukas
 */
public class Proyecto {

    public static void main(String[] args) {
        System.out.println("Bienvenido a 'Estacionamiento Ángel Araya' ");

        Auto auto = new Auto("Sedan", "acab-12", "Chevrolet", "Corsa", false);
        Camioneta cam=new Camioneta("3/4","angel-1","mercedes benz","asdfasdf",false);
        auto.setHoraSalida(new Date(120, 10, 23, 22, 55, 6));
        cam.setHoraSalida(new Date(120, 10, 23, 23, 59, 59));
        System.out.println(auto.horaIngreso + "   " + auto.horaSalida);
        System.out.println(cam.horaIngreso+"   "+cam.horaSalida);
        RegistroEstacionamiento r1 = new RegistroEstacionamiento();
        r1.ingresarAutoCamioneta(auto);
        r1.ingresarAutoCamioneta(cam);
        r1.generarBoletaAutoCamionetas(auto);
        r1.generarBoletaAutoCamionetas(cam);
    }

}
