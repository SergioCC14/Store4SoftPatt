package controladores;

import modelo.Pedido;

public interface Sujeto {
    // Establecemos el pedido que es monitorizado
    public void setPedido(Pedido pedido);
    
    // Devuelve el pedido que monitoriza
    public Pedido getPedido();
    
    // Añade un observador a la lista
    public void addObservador(Observador o);
    
    // Elimina un observador de la lista
    public void removeObservador(Observador o);
    
    // Notivia a todos los observadores de que se ha producido un cambio
    public void notificarObservadores();
}
