/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1_fabiohenriquez;

import java.util.ArrayList;

/**
 *
 * @author FABIO
 */
public class Carpeta extends Archivo {
    
    private ArrayList<Archivo> archivo = new ArrayList();

    public Carpeta() {
        super();
    }
    
    public ArrayList<Archivo> getArchivo() {
        return archivo;
    }

    public void setArchivo(ArrayList<Archivo> archivo) {
        this.archivo = archivo;
    }
    
    
    

    
    
    
    
    
    
    
    
}
