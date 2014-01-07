package modelo;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Pedido {

    String id;
    Date fecha;
    
    private ArrayList<Articulo> articulos = new ArrayList();

    public Pedido(Date fecha) {
        this.fecha = fecha;
    }
    
    public Pedido(Pedido original){
        this.id = original.getId();
        this.fecha = original.getFecha();
        this.articulos = new ArrayList(original.getArticulos());
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public ArrayList<Articulo> getArticulos() {
        return articulos;
    }

    public void setArticulos(ArrayList<Articulo> articulos) {
        this.articulos = articulos;
    }
    
    public void addArticulo(Articulo articulo) {
        articulo.setId(String.valueOf(articulo.hashCode()));
        articulos.add(articulo);
    }

    public void modArticulo(int index, Articulo articulo) {
        articulo.setId(String.valueOf(articulo.hashCode()));
        articulos.set(index, articulo);
    }

    public void removeArticulo(int numArticulo) {
        articulos.remove(numArticulo);
    }
    
    private String calcularPrecio() {
        double suma = 0.00d;
        
        for (Articulo i: articulos) {
            suma += i.coste;
        }
        
        return String.valueOf(suma);        
    }
    
    private String calcularArticulos() {
        return String.valueOf(articulos.size());
    }
    
    public String[] ToArray() {
        String[] array = {DateFormat.getDateInstance().format(this.fecha), calcularArticulos(), this.id, calcularPrecio()};
        return array;
    }
}
