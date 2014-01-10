package modelo;

import controladores.Observador;
import controladores.ObservadorConcreto;
import controladores.Sujeto;
import controladores.SujetoConcreto;
import java.util.ArrayList;
import java.util.Date;

/**
 * Clase que usa el Patrón Singleton, creando instancias de si mismo, y que
 * reune las listas de Clientes, Artículos, Pedidos, Peticiones, Presupuestos,
 * Facturas; así como el sujeto y observadores del Patrón Observer; con el fin
 * de reunir en un solo punto todos los datos de la aplicación y acceder a ellos
 * mediante instancias de esta clase. Actualmente al ser un prototipo, los datos
 * y objetos son cargados en esta clase. Con BBDD, la clase ModeloGlobal será la
 * encargada de comunicarse con la BBDD, siendo el único punto de enlace por
 * motivos de seguridad y evitar corrupción de datos.
 */
public class ModeloGlobal {

    private ArrayList<Cliente> clientes = new ArrayList();
    private ArrayList<Articulo> articulos = new ArrayList();
    private ArrayList<Pedido> pedidos = new ArrayList();
    private ArrayList<PeticionTrabajo> peticiones = new ArrayList();
    private ArrayList<Presupuesto> presupuestos = new ArrayList();
    private ArrayList<Factura> facturas = new ArrayList();
    public Sujeto sujeto = new SujetoConcreto();
    public Observador proveedor1 = new ObservadorConcreto("Proveedor1", sujeto);
    public Observador proveedor2 = new ObservadorConcreto("Proveedor2", sujeto);
    public Observador proveedor3 = new ObservadorConcreto("Proveedor3", sujeto);
    public Observador proveedor4 = new ObservadorConcreto("Proveedor4", sujeto);

    private static ModeloGlobal instancia;

    /**
     * Constructor Privado y propio que inicializa la primera instancia de la
     * clase. En el se agrupan todas las creaciones de objetos que serán creados
     * en la primera instancia. Y después llamados por el resto de clases de la
     * aplicación instanciando ModeloGlobal.
     */
    private ModeloGlobal() {
        Cliente cliente1 = new Cliente("Daniel", "Martín", "123456789A", "Torrejon", "123456", 'P');
        Cliente cliente2 = new Cliente("Sergio", "Canis", "123456789B", "Alcala", "654321", 'E');
        Cliente cliente3 = new Cliente("Salvador", "Otón", "123456789B", "Alcala", "654321", 'E');
        Articulo articulo1 = new Articulo("Articulo1", "Descripcion1", 'N', 2.20, 1.20, "Proveedor1");
        Articulo articulo2 = new Articulo("Articulo2", "Descripcion2", 'E', 1.10, 0.10, "Proveedor3");
        Articulo articulo3 = new Articulo("Articulo3", "Descripcion3", 'E', 15.00, 13.00, "Proveedor2");
        Pedido pedido1 = new Pedido(new Date());
        Pedido pedido2 = new Pedido(new Date());
        pedido1.addArticulo(articulo1);
        pedido1.addArticulo(articulo2);
        pedido2.addArticulo(articulo3);
        PeticionTrabajo peticion1 = new PeticionTrabajo(cliente1, new Date());
        peticion1.addArticulo(articulo1);
        peticion1.addArticulo(articulo3);
        PeticionTrabajo peticion2 = new PeticionTrabajo(cliente2, new Date());
        peticion2.addArticulo(articulo2);
        Factura factura1 = new Factura(peticion1, "Emitida");
        Presupuesto presupuesto1 = new Presupuesto(peticion1, 22);
        Factura factura2 = new Factura(peticion2, "Pendiente");
        Presupuesto presupuesto2 = new Presupuesto(peticion2, 10);

        this.addCliente(cliente1);
        this.addCliente(cliente2);
        this.addCliente(cliente3);
        this.addArticulo(articulo1);
        this.addArticulo(articulo2);
        this.addPedido(pedido1);
        this.addPedido(pedido2);
        this.addPeticion(peticion1);
        this.addPeticion(peticion2);
        this.addFactura(factura1);
        this.addFactura(factura2);
        this.addPresupuesto(presupuesto1);
        this.addPresupuesto(presupuesto2);
    }

    /**
     * Método que es llamado cuando se requiere el uso de la clase, y que
     * devuelve una instancia de este para el uso de sus métodos sin necesidad
     * de creación de un nuevo modelo o de corrupción de estos.
     *
     * @return Una instancia de ModeloGlobal con la que poder trabajar.
     */
    public static ModeloGlobal getInstancia() {
        if (instancia == null) {
            instancia = new ModeloGlobal();
        }

        return instancia;
    }

    /**
     * Añadimos el Cliente indicado a la lista de Clientes de ModeloGlobal.
     *
     * @param cliente Cliente que vamos a introducir en la lista.
     */
    public void addCliente(Cliente cliente) {
        cliente.setId(String.valueOf(cliente.hashCode()));
        clientes.add(cliente);
    }

    /**
     * Modificamos el cliente indicado de la lista de Clientes del ModeloGlobal,
     * por otro cliente dado.
     *
     * @param index Indice del cliente que vamos a intercambiar.
     * @param cliente Cliente que vamos a poner en la posición del indicado.
     */
    public void modCliente(int index, Cliente cliente) {
        cliente.setId(String.valueOf(cliente.hashCode()));
        clientes.set(index, cliente);
    }

    /**
     * Borramos el cliente indicado de la lista de clientes de ModeloGlobal.
     *
     * @param numCliente Indice de la lista de clientes que queremos borrar.
     */
    public void removeCliente(int numCliente) {
        clientes.remove(numCliente);
    }

    /**
     * @return ArrayList de Clientes que posee la clase ModeloGlobal.
     */
    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    /**
     * Añadimos el Artículo indicado a la lista de Artículos de ModeloGlobal.
     *
     * @param articulo Artículo que vamos a introducir en la lista.
     */
    public void addArticulo(Articulo articulo) {
        articulo.setId(String.valueOf(articulo.hashCode()));
        articulos.add(articulo);
    }

    /**
     * Modificamos el artículo indicado de la lista de Artículos del
     * ModeloGlobal, por otro Artículo dado.
     *
     * @param index Indice del artículo que vamos a intercambiar.
     * @param articulo Artículo que vamos a poner en la posición del indicado.
     */
    public void modArticulo(int index, Articulo articulo) {
        articulo.setId(String.valueOf(articulo.hashCode()));
        articulos.set(index, articulo);
    }

    /**
     * Borramos el artículo indicado de la lista de artículos de ModeloGlobal.
     *
     * @param numArticulo Indice de la lista de artículos que queremos borrar.
     */
    public void removeArticulo(int numArticulo) {
        articulos.remove(numArticulo);
    }

    /**
     * @return ArrayList de Artículos que posee la clase ModeloGlobal.
     */
    public ArrayList<Articulo> getArticulos() {
        return articulos;
    }

    /**
     * Añadimos el Pedido indicado a la lista de Pedidos de ModeloGlobal.
     *
     * @param pedido Pedido que vamos a introducir en la lista.
     */
    public void addPedido(Pedido pedido) {
        pedido.setId(String.valueOf(pedido.hashCode()));
        pedidos.add(pedido);
    }

    /**
     * Modificamos el pedido indicado de la lista de Pedidos del ModeloGlobal,
     * por otro pedido dado.
     *
     * @param index Indice del pedido que vamos a intercambiar.
     * @param pedido Pedido que vamos a poner en la posición del indicado.
     */
    public void modPedido(int index, Pedido pedido) {
        pedido.setId(String.valueOf(pedido.hashCode()));
        pedidos.set(index, pedido);
    }

    /**
     * Borramos el pedido indicado de la lista de pedidos de ModeloGlobal.
     *
     * @param numPedido Indice de la lista de pedidos que queremos borrar.
     */
    public void removePedido(int numPedido) {
        pedidos.remove(numPedido);
    }

    /**
     * @return ArrayList de Pedidos que posee la clase ModeloGlobal.
     */
    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    /**
     * Añadimos la Petición de Trabajo indicada a la lista de Peticiones de
     * Trabajo de ModeloGlobal.
     *
     * @param peticion Petición de Trabajo que vamos a introducir en la lista.
     */
    public void addPeticion(PeticionTrabajo peticion) {
        peticion.setId(String.valueOf(peticion.hashCode()));
        peticiones.add(peticion);
    }

    /**
     * Modificamos la petición de trabajo indicada de la lista de Peticiones de
     * Trabajo del ModeloGlobal, por otra Petición de Trabajo dada.
     *
     * @param index Indice de la Petición que vamos a intercambiar.
     * @param peticion Petición que vamos a poner en la posición del indicado.
     */
    public void modPeticion(int index, PeticionTrabajo peticion) {
        peticion.setId(String.valueOf(peticion.hashCode()));
        peticiones.set(index, peticion);
    }

    /**
     * Borramos la petición de trabajo indicada de la lista de peticiones de
     * trabajo de ModeloGlobal.
     *
     * @param numPeticion Indice de la lista de peticiones que queremos borrar.
     */
    public void removePeticion(int numPeticion) {
        peticiones.remove(numPeticion);
    }

    /**
     * @return ArrayList de Peticiones de Trabajo que posee la clase
     * ModeloGlobal.
     */
    public ArrayList<PeticionTrabajo> getPeticiones() {
        return peticiones;
    }

    /**
     * Añadimos el Presupuesto indicado a la lista de Presupuestos de
     * ModeloGlobal.
     *
     * @param presupuesto Presupuesto que vamos a introducir en la lista.
     */
    public void addPresupuesto(Presupuesto presupuesto) {
        presupuesto.setId(String.valueOf(presupuesto.hashCode()));
        presupuestos.add(presupuesto);
    }

    /**
     * Modificamos el presupuesto indicado de la lista de Presupuestos del
     * ModeloGlobal, por otro presupuesto dado.
     *
     * @param index Indice del presupuseto que vamos a intercambiar.
     * @param presupuesto Presupuesto que vamos a poner en la posición del
     * indicado.
     */
    public void modPresupuesto(int index, Presupuesto presupuesto) {
        presupuesto.setId(String.valueOf(presupuesto.hashCode()));
        presupuestos.set(index, presupuesto);
    }

    /**
     * Borramos el presupuesto indicado de la lista de presupuestos de
     * ModeloGlobal.
     *
     * @param numPresupuesto Indice de la lista de presupuestos que queremos
     * borrar.
     */
    public void removePresupuesto(int numPresupuesto) {
        presupuestos.remove(numPresupuesto);
    }

    /**
     * @return ArrayList de Presupuestos que posee la clase ModeloGlobal.
     */
    public ArrayList<Presupuesto> getPresupuestos() {
        return presupuestos;
    }

    /**
     * Añadimos la Factura indicada a la lista de Facturas de ModeloGlobal.
     *
     * @param factura Factura que vamos a introducir en la lista.
     */
    public void addFactura(Factura factura) {
        factura.setId(String.valueOf(factura.hashCode()));
        facturas.add(factura);
    }

    /**
     * Modificamos la factura indicada de la lista de Facturas del ModeloGlobal,
     * por otra Factura dada.
     *
     * @param index Indice de la factura que vamos a intercambiar.
     * @param factura Factura que vamos a poner en la posición del indicado.
     */
    public void modFactura(int index, Factura factura) {
        factura.setId(String.valueOf(factura.hashCode()));
        facturas.set(index, factura);
    }

    /**
     * Borramos la factura indicada de la lista de facturas de ModeloGlobal.
     *
     * @param numFactura Indice de la lista de facturas que queremos borrar.
     */
    public void removeFactura(int numFactura) {
        facturas.remove(numFactura);
    }

    /**
     * @return ArrayList de Facturas que posee la clase ModeloGlobal.
     */
    public ArrayList<Factura> getFacturas() {
        return facturas;
    }
}
