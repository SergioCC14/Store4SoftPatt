package vista;

import controladores.estrategias.ContextoClientes;
import controladores.estrategias.EstrategiaClientes;
import controladores.estrategias.EstrategiaConcretaClientesApellido;
import controladores.estrategias.EstrategiaConcretaClientesDni;
import controladores.estrategias.EstrategiaConcretaClientesNombre;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Cliente;
import modelo.ModeloGlobal;

/**
 * Clase jFrame que muestra la lista de clientes que posee la clase Modelo,
 * haciendo una instancia de esta para obtener los datos. Se da aparte varias
 * opciones, como añadir, o consultar un cliente, volver al jFrame
 * PrincipalCoordinador, u ordenar la lista por nombre, apellidos o dni.
 */
public class ConsultarListaClientes extends javax.swing.JFrame {

    ModeloGlobal modelo = ModeloGlobal.getInstancia();
    DefaultTableModel model;

    /**
     * Constructor principal de la clase. Se encarga de inicializar los
     * componentes de la interfaz y de actualizar estos con los datos aportados
     * desde modelo con la lista de clientes.
     */
    public ConsultarListaClientes() {
        initComponents();
        setLocationRelativeTo(null);

        String[] cn = {"Nombre", "Apellidos", "Dni", "Direccion", "Telefono", "Tipo"};
        model = new DefaultTableModel();
        jTable.setModel(model);
        model.setColumnIdentifiers(cn);
        for (Cliente i : modelo.getClientes()) {
            model.addRow(i.ToArray());
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

        jButtonVolver = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jButtonAdd = new javax.swing.JButton();
        jButtonConsultar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButtonSortNombre = new javax.swing.JButton();
        jButtonSortApellidos = new javax.swing.JButton();
        jButtonSortDni = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Store4SoftPatt - Consultar Lista Clientes");
        setResizable(false);

        jButtonVolver.setText("Volver");
        jButtonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverActionPerformed(evt);
            }
        });

        jTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(jTable);
        jTable.getAccessibleContext().setAccessibleName("");

        jButtonAdd.setText("Añadir");
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });

        jButtonConsultar.setText("Consultar");
        jButtonConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultarActionPerformed(evt);
            }
        });

        jLabel1.setText("Ordenar por:");

        jButtonSortNombre.setText("Nombre");
        jButtonSortNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSortNombreActionPerformed(evt);
            }
        });

        jButtonSortApellidos.setText("Apellidos");
        jButtonSortApellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSortApellidosActionPerformed(evt);
            }
        });

        jButtonSortDni.setText("Dni");
        jButtonSortDni.setPreferredSize(new java.awt.Dimension(75, 23));
        jButtonSortDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSortDniActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonSortNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonSortApellidos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonSortDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButtonConsultar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButtonAdd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonConsultar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonSortNombre)
                        .addComponent(jLabel1)
                        .addComponent(jButtonSortApellidos)
                        .addComponent(jButtonSortDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonVolver))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Método que es llamado cuando es detectado el evento Action Performed del
     * componente jButtonVolver. Creamos el jFrame PrincipalCoordinador, lo
     * hacemos visible y cerramos el jFrame actual.
     *
     * @param evt Datos sobre el evento realizado.
     */
    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed
        JFrame frame = new PrincipalCoordinador();
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonVolverActionPerformed

    /**
     * Método que es llamado cuando es detectado el evento Action Performed del
     * componente jButtonAdd. Creamos el jFrame DarAltaCliente, lo hacemos
     * visible y cerramos el jFrame actual.
     *
     * @param evt Datos sobre el evento realizado.
     */
    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
        JFrame frame = new DarAltaCliente();
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonAddActionPerformed

    /**
     * Método que es llamado cuando es detectado el evento Action Performed del
     * componente jButtonConsultar. Si hay un cliente de la lista seleccionado,
     * Creamos el jFrame ConsultarCliente con el indice del cliente como
     * parámetro, lo hacemos visible y cerramos el jFrame actual.
     *
     * @param evt Datos sobre el evento realizado.
     */
    private void jButtonConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarActionPerformed
        if (jTable.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Seleccione primero.", "Error", JOptionPane.OK_OPTION);
        } else {
            JFrame frame = new ConsultarCliente(jTable.getSelectedRow());
            frame.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_jButtonConsultarActionPerformed

    /**
     * Método que es llamado cuando es detectado el evento Action Performed del
     * componente jButtonSortNombre. Limpia la tabla, llama al patrón Strategy
     * para ordenar los elementos con el contexto nombre y los guardamos en un
     * nuevo Array que mostramos en la tabla.
     *
     * @param evt Datos sobre el evento realizado.
     */
    private void jButtonSortNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSortNombreActionPerformed
        model.setRowCount(0);
        EstrategiaClientes est = new EstrategiaConcretaClientesNombre();
        ContextoClientes contexto = new ContextoClientes(est, modelo.getClientes());
        ArrayList<Cliente> clientesNew = contexto.ejecutaEstrategia();
        for (Cliente i : clientesNew) {
            model.addRow(i.ToArray());
        }
    }//GEN-LAST:event_jButtonSortNombreActionPerformed

    /**
     * Método que es llamado cuando es detectado el evento Action Performed del
     * componente jButtonSortNombre. Limpia la tabla, llama al patrón Strategy
     * para ordenar los elementos con el contexto apellidos y los guardamos en
     * un nuevo Array que mostramos en la tabla.
     *
     * @param evt Datos sobre el evento realizado.
     */
    private void jButtonSortApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSortApellidosActionPerformed
        model.setRowCount(0);
        EstrategiaClientes est = new EstrategiaConcretaClientesApellido();
        ContextoClientes contexto = new ContextoClientes(est, modelo.getClientes());
        ArrayList<Cliente> clientesNew = contexto.ejecutaEstrategia();
        for (Cliente i : clientesNew) {
            model.addRow(i.ToArray());
        }
    }//GEN-LAST:event_jButtonSortApellidosActionPerformed

    /**
     * Método que es llamado cuando es detectado el evento Action Performed del
     * componente jButtonSortNombre. Limpia la tabla, llama al patrón Strategy
     * para ordenar los elementos con el contexto dni y los guardamos en un
     * nuevo Array que mostramos en la tabla.
     *
     * @param evt Datos sobre el evento realizado.
     */
    private void jButtonSortDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSortDniActionPerformed
        model.setRowCount(0);
        EstrategiaClientes est = new EstrategiaConcretaClientesDni();
        ContextoClientes contexto = new ContextoClientes(est, modelo.getClientes());
        ArrayList<Cliente> clientesNew = contexto.ejecutaEstrategia();
        for (Cliente i : clientesNew) {
            model.addRow(i.ToArray());
        }
    }//GEN-LAST:event_jButtonSortDniActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonConsultar;
    private javax.swing.JButton jButtonSortApellidos;
    private javax.swing.JButton jButtonSortDni;
    private javax.swing.JButton jButtonSortNombre;
    private javax.swing.JButton jButtonVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    // End of variables declaration//GEN-END:variables
}
