/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automat;

/**
 *
 * @author Robert
 */
public class MenuPanel extends javax.swing.JPanel {

    /**
     * Creates new form MenuPanel
     */
    
    Billetautomat automat = new Billetautomat();
    
    int type = 0;
    int zoner = 1;
    int antal = 1;
    
    public MenuPanel() {
        
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        billettype = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        zoneMinus = new javax.swing.JButton();
        zonePlus = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        antalMinus = new javax.swing.JButton();
        antalPlus = new javax.swing.JButton();
        antalAntal = new javax.swing.JLabel();
        antalZoner = new javax.swing.JLabel();
        tilfoej = new javax.swing.JButton();
        nulstil = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        guiKurv = new javax.swing.JTextArea();
        betaling = new javax.swing.JButton();
        totalPris = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        afbrydKoeb = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel1.setText("BILLETAUTOMAT");

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel2.setText("Vælg Billettype");

        billettype.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        billettype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Voksen", "Børn", "Pensionist", "Studerende", "Cykel", "Hund" }));
        billettype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billettypeActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel3.setText("Zone");

        zoneMinus.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        zoneMinus.setText("-");
        zoneMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zoneMinusActionPerformed(evt);
            }
        });

        zonePlus.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        zonePlus.setText("+");
        zonePlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zonePlusActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel4.setText("Antal");

        antalMinus.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        antalMinus.setText("-");
        antalMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                antalMinusActionPerformed(evt);
            }
        });

        antalPlus.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        antalPlus.setText("+");
        antalPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                antalPlusActionPerformed(evt);
            }
        });

        antalAntal.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        antalAntal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        antalAntal.setText("1");
        antalAntal.setToolTipText("");

        antalZoner.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        antalZoner.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        antalZoner.setText("1");
        antalZoner.setToolTipText("");

        tilfoej.setText("Tilføj");
        tilfoej.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tilfoejActionPerformed(evt);
            }
        });

        nulstil.setText("Nulstil");
        nulstil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nulstilActionPerformed(evt);
            }
        });

        guiKurv.setColumns(20);
        guiKurv.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        guiKurv.setRows(5);
        guiKurv.setText("Kurven er tom:");
        jScrollPane1.setViewportView(guiKurv);

        betaling.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        betaling.setText("Gå til betaling");
        betaling.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                betalingActionPerformed(evt);
            }
        });

        totalPris.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        totalPris.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        totalPris.setText(" "+automat.getTotal() + " DKK");

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel5.setText("TOTAL:");

        afbrydKoeb.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        afbrydKoeb.setText("Afbryd køb");
        afbrydKoeb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                afbrydKoebActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Billettype", "Zoner", "Antal", "Pris"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(billettype, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(24, 24, 24)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(nulstil)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(tilfoej))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(zoneMinus)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(antalZoner, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(0, 0, Short.MAX_VALUE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(antalMinus)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(antalAntal, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(antalPlus)
                                                .addComponent(zonePlus))))))
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 457, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(afbrydKoeb)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(totalPris, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(betaling, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(7, 7, 7)))))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(229, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(billettype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(zonePlus)
                            .addComponent(zoneMinus)
                            .addComponent(antalZoner))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4))
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(antalPlus)
                    .addComponent(antalMinus)
                    .addComponent(antalAntal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tilfoej)
                    .addComponent(nulstil))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalPris)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(betaling)
                    .addComponent(afbrydKoeb))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(236, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(144, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void zoneMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zoneMinusActionPerformed
        // TODO add your handling code here:
        if (zoner > 1){
            zoner--;
        }
        antalZoner.setText(" "+ zoner + " ");
    }//GEN-LAST:event_zoneMinusActionPerformed

    private void zonePlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zonePlusActionPerformed
        // TODO add your handling code here:
        if (zoner < 6){
            zoner++;
        }
        antalZoner.setText(" "+ zoner + " ");
    }//GEN-LAST:event_zonePlusActionPerformed

    private void antalMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_antalMinusActionPerformed
        // TODO add your handling code here:
        if (antal > 1){
            antal--;
        }        
        antalAntal.setText(" "+ antal + " ");
    }//GEN-LAST:event_antalMinusActionPerformed

    private void antalPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_antalPlusActionPerformed
        // TODO add your handling code here:
       
        antal++;
               
        antalAntal.setText(" "+ antal + " ");
    }//GEN-LAST:event_antalPlusActionPerformed

    private void billettypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billettypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_billettypeActionPerformed

    private void nulstilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nulstilActionPerformed
        // TODO add your handling code here:
        zoner = 1;
        antal = 1;
        billettype.setSelectedIndex(0);
        antalZoner.setText(" " + zoner + " ");
        antalAntal.setText(" " + antal + " ");
        
    }//GEN-LAST:event_nulstilActionPerformed

    private void tilfoejActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tilfoejActionPerformed
        // TODO add your handling code here:
        
        type = billettype.getSelectedIndex();
              
        automat.tilfoejBillet(type,zoner,antal);
                        
        guiKurv.setText("I kurven:\n");
        for (int i = 0 ; i < automat.kurv.size() ; i++){
        guiKurv.append(automat.kurv.get(i).getBillettype()+"\t"+automat.kurv.get(i).getAntalZoner()+"\t"+automat.kurv.get(i).getAntalBilletter()+"\n");
        };
        
        zoner = 1;
        antal = 1;
        billettype.setSelectedIndex(0);
        antalZoner.setText(" " + zoner + " ");
        antalAntal.setText(" " + antal + " ");
        
        totalPris.setText(" " + automat.getTotal() + " DKK");
    }//GEN-LAST:event_tilfoejActionPerformed

    private void afbrydKoebActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_afbrydKoebActionPerformed
        // TODO add your handling code here:
        
        automat.kurv.clear();
        
        zoner = 1;
        antal = 1;
        billettype.setSelectedIndex(0);
        antalZoner.setText(" " + zoner + " ");
        antalAntal.setText(" " + antal + " ");
        
        guiKurv.setText("Kurven er tom:");
        totalPris.setText(" " + automat.getTotal() + " DKK");
    }//GEN-LAST:event_afbrydKoebActionPerformed

    private void betalingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_betalingActionPerformed
        // TODO add your handling code here:
        //StartFrame.fane.setSelectedIndex(1);
    }//GEN-LAST:event_betalingActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton afbrydKoeb;
    private javax.swing.JLabel antalAntal;
    private javax.swing.JButton antalMinus;
    private javax.swing.JButton antalPlus;
    private javax.swing.JLabel antalZoner;
    private javax.swing.JButton betaling;
    private javax.swing.JComboBox<String> billettype;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextArea guiKurv;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton nulstil;
    private javax.swing.JButton tilfoej;
    private javax.swing.JLabel totalPris;
    private javax.swing.JButton zoneMinus;
    private javax.swing.JButton zonePlus;
    // End of variables declaration//GEN-END:variables
}

