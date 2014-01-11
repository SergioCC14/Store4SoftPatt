package controladores;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Pedido;

/**
 * Clase que define un SujetoConcreto, a partir de un Sujeto Interfaz. Que será
 * el encargado de manejar una lista de observadores y de avisarlos ante
 * posibles añadidos o cambios en la lista de Pedidos de la aplicación para que
 * actúen en consecuencia.
 */
public class SujetoConcreto implements Sujeto {

    private ArrayList<Observador> observadores = new ArrayList();
    private Pedido pedido;

    /**
     * Establecemos el Pedido que es monitorizado.
     *
     * @param pedido Pedido que queremos monitorizar.
     */
    @Override
    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    /**
     * @return Pedido que estamos monitorizando
     */
    @Override
    public Pedido getPedido() {
        return this.pedido;
    }

    /**
     * Añadimos el Observador indicado a la lista de Observadores para que sea
     * avisado.
     *
     * @param o Observador que se desea añadir a la lista.
     */
    @Override
    public void addObservador(Observador o) {
        if (observadores.contains(o) == false) {
            observadores.add(o);
        }
    }

    /**
     * Eliminamos el observador indicado de la lista de Observadores.
     *
     * @param o Observador que deseamos eliminar de la lista.
     */
    @Override
    public void removeObservador(Observador o) {
        observadores.remove(o);
    }

    /**
     * Notificamos a todos los Observadores de la lista de que se han producido
     * un añadido o cambio en el pedido monitorizado, para que actuén según se
     * les indique y sepan si tienen que realizar envíos.
     */
    @Override
    public void notificarObservadores() {
        // Pasamos el vector a un array para evitar los conflictos
        // en tiempo de ejecución.
        Object[] obArray = observadores.toArray();

        for (int i = 0; i < obArray.length; ++i) {
            Observador o = (Observador) obArray[i];
            JOptionPane.showMessageDialog(null, o.actualizar(), "Correcto", JOptionPane.DEFAULT_OPTION);
        }
    }
}
