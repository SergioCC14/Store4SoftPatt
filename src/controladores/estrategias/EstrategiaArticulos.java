package controladores.estrategias;

import java.util.ArrayList;
import modelo.Articulo;

/**
 * Interfaz que crea los métodos sin implementar para las estrategias de
 * ordenación de Artículos. De tal forma que será llamado como objeto por el
 * contexto para la ordenación de una lista de Artículos. E implementado por
 * Estrategias Concretas de Ordenación.
 */
public interface EstrategiaArticulos {

    /**
     * Método que ordena un ArrayList de Artículos.
     * 
     * @param articulos ArrayList de Artículos a ordenar.
     */
    public void ordena(ArrayList<Articulo> articulos);
}
