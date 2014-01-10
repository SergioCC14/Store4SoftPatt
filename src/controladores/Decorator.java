package controladores;

import java.util.ArrayList;
import java.util.Date;
import modelo.Articulo;
import modelo.Cliente;
import modelo.Documento;

/**
 * Clase abstracta que implementa la clase Documento siguiendo con el Patrón
 * Decorator. El decorador crea una clase que partiendo de los datos que
 * contiene un objeto Documento crea uno nuevo en la clase que implemente el
 * Decorador. De este modo podemos ampliar la funcionalidad de Documento con
 * clases nuevas que implementen nuevos atributos y métodos, siendo estos
 * independientes de Documento en estos nuevos atributos y métodos, pero
 * dependiendo del objeto documento en los ya incluidos.
 */
public abstract class Decorator implements Documento {

    private Documento documento;

    /**
     * Constructor principal de la clase y que define un Decorador a partir de
     * un documento dado por parametro.
     *
     * @param documento Documento del que está compuesto el Decorador.
     */
    public Decorator(Documento documento) {
        this.documento = documento;
    }

    /**
     * Indicamos un valor nuevo para el atributo Documento.
     *
     * @param documento Valor nuevo que queremos para el atributo.
     */
    public void setDocumento(Documento documento) {
        this.documento = documento;
    }

    /**
     * @return El atributo Documento del Decorador
     */
    public Documento getDocumento() {
        return this.documento;
    }

    /**
     * @return ArrayList de Artículos que posee la clase Decorator. Obtenido del
     * documento.
     */
    @Override
    public ArrayList<Articulo> getArticulos() {
        return documento.getArticulos();
    }

    /**
     * Dado un ArrayList de artículos, sustituimos el ArrayList actual por el
     * nuevo indicado por parámetro.
     *
     * @param articulos ArrayList de artículos que sustituye al ArrayList actual
     * en el Documento.
     */
    @Override
    public void setArticulos(ArrayList<Articulo> articulos) {
        documento.setArticulos(articulos);
    }

    /**
     * Añadimos el artículo indicado a la lista de artículos del Decorator en el
     * Documento.
     *
     * @param articulo Artículo que vamos a introducir en la lista.
     */
    @Override
    public void addArticulo(Articulo articulo) {
        documento.addArticulo(articulo);
    }

    /**
     * Modificamos el artículo indicado de la lista de artículos del Decorador,
     * por otro artículo dado por parámetro en el Documento.
     *
     * @param index Indice del artículo que vamos a intercambiar.
     * @param articulo Artículo que vamos a poner en la posición del indicado.
     */
    @Override
    public void modArticulo(int index, Articulo articulo) {
        documento.modArticulo(index, articulo);
    }

    /**
     * Borramos el artículo indicado de la lista de artículos del Decorador en
     * el Documento.
     *
     * @param numArticulo Indice de la lista de artículos que queremos borrar.
     */
    @Override
    public void removeArticulo(int numArticulo) {
        documento.removeArticulo(numArticulo);
    }

    /**
     * @return String con la suma de precios de los artículos que posee el
     * decorador en la lista de Artículos. Obtenido del documento.
     */
    @Override
    public String calcularPrecio() {
        return documento.calcularPrecio();
    }

    /**
     * @return String con el número de artículos que posee la lista de Artículos
     * del Decorator. Obtenido del documento.
     */
    @Override
    public String calcularArticulos() {
        return documento.calcularArticulos();
    }

    /**
     * @return El atributo Id del Decorador. Obtenido del documento.
     */
    @Override
    public String getId() {
        return documento.getId();
    }

    /**
     * Indicamos un valor nuevo para el atributo Id en el Documento.
     *
     * @param id Valor nuevo que queremos para el atributo.
     */
    @Override
    public void setId(String id) {
        documento.setId(id);
    }

    /**
     * @return El atributo Fecha del Decorador. Obtenido del documento.
     */
    @Override
    public Date getFecha() {
        return documento.getFecha();
    }

    /**
     * Indicamos un valor nuevo para el atributo Fecha en el Documento.
     *
     * @param fecha Valor nuevo que queremos para el atributo.
     */
    @Override
    public void setFecha(Date fecha) {
        documento.setFecha(fecha);
    }

    /**
     * @return El atributo Cliente del Decorador. Obtenido del documento.
     */
    @Override
    public Cliente getCliente() {
        return documento.getCliente();
    }

    /**
     * Indicamos un valor nuevo para el atributo Cliente en el Documento.
     *
     * @param cliente Valor nuevo que queremos para el atributo.
     */
    @Override
    public void setCliente(Cliente cliente) {
        documento.setCliente(cliente);
    }

    /**
     * @return Un Array de String, con los atributos ordenados y retocados más
     * importantes del Decorador para su lectura en tablas. Obtenido del
     * documento.
     */
    @Override
    public String[] ToArray() {
        return documento.ToArray();
    }
}
