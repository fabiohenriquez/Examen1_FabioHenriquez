
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
       
        switch (MenuArchivos()) {
            case 2:
                if (raiz.getDocumentos().size() < 1) {
                    JOptionPane.showMessageDialog(null, "No hay carpetas o archivos");
                } else {

                    EntraSub(raiz);
                }
                break;
            case 3:
                 JOptionPane.showMessageDialog(null, "Esta en la raiz");
                Regresar(raiz);
               
                break;
            case 4:
                CrearArchivo(raiz);

                break;
            case 1:
                String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del sistema: \n");
                String usuario = JOptionPane.showInputDialog(null, "Ingrese el Usuario: \n");
                Double bytes = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el tamaño (en bytes)"));
                sistemas.setNombre(nombre);
                sistemas.setUsuario(usuario);
                sistemas.setCapacidad(bytes);
                JOptionPane.showMessageDialog(null, "Sistema creado usted esta en : "+ sistemas.toString());
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
        int opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Gestor de Archivos \n"
                
                + " --Menu--\n"
                + "1.Crear el sistema \n"
                + "2. Entrar en una subcarpeta \n"
                + "3. Regresar a una carpeta anterior \n"
                + "4. Comandos para Crear un Archivo \n"
                + "5. Comandos para modificar \n"
                + "6. Comando para Listar \n"));

        return opcion;
    }

    
    //SIstema de archivos
    public static void SistemaArchivos() {

        switch (MenuArchivos()) {
            case 2:
                if (raiz.getDocumentos().size() < 1) {
                    JOptionPane.showMessageDialog(null, "No hay carpetas o archivos");
                } else {

                    EntraSub(raiz);
                }
                break;
            case 3:
                 JOptionPane.showMessageDialog(null, "Esta en la raiz");
                Regresar(raiz);
               
                break;
            case 4:
                CrearArchivo(raiz);

                break;
            case 5:
                modificar_Archivo(raiz);

            break;
            case 6:
                Listac(raiz);
                break;
        }
    }//Fin del metodo sistemaarchivos

//archivo
    public static void modificar_Archivo(Carpeta c){
    
    }
    public static void EntraSub(Carpeta c) {
        String s = "";
        boolean aux=true;
        for (Archivo t : c.getDocumentos()) {
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
                
                break;
            case 3:
                CrearArchivo((Carpeta) c.getDocumentos().get(opcion));

                break;
            
            case 4:
                Listac((Carpeta) c.getDocumentos().get(opcion));
                break;
            case 5:
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
                Listac(c);
                break;
            case 5:
                Listaall();
                break;

        }

    }//Fin metod regresa

    public static void CrearArchivo(Carpeta c) {
        
        String comando = JOptionPane.showInputDialog(null,"Usted esta en : "+
        sistemas.toString());
        String com = comando.split(" ")[0];
        String nom= comando.split(" ")[1];
        String size = comando.split(" ")[2];
        if (com.equals("mkdir")) {
           sistemas.getArchivos().add(new Carpeta(nom, size, new Date(), new Date()));
            JOptionPane.showMessageDialog(null, "Carpeta Creada");
            sistemas.setCarpeta_Raiz(nom);
        }else if(com.equals("cat")){
            String algo = JOptionPane.showInputDialog(null,"Ingrese el archivo de texto");
            sistemas.getArchivos().add(new Archivo_Texto(algo));
        }
              

       

    }//Fin metodo creararchivo

    public static void Listac(Carpeta c) {
        String s = "";
        for (Archivo t : c.getDocumentos()) {
            s += c.getDocumentos().indexOf(t) + " - " + t + "\n";
        }

        JOptionPane.showMessageDialog(null, s);
    }

    public static void Listaall() {
        String s = "";
        for (Archivo t : raiz.getDocumentos()) {
            s += raiz.getDocumentos().indexOf(t) + " - " + t + "\n";
        }

        JOptionPane.showMessageDialog(null, s);
    }
       
      
            

          
    
}
