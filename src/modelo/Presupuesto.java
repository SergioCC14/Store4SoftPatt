package modelo;

import controladores.Decorator;
import java.util.ArrayList;
import java.util.Arrays;

public class Presupuesto extends Decorator {

    private int horasPrevistas;

    public Presupuesto(Documento d, int horasPrevistas) {
        super(d);
        this.horasPrevistas = horasPrevistas;
    }

    public Presupuesto(Presupuesto original) {
        super(original.getDocumento());
        this.horasPrevistas = original.getHoras();
    }
    
    public int getHoras() {
        return this.horasPrevistas;
    }

    public void setHoras(int horas) {
        this.horasPrevistas = horas;
    }

    @Override
    public String[] ToArray() {
        String[] array = super.ToArray();
        ArrayList<String> aux = new ArrayList<>();
        aux.addAll(Arrays.asList(array));
        aux.add(String.valueOf(this.horasPrevistas));
        String[] array2 = new String[6];
        aux.toArray(array2);
        return array2;
    }
}
