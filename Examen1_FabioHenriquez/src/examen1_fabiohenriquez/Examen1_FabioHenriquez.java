
package examen1_fabiohenriquez;

import java.util.Date;
import java.util.Scanner;
import javax.swing.JOptionPane;




public class Examen1_FabioHenriquez {

    static Carpeta raiz = new Carpeta();

    static Date fecha = new Date();
    
    static Sistema sistemas = new Sistema();
    
    static Scanner lea = new Scanner(System.in);
    
    
    public static void main(String[] args) {
         int res = 0;
        do {
        String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del sistema: \n");
        String usuario = JOptionPane.showInputDialog(null, "Ingrese el Usuario: \n");
        Double bytes = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el tamaño (en bytes)"));
        sistemas.setNombre(nombre);
        sistemas.setUsuario(usuario);
        sistemas.setCapacidad(bytes);
        switch (MenuArchivos()) {
            case 1:
                if (raiz.getDocumentos().size() < 1) {
                    JOptionPane.showMessageDialog(null, "No hay carpetas o archivos");
                } else {

                    EntraSub(raiz);
                }
                break;
            case 2:
                 JOptionPane.showMessageDialog(null, "Esta en la raiz");
                Regresar(raiz);
               
                break;
            case 3:
                CrearArchivo(raiz);

                break;
            case 4:
                CrearCarpeta(raiz);
                break;
            case 5:
                Listac(raiz);
                break;
            case 6:
                Listaall();
                break;

        
            }//Fin del switch menu

         res = JOptionPane.showConfirmDialog(null, "¿Desea salir del sistema?", "Confirmacion", JOptionPane.YES_NO_OPTION);
        } while (res == 1);

    }//Fin del main
    public static int MenuArchivos() {
        int opcion = Integer.parseInt(JOptionPane.showInputDialog(null, ""
                + "Usted esta en :  "
                + sistemas.toString() + "\n"
                + "--Menu--\n"
                + "1. Entrar en una subcarpeta\n"
                + "2. Regresar a una carpeta anterior\n"
                + "3. Crear un archivo\n"
                + "4. Crear una carpeta\n"
                + "5. Lista directorio actual\n"
                + "6. Listar todo FileSystem\n"));

        return opcion;
    }

    
    //SIstema de archivos
    public static void SistemaArchivos() {

        switch (MenuArchivos()) {
            case 1:
                if (raiz.getDocumentos().size() < 1) {
                    JOptionPane.showMessageDialog(null, "No hay carpetas o archivos");
                } else {

                    EntraSub(raiz);
                }
                break;
            case 2:
                 JOptionPane.showMessageDialog(null, "Esta en la raiz");
                Regresar(raiz);
               
                break;
            case 3:
                CrearArchivo(raiz);

                break;
            case 4:
                CrearCarpeta(raiz);
                break;
            case 5:
                Listac(raiz);
                break;
            case 6:
                Listaall();
                break;

        }
    }//Fin del metodo sistemaarchivos

    //archivo
    public static void EntraSub(Carpeta c) {
        String s = "";
        boolean aux=true;
        for (Fichero t : c.getDocumentos()) {
            if (t instanceof Carpeta) {
                s += c.getDocumentos().indexOf(t) + " - " + t + "\n";
            }
        }
        int opcion=0;
        
      
            
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Elija a que carpeta acceder\n" + s,"Elija",JOptionPane.DEFAULT_OPTION));
                
            
            
        
        
        switch (MenuArchivos()) {
            case 1:

                EntraSub(((Carpeta) c.getDocumentos().get(opcion)));

                break;
            case 2:
                Regresar(c.getPerteneceA());
                break;
            case 3:
                CrearArchivo((Carpeta) c.getDocumentos().get(opcion));

                break;
            case 4:
                CrearCarpeta(((Carpeta) c.getDocumentos().get(opcion)));
                break;
            case 5:
                Listac((Carpeta) c.getDocumentos().get(opcion));
                break;
            case 6:
                Listaall();
                break;
        }

    }

    public static void Regresar(Carpeta c) {

        switch (MenuArchivos()) {
            case 1:
                EntraSub(c);

                break;
            case 2:
                Regresar(c);
                break;
            case 3:
                CrearArchivo(c);
                break;
            case 4:
                CrearCarpeta(c);
                break;
            case 5:
                Listac(c);
                break;
            case 6:
                Listaall();
                break;

        }

    }//Fin metod regresa

    public static void CrearArchivo(Carpeta c) {
        Archivo ar = new Archivo();
        String contenido = JOptionPane.showInputDialog(null, "Ingrese un contenido"
                + "de la carpeta");
        ar.setContenido(contenido);
        ar.setFechaCreacion(fecha);
        ar.setHechoPor(JOptionPane.showInputDialog(null, "Ingrese por quien fue hecho"));
        ar.setNombre(JOptionPane.showInputDialog(null, "Ingrese le nombre"));
        ar.setPerteneceA(c);
        boolean aux = true;
        while (aux) {
            try {
                ar.setTamaño(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el tamaño de 0 a 1024")));
                aux = false;
            } catch (Excepcion ex) {
                aux = true;
                JOptionPane.showMessageDialog(null, "No se puede no son los tamaños requeridos");
            }
        }//FIn del while

        c.getDocumentos().add(ar);

    }//Fin metodo creararchivo

    public static void CrearCarpeta(Carpeta c) {
        Carpeta ca = new Carpeta();

        ca.setFechaCreacion(fecha);
        ca.setHechoPor(JOptionPane.showInputDialog(null, "Ingrese por quien fue hecho"));
        ca.setNombre(JOptionPane.showInputDialog(null, "Ingrese le nombre"));
        ca.setPerteneceA(c);

        boolean aux = true;
        while (aux) {
            try {
                ca.setTamaño(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el tamaño de 0 a 1024")));
                aux = false;
            } catch (Excepcion ex) {
                aux = true;
                JOptionPane.showMessageDialog(null, "No se puede no son los tamaños requeridos");
            }
        }//FIn del while
        c.getDocumentos().add(ca);
    }//Fin metodo crear carpeta

    public static void Listac(Carpeta c) {
        String s = "";
        for (Fichero t : c.getDocumentos()) {
            s += c.getDocumentos().indexOf(t) + " - " + t + "\n";
        }

        JOptionPane.showMessageDialog(null, s);
    }

    public static void Listaall() {
        String s = "";
        for (Fichero t : raiz.getDocumentos()) {
            s += raiz.getDocumentos().indexOf(t) + " - " + t + "\n";
        }

        JOptionPane.showMessageDialog(null, s);
    }
       
      
            

          
    
}
