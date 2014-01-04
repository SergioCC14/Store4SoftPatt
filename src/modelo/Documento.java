package modelo;

import java.util.Date;

public interface Documento {

    public double getPrecio();
    
    public void setPrecio(double precio);
    
    public String getId();
    
    public void setId(String id);
    
    public Date getFecha();
    
    public void setFecha(Date fecha);
    
    public Cliente getCliente();
    
    public void setCliente(Cliente cliente);
    
    public String[] ToArray();
}
