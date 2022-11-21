/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

/**
 *
 * @author CETECOM
 */
public class VentanaInteractiva extends javax.swing.JFrame {

    /**
     * Creates new form VentanaInteractiva
     */
    public VentanaInteractiva() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        botonNariz = new javax.swing.JButton();
        botonLenteIzquierdo = new javax.swing.JButton();
        botonLenteDerecho = new javax.swing.JButton();
        botonPapada = new javax.swing.JButton();
        botonPecho = new javax.swing.JButton();
        botonCulo = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonNariz.setContentAreaFilled(false);
        botonNariz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonNarizActionPerformed(evt);
            }
        });
        jPanel1.add(botonNariz, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 40, 20));

        botonLenteIzquierdo.setContentAreaFilled(false);
        botonLenteIzquierdo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLenteIzquierdoActionPerformed(evt);
            }
        });
        jPanel1.add(botonLenteIzquierdo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 40, 40));

        botonLenteDerecho.setContentAreaFilled(false);
        botonLenteDerecho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLenteDerechoActionPerformed(evt);
            }
        });
        jPanel1.add(botonLenteDerecho, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 40, 40));

        botonPapada.setContentAreaFilled(false);
        botonPapada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPapadaActionPerformed(evt);
            }
        });
        jPanel1.add(botonPapada, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 90, 50));

        botonPecho.setContentAreaFilled(false);
        botonPecho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPechoActionPerformed(evt);
            }
        });
        jPanel1.add(botonPecho, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, 150, 130));

        botonCulo.setContentAreaFilled(false);
        botonCulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCuloActionPerformed(evt);
            }
        });
        jPanel1.add(botonCulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 230, 50, 100));

        jLabel2.setText("Tócame!");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Gato-bacano.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 480));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonNarizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonNarizActionPerformed
        // TODO add your handling code here:
        new VentanaInteractivaNariz().setVisible(true);
    }//GEN-LAST:event_botonNarizActionPerformed

    private void botonPechoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPechoActionPerformed
        // TODO add your handling code here:
        new VentanaInteractivaPecho().setVisible(true);
    }//GEN-LAST:event_botonPechoActionPerformed

    private void botonPapadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPapadaActionPerformed
        // TODO add your handling code here:
        new VentanaInteractivaPapada().setVisible(true);
    }//GEN-LAST:event_botonPapadaActionPerformed

    private void botonLenteIzquierdoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLenteIzquierdoActionPerformed
        // TODO add your handling code here:
        new VentanaInteractivaLenIzquierdo().setVisible(true);
    }//GEN-LAST:event_botonLenteIzquierdoActionPerformed

    private void botonLenteDerechoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLenteDerechoActionPerformed
        // TODO add your handling code here:
        new VentanaInteractivaLenDerecho().setVisible(true);
    }//GEN-LAST:event_botonLenteDerechoActionPerformed

    private void botonCuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCuloActionPerformed
        // TODO add your handling code here:
        new VentanaInteractivaCulo().setVisible(true);
    }//GEN-LAST:event_botonCuloActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaInteractiva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaInteractiva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaInteractiva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaInteractiva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaInteractiva().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCulo;
    private javax.swing.JButton botonLenteDerecho;
    private javax.swing.JButton botonLenteIzquierdo;
    private javax.swing.JButton botonNariz;
    private javax.swing.JButton botonPapada;
    private javax.swing.JButton botonPecho;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}