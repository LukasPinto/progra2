package proyecto;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Angelaraya
 */
public class ArchivoEstacionamiento {

    public void registrarBoletas(String nombreArchivo, String dato) throws IOException {
        File archivo = new File("registroBoletas.txt");
        if (!archivo.exists()) {
            try {
                archivo.createNewFile();
                String ruta = nombreArchivo;
                // Si el archivo no existe es creado

                FileWriter fw = new FileWriter(archivo, true);
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write(dato + "\n");
                bw.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            try {

                String ruta = nombreArchivo;
                // Si el archivo no existe es creado

                FileWriter fw = new FileWriter(archivo, true);
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write(dato + "\n");
                bw.close();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

    }

    public void limpiarArchivo(File archivo) throws IOException {
        archivo.delete();
        try {
            archivo.createNewFile();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
