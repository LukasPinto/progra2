/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
/**
 *
 * @author Benjamin
 */
public class ArchivoEstacionamiento {
    
    BufferedReader fin = null;
        BufferedWriter fout = null;
        String cadena;

        try {
            //obtener la ruta del archivo
            //File directory = new File("./");
            //System.out.println(directory.getAbsolutePath());
            fin = new BufferedReader(new FileReader("/Users/yaravi/Downloads/pruebaArchivos/hola.txt"));
            fout = new BufferedWriter(new FileWriter("/Users/yaravi/Downloads/pruebaArchivos/salida.txt"));
            while ((cadena = fin.readLine()) != null) {
                fout.write(cadena);
                //System.out.println(cadena);
            }
        } finally {
            if (fin != null) {
                fin.close();
            }
            if (fout != null) {
                fout.close();
            }
        }
        
        String cadena;
        
        BufferedReader fin = new BufferedReader(new FileReader("/Users/yaravi/Downloads/pruebaArchivos/hola.txt"));
        Scanner s = new Scanner(fin);

        PrintWriter writer = new PrintWriter(new FileOutputStream(
                new File("/Users/yaravi/Downloads/pruebaArchivos/salida.txt"), true));
        /* modo append = true */
    

        while ((cadena = fin.readLine()) != null) {
            writer.println(cadena);
            //System.out.println(cadena);
        }
        s.close();
        writer.close()
    
    
}
