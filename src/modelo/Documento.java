package modelo;

import java.util.ArrayList;
import java.util.Date;

/**
 * Interface que define un Documento en nuestro sistema. Usado por el patrón
 * Decorator, sirve de puente entre la creación de una Petición de Trabajo y su
 * expansión hacia un Presupuesto y una Factura. Se definen los métodos
 * abstractos que luego se implementarán en cada clase.
 */
public interface Documento {

    /**
     * @return ArrayList de Artículos que posee la clase actualmente.
     */
    public ArrayList<Articulo> getArticulos();

    /**
     * Dado un ArrayList de artículos, sustituimos el ArrayList actual por el
     * nuevo indicado por parámetro.
     *
     * @param articulos ArrayList de artículos que sustituye al ArrayList
     * actual.
     */
    public void setArticulos(ArrayList<Articulo> articulos);

    /**
     * Añadimos el artículo indicado a la lista de artículos de la clase.
     *
     * @param articulo Artículo que vamos a introducir en la lista.
     */
    public void addArticulo(Articulo articulo);

    /**
     * Modificamos el artículo indicado de la lista de artículos de la clase,
     * por otro artículo dado.
     *
     * @param index Indice del artículo que vamos a intercambiar.
     * @param articulo Artículo que vamos a poner en la posición del indicado.
     */
    public void modArticulo(int index, Articulo articulo);

    /**
     * Borramos el artículo indicado de la lista de artículos de la clase.
     *
     * @param numArticulo Indice de la lista de artículos que queremos borrar.
     */
    public void removeArticulo(int numArticulo);

    /**
     * @return String con la suma de precios de los artículos que posee la clase
     * en la lista de Artículos.
     */
    public String calcularPrecio();

    /**
     * @return String con el número de artículos que posee la lista de artículos
     * de la clase.
     */
    public String calcularArticulos();

    /**
     * @return El atributo Id de la clase.
     */
    public String getId();

    /**
     * Indicamos un valor nuevo para el atributo Id.
     *
     * @param id Valor nuevo que queremos para el atributo.
     */
    public void setId(String id);

    /**
     * @return El atributo Fecha de la clase
     */
    public Date getFecha();

    /**
     * Indicamos un valor nuevo para el atributo Fecha.
     *
     * @param fecha Valor nuevo que queremos para el atributo.
     */
    public void setFecha(Date fecha);

    /**
     * @return El atributo Cliente de la clase
     */
    public Cliente getCliente();

    /**
     * Indicamos un valor nuevo para el atributo Cliente.
     *
     * @param cliente Valor nuevo que queremos para el atributo.
     */
    public void setCliente(Cliente cliente);

    /**
     * @return Un Array de String, con los atributos ordenados y retocados más
     * importantes de la clase para su lectura en tablas.
     */
    public String[] ToArray();
}
