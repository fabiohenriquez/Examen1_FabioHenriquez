/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hh;

import java.util.StringTokenizer;

/**
 *
 * @author FABIO
 */
public class Hh {

    /**
     * @param args the command line arguments
     */
   

   public static void main(String args[]) {
System.out.println("Ingrese el nombre del sistema: ");
        String n = lea.next();
        System.out.println("Ingrese el usuario: ");
        String usuario = lea.next();
        System.out.println("Ingrese la Capacidad (Bytes): ");
        double capacidad = lea.nextDouble();
        sistemas = new Sistema(n, usuario, capacidad);
        System.out.println("SEPARE EL COMANDO DE LA INSTRUCCION POR UNA COMA (,)");
        System.out.print(sistemas.toString());
        String comando = lea.next(); 
        //
        String coman = comando.split(",")[0];
        String name = comando.split(",")[1];
        String size = comando.split(",")[2];
       //
        System.out.println(coman+" "+name+" "+size);
        if (coman.equals(crear_carpeta)) {
             sistemas.getArchivos().add(new Carpeta(name, size, new Date(), new Date()));
            
        }
        sistemas.setCarpeta_Raiz(name);
        System.out.println("");
        System.out.println("SEPARE EL COMANDO DE LA INSTRUCCION POR UNA COMA (,)");
        System.out.print(sistemas.toString());
        comando = lea.next();
  
   }

    
}
