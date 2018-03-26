/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automat;

/**
 *
 * @author benja
 */
public class AutomatGUI extends javax.swing.JFrame {

    /**
     * Creates new form AutomatGUI
     */
    public AutomatGUI() {
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

        KurvListe = new java.awt.List();
        TitelTekst = new javax.swing.JLabel();
        BillettypeBox = new javax.swing.JComboBox<>();
        billettypeTekstVelkommen = new javax.swing.JLabel();
        zoneTekst = new javax.swing.JLabel();
        antalTekst = new javax.swing.JLabel();
        BetalKnap = new javax.swing.JButton();
        SletKnap = new javax.swing.JButton();
        TotalPrisTekst = new javax.swing.JLabel();
        minusZone = new javax.swing.JButton();
        plusZone = new javax.swing.JButton();
        minusAntal = new javax.swing.JButton();
        plusAntal = new javax.swing.JButton();
        totalPris = new javax.swing.JLabel();
        TilfoejBillet = new javax.swing.JButton();
        AfslutKnap = new javax.swing.JButton();
        zoneValgTekst = new javax.swing.JLabel();
        antalValgTekst = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        KurvListe.setForeground(new java.awt.Color(153, 255, 255));
        KurvListe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KurvListeActionPerformed(evt);
            }
        });

        TitelTekst.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        TitelTekst.setForeground(new java.awt.Color(153, 0, 0));
        TitelTekst.setText("Billetautomat");

        BillettypeBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Voksenbillet", "Barn", "Pensionist", "Alien" }));
        BillettypeBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                BillettypeBoxItemStateChanged(evt);
            }
        });
        BillettypeBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BillettypeBoxActionPerformed(evt);
            }
        });

        billettypeTekstVelkommen.setText("Chooese type of ticket");

        zoneTekst.setText("Zone");

        antalTekst.setText("Antal");

        BetalKnap.setText("BETAL");

        SletKnap.setText("Slet");

        TotalPrisTekst.setForeground(new java.awt.Color(153, 0, 0));
        TotalPrisTekst.setText("Total pris:");

        minusZone.setBackground(new java.awt.Color(153, 0, 0));
        minusZone.setFont(new java.awt.Font("Gill Sans Ultra Bold", 1, 12)); // NOI18N
        minusZone.setForeground(new java.awt.Color(255, 255, 255));
        minusZone.setText("-");

        plusZone.setBackground(new java.awt.Color(0, 102, 0));
        plusZone.setFont(new java.awt.Font("Gill Sans Ultra Bold", 1, 12)); // NOI18N
        plusZone.setForeground(new java.awt.Color(255, 255, 255));
        plusZone.setText("+");

        minusAntal.setBackground(new java.awt.Color(153, 0, 0));
        minusAntal.setFont(new java.awt.Font("Gill Sans Ultra Bold", 1, 12)); // NOI18N
        minusAntal.setForeground(new java.awt.Color(255, 255, 255));
        minusAntal.setText("-");

        plusAntal.setBackground(new java.awt.Color(0, 102, 0));
        plusAntal.setFont(new java.awt.Font("Gill Sans Ultra Bold", 1, 12)); // NOI18N
        plusAntal.setForeground(new java.awt.Color(255, 255, 255));
        plusAntal.setText("+");

        totalPris.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        totalPris.setText("Pris");

        TilfoejBillet.setBackground(new java.awt.Color(0, 0, 153));
        TilfoejBillet.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        TilfoejBillet.setForeground(new java.awt.Color(255, 255, 255));
        TilfoejBillet.setText("Tilfoej");
        TilfoejBillet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TilfoejBilletActionPerformed(evt);
            }
        });

        AfslutKnap.setText("Afslut");

        zoneValgTekst.setFont(new java.awt.Font("Gill Sans Ultra Bold", 1, 14)); // NOI18N
        zoneValgTekst.setText("1");

        antalValgTekst.setFont(new java.awt.Font("Gill Sans Ultra Bold", 1, 14)); // NOI18N
        antalValgTekst.setText("2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addComponent(TotalPrisTekst))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(antalTekst)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(TitelTekst)
                                .addComponent(BillettypeBox, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(billettypeTekstVelkommen)
                                .addComponent(zoneTekst)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(AfslutKnap)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(TilfoejBillet, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(16, 16, 16)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(minusZone, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(minusAntal, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(antalValgTekst, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(zoneValgTekst, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(plusZone, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(plusAntal, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGap(79, 79, 79))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(KurvListe, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(totalPris, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SletKnap)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BetalKnap)
                        .addGap(0, 3, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TitelTekst)
                        .addGap(18, 18, 18)
                        .addComponent(billettypeTekstVelkommen)
                        .addGap(5, 5, 5)
                        .addComponent(BillettypeBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(zoneTekst)
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(minusZone, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(plusZone, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(zoneValgTekst, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(antalTekst)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(antalValgTekst, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(plusAntal, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(minusAntal, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(KurvListe, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TotalPrisTekst)
                    .addComponent(SletKnap)
                    .addComponent(BetalKnap)
                    .addComponent(totalPris)
                    .addComponent(TilfoejBillet)
                    .addComponent(AfslutKnap))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BillettypeBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BillettypeBoxActionPerformed
        
    }//GEN-LAST:event_BillettypeBoxActionPerformed

    private void BillettypeBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_BillettypeBoxItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_BillettypeBoxItemStateChanged

    private void KurvListeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KurvListeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_KurvListeActionPerformed

    private void TilfoejBilletActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TilfoejBilletActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TilfoejBilletActionPerformed

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
            java.util.logging.Logger.getLogger(AutomatGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AutomatGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AutomatGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AutomatGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AutomatGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AfslutKnap;
    private javax.swing.JButton BetalKnap;
    private javax.swing.JComboBox<String> BillettypeBox;
    private java.awt.List KurvListe;
    private javax.swing.JButton SletKnap;
    private javax.swing.JButton TilfoejBillet;
    private javax.swing.JLabel TitelTekst;
    private javax.swing.JLabel TotalPrisTekst;
    private javax.swing.JLabel antalTekst;
    private javax.swing.JLabel antalValgTekst;
    private javax.swing.JLabel billettypeTekstVelkommen;
    private javax.swing.JButton minusAntal;
    private javax.swing.JButton minusZone;
    private javax.swing.JButton plusAntal;
    private javax.swing.JButton plusZone;
    private javax.swing.JLabel totalPris;
    private javax.swing.JLabel zoneTekst;
    private javax.swing.JLabel zoneValgTekst;
    // End of variables declaration//GEN-END:variables
}
