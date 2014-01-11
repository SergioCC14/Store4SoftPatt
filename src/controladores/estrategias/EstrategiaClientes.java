package controladores.estrategias;

import java.util.ArrayList;
import modelo.Cliente;

/**
 * Interface que crea los métodos sin implementar para las estrategias de
 * ordenación de Clientes. De tal forma que será llamado como objeto por el
 * contexto para la ordenación de una lista de Clientes. E implementado por
 * Estrategias Concretas de Ordenación.
 */
public interface EstrategiaClientes {

    public void ordena(ArrayList<Cliente> clientes);
}
