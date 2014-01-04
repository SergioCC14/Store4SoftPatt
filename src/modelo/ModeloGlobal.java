package modelo;

import controladores.Observador;
import controladores.ObservadorConcreto;
import controladores.Sujeto;
import controladores.SujetoConcreto;
import java.util.ArrayList;

/**
 *
 * @author Daniel
 */
public class ModeloGlobal {

    private ArrayList<Cliente> clientes = new ArrayList<>();
    private ArrayList<Articulo> articulos = new ArrayList<>();
    private ArrayList<Pedido> pedidos = new ArrayList<>();
    public Sujeto sujeto = new SujetoConcreto();
    public Observador proveedor1 = new ObservadorConcreto("Proveedor1",sujeto);
    public Observador proveedor2 = new ObservadorConcreto("Proveedor2",sujeto);
    public Observador proveedor3 = new ObservadorConcreto("Proveedor3",sujeto);
    public Observador proveedor4 = new ObservadorConcreto("Proveedor4",sujeto);

    private static ModeloGlobal instancia;

    // constructor privado
    private ModeloGlobal() {
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
}
