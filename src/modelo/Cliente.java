package modelo;

public class Cliente {
    String id, nombre, apellidos, dni, direccion, telefono;
    char tipo;
    
    public Cliente (String nombre, String apellidos, String dni, String direccion, String telefono, char tipo) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.direccion = direccion;
        this.telefono = telefono;
        this.tipo = tipo;
    }

    public Cliente (Cliente original) {
        this.id = original.getId();
        this.nombre = original.getNombre();
        this.apellidos = original.getApellidos();
        this.dni = original.getDni();
        this.direccion = original.getDireccion();
        this.telefono = original.getTelefono();
        this.tipo = original.tipo;
    }
    
    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }
    
    public String[] ToArray() {
        String[] array = {this.nombre, this.apellidos, this.dni, this.direccion, this.telefono, String.valueOf(tipo)};
        return array;
    }
}
