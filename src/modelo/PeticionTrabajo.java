package modelo;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * Clase que define una Petición de Trabajo en nuestro sistema. Implementa la
 * clase Documento, sobreescribiendo sus métodos abstractos e implementandolos.
 * Así como añadiendo atributos que definen una Petición de Trabajo, que son:
 * Id, Cliente, Fecha y una lista de Artículos. Aparte de un constructor
 * principal, posee uno secundario que crea copias profundas a partir de otra
 * Petición de Trabajo, mediante el uso del patrón Prototype.
 */
public class PeticionTrabajo implements Documento {

    private Cliente cliente;
    private String id;
    private Date fecha;
    private ArrayList<Articulo> articulos = new ArrayList();

    /**
     * Constructor principal de la clase y que define una Petición de Trabajo
     * por los parámetros dados.
     *
     * @param cliente Es el Cliente que manda la Petición de Trabajo.
     * @param fecha Fecha de la Petición de Trabajo.
     */
    public PeticionTrabajo(Cliente cliente, Date fecha) {
        this.cliente = cliente;
        this.fecha = fecha;
    }

    /**
     * Constructor secundario de la clase. Dado una Petición de Trabajo ya
     * creada, original, se crea una copia profunda mediante el patrón
     * Prototype, y se guarda en un nuevo objeto que será copia exacta del
     * original.
     *
     * @param original Petición que queremos copiar en un nuevo objeto.
     */
    public PeticionTrabajo(PeticionTrabajo original) {
        this.id = original.getId();
        this.articulos = new ArrayList(original.getArticulos());
        this.cliente = original.getCliente();
        this.fecha = original.getFecha();
    }

    /**
     * @return ArrayList de Artículos que posee la clase Petición.
     */
    @Override
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
    @Override
    public void setArticulos(ArrayList<Articulo> articulos) {
        this.articulos = articulos;
    }

    /**
     * Añadimos el artículo indicado a la lista de artículos de la Petición.
     *
     * @param articulo Artículo que vamos a introducir en la lista.
     */
    @Override
    public void addArticulo(Articulo articulo) {
        articulo.setId(String.valueOf(articulo.hashCode()));
        articulos.add(articulo);
    }

    /**
     * Modificamos el artículo indicado de la lista de artículos de la Petición,
     * por otro artículo dado.
     *
     * @param index Indice del artículo que vamos a intercambiar.
     * @param articulo Artículo que vamos a poner en la posición del indicado.
     */
    @Override
    public void modArticulo(int index, Articulo articulo) {
        articulo.setId(String.valueOf(articulo.hashCode()));
        articulos.set(index, articulo);
    }

    /**
     * Borramos el artículo indicado de la lista de artículos de la Petición.
     *
     * @param numArticulo Indice de la lista de artículos que queremos borrar.
     */
    @Override
    public void removeArticulo(int numArticulo) {
        articulos.remove(numArticulo);
    }

    /**
     * @return String con la suma de precios de los artículos que posee la
     * Petición en la lista de Artículos.
     */
    @Override
    public String calcularPrecio() {
        double suma = 0.00d;

        for (Articulo i : articulos) {
            suma += i.coste;
        }

        return String.valueOf(suma);
    }

    /**
     * @return String con el número de artículos que posee la lista de Artículos
     * de la Petición.
     */
    @Override
    public String calcularArticulos() {
        return String.valueOf(articulos.size());
    }

    /**
     * @return El atributo Id de la Petición.
     */
    @Override
    public String getId() {
        return this.id;
    }

    /**
     * Indicamos un valor nuevo para el atributo Id.
     *
     * @param id Valor nuevo que queremos para el atributo.
     */
    @Override
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return El atributo Fecha de la Petición.
     */
    @Override
    public Date getFecha() {
        return this.fecha;
    }

    /**
     * Indicamos un valor nuevo para el atributo Fecha.
     *
     * @param fecha Valor nuevo que queremos para el atributo.
     */
    @Override
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * @return El atributo Cliente de la Petición.
     */
    @Override
    public Cliente getCliente() {
        return this.cliente;
    }

    /**
     * Indicamos un valor nuevo para el atributo Cliente.
     *
     * @param cliente Valor nuevo que queremos para el atributo.
     */
    @Override
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * @return Un Array de String, con los atributos ordenados y retocados más
     * importantes de la Petición de Trabajo para su lectura en tablas.
     */
    @Override
    public String[] ToArray() {
        String[] array = {this.cliente.getDni(), this.cliente.getNombre(), DateFormat.getDateInstance().format(this.fecha), calcularPrecio(), calcularArticulos()};
        return array;
    }
}
