
package proyecto;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
/**
 *
 * @author Angelaraya
 */
public class ArchivoEstacionamiento{

    public static void main(String[] escribir){
        String texto = "";
        try{
            BufferedReader br;
            FileReader fr = new FileReader("archivo.txt");
            br = new BufferedReader(fr);
            System.out.println("Contenido del txt: ");
            String linea=br.readLine();
            while (linea !=null){
                System.out.println(linea);
                linea=br.readLine();
            }
            br.close();          
        }catch (IOException ioe){
            System.out.println("Error al abrir el archivo");
            ioe.printStackTrace();
        }catch (Exception e){
            System.out.println("Error al leer el teclado");
            e.printStackTrace();
        }
    }
}
