package controladores;

import java.util.ArrayList;

public class ContadorFacturas {
    
    private ArrayList<String> facturas = new ArrayList<>();
    private static ContadorFacturas instancia;
    
    // constructor privado
    private ContadorFacturas() {}
    
    public static ContadorFacturas getInstancia() {
        if (instancia == null)
            instancia = new ContadorFacturas();
        
        return instancia;
    }
    
    public boolean devolverEstadoFactura(String facturaId) {
        if (facturas.contains(facturaId))
            return true;
        else {
            facturas.add(facturaId);
            return false;
        }
    }
    
    public void borrarFactura(String facturaId) {
        facturas.remove(facturaId);
    }
}
