package controladores.estrategias;

import java.util.ArrayList;
import modelo.Articulo;

public class ContextoArticulos {

    private EstrategiaArticulos estrategia;
    private ArrayList<Articulo> alumnos;

    public ContextoArticulos(EstrategiaArticulos e, ArrayList<Articulo> u) {
        this.estrategia = e;
        this.alumnos = u;
    }

    public void setEstrategia(EstrategiaArticulos e) {
        this.estrategia = e;
    }

    public ArrayList<Articulo> ejecutaEstrategia() {
        estrategia.ordena(alumnos);
        return alumnos;
    }
}
