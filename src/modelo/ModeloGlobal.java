package modelo;

import controladores.Observador;
import controladores.ObservadorConcreto;
import controladores.Sujeto;
import controladores.SujetoConcreto;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Daniel
 */
public class ModeloGlobal {

    private ArrayList<Cliente> clientes = new ArrayList<>();
    private ArrayList<Articulo> articulos = new ArrayList<>();
    private ArrayList<Pedido> pedidos = new ArrayList<>();
    private ArrayList<PeticionTrabajo> peticiones = new ArrayList<>();
    private ArrayList<Presupuesto> presupuestos = new ArrayList<>();
    private ArrayList<Factura> facturas = new ArrayList<>();
    public Sujeto sujeto = new SujetoConcreto();
    public Observador proveedor1 = new ObservadorConcreto("Proveedor1", sujeto);
    public Observador proveedor2 = new ObservadorConcreto("Proveedor2", sujeto);
    public Observador proveedor3 = new ObservadorConcreto("Proveedor3", sujeto);
    public Observador proveedor4 = new ObservadorConcreto("Proveedor4", sujeto);

    private static ModeloGlobal instancia;

    // constructor privado
    private ModeloGlobal() {
        Cliente cliente1 = new Cliente("Daniel", "Martin", "123456789A", "Torrejon", "123456", 'P');
        Cliente cliente2 = new Cliente("Sergio", "Canis", "123456789B", "Alcala", "654321", 'E');
        this.addCliente(cliente1);
        this.addCliente(cliente2);
        this.addArticulo(new Articulo("Articulo1", "Descripcion1", 'N', 2.20, 1.20, "Proveedor1"));
        this.addArticulo(new Articulo("Articulo2", "Descripcion2", 'E', 1.10, 0.10, "Proveedor3"));
        Pedido pedido1 = new Pedido(new Date());
        pedido1.addArticulo(this.getArticulos().get(0));
        Pedido pedido2 = new Pedido(new Date());
        pedido2.addArticulo(this.getArticulos().get(1));
        this.addPedido(pedido1);
        this.addPedido(pedido2);
        PeticionTrabajo peticion1 = new PeticionTrabajo(cliente1, new Date());
        peticion1.addArticulo(this.getArticulos().get(0));
        peticion1.addArticulo(this.getArticulos().get(1));
        Factura factura1 = new Factura(peticion1, "emitida");
        Presupuesto presupuesto1 = new Presupuesto(peticion1, 22);
        this.addPeticion(peticion1);
        this.addFactura(factura1);
        this.addPresupuesto(presupuesto1);
    }

    public static ModeloGlobal getInstancia() {
        if (instancia == null) {
            instancia = new ModeloGlobal();
        }

        return instancia;
    }

    public void addCliente(Cliente cliente) {
        cliente.setId(String.valueOf(cliente.hashCode()));
        clientes.add(cliente);
    }

    public void modCliente(int index, Cliente cliente) {
        cliente.setId(String.valueOf(cliente.hashCode()));
        clientes.set(index, cliente);
    }

    public void removeCliente(int numCliente) {
        clientes.remove(numCliente);
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void addArticulo(Articulo articulo) {
        articulo.setId(String.valueOf(articulo.hashCode()));
        articulos.add(articulo);
    }

    public void modArticulo(int index, Articulo articulo) {
        articulo.setId(String.valueOf(articulo.hashCode()));
        articulos.set(index, articulo);
    }

    public void removeArticulo(int numArticulo) {
        articulos.remove(numArticulo);
    }

    public ArrayList<Articulo> getArticulos() {
        return articulos;
    }

    public void addPedido(Pedido pedido) {
        pedido.setId(String.valueOf(pedido.hashCode()));
        pedidos.add(pedido);
    }

    public void modPedido(int index, Pedido pedido) {
        pedido.setId(String.valueOf(pedido.hashCode()));
        pedidos.set(index, pedido);
    }

    public void removePedido(int numPedido) {
        pedidos.remove(numPedido);
    }

    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    public void addPeticion(PeticionTrabajo peticion) {
        peticion.setId(String.valueOf(peticion.hashCode()));
        peticiones.add(peticion);
    }

    public void modPeticion(int index, PeticionTrabajo peticion) {
        peticion.setId(String.valueOf(peticion.hashCode()));
        peticiones.set(index, peticion);
    }

    public void removePeticion(int numPeticion) {
        peticiones.remove(numPeticion);
    }

    public ArrayList<PeticionTrabajo> getPeticiones() {
        return peticiones;
    }

    public void addPresupuesto(Presupuesto presupuesto) {
        presupuesto.setId(String.valueOf(presupuesto.hashCode()));
        presupuestos.add(presupuesto);
    }

    public void modPresupuesto(int index, Presupuesto presupuesto) {
        presupuesto.setId(String.valueOf(presupuesto.hashCode()));
        presupuestos.set(index, presupuesto);
    }

    public void removePresupuesto(int numPresupuesto) {
        presupuestos.remove(numPresupuesto);
    }

    public ArrayList<Presupuesto> getPresupuestos() {
        return presupuestos;
    }

    public void addFactura(Factura factura) {
        factura.setId(String.valueOf(factura.hashCode()));
        facturas.add(factura);
    }

    public void modFactura(int index, Factura factura) {
        factura.setId(String.valueOf(factura.hashCode()));
        facturas.set(index, factura);
    }

    public void removeFactura(int numFactura) {
        facturas.remove(numFactura);
    }

    public ArrayList<Factura> getFacturas() {
        return facturas;
    }
}
