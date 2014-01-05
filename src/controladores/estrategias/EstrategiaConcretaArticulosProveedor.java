package controladores.estrategias;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import modelo.Articulo;

public class EstrategiaConcretaArticulosProveedor implements EstrategiaArticulos {

    @Override
    public void ordena(ArrayList<Articulo> alumnos) {
        //Comparador para ordenar los alumnos por su nombre
        Comparator NomUniComp = new Comparator() {

            @Override
            public int compare(Object o1, Object o2) {
                Articulo uni1 = (Articulo) o1;
                Articulo uni2 = (Articulo) o2;

                return uni1.getProveedor().compareToIgnoreCase(uni2.getProveedor());
            }
        };

        //Ordenamos los objetos del array por el atributo Nombre
        Collections.sort(alumnos, NomUniComp);
    }
}
