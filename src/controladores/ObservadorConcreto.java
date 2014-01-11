package controladores;

import java.util.ArrayList;
import modelo.Articulo;

/**
 * Clase ObservadorConcreto que actúa como Proveedor implementando la clase
 * Observador, es decir, cuando se realiza un pedido, el sujeto concreto, llama
 * a los observadores (proveedores), para que revisen si en el pedido hay
 * artículos que deban enviar ellos a la empresa.
 */
public class ObservadorConcreto implements Observador {

    private String nombre;
    private Sujeto sujeto;

    /**
     * Constructor principal que define los atributos de un Observador concreto
     * como son su nombre y el sujeto al que observan.
     *
     * @param nombre Nombre del Proveedor (Observador).
     * @param sujeto Sujeto al que deben observar para revisar posibles cambios.
     */
    public ObservadorConcreto(String nombre, Sujeto sujeto) {
        this.nombre = nombre;
        this.sujeto = sujeto;
        sujeto.addObservador(this);
    }

    /**
     * El sujeto concreto llama actualizar a los observadores para indicarles
     * que tienen pedidos nuevos con posibles envíos por su parte pendientes.
     *
     * @return String que muestra los resultados de la actualización.
     */
    @Override
    public String actualizar() {
        ArrayList<Articulo> articulos = sujeto.getPedido().getArticulos();
        String res = "\nEl Proveedor " + nombre + " ha recibido el pedido; ";

        // Si algún artículo nos tiene de proveedor, enviamos el artículo.
        for (Articulo a : articulos) {
            if (a.getProveedor() == nombre) {
                res += "envía " + a.getNombre() + ", ";
            }
        }

        res += "al almacén.";

        return res;
    }
}
