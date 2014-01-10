package vista;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import modelo.Cliente;
import modelo.ModeloGlobal;

/**
 * Clase jFrame que muestra los datos de un cliente seleccionado previamente en
 * el jFrame ConsultarListaClientes. Obtiene los datos de la lista de clientes
 * de una instancia a la clase modelo, y los muestra, dando la opción de
 * modificar el cliente o de borrarlo si el usuario así lo necesita.
 */
public class ConsultarCliente extends javax.swing.JFrame {

    ModeloGlobal modelo = ModeloGlobal.getInstancia();
    Cliente cliente;
    int clienteSel;

    /**
     * Constructor principal de la clase. Se encarga de inicializar los
     * componentes de la interfaz y de actualizar estos con los datos aportados
     * desde modelo por el cliente seleccionado en la clase
     * ConsultarListaClientes.
     *
     * @param clienteSel int que indica el número del cliente seleccionado en la
     * lista de clientes de Modelo Global.
     */
    public ConsultarCliente(int clienteSel) {
        initComponents();
        setLocationRelativeTo(null);
        this.clienteSel = clienteSel;

        cliente = modelo.getClientes().get(clienteSel);

        jTextField23.setText(cliente.getId());
        jTextField1.setText(cliente.getNombre());
        jTextField2.setText(cliente.getApellidos());
        jTextField3.setText(cliente.getDni());
        jTextField21.setText(cliente.getDireccion());
        jTextField22.setText(cliente.getTelefono());
        if (cliente.getTipo() == 'P') {
            jRadioButtonParticular.setSelected(true);
        } else {
            jRadioButtonEmpresa.setSelected(true);
        }
    }

    /**
     * Este método es llamado por el constructor para inicializar el form.
     * PELIGRO: NO modificar este código. El contenido de este método es siempre
     * generado por el editor del Form.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup = new javax.swing.ButtonGroup();
        jButtonVolver = new javax.swing.JButton();
        jButtonBorrar = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField21 = new javax.swing.JTextField();
        jRadioButtonParticular = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        jRadioButtonEmpresa = new javax.swing.JRadioButton();
        jTextField22 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField23 = new javax.swing.JTextField();
        jButtonModificar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Store4SoftPatt - Consultar Cliente");
        setResizable(false);

        jButtonVolver.setText("Volver");
        jButtonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverActionPerformed(evt);
            }
        });

        jButtonBorrar.setText("Borrar");
        jButtonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBorrarActionPerformed(evt);
            }
        });

        jTextField1.setText("Nombre1");

        jLabel2.setText("Nombre:");

        jTextField2.setText("Apellido1 Apellido2");

        jLabel3.setText("Apellidos:");

        jTextField3.setText("12345678X");

        jLabel1.setText("DNI:");

        jLabel4.setText("Dirección:");

        jTextField21.setText("Direccion Completa 1");

        buttonGroup.add(jRadioButtonParticular);
        jRadioButtonParticular.setSelected(true);
        jRadioButtonParticular.setText("Particular");

        jLabel9.setText("Tipo de Cliente:");

        buttonGroup.add(jRadioButtonEmpresa);
        jRadioButtonEmpresa.setText("Empresa");

        jTextField22.setText("123456789");

        jLabel10.setText("Telefono:");

        jLabel11.setText("ID. Cliente:");
        jLabel11.setToolTipText("");

        jTextField23.setEditable(false);
        jTextField23.setText("12345");

        jButtonModificar.setText("Modificar");
        jButtonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField23)
                            .addComponent(jTextField3)
                            .addComponent(jTextField2)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButtonEmpresa)
                                    .addComponent(jRadioButtonParticular))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButtonBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonModificar)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel10))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(0, 79, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel4)
                    .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel10)
                    .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButtonParticular)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButtonEmpresa)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 17, Short.MAX_VALUE)
                        .addComponent(jButtonModificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonBorrar)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonVolver)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Método que es llamado cuando es detectado el evento Action Performed del
     * componente jButtonVolver. Creamos el jFrame ConsultarListaClientes, lo
     * hacemos visible y cerramos el jFrame actual.
     *
     * @param evt Datos sobre el evento realizado.
     */
    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed
        JFrame frame = new ConsultarListaClientes();
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonVolverActionPerformed

    /**
     * Método que es llamado cuando es detectado el evento Action Performed del
     * componente jButtonBorrar. Mostramos un mensaje de confirmación para
     * borrar el cliente, y de aceptar, borramos el cliente del Modelo Global y
     * redirigimos al Form ConsultarListaClientes.
     *
     * @param evt Datos sobre el evento realizado.
     */
    private void jButtonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBorrarActionPerformed
        if (JOptionPane.OK_OPTION == JOptionPane.showConfirmDialog(null, "¿Seguro que quiere borrar?.", "Confirmar", JOptionPane.YES_NO_OPTION)) {
            modelo.removeCliente(clienteSel);
            JFrame frame = new ConsultarListaClientes();
            frame.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_jButtonBorrarActionPerformed

    /**
     * Método que es llamado cuando es detectado el evento Action Performed del
     * componente jButtonModificar. En él, recogemos los datos del Form y
     * mediante el uso del patrón Prototype, actualizamos el cliente
     * seleccionado en el Modelo Global que usamos en la aplicación.
     *
     * @param evt Datos sobre el evento realizado.
     */
    private void jButtonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarActionPerformed
        char tipo = jRadioButtonParticular.isSelected() ? 'P' : 'E';

        // Aplicamos patrón prototype generando una copia del original.
        Cliente clienteNew = new Cliente(cliente);

        // Modificamos la copia con los nuevos datos del Form.
        clienteNew.setNombre(jTextField1.getText());
        clienteNew.setApellidos(jTextField2.getText());
        clienteNew.setDni(jTextField3.getText());
        clienteNew.setDireccion(jTextField21.getText());
        clienteNew.setTelefono(jTextField22.getText());
        clienteNew.setTipo(tipo);

        // Actualizamos el cliente original en Modelo Global con el cliente copiado
        // y modificado previamente.
        modelo.modCliente(clienteSel, clienteNew);
        JOptionPane.showMessageDialog(null, "Cliente modificado correctamente.", "Correcto", JOptionPane.DEFAULT_OPTION);
    }//GEN-LAST:event_jButtonModificarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JButton jButtonBorrar;
    private javax.swing.JButton jButtonModificar;
    private javax.swing.JButton jButtonVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButtonEmpresa;
    private javax.swing.JRadioButton jRadioButtonParticular;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
