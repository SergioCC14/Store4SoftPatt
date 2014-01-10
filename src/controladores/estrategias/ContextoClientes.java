package controladores.estrategias;

import java.util.ArrayList;
import modelo.Cliente;

/**
 * Clase que crea un contexto que junta una Estrategia de Ordenación de
 * Clientes y un ArrayList de Clientes a ordenar. De esta forma, solo debemos
 * alterar el contexto con el tipo de ordenación a realizar y pedir la
 * ordenación del ArrayList según este tipo. Pudiendo cambiar el tipo de
 * ordenación siempre que queramos.
 */
public class ContextoClientes {

    private EstrategiaClientes estrategia;
    private ArrayList<Cliente> clientes;

     /**
     * Constructor principal de la clase, creamos un ContextoClientes dados una
     * estrategia de ordenación de clientes y un ArrayList de estos.
     *
     * @param est Estrategia de Ordenación de Clientes a usar.
     * @param clis ArrayList de Clientes que vamos a ordenar.
     */   
    public ContextoClientes(EstrategiaClientes est, ArrayList<Cliente> clis) {
        this.estrategia = est;
        this.clientes = clis;
    }

     /**
     * Indicamos un valor nuevo para el atributo Estrategia, definiendo asi el
     * tipo de estrategia y por tanto ordenación que queremos realizar.
     *
     * @param est Valor nuevo que queremos para el atributo.
     */   
    public void setEstrategia(EstrategiaClientes est) {
        this.estrategia = est;
    }

     /**
     * Ejecutamos la estrategia, es decir, llamamos al método ordena de la
     * estategia para ordenar los clientes según el tipo de estrategia
     * indicados previamente en this.estrategia.
     *
     * @return ArrayList de Clientes ordenado según estrategia.
     */   
    public ArrayList<Cliente> ejecutaEstrategia() {
        estrategia.ordena(clientes);
        return clientes;
    }
}
