package controladores;

import java.util.HashMap;
import modelo.Fichero;

/**
 * Clase que implementa un Servidor Concreto a partir de la Interfaz Servidor.
 * Incluye su método enviar, que envía el archivo indicado creando un nuevo
 * Fichero y añadiéndolo a la lista de Ficheros enviados.
 */
public class ServidorFacturas implements Servidor {

    // Nombre del servidor
    private String nombre;
    private HashMap<String, Fichero> facturas;
    private Fichero fact;

    /**
     * Constructor Principal, creamos un servidor a partir de un Nombre. Además
     * se crea un registro con un ArrayList de Ficheros enviados.
     *
     * @param nombre Nombre del Servidor que creamos.
     */
    public ServidorFacturas(String nombre) {
        this.nombre = nombre;
        facturas = new HashMap<>();
    }

    /**
     * Dado un nombre de archivo, se crea un fichero que es guardado en el
     * ArrayList Facturas, y enviado al cliente (simuladamente).
     *
     * @param nomFact Nombre del Archivo que vamos a enviar.
     * @return Información sobre el envío realizado.
     */
    @Override
    public String enviar(String nomFact) {
        fact = new Fichero(nomFact);
        facturas.put(fact.getId(), fact);
        return "\nFactura enviada correctamente.";
    }
}
