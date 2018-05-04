package automat;

public class Kurv {

    private int antalBilletter;
    private String billettype;
    private double billetPris;
    private int antalZoner;
    private int index;

    public Kurv(String billettype, int antalBilletter, double billetPris, int antalZoner, int index) {
        this.billettype = billettype;                                           // Overfører parameter billettype til denne klasses variabel af samme navn.
        this.antalBilletter = antalBilletter;                                   // Overfører parameter antal billetter til denne klasses variable af samme navn.
        this.billetPris = (billetPris * antalZoner * antalBilletter);           // Beregner billetpris ud fra pris pr. zone + antal zoner + antal billetter.
        this.antalZoner = antalZoner;                                           // Overfører antallet af zoner til denne klasses variabel af samme navn.
        this.index = index;                                                     // Overfører index nummer til denne klasses variabel af samme navn.
    } // Identification af kurv, afsluttet.

    // BILLETTYPE --------------------------------------------------------------
    public String getBillettype() {                                             // Public int-funkiton, get (billettype)
        return billettype;                                                      // Returnerer nuværende billettype
    } // End of getBillettype
    public void setBillettype(String billettype) {                              // Public void-funktion, set (redigering) af billettypen
        this.billettype = billettype;                                           // Opdatering af variael billettype.
    } // End of setBillettype


    // BILLET PRIS -------------------------------------------------------------
    public double getBilletPris() {                                             // Public int-funkiton, get (billetpris)
        return billetPris;                                                      // Returnerer nuværende billetpris
    } // End of getBilletPris
    public void setBilletPris(double billetPris) {                              // Public void-funktion, set (redigering) af billetpris
        this.billetPris = billetPris;                                           // Opdatering af variable billetpris.
    } // End of setBilletPris


    // INDEX -------------------------------------------------------------------
    public int getIndex() {                                                     // Public int-funkiton, get (index nummer)
        return index;                                                           // Returnerer nuværende index-nummer
    } // End of getIndex
    public void setIndex(int index) {                                           // Public void-funktion, set (index nummer)
        this.index = index;                                                     // Opdatering af variabel index
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
