package modelo;

/**
 * Clase que define un cliente en nuestro sistema. Este se define por su id,
 * nombre, apellidos, dni, dirección y teléfono. Aparte de un constructor
 * principal, posee uno secundario que crea copias profundas a partir de otro
 * Cliente, mediante el uso del patrón Prototype.
 */
public class Cliente {

    String id, nombre, apellidos, dni, direccion, telefono;
    char tipo;

    /**
     * Constructor principal de la clase y que define un Cliente por los
     * parámetros dados. Su id es definido en la clase que crea el objeto.
     *
     * @param nombre Nombre del Cliente.
     * @param apellidos Apellidos del Cliente.
     * @param dni DNI del Cliente.
     * @param direccion Dirección del Cliente.
     * @param telefono Teléfono del Cliente.
     * @param tipo 'P' = Particular, 'E' = Empresa.
     */
    public Cliente(String nombre, String apellidos, String dni, String direccion, String telefono, char tipo) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.direccion = direccion;
        this.telefono = telefono;
        this.tipo = tipo;
    }

    /**
     * Constructor secundario de la clase. Dado un Cliente ya creado, original,
     * se crea una copia profunda mediante el patrón Prototype, y se guarda en
     * un nuevo objeto que será copia exacta del original.
     *
     * @param original Cliente que queremos copiar en un nuevo objeto.
     */
    public Cliente(Cliente original) {
        this.id = original.getId();
        this.nombre = original.getNombre();
        this.apellidos = original.getApellidos();
        this.dni = original.getDni();
        this.direccion = original.getDireccion();
        this.telefono = original.getTelefono();
        this.tipo = original.tipo;
    }

    /**
     * @return El atributo Teléfono del Cliente
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Indicamos un valor nuevo para el atributo Teléfono.
     *
     * @param telefono Valor nuevo que queremos para el atributo.
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * @return El atributo Id del Cliente
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
     * @return El atributo Nombre del Cliente
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
     * @return El atributo Apellidos del Cliente
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * Indicamos un valor nuevo para el atributo Apellidos.
     *
     * @param apellidos Valor nuevo que queremos para el atributo.
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * @return El atributo DNI del Cliente
     */
    public String getDni() {
        return dni;
    }

    /**
     * Indicamos un valor nuevo para el atributo DNI.
     *
     * @param dni Valor nuevo que queremos para el atributo.
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * @return El atributo Dirección del Cliente
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Indicamos un valor nuevo para el atributo Dirección.
     *
     * @param direccion Valor nuevo que queremos para el atributo.
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return El atributo Tipo del Cliente
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
     * @return Un Array de String, con los atributos ordenados y retocados más
     * importantes del Cliente para su lectura en tablas.
     */
    public String[] ToArray() {
        String[] array = {this.nombre, this.apellidos, this.dni, this.direccion, this.telefono, String.valueOf(tipo)};
        return array;
    }
}
