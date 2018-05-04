package automat;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;  

public class PrintBillet extends javax.swing.JPanel {

    File file = new File("BilletUdprint.txt");
    
    public void nyBillet(){
        file.delete();
    }
    
    public void printBilletter() throws IOException{
        
        Date Date = new Date();
        
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            
                        
            // BILLET
            for (int i = 0 ; i < MenuPanel.automat.kurv.size() ; i++){
                 for (int j = 0 ; j < MenuPanel.automat.kurv.get(i).getAntalBilletter() ; j++){
                    
                    writer.append(" ________________________________________\n");
                    writer.append("|_______________       BT        _______________|\n");
                    writer.append("|_______________________________________|\n");
                    writer.append("|                              "+ MenuPanel.automat.kurv.get(i).getBillettype() +"                            |\n");
                    writer.append("|                                 "+MenuPanel.automat.kurv.get(i).getAntalZoner()+ " Zoner                                  |\n");
                    writer.append("|________________________________________|\n");
                    writer.append("|           Billet gyldig i 2 timer fra udstedelse           |\n");
                    writer.append("|                  "+Date.toString()+"             |\n");
                    writer.append("|________________________________________|\n");
                    writer.append("\n\n");          

                    MenuPanel.automat.antalBilletterSolgt++;
        
                    } // End of j for loop            
                } // End of i for loop
                writer.close();
            } catch (IOException ex) {
            System.err.println("File not found");
        }
    } // End of printBilletter()
    
        
    /**
     * Creates new form PrintBillet
     */
    public PrintBillet() {
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

        jLabel1 = new javax.swing.JLabel();
        guiAfslut = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel1.setText("BlueJay");

        guiAfslut.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        guiAfslut.setText("Hovedmenu");
        guiAfslut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guiAfslutActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        jLabel2.setText("BILLETTER PRINTES");

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel3.setText("Tak fordi du vælger");

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel4.setText("at køre med ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(314, 314, 314))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(281, 281, 281))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 286, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(344, 344, 344))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(guiAfslut, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(301, 301, 301))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(231, 231, 231))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(117, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(guiAfslut, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void guiAfslutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guiAfslutActionPerformed
        MenuPanel.clear();
        StartFrame.fane.setSelectedIndex(0);
    }//GEN-LAST:event_guiAfslutActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton guiAfslut;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
} // End of class Print Billet
