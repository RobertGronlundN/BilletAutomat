package automat;

import java.io.IOException;
import javax.swing.JTabbedPane;

public class MainGUI extends javax.swing.JFrame 
{
    //Billetautomat ba;
    static Billetautomat automat = new Billetautomat();    
    MainGUI mg = this;
    /**
     * Creates new form StartFrame
     */
    public MainGUI() {
        initComponents();
        
        setup();
        
        // Denne kode er givet af Jacob Nordfalk
        fane.setUI(new javax.swing.plaf.basic.BasicTabbedPaneUI(){
            protected int calculateTabAreaHeight(int t, int h, int m){
                return 0;
            }
        });  
    }
    
    public void setup(){
        menuPanel2.setup(mg);
        betalingPanel1.setup(mg);
        printBillet1.setup(mg);
        montoerPanel1.setup(mg);
        zonePanel1.setup(mg);
        loginPanel1.setup(mg);
    }
    
    public void setTab(int tab) {
        fane.setSelectedIndex(tab);
        betalingPanel1.updateIndkoebskurv();
        menuPanel2.update();
        zonePanel1.update();
    }
    
    public void afslut(){
        fane.setSelectedIndex(0);
        menuPanel2.clear();
    }
    
    public void print() throws IOException{
        //printBillet1.sletFil();
        printBillet1.printBilletter();
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fane = new javax.swing.JTabbedPane();
        menuPanel2 = new automat.MenuPanel();
        betalingPanel1 = new automat.BetalingPanel();
        montoerPanel1 = new automat.MontoerPanel();
        printBillet1 = new automat.PrintBillet();
        zonePanel1 = new automat.ZonePanel();
        loginPanel1 = new automat.LoginPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fane.addTab("Menu", menuPanel2);
        fane.addTab("Betaling", betalingPanel1);
        fane.addTab("Montør", montoerPanel1);
        fane.addTab("Udprint", printBillet1);
        fane.addTab("Zoneberegner", zonePanel1);
        fane.addTab("Login", loginPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fane, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fane, javax.swing.GroupLayout.DEFAULT_SIZE, 508, Short.MAX_VALUE)
        );

        fane.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
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
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            new MainGUI().setVisible(true);
            }
        });
    } // End of main

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private automat.BetalingPanel betalingPanel1;
    private javax.swing.JTabbedPane fane;
    private automat.LoginPanel loginPanel1;
    private automat.MenuPanel menuPanel2;
    private automat.MontoerPanel montoerPanel1;
    private automat.PrintBillet printBillet1;
    private automat.ZonePanel zonePanel1;
    // End of variables declaration//GEN-END:variables
}
