package modelo;

import controladores.Decorator;


public class Presupuesto extends Decorator{
    private int horasPrevistas;
    
    public Presupuesto(Documento d, int horasPrevistas){
        super(d);
        this.horasPrevistas = horasPrevistas;
    }
    
    public int getHoras(){
        return this.horasPrevistas;
    }
    
   public void setHoras(int horas){
       this.horasPrevistas = horas;
   }
   
   @Override
    public String[] ToArray(){
        String[] array = {super.ToArray() + String.valueOf(this.horasPrevistas)};
        return array;
    }   
}
