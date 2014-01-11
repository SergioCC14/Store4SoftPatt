package controladores;

import modelo.Pedido;

/**
 * Interface que define un Sujeto global. Que será el encargado de manejar una
 * lista de observadores y de avisarlos ante posibles añadidos o cambios en la
 * lista de Pedidos de la aplicación para que actúen en consecuencia.
 */
public interface Sujeto {

    /**
     * Establecemos el Pedido que es monitorizado.
     *
     * @param pedido Pedido que queremos monitorizar.
     */
    public void setPedido(Pedido pedido);

    /**
     * @return Pedido que estamos monitorizando
     */
    public Pedido getPedido();

    /**
     * Añadimos el Observador indicado a la lista de Observadores para que sea
     * avisado.
     *
     * @param o Observador que se desea añadir a la lista.
     */
    public void addObservador(Observador o);

    /**
     * Eliminamos el observador indicado de la lista de Observadores.
     *
     * @param o Observador que deseamos eliminar de la lista.
     */
    public void removeObservador(Observador o);

    /**
     * Notificamos a todos los Observadores de la lista de que se han producido
     * un añadido o cambio en el pedido monitorizado, para que actuén según se
     * les indique y sepan si tienen que realizar envíos.
     */
    public void notificarObservadores();
}
