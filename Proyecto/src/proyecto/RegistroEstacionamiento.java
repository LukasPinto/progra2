/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Benjamin
 */
public class RegistroEstacionamiento {
    private final List<Camion> listaCamiones;
    private final List<Vehiculo> listaAutosCamionetas;
    private final List<Moto> listaMotos;

   

    public RegistroEstacionamiento() {
        this.listaCamiones=new ArrayList<>();
        this.listaAutosCamionetas=new ArrayList<>();
        this.listaMotos=new ArrayList<>();
    }

    public boolean ingresarAutoCamioneta(Vehiculo vehiculo){
        return this.listaAutosCamionetas.add(vehiculo);
    }
    
    public boolean ingresarCamion(Camion camion){
        return this.listaCamiones.add(camion);
    }
    public boolean ingresarMoto(Moto moto){
        return this.listaMotos.add(moto);
    }
    
    
    
    
   
    
    
    
}