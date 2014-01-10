package controladores.estrategias;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import modelo.Cliente;

/**
 * Clase que implementa la Estrategia de Ordenación de Clientes, de tal forma
 * que dado un ArrayList de Clientes, estos son ordenados por Nombre y devueltos
 * al contexto que lo llama.
 */
public class EstrategiaConcretaClientesNombre implements EstrategiaClientes {

    /**
     * Método que ordena un ArrayList de Clientes por su Nombre.
     *
     * @param clientes ArrayList de Clientes a ordenar.
     */
    @Override
    public void ordena(ArrayList<Cliente> clientes) {

        Comparator NomCliComp = new Comparator() {

            /**
             * Comparador de dos objetos, en este caso clientes, según su
             * Nombre, para ver el orden en el que deben colocarse en el
             * ArrayList.
             *
             * @param o1 Objeto a comparar 1
             * @param o2 Objeto a comparar 2
             * @return Comparador configurado con los parametros indicados.
             */
            @Override
            public int compare(Object o1, Object o2) {

                Cliente cli1 = (Cliente) o1;
                Cliente cli2 = (Cliente) o2;

                return cli1.getNombre().compareToIgnoreCase(cli2.getNombre());
            }
        };

        //Ordenamos los clientes del ArrayList por el atributo Nombre
        Collections.sort(clientes, NomCliComp);
    }
}
