package controladores;

/**
 * Interface que define un Observador global. Incluye su método actualizar, que
 * será implementado en Observadores concretos.
 */
public interface Observador {

    /**
     * El sujeto concreto llama actualizar a los observadores para indicarles
     * que tienen pedidos nuevos con posibles envíos por su parte pendientes.
     *
     * @return String que muestra los resultados de la actualización.
     */
    public String actualizar();
}
