package vista;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import modelo.Articulo;
import modelo.ModeloGlobal;
import modelo.Pedido;

/**
 * Clase jFrame que muestra los datos de un pedido seleccionado previamente en
 * el jFrame ConsultarListaPedidos. Obtiene los datos de la lista de pedidos de
 * una instancia a la clase modelo, y los muestra, dando la opción de modificar
 * el pedido, o borrarlo si el usuario así lo necesita.
 */
public class ConsultarPedido extends javax.swing.JFrame {

    ModeloGlobal modelo = ModeloGlobal.getInstancia();
    Pedido pedido;
    int pedidoSel;

    /**
     * Constructor principal de la clase. Se encarga de inicializar los
     * componentes de la interfaz y de actualizar estos con los datos aportados
     * desde modelo por el pedido seleccionado en la clase
     * ConsultarListaPedidos.
     *
     * @param pedidoSel int que indica el número del pedido seleccionado en la
     * lista de pedidos de Modelo Global.
     */
    public ConsultarPedido(int pedidoSel) {
        initComponents();
        setLocationRelativeTo(null);
        this.pedidoSel = pedidoSel;

        pedido = modelo.getPedidos().get(pedidoSel);

        jFormattedTextField1.setText(DateFormat.getDateInstance().format(pedido.getFecha()));
        jTextField3.setText(pedido.getId());
        try {
            jComboArt1.setSelectedItem(pedido.getArticulos().get(0).getNombre());
            jTextArtPrec1.setText(String.valueOf(pedido.getArticulos().get(0).getCoste()));
            jComboArt2.setSelectedItem(pedido.getArticulos().get(1).getNombre());
            jTextArtPrec2.setText(String.valueOf(pedido.getArticulos().get(1).getCoste()));
            jComboArt3.setSelectedItem(pedido.getArticulos().get(2).getNombre());
            jTextArtPrec3.setText(String.valueOf(pedido.getArticulos().get(2).getCoste()));
            jComboArt4.setSelectedItem(pedido.getArticulos().get(3).getNombre());
            jTextArtPrec4.setText(String.valueOf(pedido.getArticulos().get(3).getCoste()));
        } catch (Exception e) {
        }

        jTextPrecTotal.setText(String.valueOf(Double.valueOf(jTextArtPrec1.getText()) + Double.valueOf(jTextArtPrec2.getText()) + Double.valueOf(jTextArtPrec3.getText()) + Double.valueOf(jTextArtPrec4.getText())));
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
        jButtonModificar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextArtPrec1 = new javax.swing.JTextField();
        jTextArtPrec2 = new javax.swing.JTextField();
        jTextArtPrec3 = new javax.swing.JTextField();
        jTextArtPrec4 = new javax.swing.JTextField();
        jTextPrecTotal = new javax.swing.JTextField();
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
        jButtonBorrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Store4SoftPatt - Consultar Pedido");
        setResizable(false);

        jButtonVolver.setText("Volver");
        jButtonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverActionPerformed(evt);
            }
        });

        jButtonModificar.setText("Modificar");
        jButtonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarActionPerformed(evt);
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

        jTextArtPrec1.setEditable(false);
        jTextArtPrec1.setText("0");

        jTextArtPrec2.setEditable(false);
        jTextArtPrec2.setText("0");

        jTextArtPrec3.setEditable(false);
        jTextArtPrec3.setText("0");

        jTextArtPrec4.setEditable(false);
        jTextArtPrec4.setText("0");

        jTextPrecTotal.setEditable(false);
        jTextPrecTotal.setText("0");

        jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));

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

        jButtonBorrar.setText("Borrar");
        jButtonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBorrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addGap(97, 97, 97)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                                    .addComponent(jFormattedTextField1)))
                            .addComponent(jLabel4))
                        .addGap(0, 0, Short.MAX_VALUE))
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
                                        .addComponent(jTextPrecTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jTextArtPrec2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jTextArtPrec3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(jTextArtPrec4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jTextArtPrec1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButtonModificar)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jButtonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jButtonBorrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap())
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
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextArtPrec1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboArt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextArtPrec2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboArt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextArtPrec3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboArt3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextArtPrec4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboArt4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextPrecTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonModificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonBorrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
     * componente jButtonModificar. En él, recogemos los datos del Form y
     * mediante el uso del patrón Prototype, actualizamos el pedido seleccionado
     * en el Modelo Global que usamos en la aplicación.
     *
     * @param evt Datos sobre el evento realizado.
     */
    private void jButtonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarActionPerformed
        Date fecha;
        try {
            fecha = DateFormat.getDateInstance().parse(jFormattedTextField1.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Fecha no válida. Usaremos la fecha actual.", "Error", JOptionPane.DEFAULT_OPTION);
            fecha = new Date();
        }

        // Aplicamos patrón prototype generando una copia del original.
        Pedido pedidoNew = new Pedido(pedido);

        // Modificamos la copia con los nuevos datos del Form.
        pedidoNew.setFecha(fecha);

        ArrayList<Articulo> articulos = new ArrayList<>();
        if (jComboArt1.getSelectedIndex() != 0) {
            articulos.add(modelo.getArticulos().get(jComboArt1.getSelectedIndex() - 1));
        }
        if (jComboArt2.getSelectedIndex() != 0) {
            articulos.add(modelo.getArticulos().get(jComboArt2.getSelectedIndex() - 1));
        }
        if (jComboArt3.getSelectedIndex() != 0) {
            articulos.add(modelo.getArticulos().get(jComboArt3.getSelectedIndex() - 1));
        }
        if (jComboArt4.getSelectedIndex() != 0) {
            articulos.add(modelo.getArticulos().get(jComboArt4.getSelectedIndex() - 1));
        }
        pedidoNew.setArticulos(articulos);

        // Actualizamos el pedido original en Modelo Global con el pedido copiado
        // y modificado previamente.
        modelo.modPedido(pedidoSel, pedidoNew);
        JOptionPane.showMessageDialog(null, "Pedido modificado correctamente.", "Correcto", JOptionPane.DEFAULT_OPTION);

        // Usamos el patrón Observer para avisar a todos los proveedores observadores
        // y avisarles de que hay posibles pedidos pendientes de envío. 
        modelo.sujeto.setPedido(pedidoNew);
        modelo.sujeto.notificarObservadores();
    }//GEN-LAST:event_jButtonModificarActionPerformed

    /**
     * Método que es llamado cuando es detectado el evento Action Performed del
     * componente jComboArt1. Al seleccionar un artículo, el método actualiza la
     * descripción y precio de este, además del precio total.
     *
     * @param evt Datos sobre el evento realizado.
     */
    private void jComboArt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboArt1ActionPerformed
        if (jComboArt1.getSelectedIndex() == 0) {
            jTextArtPrec1.setText("0");
        } else {
            jTextArtPrec1.setText(String.valueOf(modelo.getArticulos().get(jComboArt1.getSelectedIndex() - 1).getCoste()));
        }
        jTextPrecTotal.setText(String.valueOf(Double.valueOf(jTextArtPrec1.getText()) + Double.valueOf(jTextArtPrec2.getText()) + Double.valueOf(jTextArtPrec3.getText()) + Double.valueOf(jTextArtPrec4.getText())));
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
            jTextArtPrec2.setText("0");
        } else {
            jTextArtPrec2.setText(String.valueOf(modelo.getArticulos().get(jComboArt2.getSelectedIndex() - 1).getCoste()));
        }
        jTextPrecTotal.setText(String.valueOf(Double.valueOf(jTextArtPrec1.getText()) + Double.valueOf(jTextArtPrec2.getText()) + Double.valueOf(jTextArtPrec3.getText()) + Double.valueOf(jTextArtPrec4.getText())));
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
            jTextArtPrec3.setText("0");
        } else {
            jTextArtPrec3.setText(String.valueOf(modelo.getArticulos().get(jComboArt3.getSelectedIndex() - 1).getCoste()));
        }
        jTextPrecTotal.setText(String.valueOf(Double.valueOf(jTextArtPrec1.getText()) + Double.valueOf(jTextArtPrec2.getText()) + Double.valueOf(jTextArtPrec3.getText()) + Double.valueOf(jTextArtPrec4.getText())));
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
            jTextArtPrec4.setText("0");
        } else {
            jTextArtPrec4.setText(String.valueOf(modelo.getArticulos().get(jComboArt4.getSelectedIndex() - 1).getCoste()));
        }
        jTextPrecTotal.setText(String.valueOf(Double.valueOf(jTextArtPrec1.getText()) + Double.valueOf(jTextArtPrec2.getText()) + Double.valueOf(jTextArtPrec3.getText()) + Double.valueOf(jTextArtPrec4.getText())));
    }//GEN-LAST:event_jComboArt4ActionPerformed

    /**
     * Método que es llamado cuando es detectado el evento Action Performed del
     * componente jButtonBorrar. Mostramos un mensaje de confirmación para
     * borrar el pedido, y de aceptar, borramos el pedido del Modelo Global y
     * redirigimos al Form ConsultarListaPedidos.
     *
     * @param evt Datos sobre el evento realizado.
     */
    private void jButtonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBorrarActionPerformed
        if (JOptionPane.OK_OPTION == JOptionPane.showConfirmDialog(null, "¿Seguro que quiere borrar?.", "Confirmar", JOptionPane.YES_NO_OPTION)) {
            modelo.removePedido(pedidoSel);
            JFrame frame = new ConsultarListaPedidos();
            frame.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_jButtonBorrarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBorrar;
    private javax.swing.JButton jButtonModificar;
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
    private javax.swing.JTextField jTextArtPrec1;
    private javax.swing.JTextField jTextArtPrec2;
    private javax.swing.JTextField jTextArtPrec3;
    private javax.swing.JTextField jTextArtPrec4;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextPrecTotal;
    // End of variables declaration//GEN-END:variables
}
