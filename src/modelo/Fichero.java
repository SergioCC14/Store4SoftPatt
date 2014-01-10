package modelo;

import java.io.File;
import java.util.Date;

/**
 * Clase que define la estructura de un Fichero que será mandado a través de un
 * servidor a un cliente. Está compuesto por los atributos id, nombre,
 * fechaEnvio, fichero, contador y tama.
 */
public class Fichero {

    private String id;
    private String nombre;
    private Date fechaEnvio;
    private File archivo;
    private long tama;
    // Contador único que identifica el fichero
    private static int contador = 0;

    /**
     * Constructor principal de la clase y que define un Fichero por los
     * parámetros dados.
     *
     * @param nombre Nombre del archivo físico del que se compone el Fichero.
     */
    public Fichero(String nombre) {
        this.id = Integer.toString(getContador());
        this.nombre = nombre;
        this.fechaEnvio = new Date();
        this.archivo = new File(nombre);
        this.tama = archivo.length();
    }

    /**
     * Para hacer un id único, cada vez que llamamos al contador es porque vamos
     * a incluir un id, es decir, que lo aumentamos en 1 para que sea distinto
     * al resto.
     *
     * @return El atributo Contador del Fichero.
     */
    private static int getContador() {
        return contador++;
    }

    /**
     * @return El atributo id del Fichero.
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return El atributo Nombre del Fichero.
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * @return El atributo Fecha del Fichero.
     */
    public Date getFecha() {
        return this.fechaEnvio;
    }

    /**
     * @return El atributo Archivo del Fichero.
     */
    public File getArchivo() {
        return this.archivo;
    }

    /**
     * @return Un String con un resumen del fichero que lo describe.
     */
    @Override
    public String toString() {
        return id + " " + nombre + " " + tama;
    }
}
