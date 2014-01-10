package controladores;

/**
 * Interfaz que define un Servidor global. Incluye su metodo enviar, que será
 * implementado en un ServidorFacturas.
 */
public interface Servidor {

    /**
     * Metodo que dada el nombre de un archivo (Factura), lo envia a través del
     * Servidor a un Cliente.
     *
     * @param nomFact Nombre de la Factura (Archivo) que vamos a enviar.
     * @return Información sobre el envío realizado.
     */
    public String enviar(String nomFact);
}
