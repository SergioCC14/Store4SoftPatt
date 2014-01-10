package modelo;

/**
 * Clase que define un artículo en nuestro sistema. Este se define por su id,
 * nombre, descripción, tipo, precio, coste y proveedor. Aparte de un
 * constructor principal, posee uno secundario que crea copias profundas a
 * partir de otro Artículo, mediante el uso del patrón Prototype.
 */
public class Articulo {

    String id, nombre, descripcion;
    char tipo;
    double precio, coste;
    String proveedor;

    /**
     * Constructor principal de la clase y que define un Artículo por los
     * parámetros dados. Su id es definido en la clase que crea el objeto.
     *
     * @param nombre Nombre del artículo.
     * @param descripcion Breve descripción del artículo.
     * @param tipo 'N' = Normal, 'E' = Especial.
     * @param precio double con el precio en € del artículo.
     * @param coste double con el coste en € del artículo.
     * @param proveedor Nombre del proveedor que lo envía.
     */
    public Articulo(String nombre, String descripcion, char tipo, double precio, double coste, String proveedor) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.precio = precio;
        this.coste = coste;
        this.proveedor = proveedor;
    }

    /**
     * Constructor secundario de la clase. Dado un Artículo ya creado, original,
     * se crea una copia profunda mediante el patrón Prototype, y se guarda en
     * un nuevo objeto que será copia exacta del original.
     *
     * @param original Artículo que queremos copiar en un nuevo objeto.
     */
    public Articulo(Articulo original) {
        this.id = original.getId();
        this.nombre = original.getNombre();
        this.descripcion = original.getDescripcion();
        this.tipo = original.getTipo();
        this.precio = original.getPrecio();
        this.coste = original.getCoste();
        this.proveedor = original.getProveedor();
    }

    /**
     * @return El atributo Id del Artículo
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
     * @return El atributo Nombre del Artículo
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Indicamos un valor nuevo para el atributo Nombre.
     *
     * @param nombre Valor nuevo que queremos para el atributo.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return El atributo Descripcion del Artículo
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Indicamos un valor nuevo para el atributo Descripcion.
     *
     * @param descripcion Valor nuevo que queremos para el atributo.
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return El atributo Tipo del Artículo
     */
    public char getTipo() {
        return tipo;
    }

    /**
     * Indicamos un valor nuevo para el atributo Tipo.
     *
     * @param tipo Valor nuevo que queremos para el atributo.
     */
    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    /**
     * @return El atributo Precio del Artículo
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Indicamos un valor nuevo para el atributo Precio.
     *
     * @param precio Valor nuevo que queremos para el atributo.
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * @return El atributo Coste del Artículo
     */
    public double getCoste() {
        return coste;
    }

    /**
     * Indicamos un valor nuevo para el atributo Coste.
     *
     * @param coste Valor nuevo que queremos para el atributo.
     */
    public void setCoste(double coste) {
        this.coste = coste;
    }

    /**
     * @return El atributo Proveedor del Artículo
     */
    public String getProveedor() {
        return proveedor;
    }

    /**
     * Indicamos un valor nuevo para el atributo Proveedor.
     *
     * @param proveedor Valor nuevo que queremos para el atributo.
     */
    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    /**
     * @return Un Array de String, con los atributos ordenados y retocados más
     * importantes del Artículo para su lectura en tablas.
     */
    public String[] ToArray() {
        String[] array = {this.nombre, this.descripcion, String.valueOf(tipo), String.valueOf(precio) + "€", String.valueOf(coste) + "€", this.proveedor};
        return array;
    }
}
