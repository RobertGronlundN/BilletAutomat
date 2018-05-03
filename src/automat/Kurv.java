package automat;

public class Kurv {

    private int antalBilletter;
    private String billettype;
    private double billetPris;
    private int antalZoner;
    private int index;

    public Kurv(String billettype, int antalBilletter, double billetPris, int antalZoner, int index) {
        this.billettype = billettype;
        this.antalBilletter = antalBilletter;
        this.billetPris = (billetPris * antalZoner * antalBilletter);
        this.antalZoner = antalZoner;
        this.index = index;
    }

    // BILLETTYPE --------------------------------------------------------------
    public String getBillettype() {
        return billettype;
    } // End of getBillettype
    public void setBillettype(String billettype) {
        this.billettype = billettype;
    } // End of setBillettype


    // BILLET PRIS -------------------------------------------------------------
    public double getBilletPris() {
        return billetPris;
    } // End of getBilletPris
    public void setBilletPris(double billetPris) {
        this.billetPris = billetPris;
    } // End of setBilletPris


    // INDEX -------------------------------------------------------------------
    public int getIndex() {
        return index;
    } // End of getIndex
    public void setIndex(int index) {
        this.index = index;
    } // End of setIndex


    // ANTAL ZONER -------------------------------------------------------------
    public int getAntalZoner() {                                                // Public int-funktion, get (aflaesning)
        return antalZoner;                                                      // Returnerer valgte antal af zoner
    } // End of get antalZoner
    public void setAntalZoner(int zone) {                                       // Public void-funktion, set (redigering)
        this.antalZoner = zone;                                                 // Opdatering af varibalen antalZoner
    } // End of set antalZoner


    // ANTAL BILLETTER ---------------------------------------------------------
    public int getAntalBilletter() {                                            // Public int-funktion, get (aflaesning)
        return antalBilletter;                                                  // Returnerer valgte antal af billetter
    } // End of get antalBilletter
    public void setAntalBilletter(int antal) {                                  // Public void-funktion, set (redigering)
        this.antalBilletter = antal;                                            // Opdatering af variablen antalBilletter
    } // End of set antalBilletter

} // End of class Kurv
