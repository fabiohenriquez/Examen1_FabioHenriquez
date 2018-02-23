/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1_fabiohenriquez;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author mjper
 */
public class Carpeta extends Archivo {
    private ArrayList <Archivo> documentos= new ArrayList();

    public Carpeta() {
    }

    public Carpeta(String nombre, String tamaño, Date fecha_c, Date fecha_mod) {
        super(nombre, tamaño, fecha_c, fecha_mod);
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

    
    public ArrayList<Archivo> getDocumentos() {
        return documentos;
    }

    public void setDocumentos(ArrayList<Archivo> documentos) {
        this.documentos = documentos;
    }

    @Override
    public String toString() {
        return "Carpeta{" + "documentos=" + documentos + '}';
    }
    
    
    
    
}
