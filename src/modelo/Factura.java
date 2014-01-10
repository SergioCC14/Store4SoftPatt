package modelo;

import controladores.Decorator;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Clase que define una Factura en nuestro sistema. Este extiende la clase
 * Decorator, que es una Petición de Trabajo, todos sus atributos y métodos, y
 * añade el atributo de estado a su definición. Aparte de un constructor
 * principal, posee uno secundario que crea copias profundas a partir de otra
 * Factura, mediante el uso del patrón Prototype.
 */
public class Factura extends Decorator {

    private String estado;

    /**
     * Constructor principal de la clase y que define una Factura por los
     * parámetros dados. El documento que es una Petición de Trabajo con sus
     * atributos y métodos y un estado.
     *
     * @param d Petición de Trabajo de la que heredamos atributos y métodos.
     * @param estado String con el estado actual de la Factura.
     */
    public Factura(Documento d, String estado) {
        super(d);
        this.estado = estado;
    }

    /**
     * Constructor secundario de la clase. Dada una Factura ya creada, original,
     * se crea una copia profunda mediante el patrón Prototype, y se guarda en
     * un nuevo objeto que será copia exacta del original.
     *
     * @param original Factura que queremos copiar en un nuevo objeto.
     */
    public Factura(Factura original) {
        super(original.getDocumento());
        this.estado = original.getEstado();
    }

    /**
     * @return El atributo Estado de la Factura
     */
    public String getEstado() {
        return this.estado;
    }

    /**
     * Indicamos un valor nuevo para el atributo Estado.
     *
     * @param estado Valor nuevo que queremos para el atributo.
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * Devuelve un Array de String con los atributos más importantes de la
     * Factura. Dado que hereda atributos y métodos de un Documento (Petición de
     * Trabajo), tenemos que obtener la mayoria de datos para el ArrayList de
     * este. De ahí el trabajo con ArrayList (No se puede trabajar con
     * String[]).
     *
     * @return Un Array de String, con los atributos ordenados y retocados más
     * importantes de la Factura para su lectura en tablas.
     */
    @Override
    public String[] ToArray() {
        String[] array = super.ToArray();
        ArrayList<String> aux = new ArrayList<>();
        aux.addAll(Arrays.asList(array));
        aux.add(this.estado);
        String[] array2 = new String[6];
        aux.toArray(array2);
        return array2;
    }
}
