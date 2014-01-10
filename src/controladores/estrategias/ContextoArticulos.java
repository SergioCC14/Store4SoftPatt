package controladores.estrategias;

import java.util.ArrayList;
import modelo.Articulo;

/**
 * Clase que crea un contexto que junta una Estrategia de Ordenación de
 * Artículos y un ArrayList de Artículos a ordenar. De esta forma, solo debemos
 * alterar el contexto con el tipo de ordenación a realizar y pedir la
 * ordenación del ArrayList según este tipo. Pudiendo cambiar el tipo de
 * ordenación siempre que queramos.
 */
public class ContextoArticulos {

    private EstrategiaArticulos estrategia;
    private ArrayList<Articulo> articulos;

    /**
     * Constructor principal de la clase, creamos un ContextoArticulos dados una
     * estrategia de ordenación de artículos y un ArrayList de estos.
     *
     * @param est Estrategia de Ordenación de Artículos a usar.
     * @param arts ArrayList de Artículos que vamos a ordenar.
     */
    public ContextoArticulos(EstrategiaArticulos est, ArrayList<Articulo> arts) {
        this.estrategia = est;
        this.articulos = arts;
    }

    /**
     * Indicamos un valor nuevo para el atributo Estrategia, definiendo asi el
     * tipo de estrategia y por tanto ordenación que queremos realizar.
     *
     * @param est Valor nuevo que queremos para el atributo.
     */
    public void setEstrategia(EstrategiaArticulos est) {
        this.estrategia = est;
    }

    /**
     * Ejecutamos la estrategia, es decir, llamamos al método ordena de la
     * estategia para ordenar los artículos según el tipo de estrategia
     * indicados previamente en this.estrategia.
     *
     * @return ArrayList de Artículos ordenado según estrategia.
     */
    public ArrayList<Articulo> ejecutaEstrategia() {
        estrategia.ordena(articulos);
        return articulos;
    }
}
