package automat;                                                                // Skal tilhøre den overordnede package, automat for at kunne arbejde sammen med de resterende filer

import java.util.ArrayList;                                                    // Import, brugt til oprettelse af ArrayList

public class Billetinformation2                                                 // Overordnet public class, initialisering af variable
{
    private String billettype;                                                  // Indeholder navn, billttypen
    private int antalZoner;                                                     // Antallet af zoner, int
    private int antalBilletter;                                                 // Antallet af billetter, int
    private int billetPris;                                                     // Summeret pris: type*12*zone*antal

    public Billetinformation2(String billettype, int antalZoner, int antalBilletter, int billetPris) {
        this.billettype = billettype;                                           // Opdatering af variablen billettype
        this.antalZoner = antalZoner;                                           // Opdatering af variablen antalZoner
        this.antalBilletter = antalBilletter;                                   // Opdatering af variablen antalBilletter
        this.billetPris = billetPris;                                           // Opdatering af variablen summeretPris
    } // End of public Billetinformation2

    // BILLETTYPE --------------------------------------------------------------
    public String getBillettype() {                                             // Public string-funktion, get (aflæsning)
        return billettype;                                                      // Returnerer typen af billet, string
    } // End of get billetType
    public void setBillettype(String billettype) {                              // Public void-funktion, set (redigering)
        this.billettype = billettype;                                           // Opdatering af vaiablen billettype
    } // End of set billetType

    // ANTAL ZONER -------------------------------------------------------------
    public int getAntalZoner() {                                                // Public int-funktion, get (aflæsning)
        return antalZoner;                                                      // Returnerer valgte antal af zoner
    } // End of get antalZoner
    public void setAntalZoner(int zone) {                                       // Public void-funktion, set (redigering)
        this.antalZoner = zone;                                                 // Opdatering af varibalen antalZoner
    } // End of set antalZoner

    // ANTAL BILLETTER ---------------------------------------------------------
    public int getAntalBilletter() {                                            // Public int-funktion, get (aflæsning)
        return antalBilletter;                                                  // Returnerer valgte antal af billetter
    } // End of get antalBilletter
    public void setAntalBilletter(int antal) {                                  // Public void-funktion, set (redigering)
        this.antalBilletter = antal;                                            // Opdatering af variablen antalBilletter
    } // End of set antalBilletter

    // SUMMERET PRIS -----------------------------------------------------------
    public int getBilletPris() {                                                // Public int-funktion, get (aflæsning)
        return billetPris;                                                      // Returnerer den summerede pris
    } // End of get summeretPris
    public void setBilletPris(double type) {               // Public void-funktion, set (redigering)
        this.billetPris = (int) (type * getAntalZoner() * 12 * getAntalBilletter());                     // Opdatering af integeren summeretPris
    } // End of set summeretPris

    // ARRAYLIST ---------------------------------------------------------------// Oprettelse af ArrayList kaldet indkøbskurv, Indeholder typen class: Billetinfo2
    ArrayList<Billetinformation2> indkøbskurv = new ArrayList<Billetinformation2>( );

    // ADD BILLET MED NUVÆRENDE INFO -------------------------------------------
    public void tilføjBillet(){                                                 // Funktionen kaldes når en ny billet skal tilføjes til arraylisen indkøbskurv
        indkøbskurv.add(new Billetinformation2(getBillettype(), getAntalZoner(), getAntalBilletter(), getBilletPris()));
    } // End of void tilføjBillet

    // TO STRING ---------------------------------------------------------------
    @Override                                                                   // Override enabled
    public String toString() {                                                  // Opretter public string-funktion. Omskriver class fra arraylisten til en samlet string
        return "Billettype: \t" +getBillettype()+ "; \tZoner: \t" +getAntalZoner()+ " zoner \tAntalBil: \t"+ getAntalBilletter()+" stk. \tSummeretPris: \t"+getBilletPris()+ "DKK";
    } // End of toString

    // PRINT LIST
    public void udskrivKurv() {                                                 // Funktion til udskrivning af indkøbskurv
        System.out.println("------------- INDKØBSKURV -------------");
        for (Billetinformation2 b : indkøbskurv) {
            System.out.println(b); // Assuming a valid toString in the Book class
        }
        System.out.println("---------------------------------------");
    }
} // End of public class Billetinformation
