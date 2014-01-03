package aplicacion;

import java.util.HashMap;

public class ServidorFacturas implements Servidor {
    // Nombre del servidor
    private String nombre;
    private HashMap<String, Fichero> facturas;
    private Fichero fact;
    
    public ServidorFacturas(String nombre) {
        this.nombre = nombre;
        facturas = new HashMap<>();
    }
    
    @Override
    public String enviar(String nomFact) {
      fact = new Fichero(nomFact);
      facturas.put(fact.getId(), fact);
      return "\nFactura enviada correctamente.";
    }
}
