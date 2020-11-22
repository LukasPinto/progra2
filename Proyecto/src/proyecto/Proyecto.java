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
        
        Auto auto=new Auto("Sedan", "acab-12", "Chevrolet" , "Corsa" , false);
        auto.setHoraSalida(new Date(120, 5,3, 11, 53, 6));
        System.out.println(auto.horaIngreso+"   "+ auto.horaSalida);
        RegistroEstacionamiento r1=new RegistroEstacionamiento();
       r1.ingresarAutoCamioneta(auto);
       r1.generarBoleta(auto);
        
    }

}
