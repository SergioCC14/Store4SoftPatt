package controladores;

import java.util.Date;
import modelo.Cliente;
import modelo.Documento;

public abstract class Decorator implements Documento {

    private Documento documento;

    public Decorator(Documento documento) {
        this.documento = documento;
    }
    
    public void setDocumento(Documento documento) {
        this.documento = documento;
    }

    public Documento getDocumento() {
        return this.documento;
    }
    
    @Override
    public double getPrecio() {
        return documento.getPrecio();
    }

    @Override
    public void setPrecio(double precio) {
        documento.setPrecio(precio);
    }

    @Override
    public String getId() {
        return documento.getId();
    }

    @Override
    public void setId(String id) {
        documento.setId(id);
    }

    @Override
    public Date getFecha() {
        return documento.getFecha();
    }

    @Override
    public void setFecha(Date fecha) {
        documento.setFecha(fecha);
    }

    @Override
    public Cliente getCliente() {
        return documento.getCliente();
    }

    @Override
    public void setCliente(Cliente cliente) {
        documento.setCliente(cliente);
    }
    
    @Override
    public String[] ToArray(){
        return documento.ToArray();
    }
}
