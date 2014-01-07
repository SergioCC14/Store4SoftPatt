package controladores.estrategias;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import modelo.Cliente;

public class EstrategiaConcretaClientesNombre implements EstrategiaClientes {

    @Override
    public void ordena(ArrayList<Cliente> alumnos) {
        //Comparador para ordenar los alumnos por su nombre
        Comparator NomAluComp = new Comparator() {

            @Override
            public int compare(Object o1, Object o2) {

                Cliente uni1 = (Cliente) o1;
                Cliente uni2 = (Cliente) o2;

                return uni1.getNombre().compareToIgnoreCase(uni2.getNombre());
            }
        };

        //Ordenamos los objetos del array por el atributo Nombre
        Collections.sort(alumnos, NomAluComp);
    }
}