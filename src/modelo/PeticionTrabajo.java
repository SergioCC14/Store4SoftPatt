/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.text.DateFormat;
import java.util.Date;

public class PeticionTrabajo implements Documento {

    private double precio;
    private Cliente cliente;
    private String id;
    private Date fecha;

    public PeticionTrabajo(double precio, Cliente cliente, Date fecha) {
        this.precio = precio;
        this.cliente = cliente;
        this.fecha = fecha;
    }

    @Override
    public double getPrecio() {
        return this.precio;
    }

    @Override
    public void setPrecio(double precio) {
        this.precio = precio;
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
        String[] array = {this.cliente.getDni(), this.cliente.getNombre(), DateFormat.getDateInstance().format(this.fecha), String.valueOf(precio)};
        return array;
    }
}
