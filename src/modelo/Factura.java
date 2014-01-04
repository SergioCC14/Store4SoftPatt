package modelo;

import controladores.Decorator;

public class Factura extends Decorator{
    private String estado;
    
    public Factura(Documento d, String estado) {
        super(d);
        this.estado = estado;
    }
    
    public String getEstado() {
        return this.estado;
    }
    
    public void setEstado(String estado){
        this.estado = estado;
    }
    
    @Override
    public String[] ToArray(){
        String[] array = {super.ToArray() + this.estado};
        return array;
    }
}
