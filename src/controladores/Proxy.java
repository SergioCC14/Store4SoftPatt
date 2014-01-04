package controladores;


public class Proxy implements Servidor {
    
    private Servidor serv;
    
    public Proxy(Servidor serv) {
        this.serv = serv;
    }
    
    public void setServidor(Servidor serv) {
        this.serv = serv;
    }
    
    public Servidor getServidor() {
        return serv;
    }
    
    @Override
    public String enviar(String nomFact) {
        return "\n(Subiendo desde el proxy...)" + serv.enviar(nomFact);
    }
}
