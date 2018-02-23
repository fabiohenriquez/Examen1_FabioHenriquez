
package examen1_fabiohenriquez;

import java.util.Date;


public class Archivo {
    
    protected  String nombre;
    protected String tamaño;
    protected Date fecha_c;
    protected Date fecha_mod;

    public Archivo() {
    }

    public Archivo(String nombre, String tamaño, Date fecha_c, Date fecha_mod) {
        this.nombre = nombre;
        this.tamaño = tamaño;
        this.fecha_c = fecha_c;
        this.fecha_mod = fecha_mod;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public Date getFecha_c() {
        return fecha_c;
    }

    public void setFecha_c(Date fecha_c) {
        this.fecha_c = fecha_c;
    }

    public Date getFecha_mod() {
        return fecha_mod;
    }

    public void setFecha_mod(Date fecha_mod) {
        this.fecha_mod = fecha_mod;
    }

    @Override
    public String toString() {
        return "Archivo{" + "nombre=" + nombre + ", tama\u00f1o=" + tamaño + ", fecha_c=" + fecha_c + ", fecha_mod=" + fecha_mod + '}';
    }
    
    
}
