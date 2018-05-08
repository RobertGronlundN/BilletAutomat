package automat;

public class ZonePanel extends javax.swing.JPanel 
{
    MainGUI mg;
    
    public void setup(MainGUI mg){
       this.mg = mg;
    }
    
    /**
     * Creates new form ZonePanel
     */
    public ZonePanel() {
        initComponents();
    }

    public void update(){
        guiEgenZone.setText("Du er i zone: " + mg.automat.beregner.getAutomatZone());
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        guiTilbage = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        guiMontoer = new javax.swing.JButton();
        guiAfslut = new javax.swing.JButton();
        guiEgenZone = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        guiZoneValg = new javax.swing.JComboBox<>();

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel1.setText("BEREGN ZONER");

        guiTilbage.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        guiTilbage.setText("Tilbage");
        guiTilbage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guiTilbageActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jButton1.setText("Godkend");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        guiMontoer.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        guiMontoer.setText("Montør");
        guiMontoer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guiMontoerActionPerformed(evt);
            }
        });

        guiAfslut.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        guiAfslut.setText("Afslut");
        guiAfslut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guiAfslutActionPerformed(evt);
            }
        });

        guiEgenZone.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        guiEgenZone.setText("Du er i zone: " + mg.automat.beregner.getAutomatZone());

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel2.setText("Billet til zone : ");

        guiZoneValg.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        guiZoneValg.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                        .addGap(451, 451, 451)
                        .addComponent(guiAfslut)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(guiMontoer))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(guiTilbage)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(guiEgenZone, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(guiZoneValg, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(guiMontoer)
                    .addComponent(guiAfslut))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(guiEgenZone, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(guiZoneValg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 239, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(guiTilbage, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void guiTilbageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guiTilbageActionPerformed
        mg.setTab(0);
    }//GEN-LAST:event_guiTilbageActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        mg.automat.beregner.setSlutZone(guiZoneValg.getSelectedIndex()+1);
        mg.automat.beregner.zoneBeregner();
        mg.setTab(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void guiMontoerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guiMontoerActionPerformed
        if (mg.automat.getMontoertilstand() == false){
            mg.setTab(5);
        } else {
            mg.setTab(2);
        }
    }//GEN-LAST:event_guiMontoerActionPerformed

    private void guiAfslutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guiAfslutActionPerformed
        mg.afslut();
    }//GEN-LAST:event_guiAfslutActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton guiAfslut;
    private javax.swing.JLabel guiEgenZone;
    private javax.swing.JButton guiMontoer;
    private javax.swing.JButton guiTilbage;
    private javax.swing.JComboBox<String> guiZoneValg;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
} // End of class Zoneberegner
