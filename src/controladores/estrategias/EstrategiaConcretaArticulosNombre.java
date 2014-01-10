package controladores.estrategias;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import modelo.Articulo;

/**
 * Clase que implementa la Estrategia de Ordenación de Artículos, de tal forma
 * que dado un ArrayList de Articulos, estos son ordenados por Nombre y
 * devueltos al contexto que lo llama.
 */
public class EstrategiaConcretaArticulosNombre implements EstrategiaArticulos {

    /**
     * Método que ordena un ArrayList de Artículos por su Nombre.
     *
     * @param articulos ArrayList de Artículos a ordenar.
     */
    @Override
    public void ordena(ArrayList<Articulo> articulos) {
        
        Comparator NomArtComp = new Comparator() {

            /**
             * Comparador de dos objetos, en este caso articulos, según su
             * Nombre, para ver el orden en el que deben colocarse en el
             * ArrayList.
             *
             * @param o1 Objeto a comparar 1
             * @param o2 Objeto a comparar 2
             * @return Comparador configurado con los parametros indicados.
             */
            @Override
            public int compare(Object o1, Object o2) {

                Articulo art1 = (Articulo) o1;
                Articulo art2 = (Articulo) o2;

                return art1.getNombre().compareToIgnoreCase(art2.getNombre());
            }
        };

        //Ordenamos los artículos del ArrayList por el atributo Nombre
        Collections.sort(articulos, NomArtComp);
    }
}
