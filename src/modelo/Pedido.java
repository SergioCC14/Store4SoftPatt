package modelo;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * Clase que define un artículo en nuestro sistema. Este se define por su id,
 * fecha y un ArrayList de Artículos. Aparte de un constructor principal, posee
 * uno secundario que crea copias profundas a partir de otro Artículo, mediante
 * el uso del patrón Prototype.
 */
public class Pedido {

    String id;
    Date fecha;
    private ArrayList<Articulo> articulos = new ArrayList();

    /**
     * Constructor principal de la clase y que define un Artículo por los
     * parámetros dados. Su id es definido en la clase que crea el objeto.
     *
     * @param fecha Fecha de realización del Pedido.
     */
    public Pedido(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * Constructor secundario de la clase. Dado un Pedido ya creado, original,
     * se crea una copia profunda mediante el patrón Prototype, y se guarda en
     * un nuevo objeto que será copia exacta del original.
     *
     * @param original Pedido que queremos copiar en un nuevo objeto.
     */
    public Pedido(Pedido original) {
        this.id = original.getId();
        this.fecha = original.getFecha();
        this.articulos = new ArrayList(original.getArticulos());
    }

    /**
     * @return El atributo Id del Pedido
     */
    public String getId() {
        return id;
    }

    /**
     * Indicamos un valor nuevo para el atributo Id.
     *
     * @param id Valor nuevo que queremos para el atributo.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return El atributo Fecha del Pedido
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * Indicamos un valor nuevo para el atributo Fecha.
     *
     * @param fecha Valor nuevo que queremos para el atributo.
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * @return ArrayList de Artículos que posee la clase Pedido.
     */
    public ArrayList<Articulo> getArticulos() {
        return articulos;
    }

    /**
     * Dado un ArrayList de artículos, sustituimos el ArrayList actual por el
     * nuevo indicado por parámetro.
     *
     * @param articulos ArrayList de artículos que sustituye al ArrayList
     * actual.
     */
    public void setArticulos(ArrayList<Articulo> articulos) {
        this.articulos = articulos;
    }

    /**
     * Añadimos el artículo indicado a la lista de artículos del Pedido.
     *
     * @param articulo Artículo que vamos a introducir en la lista.
     */
    public void addArticulo(Articulo articulo) {
        articulo.setId(String.valueOf(articulo.hashCode()));
        articulos.add(articulo);
    }

    /**
     * Modificamos el artículo indicado de la lista de artículos del Pedido, por
     * otro artículo dado.
     *
     * @param index Indice del artículo que vamos a intercambiar.
     * @param articulo Artículo que vamos a poner en la posición del indicado.
     */
    public void modArticulo(int index, Articulo articulo) {
        articulo.setId(String.valueOf(articulo.hashCode()));
        articulos.set(index, articulo);
    }

    /**
     * Borramos el artículo indicado de la lista de artículos del Pedido.
     *
     * @param numArticulo Indice de la lista de artículos que queremos borrar.
     */
    public void removeArticulo(int numArticulo) {
        articulos.remove(numArticulo);
    }

    /**
     * @return String con la suma de precios de los artículos que posee el
     * Pedido en la lista de Artículos.
     */
    private String calcularPrecio() {
        double suma = 0.00d;

        for (Articulo i : articulos) {
            suma += i.coste;
        }

        return String.valueOf(suma);
    }

     /**
     * @return String con el número de artículos que posee la lista de Artículos
     * del Pedido.
     */   
    private String calcularArticulos() {
        return String.valueOf(articulos.size());
    }

    /**
     * @return Un Array de String, con los atributos ordenados y retocados más
     * importantes del Pedido para su lectura en tablas.
     */    
    public String[] ToArray() {
        String[] array = {DateFormat.getDateInstance().format(this.fecha), calcularArticulos(), this.id, calcularPrecio()};
        return array;
    }
}
