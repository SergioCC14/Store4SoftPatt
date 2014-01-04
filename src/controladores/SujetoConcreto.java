/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Pedido;

/**
 *
 * @author Daniel
 */
public class SujetoConcreto implements Sujeto {

    // Los observadores de un pedido
    private ArrayList<Observador> observadores = new ArrayList<>();

    // El pedido monitorizado
    private Pedido pedido;

    @Override
    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public Pedido getPedido() {
        return this.pedido;
    }

    @Override
    public void addObservador(Observador o) {
        if (observadores.contains(o) == false) {
            observadores.add(o);
        }
    }

    @Override
    public void removeObservador(Observador o) {
        observadores.remove(o);
    }

    @Override
    public void notificarObservadores() {
        // Pasamos el vector a un array para evitar los conflictos
        // en tiempo de ejecución.
        Object[] obArray = observadores.toArray();

        for (int i = 0; i < obArray.length; ++i) {
            Observador o = (Observador) obArray[i];
            JOptionPane.showMessageDialog(null, o.actualizar(), "Correcto", JOptionPane.DEFAULT_OPTION);
        }
    }
}
