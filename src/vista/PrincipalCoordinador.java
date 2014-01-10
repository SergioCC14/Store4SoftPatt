package vista;

import javax.swing.JFrame;

/**
 * Clase jFrame que muestra las opciones que tiene un Coordinador Técnico una
 * vez ha accedido al sistema. Una serie de botones le redirigirán a la sección
 * elegida, y Cerrar Sesión volverá al jForm InicioSesion.
 */
public class PrincipalCoordinador extends javax.swing.JFrame {

    /**
     * Constructor principal de la clase. Se encarga de inicializar los
     * componentes de la interfaz.
     */
    public PrincipalCoordinador() {
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

        jButtonFacturas = new javax.swing.JButton();
        jButtonPresupuestos = new javax.swing.JButton();
        jButtonArticulos = new javax.swing.JButton();
        jButtonPeticiones = new javax.swing.JButton();
        jButtonClientes = new javax.swing.JButton();
        jButtonCerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Store4SoftPatt - Menú Principal");
        setResizable(false);

        jButtonFacturas.setText("Facturación");
        jButtonFacturas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFacturasActionPerformed(evt);
            }
        });

        jButtonPresupuestos.setText("Presupuestos");
        jButtonPresupuestos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPresupuestosActionPerformed(evt);
            }
        });

        jButtonArticulos.setText("Artículos");
        jButtonArticulos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonArticulosActionPerformed(evt);
            }
        });

        jButtonPeticiones.setLabel("Peticiones de Trabajo");
        jButtonPeticiones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPeticionesActionPerformed(evt);
            }
        });

        jButtonClientes.setText("Clientes");
        jButtonClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClientesActionPerformed(evt);
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonCerrar)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonFacturas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonPresupuestos, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonArticulos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonPeticiones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jButtonClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonFacturas)
                    .addComponent(jButtonArticulos)
                    .addComponent(jButtonClientes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonPeticiones)
                    .addComponent(jButtonPresupuestos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
     * ConsultarListaArticulosCoordinador, lo hacemos visible y cerramos el
     * jFrame actual.
     *
     * @param evt Datos sobre el evento realizado.
     */
    private void jButtonArticulosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonArticulosActionPerformed
        JFrame frame = new ConsultarListaArticulosCoordinador();
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonArticulosActionPerformed

    /**
     * Método que es llamado cuando es detectado el evento Action Performed del
     * componente jButtonFacturas. Creamos el jFrame ConsultarListaFacturas, lo
     * hacemos visible y cerramos el jFrame actual.
     *
     * @param evt Datos sobre el evento realizado.
     */
    private void jButtonFacturasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFacturasActionPerformed
        JFrame frame = new ConsultarListaFacturas();
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonFacturasActionPerformed

    /**
     * Método que es llamado cuando es detectado el evento Action Performed del
     * componente jButtonClientes. Creamos el jFrame ConsultarListaClientes, lo
     * hacemos visible y cerramos el jFrame actual.
     *
     * @param evt Datos sobre el evento realizado.
     */
    private void jButtonClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClientesActionPerformed
        JFrame frame = new ConsultarListaClientes();
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonClientesActionPerformed

    /**
     * Método que es llamado cuando es detectado el evento Action Performed del
     * componente jButtonPresupuestos. Creamos el jFrame
     * ConsultarListaPresupuestos, lo hacemos visible y cerramos el jFrame
     * actual.
     *
     * @param evt Datos sobre el evento realizado.
     */
    private void jButtonPresupuestosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPresupuestosActionPerformed
        JFrame frame = new ConsultarListaPresupuestos();
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonPresupuestosActionPerformed

    /**
     * Método que es llamado cuando es detectado el evento Action Performed del
     * componente jButtonPeticiones. Creamos el jFrame
     * ConsultarListaPeticionesTrabajo, lo hacemos visible y cerramos el jFrame
     * actual.
     *
     * @param evt Datos sobre el evento realizado.
     */
    private void jButtonPeticionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPeticionesActionPerformed
        JFrame frame = new ConsultarListaPeticionesTrabajo();
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonPeticionesActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonArticulos;
    private javax.swing.JButton jButtonCerrar;
    private javax.swing.JButton jButtonClientes;
    private javax.swing.JButton jButtonFacturas;
    private javax.swing.JButton jButtonPeticiones;
    private javax.swing.JButton jButtonPresupuestos;
    // End of variables declaration//GEN-END:variables
}
