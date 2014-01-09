package vista;

import java.text.DateFormat;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import modelo.Factura;
import modelo.ModeloGlobal;
import modelo.PeticionTrabajo;
import modelo.Presupuesto;

/**
 * Clase jFrame que muestra un formulario para dar de alta en modelo una
 * Petición de trabajo. Obtiene los datos del Form y al darle a guardar crea un
 * nuevo objeto en la instancia modelo.
 */
public class DarAltaPeticionTrabajo extends javax.swing.JFrame {

    ModeloGlobal modelo = ModeloGlobal.getInstancia();

    /**
     * Constructor principal de la clase. Se encarga de inicializar los
     * componentes de la interfaz.
     */
    public DarAltaPeticionTrabajo() {
        initComponents();
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
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextArtDec1 = new javax.swing.JTextField();
        jTextArtPrec1 = new javax.swing.JTextField();
        jTextArtDec2 = new javax.swing.JTextField();
        jTextArtPrec2 = new javax.swing.JTextField();
        jTextArtDec3 = new javax.swing.JTextField();
        jTextArtPrec3 = new javax.swing.JTextField();
        jTextArtDec4 = new javax.swing.JTextField();
        jTextArtPrec4 = new javax.swing.JTextField();
        jTextPrecTotal = new javax.swing.JTextField();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jComboArt1 = new javax.swing.JComboBox();
        jComboArt2 = new javax.swing.JComboBox();
        jComboArt3 = new javax.swing.JComboBox();
        jComboArt4 = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonVolver.setText("Volver");
        jButtonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverActionPerformed(evt);
            }
        });

        jButtonGuardar.setText("Guardar");
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });

        jLabel2.setText("Fecha:");

        jTextField2.setEditable(false);
        jTextField2.setText("Cliente 1");

        jLabel3.setText("Cliente:");

        jTextField3.setEditable(false);
        jTextField3.setText("1234567890");

        jLabel1.setText("Nº Peticion:");

        jLabel4.setText("Listado Artículos:");

        jLabel5.setText("Nombre");

        jLabel6.setText("Descripción");

        jLabel7.setText("Precio");

        jLabel8.setText("Total");

        jTextArtDec1.setEditable(false);

        jTextArtPrec1.setEditable(false);
        jTextArtPrec1.setText("0");

        jTextArtDec2.setEditable(false);

        jTextArtPrec2.setEditable(false);
        jTextArtPrec2.setText("0");

        jTextArtDec3.setEditable(false);

        jTextArtPrec3.setEditable(false);
        jTextArtPrec3.setText("0");

        jTextArtDec4.setEditable(false);

        jTextArtPrec4.setEditable(false);
        jTextArtPrec4.setText("0");

        jTextPrecTotal.setEditable(false);
        jTextPrecTotal.setText("0");

        jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));
        jFormattedTextField1.setText("09-ene-2013");

        jLabel9.setText("€");

        jLabel10.setText("€");

        jLabel11.setText("€");

        jLabel12.setText("€");

        jLabel13.setText("€");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jComboArt1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextArtDec1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextArtPrec1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(87, 87, 87)
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel7)
                                        .addGap(46, 46, 46))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jComboArt2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jTextArtDec2, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(jTextArtPrec2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jComboArt3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jTextArtDec3, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(jTextArtPrec3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jComboArt4, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jTextArtDec4, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(jTextArtPrec4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel8)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextPrecTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 12, Short.MAX_VALUE)
                                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(19, 19, 19)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButtonVolver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel1))
                                .addGap(97, 97, 97)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                                    .addComponent(jTextField2)
                                    .addComponent(jFormattedTextField1))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
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
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextArtDec1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextArtPrec1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jComboArt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextArtDec2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextArtPrec2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jComboArt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextArtDec3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextArtPrec3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jComboArt3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonGuardar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextArtDec4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextArtPrec4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(jComboArt4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonVolver)
                    .addComponent(jTextPrecTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Método que es llamado cuando es detectado el evento Action Performed del
     * componente jButtonVolver. Creamos el jFrame
     * ConsultarListaPeticionesTrabajo, lo hacemos visible y cerramos el jFrame
     * actual.
     *
     * @param evt Datos sobre el evento realizado.
     */
    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed
        JFrame frame = new ConsultarListaPeticionesTrabajo();
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonVolverActionPerformed

    /**
     * Método que es llamado cuando es detectado el evento Action Performed del
     * componente jButtonGuardar. En él, recogemos los datos del Form y creamos
     * un nuevo objeto PeticionTrabajo que guardamos en una instancia de
     * ModeloGlobal. En este caso además creamos un presupuesto y factura
     * acorde.
     *
     * @param evt Datos sobre el evento realizado.
     */
    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        Date fecha;
        try {
            fecha = DateFormat.getDateInstance().parse(jFormattedTextField1.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Fecha no válida. Usaremos la fecha actual.", "Error", JOptionPane.DEFAULT_OPTION);
            fecha = new Date();
        }

        // Creamos el objeto que vamos a guardar.
        PeticionTrabajo peticion = new PeticionTrabajo(modelo.getClientes().get(0), fecha);

        // Añadimos los artículos seleccionados.
        if (jComboArt1.getSelectedIndex() != 0) {
            peticion.addArticulo(modelo.getArticulos().get(jComboArt1.getSelectedIndex()-1));
        }
        if (jComboArt2.getSelectedIndex() != 0) {
            peticion.addArticulo(modelo.getArticulos().get(jComboArt2.getSelectedIndex()-1));
        }
        if (jComboArt3.getSelectedIndex() != 0) {
            peticion.addArticulo(modelo.getArticulos().get(jComboArt3.getSelectedIndex()-1));
        }
        if (jComboArt4.getSelectedIndex() != 0) {
            peticion.addArticulo(modelo.getArticulos().get(jComboArt4.getSelectedIndex()-1));
        }

        // Guardamos la petición y creamos la factura y presupuesto acorde a los
        // datos introducidos, guardandolos también en modelo.
        modelo.addPeticion(peticion);
        modelo.addFactura(new Factura(peticion, "Pendiente"));
        modelo.addPresupuesto(new Presupuesto(peticion, 10));

        JOptionPane.showMessageDialog(null, "Petición añadida correctamente.", "Correcto", JOptionPane.DEFAULT_OPTION);
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
            jTextArtDec1.setText("");
            jTextArtPrec1.setText("0");
        } else {
            jTextArtDec1.setText(modelo.getArticulos().get(jComboArt1.getSelectedIndex() - 1).getDescripcion());
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
            jTextArtDec2.setText("");
            jTextArtPrec2.setText("0");
        } else {
            jTextArtDec2.setText(modelo.getArticulos().get(jComboArt2.getSelectedIndex() - 1).getDescripcion());
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
            jTextArtDec3.setText("");
            jTextArtPrec3.setText("0");
        } else {
            jTextArtDec3.setText(modelo.getArticulos().get(jComboArt3.getSelectedIndex() - 1).getDescripcion());
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
            jTextArtDec4.setText("");
            jTextArtPrec4.setText("0");
        } else {
            jTextArtDec4.setText(modelo.getArticulos().get(jComboArt4.getSelectedIndex() - 1).getDescripcion());
            jTextArtPrec4.setText(String.valueOf(modelo.getArticulos().get(jComboArt4.getSelectedIndex() - 1).getCoste()));
        }
        jTextPrecTotal.setText(String.valueOf(Double.valueOf(jTextArtPrec1.getText()) + Double.valueOf(jTextArtPrec2.getText()) + Double.valueOf(jTextArtPrec3.getText()) + Double.valueOf(jTextArtPrec4.getText())));
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
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextArtDec1;
    private javax.swing.JTextField jTextArtDec2;
    private javax.swing.JTextField jTextArtDec3;
    private javax.swing.JTextField jTextArtDec4;
    private javax.swing.JTextField jTextArtPrec1;
    private javax.swing.JTextField jTextArtPrec2;
    private javax.swing.JTextField jTextArtPrec3;
    private javax.swing.JTextField jTextArtPrec4;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextPrecTotal;
    // End of variables declaration//GEN-END:variables
}
