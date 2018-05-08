package automat;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuPanel extends javax.swing.JPanel implements ActionListener 
{    
    MainGUI mg;
    
    public void setup(MainGUI mg){
        this.mg = mg;
    }
    
    
    public void update(){
        guiKurv.removeAll();

        if (mg.automat.kurv.size() <= 0){
            guiKurv.add(" ");
            guiKurv.add(" ");
            guiKurv.add("                                          Kurven er tom");
            
            guiBetaling.setEnabled(false);
            guiSletEnkelt.setEnabled(false);
            guiSletAlle.setEnabled(false);
        } else {
            guiBetaling.setEnabled(true);
            guiSletEnkelt.setEnabled(true);
            guiSletAlle.setEnabled(true);
        }
        
        for (int i = 0 ; i < mg.automat.kurv.size() ; i++){
            guiKurv.add(mg.automat.kurv.get(i).getBillettype()
                      + "      "
                      + mg.automat.kurv.get(i).getAntalZoner()
                      + " zoner     "
                      + mg.automat.kurv.get(i).getAntalBilletter()
                      + " billet(ter)    "
                      + mg.automat.kurv.get(i).getBilletPris()
                      + " kr.   ");
        }
        
        totalPris.setText(" " + mg.automat.getTotal() + " DKK");
        antalZoner.setText(" " + mg.automat.beregner.getRejseZoner() + " ");

        
        
    }
    
    public void clear(){
        mg.automat.kurv.clear();
                
        mg.automat.beregner.setRejseZoner(1);
        mg.automat.setAntal(1);
        billettype.setSelectedIndex(0);
        antalZoner.setText(" " + mg.automat.beregner.getRejseZoner() + " ");
        antalAntal.setText(" " + mg.automat.getAntal() + " ");
        
        guiAntalPlus.setEnabled(true);
        guiZonePlus.setEnabled(true); 
        guiAntalMinus.setEnabled(false);
        guiZoneMinus.setEnabled(false);        
                
        update();
    }
    
    
    public MenuPanel() {
        
        initComponents();        
        update();
       
        for (int i = 0 ; i < mg.automat.billetType.size() ; i++ ){
            billettype.addItem(mg.automat.billetType.get(i).getBillettype());
        }
        
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
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        billettype = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        guiZoneMinus = new javax.swing.JButton();
        guiZonePlus = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        guiAntalMinus = new javax.swing.JButton();
        guiAntalPlus = new javax.swing.JButton();
        antalAntal = new javax.swing.JLabel();
        antalZoner = new javax.swing.JLabel();
        guiTilfoej = new javax.swing.JButton();
        guiNulstil = new javax.swing.JButton();
        guiBetaling = new javax.swing.JButton();
        totalPris = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        guiKurv = new java.awt.List();
        jLabel7 = new javax.swing.JLabel();
        guiSletEnkelt = new javax.swing.JButton();
        guiMontoer = new javax.swing.JButton();
        guiSletAlle = new javax.swing.JButton();
        guiAfslut = new javax.swing.JButton();
        guiZoneBeregner = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable1);

        jLabel6.setText("jLabel6");

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel1.setText("BILLETAUTOMAT");

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel2.setText("Vælg Billettype");

        billettype.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        billettype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billettypeActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel3.setText("Zone");

        guiZoneMinus.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        guiZoneMinus.setText("-");
        if (mg.automat.beregner.getRejseZoner() <= 1) {
            guiZoneMinus.setEnabled(false);
        }
        guiZoneMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guiZoneMinusActionPerformed(evt);
            }
        });

        guiZonePlus.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        guiZonePlus.setText("+");
        guiZonePlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guiZonePlusActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel4.setText("Antal");

        guiAntalMinus.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        guiAntalMinus.setText("-");
        if (mg.automat.getAntal() == 1){
            guiAntalMinus.setEnabled(false);
        }
        guiAntalMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guiAntalMinusActionPerformed(evt);
            }
        });

        guiAntalPlus.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        guiAntalPlus.setText("+");
        guiAntalPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guiAntalPlusActionPerformed(evt);
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

        guiTilfoej.setText("Tilføj");
        guiTilfoej.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guiTilfoejActionPerformed(evt);
            }
        });

        guiNulstil.setText("Nulstil");
        guiNulstil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guiNulstilActionPerformed(evt);
            }
        });

        guiBetaling.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        guiBetaling.setText("Gå til betaling");
        guiBetaling.setEnabled(false);
        guiBetaling.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guiBetalingActionPerformed(evt);
            }
        });

        totalPris.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        totalPris.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        totalPris.setText(" "+mg.automat.getTotal() + " DKK");

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel5.setText("TOTAL:");

        guiKurv.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        guiKurv.setName(""); // NOI18N

        jLabel7.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel7.setText("Indkøbskurv");

        guiSletEnkelt.setText("Slet enkelt billet");
        guiSletEnkelt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guiSletEnkeltActionPerformed(evt);
            }
        });

        guiMontoer.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        guiMontoer.setText("Montør");
        guiMontoer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guiMontoerActionPerformed(evt);
            }
        });

        guiSletAlle.setText("Slet alle billetter");
        guiSletAlle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guiSletAlleActionPerformed(evt);
            }
        });

        guiAfslut.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        guiAfslut.setText("Afslut");
        guiAfslut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guiAfslutActionPerformed(evt);
            }
        });

        guiZoneBeregner.setText("Beregn zoner");
        guiZoneBeregner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guiZoneBeregnerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
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
                                    .addComponent(guiAntalMinus)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(antalAntal, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(guiAntalPlus))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(guiNulstil)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(guiTilfoej))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(guiZoneMinus)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(antalZoner, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(guiZonePlus))
                                .addComponent(guiZoneBeregner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(guiSletAlle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(guiSletEnkelt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 228, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(totalPris, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(guiBetaling, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(7, 7, 7))))
                    .addComponent(guiKurv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(guiAfslut)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(guiMontoer)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(guiMontoer)
                    .addComponent(guiAfslut))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(guiKurv, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(guiSletEnkelt)
                            .addComponent(guiTilfoej)
                            .addComponent(guiNulstil)
                            .addComponent(jLabel5)
                            .addComponent(totalPris))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(guiSletAlle)
                            .addComponent(guiBetaling)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(billettype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(guiZonePlus)
                            .addComponent(guiZoneMinus)
                            .addComponent(antalZoner))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(guiZoneBeregner)
                        .addGap(9, 9, 9)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(guiAntalMinus)
                            .addComponent(guiAntalPlus)
                            .addComponent(antalAntal))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void guiZoneMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guiZoneMinusActionPerformed
        // TODO add your handling code here:
        if (mg.automat.beregner.getRejseZoner() > 1){
            int x = mg.automat.beregner.getRejseZoner();
            mg.automat.beregner.setRejseZoner(x-1);
        }
        antalZoner.setText(" "+ mg.automat.beregner.getRejseZoner() + " ");
        
        if (mg.automat.beregner.getRejseZoner() <= 1) {
             guiZoneMinus.setEnabled(false);
        } else if (mg.automat.beregner.getRejseZoner() == 6) {
             guiZonePlus.setEnabled(false);
        } else {
            guiZoneMinus.setEnabled(true);
            guiZonePlus.setEnabled(true);
        }    
    }//GEN-LAST:event_guiZoneMinusActionPerformed

    private void guiZonePlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guiZonePlusActionPerformed
        if (mg.automat.beregner.getRejseZoner() < 6){
            int x = mg.automat.beregner.getRejseZoner();
            mg.automat.beregner.setRejseZoner(x+1);
        }
        antalZoner.setText(" "+ mg.automat.beregner.getRejseZoner() + " ");
        
        if (mg.automat.beregner.getRejseZoner() == 1) {
             guiZoneMinus.setEnabled(false);
        } else if (mg.automat.beregner.getRejseZoner() == 6) {
             guiZonePlus.setEnabled(false);
        } else {
            guiZoneMinus.setEnabled(true);
            guiZonePlus.setEnabled(true);
        }        
    }//GEN-LAST:event_guiZonePlusActionPerformed

    private void guiAntalMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guiAntalMinusActionPerformed
        // TODO add your handling code here:
        if (mg.automat.getAntal() > 1){
            int x = mg.automat.getAntal();
            mg.automat.setAntal(x-1);
        }        
        antalAntal.setText(" "+ mg.automat.getAntal() + " ");
        
        if (mg.automat.getAntal() == 1) {
             guiAntalMinus.setEnabled(false);
        } else if (mg.automat.getAntal() == 25) {
             guiAntalPlus.setEnabled(false);
        } else {
            guiAntalMinus.setEnabled(true);
            guiAntalPlus.setEnabled(true);
        }         
    }//GEN-LAST:event_guiAntalMinusActionPerformed

    private void guiAntalPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guiAntalPlusActionPerformed
        // TODO add your handling code here:
        int x = mg.automat.getAntal();
        mg.automat.setAntal(x+1);
               
        antalAntal.setText(" "+ mg.automat.getAntal() + " ");
        
        if (mg.automat.getAntal() == 1) {
             guiAntalMinus.setEnabled(false);
        } else if (mg.automat.getAntal() == 25) {
             guiAntalPlus.setEnabled(false);
        } else {
            guiAntalMinus.setEnabled(true);
            guiAntalPlus.setEnabled(true);
        } 
    }//GEN-LAST:event_guiAntalPlusActionPerformed

    private void billettypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billettypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_billettypeActionPerformed

    private void guiNulstilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guiNulstilActionPerformed
        clear();
    }//GEN-LAST:event_guiNulstilActionPerformed

    private void guiTilfoejActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guiTilfoejActionPerformed
          
        mg.automat.tilfoejBillet(billettype.getSelectedIndex(),mg.automat.beregner.getRejseZoner(),mg.automat.getAntal());
        
                
        update();
        
        
    }//GEN-LAST:event_guiTilfoejActionPerformed

    private void guiBetalingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guiBetalingActionPerformed
        mg.setTab(1);        
        
    }//GEN-LAST:event_guiBetalingActionPerformed

    private void guiSletEnkeltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guiSletEnkeltActionPerformed
        mg.automat.kurv.remove(guiKurv.getSelectedIndex());
        
        update();
    }//GEN-LAST:event_guiSletEnkeltActionPerformed

    private void guiMontoerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guiMontoerActionPerformed
        if (mg.automat.getMontoertilstand() == false){
            mg.setTab(5);
        } else {
            mg.setTab(2);
        }
    }//GEN-LAST:event_guiMontoerActionPerformed

    private void guiSletAlleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guiSletAlleActionPerformed
        clear();              
    }//GEN-LAST:event_guiSletAlleActionPerformed

    private void guiAfslutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guiAfslutActionPerformed
        clear();               
    }//GEN-LAST:event_guiAfslutActionPerformed

    private void guiZoneBeregnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guiZoneBeregnerActionPerformed
        mg.setTab(4);
    }//GEN-LAST:event_guiZoneBeregnerActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel antalAntal;
    private javax.swing.JLabel antalZoner;
    private javax.swing.JComboBox<String> billettype;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton guiAfslut;
    private javax.swing.JButton guiAntalMinus;
    private javax.swing.JButton guiAntalPlus;
    private javax.swing.JButton guiBetaling;
    private java.awt.List guiKurv;
    private javax.swing.JButton guiMontoer;
    private javax.swing.JButton guiNulstil;
    private javax.swing.JButton guiSletAlle;
    private javax.swing.JButton guiSletEnkelt;
    private javax.swing.JButton guiTilfoej;
    private javax.swing.JButton guiZoneBeregner;
    private javax.swing.JButton guiZoneMinus;
    private javax.swing.JButton guiZonePlus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel totalPris;
    // End of variables declaration//GEN-END:variables
  
    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}


