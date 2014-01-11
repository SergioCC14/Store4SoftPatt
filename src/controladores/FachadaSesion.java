package controladores;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import vista.PrincipalAlmacen;
import vista.PrincipalCoordinador;

/**
 * La fachada crea un ángulo de seguridad pues el usuario no accede directamente
 * a su sección, sino que es llevado previamente a la fachada que le
 * redirecciona al menú principal que corresponde a ese usuario. Simplificando
 * los subsistemas.
 */
public class FachadaSesion {

    /**
     * Si el usuario introducido es Gestor de Almacén, se le redirige al menú
     * principal del Almacén.
     */
    public void accesoAlmacen() {
        JFrame frameAlmacen = new PrincipalAlmacen();
        frameAlmacen.setVisible(true);
    }

    /**
     * Si el usuario introducido es Coordinador Tecnico, se le redirige al menú
     * principal de Coordinadores Tecnicos.
     */
    public void accesoCoordinador() {
        JFrame frameAlmacen = new PrincipalCoordinador();
        frameAlmacen.setVisible(true);
    }

    /**
     * Si el usuario introducido no es correcto, se le muestra por pantalla un
     * error y se le pide introducir de nuevo los datos.
     */
    public void accesoErroneo() {
        JOptionPane.showMessageDialog(null, "El nombre de usuario y/o contraseña introducidos"
                + " no son correctos.", "Error", JOptionPane.ERROR_MESSAGE);
    }
}
