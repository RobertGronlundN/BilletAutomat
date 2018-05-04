package automat;

public class Billettype 
{
    private String billetNavn;
    private double pris;

    public Billettype(String inTypeBillet, double inPris) {
        billetNavn = inTypeBillet;
        pris = inPris;
    } // End of object

    // BILLETNAVN --------------------------------------------------------------
    public String getBillettype() {                                             // Public string-funktion, get (aflaesning)
        return billetNavn;                                                      // Returnerer typen af billet, string
    } // End of get billetType
    
    public void setBillettype(String billettype) {                              // Public void-funktion, set (redigering)
        this.billetNavn = billettype;                                           // Opdatering af vaiablen billettype
    } // End of set billetType
    // Hvis montør skal kunne redigere eller oprette nye billet, kaldes:
    // Billettype.get(i).SetBillettype("----");

    
    // BILLET PRIS -------------------------------------------------------------
    public double getPris() {                                                   // Kaldes hvis pris ønskes oplyst.                  
        return pris;                                                            // Returnerer herefter prisen for den pågældende billet
    } // End of get pris
    
    public void setPris(double pris) {                                          // Public void-funktion, set (redigering) af pris
        this.pris = pris;                                                       // Opdatering af variabel, pris.
    } // End of set pris

} // End of public class Billettype
