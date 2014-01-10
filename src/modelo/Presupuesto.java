package modelo;

import controladores.Decorator;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Clase que define un Presupuesto en nuestro sistema. Este extiende la clase
 * Decorator, que es una Petición de Trabajo, todos sus atributos y métodos, y
 * añade el atributo de horasPrevistas a su definición. Aparte de un constructor
 * principal, posee uno secundario que crea copias profundas a partir de otro
 * Presupuesto, mediante el uso del patrón Prototype.
 */
public class Presupuesto extends Decorator {

    private int horasPrevistas;

    /**
     * Constructor principal de la clase y que define un Presupuesto por los
     * parámetros dados. El documento que es una Petición de Trabajo con sus
     * atributos y métodos y un estado.
     *
     * @param d Petición de Trabajo de la que heredamos atributos y métodos.
     * @param horasPrevistas int con las horasPrevistas del Presupuesto.
     */
    public Presupuesto(Documento d, int horasPrevistas) {
        super(d);
        this.horasPrevistas = horasPrevistas;
    }

    /**
     * Constructor secundario de la clase. Dado un Presupuesto ya creado,
     * original, se crea una copia profunda mediante el patrón Prototype, y se
     * guarda en un nuevo objeto que será copia exacta del original.
     *
     * @param original Presupuesto que queremos copiar en un nuevo objeto.
     */
    public Presupuesto(Presupuesto original) {
        super(original.getDocumento());
        this.horasPrevistas = original.getHoras();
    }

    /**
     * @return El atributo horasPrevistas del Presupuesto.
     */
    public int getHoras() {
        return this.horasPrevistas;
    }

    /**
     * Indicamos un valor nuevo para el atributo HorasPrevistas.
     *
     * @param horas Valor nuevo que queremos para el atributo.
     */
    public void setHoras(int horas) {
        this.horasPrevistas = horas;
    }

    /**
     * Devuelve un Array de String con los atributos más importantes del
     * Presupuesto. Dado que hereda atributos y métodos de un Documento
     * (Petición de Trabajo), tenemos que obtener la mayoria de datos para el
     * ArrayList de este. De ahí el trabajo con ArrayList (No se puede trabajar
     * con String[]).
     *
     * @return Un Array de String, con los atributos ordenados y retocados más
     * importantes del Presupuesto para su lectura en tablas.
     */
    @Override
    public String[] ToArray() {
        String[] array = super.ToArray();
        ArrayList<String> aux = new ArrayList<>();
        aux.addAll(Arrays.asList(array));
        aux.add(String.valueOf(this.horasPrevistas));
        String[] array2 = new String[6];
        aux.toArray(array2);
        return array2;
    }
}
