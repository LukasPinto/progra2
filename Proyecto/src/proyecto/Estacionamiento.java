
package proyecto;

public class Estacionamiento {
    
    private int numEstacionamiento;
    private String seccion;//puesto donde está estacionado
    private Vehiculo vehiculo;
    private boolean estado;//ocupado o desocupado
    
    public Estacionamiento(){
    }
    
    // getters
    public int getNumEstacionamiento() {
        return numEstacionamiento;
    }

    public String getSeccion() {
        return seccion;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    // setters
    public void setNumEstacionamiento(int numEstacionamiento) {
        this.numEstacionamiento = numEstacionamiento;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
    
    
    
    
}
