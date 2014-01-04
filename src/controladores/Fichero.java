package controladores;

import java.io.File;
import java.util.Date;

public class Fichero {

    private String id;
    private String nombre;
    private Date fechaEnvio;
    private File fichero;
    private long tama;
    // Contador único que identifica el fichero
    private static int contador = 0;
    
    public Fichero(String nombre) {
        this.id = Integer.toString(getContador());
        this.nombre = nombre;
        this.fechaEnvio = new Date();
        this.fichero = new File(nombre);
        this.tama = fichero.length();
    }
    
    private static int getContador() {
        return contador++;
    }
    
    public String getId() {
        return this.id;
    }
    
    public String getNombre() {
        return this.nombre;
    }
    
    public Date getFecha() {
        return this.fechaEnvio;
    }
    
    public File getFichero() {
        return this.fichero;
    }
    
    @Override
    public String toString() {
        return id + " " + nombre + " " + tama;
    }
}
