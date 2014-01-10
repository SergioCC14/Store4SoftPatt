package controladores.estrategias;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import modelo.Cliente;

/**
 * Clase que implementa la Estrategia de Ordenación de Clientes, de tal forma
 * que dado un ArrayList de Clientes, estos son ordenados por Apellido y
 * devueltos al contexto que lo llama.
 */
public class EstrategiaConcretaClientesApellido implements EstrategiaClientes {

    /**
     * Método que ordena un ArrayList de Clientes por su Apellido.
     *
     * @param clientes ArrayList de Clientes a ordenar.
     */
    @Override
    public void ordena(ArrayList<Cliente> clientes) {

        Comparator ApeCliComp = new Comparator() {

            /**
             * Comparador de dos objetos, en este caso clientes, según su
             * Apellido, para ver el orden en el que deben colocarse en el
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

                return cli1.getApellidos().compareToIgnoreCase(cli2.getApellidos());
            }
        };

        //Ordenamos los clientes del ArrayList por el atributo Apellidos
        Collections.sort(clientes, ApeCliComp);
    }
}
