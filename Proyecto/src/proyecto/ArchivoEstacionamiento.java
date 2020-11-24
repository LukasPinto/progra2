package proyecto;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Angelaraya
 */
public class ArchivoEstacionamiento {

    public void mostrar() throws IOException{
    String texto;
    BufferedWriter wr = new BufferedWriter(new FileWriter("target.txt"));
    try {
    BufferedReader fout;
    fout = new BufferedReader(new InputStreamReader(System.in));
    texto="";
    FileWriter archivoFW = null;
        try {
            archivoFW = new FileWriter("archivo.txt");
        } catch (IOException ex) {
            Logger.getLogger(ArchivoEstacionamiento.class.getName()).log(Level.SEVERE, null, ex);
    BufferedWriter archivoBW= new BufferedWriter(archivoFW);
    PrintWriter salida = new PrintWriter(archivoBW);
    salida.close();
    } 
    } catch(Exception e){
        System.out.println("\n\nError al leer los datos");
        e.printStackTrace();
    }

    
    }
}
