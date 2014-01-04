package modelo;

import java.util.ArrayList;
import java.util.Date;

public interface Documento {

    public ArrayList<Articulo> getArticulos();

    public void setArticulos(ArrayList<Articulo> articulos);

    public void addArticulo(Articulo articulo);

    public void modArticulo(int index, Articulo articulo);

    public void removeArticulo(int numArticulo);

    public String calcularPrecio();

    public String calcularArticulos();

    public String getId();

    public void setId(String id);

    public Date getFecha();

    public void setFecha(Date fecha);

    public Cliente getCliente();

    public void setCliente(Cliente cliente);

    public String[] ToArray();
}
