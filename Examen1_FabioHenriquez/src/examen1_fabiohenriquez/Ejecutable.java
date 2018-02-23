
package examen1_fabiohenriquez;


public class Ejecutable extends Archivo {
   private  String Texto;
    private String Sistema_Operativo;

    public Ejecutable() {
        super();
        
    }

    public Ejecutable(String Texto, String Sistema_Operativo) {
        this.Texto = Texto;
        this.Sistema_Operativo = Sistema_Operativo;
    }

    public String getTexto() {
        return Texto;
    }

    public void setTexto(String Texto) {
        this.Texto = Texto;
    }

    public String getSistema_Operativo() {
        return Sistema_Operativo;
    }

    public void setSistema_Operativo(String Sistema_Operativo) {
        this.Sistema_Operativo = Sistema_Operativo;
    }
    
    
    
    
    
}
