package controladores.estrategias;

import java.util.ArrayList;
import modelo.Cliente;

public class ContextoClientes {

    private EstrategiaClientes estrategia;
    private ArrayList<Cliente> alumnos;

    public ContextoClientes(EstrategiaClientes e, ArrayList<Cliente> u) {
        this.estrategia = e;
        this.alumnos = u;
    }

    public void setEstrategia(EstrategiaClientes e) {
        this.estrategia = e;
    }

    public ArrayList<Cliente> ejecutaEstrategia() {
        estrategia.ordena(alumnos);
        return alumnos;
    }
}
