/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

/**
 *
 * @author Lukas
 */
public class Proyecto {

    public static void main(String[] args) {
        System.out.println("Bienvenido a 'Estacionamiento Ángel Araya' ");
        RegistroEstacionamiento r1 = new RegistroEstacionamiento();
        Auto auto = new Auto("Sedan", "acab-12", "Chevrolet", "Corsa", true);
        Camioneta cam = new Camioneta("3/4", "angel-1", "mercedes benz", "asdfasdf", false);
        Camion camion = new Camion("grande", "Cama", "benjamin-1", "chevrolet", "bemz", false);
        Moto moto = new Moto("Deportiva", "asdf-32", "harley devitson", "r1", false);
        r1.ingresarAutoCamioneta(auto);
        r1.ingresarAutoCamioneta(cam);
        r1.ingresarCamion(camion);
        r1.ingresarMoto(moto);
        System.out.println(auto.horaIngreso + "   " + auto.horaSalida);
        System.out.println(cam.horaIngreso + "   " + cam.horaSalida);
        System.out.println(camion.horaIngreso + "   " + camion.horaSalida);
        System.out.println(moto.horaIngreso + "   " + moto.horaSalida);
        System.out.println("");
        r1.generarBoletaAutoCamionetas(auto);
        System.out.println("");
        r1.generarBoletaAutoCamionetas(cam);
        System.out.println("");
        r1.generarBoletaCamion(camion);
        System.out.println("");
        r1.generarBoletaMotos(moto);

    }

}
