/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package src;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Geraf
 */
public class PruebaAdmonConsolas extends javax.swing.JFrame {

    public static AdmonConsola ac = new AdmonConsola();
    /**
     * Creates new form PruebaAdmonConsolas
     */
    public PruebaAdmonConsolas() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        mnuSistema = new javax.swing.JMenu();
        opcAcercaDe = new javax.swing.JMenuItem();
        opcSalir = new javax.swing.JMenuItem();
        mnuConsolas = new javax.swing.JMenu();
        opcAltas = new javax.swing.JMenuItem();
        opcConsInd = new javax.swing.JMenuItem();
        opcConsGral = new javax.swing.JMenuItem();
        opcModificaciones = new javax.swing.JMenuItem();
        opcBajas = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LE CONSOLE DE LEGUINE - CONTROL DE CONSOLAS");
        setPreferredSize(new java.awt.Dimension(400, 298));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        mnuSistema.setText("Sistema");

        opcAcercaDe.setText("Acerca de...");
        opcAcercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcAcercaDeActionPerformed(evt);
            }
        });
        mnuSistema.add(opcAcercaDe);

        opcSalir.setText("Salir");
        opcSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcSalirActionPerformed(evt);
            }
        });
        mnuSistema.add(opcSalir);

        jMenuBar1.add(mnuSistema);

        mnuConsolas.setText("Consolas");

        opcAltas.setText("Altas");
        opcAltas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcAltasActionPerformed(evt);
            }
        });
        mnuConsolas.add(opcAltas);

        opcConsInd.setText("Consula Individual");
        opcConsInd.setEnabled(false);
        opcConsInd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcConsIndActionPerformed(evt);
            }
        });
        mnuConsolas.add(opcConsInd);

        opcConsGral.setText("Consulta General");
        opcConsGral.setEnabled(false);
        opcConsGral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcConsGralActionPerformed(evt);
            }
        });
        mnuConsolas.add(opcConsGral);

        opcModificaciones.setText("Modificaciones");
        opcModificaciones.setEnabled(false);
        opcModificaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcModificacionesActionPerformed(evt);
            }
        });
        mnuConsolas.add(opcModificaciones);

        opcBajas.setText("Bajas");
        opcBajas.setEnabled(false);
        opcBajas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcBajasActionPerformed(evt);
            }
        });
        mnuConsolas.add(opcBajas);

        jMenuBar1.add(mnuConsolas);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void opcAcercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcAcercaDeActionPerformed
        JOptionPane.showConfirmDialog(this,
                "Sistema: LE CONSOLE DE LEGUINE - CONTROL DE CONSOLAS\n" + 
                        "version 1.0\n" +
                        "Programadores:\n"+ 
                        "Joseph Abraham Duran Vargas\n" +
                        "Luis Gerardo Esteban Flores\n" +
                        "Alejandro Jesus Damian Rodriguez\n" +
                        "Fecha: 15 de Mayo del 2023", 
                "Acerca de...", 
                JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_opcAcercaDeActionPerformed

    private void opcSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_opcSalirActionPerformed

    private void opcAltasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcAltasActionPerformed
        if (ac.getCont() < 50) {
            new FrmAltas(this, true).setVisible(true);
        } else {
            JOptionPane.showConfirmDialog(this,
                    "La base de datos esta llena",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_opcAltasActionPerformed

    private void opcConsIndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcConsIndActionPerformed
        int clave;
        String claveTexto;
        
        claveTexto = JOptionPane.showInputDialog(this,
                "Clave de la consola a consultar",
                "Ingresar Clave",
                JOptionPane.QUESTION_MESSAGE);
        if (claveTexto != null) {
            clave = Integer.parseInt(claveTexto);
            int celda = ac.busqueda(clave);
            if (celda != -1) {
                if (ac.getConsola(celda) instanceof ConsolaDeSobremesa) {
                    new FrmConsIndSobremesa(this, true, celda).setVisible(true);
                } else {
                    new FrmConsIndPortatil(this, true, celda).setVisible(true);
                }
            } else {
                JOptionPane.showMessageDialog(
                this, 
                "No existe ninguna consola con esa clave",
                "Error", 
                JOptionPane.ERROR_MESSAGE);
            }
        } 
    }//GEN-LAST:event_opcConsIndActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        if (ac.getCont() > 0) {
            opcConsInd.setEnabled(true);
            opcConsGral.setEnabled(true);
            opcModificaciones.setEnabled(true);
            opcBajas.setEnabled(true);
        }
    }//GEN-LAST:event_formWindowActivated

    private void opcConsGralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcConsGralActionPerformed
        new FrmConsGral(this, true).setVisible(true);
    }//GEN-LAST:event_opcConsGralActionPerformed

    private void opcModificacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcModificacionesActionPerformed
        int clave;
        String claveTexto;
        
        claveTexto = JOptionPane.showInputDialog(this,
                "Clave de la consola a modificar",
                "Ingresar Clave",
                JOptionPane.QUESTION_MESSAGE);
        if (claveTexto != null) {
            clave = Integer.parseInt(claveTexto);
            int celda = ac.busqueda(clave);
            if (ac.getConsola(celda) instanceof ConsolaDeSobremesa) {
                new FrmModSobremesa(this, true, clave, celda).setVisible(true);
            } else {
                new FrmModPortatil(this, true, clave, celda).setVisible(true);
            }
        }
    }//GEN-LAST:event_opcModificacionesActionPerformed

    private void opcBajasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcBajasActionPerformed
        int clave;
        String claveTexto;
        
        claveTexto = JOptionPane.showInputDialog(this,
                "Clave de la consola a eliminar",
                "Ingresar Clave",
                JOptionPane.QUESTION_MESSAGE);
        if (claveTexto != null) {
            clave = Integer.parseInt(claveTexto);
            int celda = ac.busqueda(clave);
            if (ac.getConsola(celda) instanceof ConsolaDeSobremesa) {
                new FrmBajaSobremesa(this,true,celda).setVisible(true);
            } else {
                new FrmBajaPortatil(this, true, celda).setVisible(true);
            }
        }
    }//GEN-LAST:event_opcBajasActionPerformed

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
            java.util.logging.Logger.getLogger(PruebaAdmonConsolas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PruebaAdmonConsolas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PruebaAdmonConsolas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PruebaAdmonConsolas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PruebaAdmonConsolas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu mnuConsolas;
    private javax.swing.JMenu mnuSistema;
    private javax.swing.JMenuItem opcAcercaDe;
    private javax.swing.JMenuItem opcAltas;
    private javax.swing.JMenuItem opcBajas;
    private javax.swing.JMenuItem opcConsGral;
    private javax.swing.JMenuItem opcConsInd;
    private javax.swing.JMenuItem opcModificaciones;
    private javax.swing.JMenuItem opcSalir;
    // End of variables declaration//GEN-END:variables
}