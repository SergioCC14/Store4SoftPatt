package controladores;

/**
 * Usando el Patrón Proxy, enviamos un archivo utilizando la clase Proxy a un
 * cliente mediante un servidor. De este modo, evitamos problemas derivados de
 * conexiones, y de seguridad, pues hay un intermediario que se encarga de que
 * todo funcione correctamente.
 */
public class Proxy implements Servidor {

    private Servidor servidor;

    /**
     * Constructor principal de la clase Proxy, dado un servidor, creamos un
     * objeto Proxy.
     *
     * @param servidor Servidor con el que vamos a enviar el archivo.
     */
    public Proxy(Servidor servidor) {
        this.servidor = servidor;
    }

    /**
     * Indicamos un valor nuevo para el atributo Servidor.
     *
     * @param servidor Valor nuevo que queremos para el atributo.
     */
    public void setServidor(Servidor servidor) {
        this.servidor = servidor;
    }

    /**
     * @return El atributo Servidor del Proxy.
     */
    public Servidor getServidor() {
        return servidor;
    }

    /**
     * Para evitar problemas, enviamos los archivos con el servidor, a
     * través del proxy que controlará su envío a un cliente.
     *
     * @param nomFact Nombre del Archivo que vamos a enviar.
     * @return Información sobre el envío realizado.
     */
    @Override
    public String enviar(String nomFact) {
        return "\n(Subiendo desde el proxy...)" + servidor.enviar(nomFact);
    }
}
