package vista;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * La fachada crea un angulo de seguridad pues el usuario no accede directamente
 * a su sección, si no que es llevado previamente a la fachada que le
 * redirecciona al menu principal que corresponde a ese usuario. Simplificando
 * los subsistemas
 */
public class FachadaSesion {

    public void accesoTecnico() {
        JFrame frameAlmacen = new PrincipalTecnicos();
        frameAlmacen.setVisible(true);
    }

    public void accesoAlmacen() {
        JFrame frameAlmacen = new PrincipalAlmacen();
        frameAlmacen.setVisible(true);
    }

    public void accesoCoordinador() {
        JFrame frameAlmacen = new PrincipalCoordinador();
        frameAlmacen.setVisible(true);
    }

    public void accesoErroneo() {
        JOptionPane.showMessageDialog(null, "El nombre de usuario y/o contraseña introducidos"
                + " no son correctos.", "Error", JOptionPane.ERROR_MESSAGE);
    }
}
