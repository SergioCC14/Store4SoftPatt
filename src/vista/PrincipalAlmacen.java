package vista;

import javax.swing.JFrame;

/**
 * Clase jFrame que muestra las opciones que tiene un Gestor de Almacén una vez
 * ha accedido al sistema. Una serie de botones le redirigirán a la sección
 * elegida, y Cerrar Sesión volverá al jForm InicioSesion.
 */
public class PrincipalAlmacen extends javax.swing.JFrame {

    /**
     * Constructor principal de la clase. Se encarga de inicializar los
     * componentes de la interfaz.
     */
    public PrincipalAlmacen() {
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

        jButtonArticulos = new javax.swing.JButton();
        jButtonPedidos = new javax.swing.JButton();
        jButtonCerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Store4SoftPatt - Menú Principal");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jButtonArticulos.setText("Artículos");
        jButtonArticulos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonArticulosActionPerformed(evt);
            }
        });

        jButtonPedidos.setText("Pedidos");
        jButtonPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPedidosActionPerformed(evt);
            }
        });

        jButtonCerrar.setText("Cerrar Sesión");
        jButtonCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCerrarActionPerformed(evt);
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonCerrar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonArticulos, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonArticulos)
                    .addComponent(jButtonPedidos))
                .addGap(18, 18, 18)
                .addComponent(jButtonCerrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Método que es llamado cuando es detectado el evento Action Performed del
     * componente jButtonCerrar. Creamos el jFrame InicioSesion, lo hacemos
     * visible y cerramos el jFrame actual.
     *
     * @param evt Datos sobre el evento realizado.
     */
    private void jButtonCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCerrarActionPerformed
        JFrame frame = new InicioSesion();
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonCerrarActionPerformed

    /**
     * Método que es llamado cuando es detectado el evento Action Performed del
     * componente jButtonArticulos. Creamos el jFrame
     * ConsultarListaArticulosAlmacen, lo hacemos visible y cerramos el jFrame
     * actual.
     *
     * @param evt Datos sobre el evento realizado.
     */
    private void jButtonArticulosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonArticulosActionPerformed
        JFrame frame = new ConsultarListaArticulosAlmacen();
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonArticulosActionPerformed

    /**
     * Método que es llamado cuando es detectado el evento Action Performed del
     * componente jButtonPedidos. Creamos el jFrame ConsultarListaPedidos, lo
     * hacemos visible y cerramos el jFrame actual.
     *
     * @param evt Datos sobre el evento realizado.
     */
    private void jButtonPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPedidosActionPerformed
        JFrame frame = new ConsultarListaPedidos();
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonPedidosActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonArticulos;
    private javax.swing.JButton jButtonCerrar;
    private javax.swing.JButton jButtonPedidos;
    // End of variables declaration//GEN-END:variables
}
