package vista;

import java.text.DateFormat;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import modelo.ModeloGlobal;
import modelo.Pedido;

/**
 * Clase jFrame que muestra un formulario para dar de alta en modelo un Pedido.
 * Obtiene los datos del Form y al darle a guardar crea un nuevo objeto en la
 * instancia modelo.
 */
public class DarAltaPedido extends javax.swing.JFrame {

    ModeloGlobal modelo = ModeloGlobal.getInstancia();

    /**
     * Constructor principal de la clase. Se encarga de inicializar los
     * componentes de la interfaz.
     */
    public DarAltaPedido() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * Este método es llamado por el constructor para inicializar el form.
     * PELIGRO: NO modificar este código. El contenido de este método es siempre
     * generado por el editor del Form.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonVolver = new javax.swing.JButton();
        jButtonGuardar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        jTextField20 = new javax.swing.JTextField();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jComboArt1 = new javax.swing.JComboBox();
        jComboArt2 = new javax.swing.JComboBox();
        jComboArt3 = new javax.swing.JComboBox();
        jComboArt4 = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Store4SoftPatt - Dar Alta Pedido");
        setResizable(false);

        jButtonVolver.setText("Volver");
        jButtonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverActionPerformed(evt);
            }
        });

        jButtonGuardar.setText("Hacer Pedido");
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });

        jLabel2.setText("Fecha:");

        jTextField3.setEditable(false);
        jTextField3.setText("-");

        jLabel1.setText("Nº Pedido:");

        jLabel4.setText("Listado Artículos:");

        jLabel5.setText("Nombre:");

        jLabel7.setText("Precio");

        jLabel8.setText("Total");

        jTextField6.setEditable(false);
        jTextField6.setText("0");

        jTextField11.setEditable(false);
        jTextField11.setText("0");

        jTextField15.setEditable(false);
        jTextField15.setText("0");

        jTextField19.setEditable(false);
        jTextField19.setText("0");

        jTextField20.setEditable(false);
        jTextField20.setText("0");

        jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.MEDIUM))));
        jFormattedTextField1.setText("12-mar-2013");

        jComboArt1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ninguno", "Articulo1", "Articulo2" }));
        jComboArt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboArt1ActionPerformed(evt);
            }
        });

        jComboArt2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ninguno", "Articulo1", "Articulo2" }));
        jComboArt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboArt2ActionPerformed(evt);
            }
        });

        jComboArt3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ninguno", "Articulo1", "Articulo2" }));
        jComboArt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboArt3ActionPerformed(evt);
            }
        });

        jComboArt4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ninguno", "Articulo1", "Articulo2" }));
        jComboArt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboArt4ActionPerformed(evt);
            }
        });

        jLabel3.setText("€");

        jLabel6.setText("€");

        jLabel9.setText("€");

        jLabel10.setText("€");

        jLabel11.setText("€");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(97, 97, 97)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                            .addComponent(jFormattedTextField1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jComboArt1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboArt2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboArt3, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboArt4, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(jLabel7))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jTextField15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(jTextField19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jTextField6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jButtonVolver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jButtonGuardar)))))))
                    .addComponent(jLabel4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboArt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboArt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboArt3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboArt4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonGuardar)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonVolver)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Método que es llamado cuando es detectado el evento Action Performed del
     * componente jButtonVolver. Creamos el jFrame ConsultarListaPedidos, lo
     * hacemos visible y cerramos el jFrame actual.
     *
     * @param evt Datos sobre el evento realizado.
     */
    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed
        JFrame frame = new ConsultarListaPedidos();
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonVolverActionPerformed

    /**
     * Método que es llamado cuando es detectado el evento Action Performed del
     * componente jButtonGuardar. En él, recogemos los datos del Form y creamos
     * un nuevo objeto Pedido que guardamos en una instancia de ModeloGlobal.
     * Después avisamos a los proveedores (patrón Observer) de posibles cambios.
     *
     * @param evt Datos sobre el evento realizado.
     */
    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        Date fecha;
        try {
            fecha = DateFormat.getDateInstance().parse(jFormattedTextField1.getText());
        } catch (Exception e) {
            fecha = new Date();
        }

        // Creamos el objeto que vamos a guardar.
        Pedido pedido = new Pedido(fecha);

        // Añadimos los artículos seleccionados.
        if (jComboArt1.getSelectedIndex() != 0) {
            pedido.addArticulo(modelo.getArticulos().get(jComboArt1.getSelectedIndex() - 1));
        }
        if (jComboArt2.getSelectedIndex() != 0) {
            pedido.addArticulo(modelo.getArticulos().get(jComboArt2.getSelectedIndex() - 1));
        }
        if (jComboArt3.getSelectedIndex() != 0) {
            pedido.addArticulo(modelo.getArticulos().get(jComboArt3.getSelectedIndex() - 1));
        }
        if (jComboArt4.getSelectedIndex() != 0) {
            pedido.addArticulo(modelo.getArticulos().get(jComboArt4.getSelectedIndex() - 1));
        }

        // Guardamos el pedido y avisamos a los observadores de la posibilidad de
        // que tengan pedidos nuevos pendientes de envío.
        modelo.addPedido(pedido);
        modelo.sujeto.setPedido(pedido);
        modelo.sujeto.notificarObservadores();

        JOptionPane.showMessageDialog(null, "Pedido añadido correctamente.", "Correcto", JOptionPane.DEFAULT_OPTION);
    }//GEN-LAST:event_jButtonGuardarActionPerformed

    /**
     * Método que es llamado cuando es detectado el evento Action Performed del
     * componente jComboArt1. Al seleccionar un artículo, el método actualiza la
     * descripción y precio de este, además del precio total.
     *
     * @param evt Datos sobre el evento realizado.
     */
    private void jComboArt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboArt1ActionPerformed
        if (jComboArt1.getSelectedIndex() == 0) {
            jTextField6.setText("0");
        } else {
            jTextField6.setText(String.valueOf(modelo.getArticulos().get(jComboArt1.getSelectedIndex() - 1).getCoste()));
        }
        jTextField20.setText(String.valueOf(Double.valueOf(jTextField6.getText()) + Double.valueOf(jTextField11.getText()) + Double.valueOf(jTextField15.getText()) + Double.valueOf(jTextField19.getText())));
    }//GEN-LAST:event_jComboArt1ActionPerformed

    /**
     * Método que es llamado cuando es detectado el evento Action Performed del
     * componente jComboArt2. Al seleccionar un artículo, el método actualiza la
     * descripción y precio de este, además del precio total.
     *
     * @param evt Datos sobre el evento realizado.
     */
    private void jComboArt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboArt2ActionPerformed
        if (jComboArt2.getSelectedIndex() == 0) {
            jTextField11.setText("0");
        } else {
            jTextField11.setText(String.valueOf(modelo.getArticulos().get(jComboArt2.getSelectedIndex() - 1).getCoste()));
        }
        jTextField20.setText(String.valueOf(Double.valueOf(jTextField6.getText()) + Double.valueOf(jTextField11.getText()) + Double.valueOf(jTextField15.getText()) + Double.valueOf(jTextField19.getText())));
    }//GEN-LAST:event_jComboArt2ActionPerformed

    /**
     * Método que es llamado cuando es detectado el evento Action Performed del
     * componente jComboArt3. Al seleccionar un artículo, el método actualiza la
     * descripción y precio de este, además del precio total.
     *
     * @param evt Datos sobre el evento realizado.
     */
    private void jComboArt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboArt3ActionPerformed
        if (jComboArt3.getSelectedIndex() == 0) {
            jTextField15.setText("0");
        } else {
            jTextField15.setText(String.valueOf(modelo.getArticulos().get(jComboArt3.getSelectedIndex() - 1).getCoste()));
        }
        jTextField20.setText(String.valueOf(Double.valueOf(jTextField6.getText()) + Double.valueOf(jTextField11.getText()) + Double.valueOf(jTextField15.getText()) + Double.valueOf(jTextField19.getText())));
    }//GEN-LAST:event_jComboArt3ActionPerformed

    /**
     * Método que es llamado cuando es detectado el evento Action Performed del
     * componente jComboArt4. Al seleccionar un artículo, el método actualiza la
     * descripción y precio de este, además del precio total.
     *
     * @param evt Datos sobre el evento realizado.
     */
    private void jComboArt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboArt4ActionPerformed
        if (jComboArt4.getSelectedIndex() == 0) {
            jTextField19.setText("0");
        } else {
            jTextField19.setText(String.valueOf(modelo.getArticulos().get(jComboArt4.getSelectedIndex()).getCoste()));
        }
        jTextField20.setText(String.valueOf(Double.valueOf(jTextField6.getText()) + Double.valueOf(jTextField11.getText()) + Double.valueOf(jTextField15.getText()) + Double.valueOf(jTextField19.getText())));
    }//GEN-LAST:event_jComboArt4ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JButton jButtonVolver;
    private javax.swing.JComboBox jComboArt1;
    private javax.swing.JComboBox jComboArt2;
    private javax.swing.JComboBox jComboArt3;
    private javax.swing.JComboBox jComboArt4;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
