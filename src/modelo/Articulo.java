/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Daniel
 */
public class Articulo {

    String id, nombre, descripcion;
    char tipo;
    double precio, coste;
    String proveedor;

    public Articulo(String nombre, String descripcion, char tipo, double precio, double coste, String proveedor){
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.precio = precio;
        this.coste = coste;
        this.proveedor = proveedor;
    }

    public Articulo(Articulo original) {
        this.id = original.getId();
        this.nombre = original.getNombre();
        this.descripcion = original.getDescripcion();
        this.tipo = original.getTipo();
        this.precio = original.getPrecio();
        this.coste = original.getCoste();
        this.proveedor = original.getProveedor();
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getCoste() {
        return coste;
    }

    public void setCoste(double coste) {
        this.coste = coste;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }
    
    public String[] ToArray() {
        String[] array = {this.nombre, this.descripcion, String.valueOf(tipo), String.valueOf(precio)+"€", String.valueOf(coste)+"€", this.proveedor};
        return array;
    }
}
