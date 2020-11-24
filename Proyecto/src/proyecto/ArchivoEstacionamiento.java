package proyecto;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
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

    public void mostrar(String BoletaArchivo) throws IOException {
        try {
            String ruta = "ArchivoBoleta.txt";
            File file = new File(ruta);
            // Si el archivo no existe es creado
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(BoletaArchivo);
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
