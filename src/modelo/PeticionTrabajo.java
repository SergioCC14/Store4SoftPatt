/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;

public class PeticionTrabajo implements Documento {

    private Cliente cliente;
    private String id;
    private Date fecha;
    
    private ArrayList<Articulo> articulos = new ArrayList<>();
    
    public PeticionTrabajo(Cliente cliente, Date fecha) {
        this.cliente = cliente;
        this.fecha = fecha;
    }

    @Override
    public ArrayList<Articulo> getArticulos() {
        return articulos;
    }

    @Override
    public void setArticulos(ArrayList<Articulo> articulos) {
        this.articulos = articulos;
    }
    
    @Override
    public void addArticulo(Articulo articulo) {
        articulo.setId(String.valueOf(articulo.hashCode()));
        articulos.add(articulo);
    }
    
 @Override
    public void modArticulo(int index, Articulo articulo) {
        articulo.setId(String.valueOf(articulo.hashCode()));
        articulos.set(index, articulo);
    }

    @Override
    public void removeArticulo(int numArticulo) {
        articulos.remove(numArticulo);
    }
    
    @Override
    public String calcularPrecio() {
        double suma = 0.00d;
        
        for (Articulo i: articulos) {
            suma += i.coste;
        }
        
        return String.valueOf(suma);        
    }
    
    @Override
    public String calcularArticulos() {
        return String.valueOf(articulos.size());
    }
    
    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public Date getFecha() {
        return this.fecha;
    }

    @Override
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public Cliente getCliente() {
        return this.cliente;
    }

    @Override
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String[] ToArray() {
        String[] array = {this.cliente.getDni(), this.cliente.getNombre(), DateFormat.getDateInstance().format(this.fecha), calcularPrecio(), calcularArticulos()};
        return array;
    }
}
