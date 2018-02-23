
package examen1_fabiohenriquez;

import java.util.ArrayList;


public class Sistema {
    private ArrayList archivos = new ArrayList();
    private String nombre;
    private String usuario;
    private double capacidad;
    private String carpeta_Raiz = "Root";

    public Sistema() {
    }

    public Sistema(String nombre, String usuario, double capacidad) {
        this.nombre = nombre;
        this.usuario = usuario;
        this.capacidad = capacidad;
    }

    public ArrayList getArchivos() {
        return archivos;
    }

    public void setArchivos(ArrayList archivos) {
        this.archivos = archivos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }

    public String getCarpeta_Raiz() {
        return carpeta_Raiz;
    }

    public void setCarpeta_Raiz(String carpeta_Raiz) {
        this.carpeta_Raiz = carpeta_Raiz;
    }

    @Override
    public String toString() {
        return usuario+"/" + carpeta_Raiz+'/';
    }
    
    
    
    
}
