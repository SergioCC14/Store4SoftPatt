package vista;

import controladores.estrategias.ContextoArticulos;
import controladores.estrategias.EstrategiaArticulos;
import controladores.estrategias.EstrategiaConcretaArticulosNombre;
import controladores.estrategias.EstrategiaConcretaArticulosProveedor;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Articulo;
import modelo.ModeloGlobal;

/**
 * Clase jFrame que muestra la lista de artículos que posee la clase Modelo,
 * haciendo una instancia de esta para obtener los datos. Se da aparte varias
 * opciones, como añadir, o consultar un artículo, volver al jFrame
 * PrincipalAlmacen, u ordenar la lista por nombre o proveedor.
 */
public class ConsultarListaArticulosAlmacen extends javax.swing.JFrame {

    ModeloGlobal modelo = ModeloGlobal.getInstancia();
    DefaultTableModel model;

    /**
     * Constructor principal de la clase. Se encarga de inicializar los
     * componentes de la interfaz y de actualizar estos con los datos aportados
     * desde modelo con la lista de artículos.
     */
    public ConsultarListaArticulosAlmacen() {
        initComponents();

        String[] cn = {"Nombre", "Descripcion", "Tipo", "Precio", "Coste", "Proveedor"};
        model = new DefaultTableModel();
        jTable.setModel(model);
        model.setColumnIdentifiers(cn);
        for (Articulo i : modelo.getArticulos()) {
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
        jButtonSortNombre = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButtonSortProvee = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        jButtonSortNombre.setText("Nombre");
        jButtonSortNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSortNombreActionPerformed(evt);
            }
        });

        jLabel1.setText("Ordenar por:");

        jButtonSortProvee.setText("Proveedor");
        jButtonSortProvee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSortProveeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonSortNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonSortProvee))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonConsultar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonVolver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonAdd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonConsultar)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonVolver)
                    .addComponent(jButtonSortNombre)
                    .addComponent(jLabel1)
                    .addComponent(jButtonSortProvee))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Método que es llamado cuando es detectado el evento Action Performed del
     * componente jButtonVolver. Creamos el jFrame PrincipalAlmacen, lo hacemos
     * visible y cerramos el jFrame actual.
     *
     * @param evt Datos sobre el evento realizado.
     */
    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed
        JFrame frame = new PrincipalAlmacen();
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonVolverActionPerformed

    /**
     * Método que es llamado cuando es detectado el evento Action Performed del
     * componente jButtonAdd. Creamos el jFrame DarAltaArticulo, lo hacemos
     * visible y cerramos el jFrame actual.
     *
     * @param evt Datos sobre el evento realizado.
     */
    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
        JFrame frame = new DarAltaArticulo();
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonAddActionPerformed

    /**
     * Método que es llamado cuando es detectado el evento Action Performed del
     * componente jButtonConsultar. Si hay un artículo de la lista seleccionado,
     * Creamos el jFrame ConsultarArticulo con el indice del artículo como
     * parámetro, lo hacemos visible y cerramos el jFrame actual.
     *
     * @param evt Datos sobre el evento realizado.
     */
    private void jButtonConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarActionPerformed
        if (jTable.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Seleccione primero.", "Error", JOptionPane.OK_OPTION);
        } else {
            JFrame frame = new ConsultarArticulo(jTable.getSelectedRow());
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
        EstrategiaArticulos est = new EstrategiaConcretaArticulosNombre();
        ContextoArticulos contexto = new ContextoArticulos(est, modelo.getArticulos());
        ArrayList<Articulo> articulosNew = contexto.ejecutaEstrategia();
        for (Articulo i : articulosNew) {
            model.addRow(i.ToArray());
        }
    }//GEN-LAST:event_jButtonSortNombreActionPerformed

    /**
     * Método que es llamado cuando es detectado el evento Action Performed del
     * componente jButtonSortProvee. Limpia la tabla, llama al patrón Strategy
     * para ordenar los elementos con el contexto proveedor y los guardamos en
     * un nuevo Array que mostramos en la tabla.
     *
     * @param evt Datos sobre el evento realizado.
     */
    private void jButtonSortProveeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSortProveeActionPerformed
        model.setRowCount(0);
        EstrategiaArticulos est = new EstrategiaConcretaArticulosProveedor();
        ContextoArticulos contexto = new ContextoArticulos(est, modelo.getArticulos());
        ArrayList<Articulo> articulosNew = contexto.ejecutaEstrategia();
        for (Articulo i : articulosNew) {
            model.addRow(i.ToArray());
        }
    }//GEN-LAST:event_jButtonSortProveeActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonConsultar;
    private javax.swing.JButton jButtonSortNombre;
    private javax.swing.JButton jButtonSortProvee;
    private javax.swing.JButton jButtonVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    // End of variables declaration//GEN-END:variables
}
