package Practico6lab1C2.vistas;

import java.util.TreeSet;
import Practico6Lab1c2.entidades.Producto;
import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;
import javax.swing.ImageIcon;

public class Menu extends javax.swing.JFrame {

    private TreeSet<Producto> productos = new TreeSet<>();

    public Menu() {

        initComponents();
        this.setLocation(500, 200);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jLempresa = new javax.swing.JLabel();
        jmMenuGeneral = new javax.swing.JMenuBar();
        jmAdministracion = new javax.swing.JMenu();
        jmiProductos = new javax.swing.JMenuItem();
        jmConsultas = new javax.swing.JMenu();
        jmiRubro = new javax.swing.JMenuItem();
        jmiNombre = new javax.swing.JMenuItem();
        jmiPrecio = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(500, 400));
        setSize(new java.awt.Dimension(500, 400));

        escritorio.setBackground(new java.awt.Color(0, 54, 98));

        jLempresa.setBackground(new java.awt.Color(51, 0, 255));
        jLempresa.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        jLempresa.setForeground(new java.awt.Color(0, 0, 51));
        jLempresa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLempresa.setText("Supermercado DETODO SA");
        jLempresa.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        escritorio.setLayer(jLempresa, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLempresa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 400, Short.MAX_VALUE))
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
            .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLempresa, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE))
        );

        jmAdministracion.setText("Administración");

        jmiProductos.setText("Productos");
        jmiProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiProductosActionPerformed(evt);
            }
        });
        jmAdministracion.add(jmiProductos);

        jmMenuGeneral.add(jmAdministracion);

        jmConsultas.setText("Consultas");

        jmiRubro.setText("Por Rubro");
        jmiRubro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiRubroActionPerformed(evt);
            }
        });
        jmConsultas.add(jmiRubro);

        jmiNombre.setText("Por Nombre");
        jmiNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiNombreActionPerformed(evt);
            }
        });
        jmConsultas.add(jmiNombre);

        jmiPrecio.setText("Por Precio");
        jmiPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiPrecioActionPerformed(evt);
            }
        });
        jmConsultas.add(jmiPrecio);

        jmMenuGeneral.add(jmConsultas);

        setJMenuBar(jmMenuGeneral);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmiProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiProductosActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        gestionDeProductos gdp = new gestionDeProductos(productos);
        gdp.setVisible(true);
        escritorio.add(gdp);


    }//GEN-LAST:event_jmiProductosActionPerformed

    private void jmiRubroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiRubroActionPerformed

        escritorio.removeAll();
        escritorio.repaint();
        ConsultaProductoRubro gdp = new ConsultaProductoRubro(productos);
        gdp.setVisible(true);
        escritorio.add(gdp);
    }//GEN-LAST:event_jmiRubroActionPerformed

    private void jmiNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiNombreActionPerformed

        escritorio.removeAll();
        escritorio.repaint();
        ListadoNombre gdp = new ListadoNombre(productos);
        gdp.setVisible(true);
        escritorio.add(gdp);
    }//GEN-LAST:event_jmiNombreActionPerformed

    private void jmiPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiPrecioActionPerformed

        escritorio.removeAll();
        escritorio.repaint();
        ConsultaPorPrecio gdp = new ConsultaPorPrecio(productos);
        gdp.setVisible(true);
        escritorio.add(gdp);
    }//GEN-LAST:event_jmiPrecioActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JLabel jLempresa;
    private javax.swing.JMenu jmAdministracion;
    private javax.swing.JMenu jmConsultas;
    private javax.swing.JMenuBar jmMenuGeneral;
    private javax.swing.JMenuItem jmiNombre;
    private javax.swing.JMenuItem jmiPrecio;
    private javax.swing.JMenuItem jmiProductos;
    private javax.swing.JMenuItem jmiRubro;
    // End of variables declaration//GEN-END:variables
}
