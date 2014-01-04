package controladores;

import java.util.ArrayList;
import modelo.Articulo;

public class ObservadorConcreto implements Observador {

    private String nombre;
    private Sujeto sujeto;

    public ObservadorConcreto(String nombre, Sujeto sujeto) {
        this.nombre = nombre;
        this.sujeto = sujeto;
        sujeto.addObservador(this);
    }

    @Override
    public String actualizar() {
        ArrayList<Articulo> articulos = sujeto.getPedido().getArticulos();
        String res = "\nEl Proveedor " + nombre + " ha recibido el pedido; ";
        
        for (Articulo a : articulos) {
            if (a.getProveedor() == nombre) {
               res += "envía " + a.getNombre() + ", ";
            }
        }
        
        res += "al almacén.";
                
        return res;
    }
}
