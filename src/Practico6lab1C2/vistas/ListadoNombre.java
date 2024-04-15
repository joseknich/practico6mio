/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Practico6lab1C2.vistas;

import java.awt.Color;
import java.util.TreeSet;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import Practico6Lab1c2.entidades.Producto;

public class ListadoNombre extends javax.swing.JInternalFrame {

    private TreeSet<Producto> productos;
    private DefaultTableModel modelo = new DefaultTableModel();

    public ListadoNombre(TreeSet<Producto> productos) {
        initComponents();
        this.setLocation(500, 200);
        this.productos = productos;
        armarCabecera();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlListadoNombre = new javax.swing.JLabel();
        jlPrimerosCaracteres = new javax.swing.JLabel();
        jtfCaracteresBuscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTabla = new javax.swing.JTable();

        setBackground(new java.awt.Color(102, 102, 102));
        setClosable(true);

        jlListadoNombre.setBackground(new java.awt.Color(255, 255, 255));
        jlListadoNombre.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jlListadoNombre.setText("Listado Por Nombre");

        jlPrimerosCaracteres.setBackground(new java.awt.Color(255, 255, 255));
        jlPrimerosCaracteres.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jlPrimerosCaracteres.setText("Escriba los primeros caracteres:");

        jtfCaracteresBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfCaracteresBuscarKeyReleased(evt);
            }
        });

        jtTabla.setBackground(new java.awt.Color(118, 171, 174));
        jtTabla.setForeground(new java.awt.Color(0, 51, 255));
        jtTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Codigo", "Descripcion", "Precio", "Stock"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtTabla);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(220, 220, 220)
                .addComponent(jlListadoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(223, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 52, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlPrimerosCaracteres)
                        .addGap(18, 18, 18)
                        .addComponent(jtfCaracteresBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlListadoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfCaracteresBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlPrimerosCaracteres))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(115, 115, 115))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfCaracteresBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfCaracteresBuscarKeyReleased

        borrarFilas();

        String find = jtfCaracteresBuscar.getText().toLowerCase();
        System.out.println(find);
        for (Producto prod : productos) {

            if (prod.getDescripcion().toLowerCase().startsWith(find)) {

                Vector renglon = new Vector();
                renglon.add(prod.getCodigo());
                renglon.add(prod.getDescripcion());
                renglon.add(prod.getPrecio());
                renglon.add(prod.getStock());
                renglon.add(prod.getRubro());
                modelo.addRow(renglon);
                System.out.println(renglon);

            }

        }
    }//GEN-LAST:event_jtfCaracteresBuscarKeyReleased

    private void armarCabecera() {

        modelo.addColumn("Codigo");
        modelo.addColumn("Descripcion");
        modelo.addColumn("Precio");
        modelo.addColumn("Stock");
        modelo.addColumn("Rubro");
        jtTabla.setModel(modelo);
    }

    private void borrarFilas() {

        int filas = modelo.getRowCount() - 1;
        for (int f = filas; f >= 0; f--) {

            modelo.removeRow(f);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlListadoNombre;
    private javax.swing.JLabel jlPrimerosCaracteres;
    private javax.swing.JTable jtTabla;
    private javax.swing.JTextField jtfCaracteresBuscar;
    // End of variables declaration//GEN-END:variables
}
