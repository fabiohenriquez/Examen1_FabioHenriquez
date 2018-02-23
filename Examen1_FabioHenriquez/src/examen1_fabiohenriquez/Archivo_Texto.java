
package examen1_fabiohenriquez;


public class Archivo_Texto extends Archivo {
    private String texto;

    public Archivo_Texto() {
        super();
    }

    public Archivo_Texto(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    @Override
    public String toString() {
        return "Archivo_Texto{" + "texto=" + texto + '}';
    }
    
    
    
    
}
