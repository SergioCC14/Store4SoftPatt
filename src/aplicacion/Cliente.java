package aplicacion;

public class Cliente {
    // TODO: Eliminar seguramente esta clase, ya que ValidarFactura hace su trabajo.
    //private static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
    private static Servidor proxy = new Proxy(new ServidorFacturas("MiServidor"));
    
    public Cliente(String nomFact) {
        System.out.println(proxy.enviar(nomFact));
    }
}
