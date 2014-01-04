package controladores;

import java.util.ArrayList;
import java.util.Date;
import modelo.Articulo;
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
    public ArrayList<Articulo> getArticulos() {
        return documento.getArticulos();
    }

    @Override
    public void setArticulos(ArrayList<Articulo> articulos) {
        documento.setArticulos(articulos);
    }

    @Override
    public void addArticulo(Articulo articulo) {
        documento.addArticulo(articulo);
    }

    @Override
    public void modArticulo(int index, Articulo articulo) {
        documento.modArticulo(index, articulo);
    }

    @Override
    public void removeArticulo(int numArticulo) {
        documento.removeArticulo(numArticulo);
    }

    @Override
    public String calcularPrecio() {
        return documento.calcularPrecio();
    }

    @Override
    public String calcularArticulos() {
        return documento.calcularArticulos();
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
    public String[] ToArray() {
        return documento.ToArray();
    }
}
