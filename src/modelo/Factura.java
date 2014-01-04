package modelo;

import controladores.Decorator;
import java.util.ArrayList;
import java.util.Arrays;

public class Factura extends Decorator {

    private String estado;

    public Factura(Documento d, String estado) {
        super(d);
        this.estado = estado;
    }
    
    public Factura(Factura original){
        super(original.getDocumento());
        this.estado = original.getEstado();
    }

    public String getEstado() {
        return this.estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String[] ToArray() {
        String[] array = super.ToArray();
        ArrayList<String> aux = new ArrayList<>();
        aux.addAll(Arrays.asList(array));
        aux.add(this.estado);
        String[] array2 = new String[6];
        aux.toArray(array2);
        return array2;
    }
}
