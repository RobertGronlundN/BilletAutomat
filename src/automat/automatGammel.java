package automat;                                                                // Skal tilhoere den overordnede package, automat for at kunne arbejde sammen med de resterende filer

import java.util.ArrayList;                                                     // Import, brugt til oprettelse af ArrayList
import java.util.Date;
import java.util.stream.Collectors;
import java.util.List;

public class automatGammel                                                      // Overordnet public class, initialisering af variable
{
    //private String billettype;                                                  // Indeholder navn, billttypen
    //private int antalZoner;                                                     // Antallet af zoner, int
    public int automatZone;
    //private int antalBilletter;                                                 // Antallet af billetter, int
    //private int billetPris;                                                     // Summeret pris: type*12*zone*antal
    private double balance;
    private double total;
    private int antalBilletterSolgt;
    private boolean montoertilstand = false;
    private boolean validBalance = false;

    ArrayList<String> automatLog = new ArrayList<>();                           // Oprettelse af ArrayList til automatlog
    ArrayList<Billettype> billetliste = new ArrayList<>();                       // Oprettelse af ArrayList til Billettype
    ArrayList<Kurv> kurv = new ArrayList<>();
    
    public automatGammel(){
        billetliste.add(new Billettype("Voksen", 12));
        billetliste.add(new Billettype("Barn", 6));
        billetliste.add(new Billettype("Pensionist", 9));
    }
    
    /*
    public Billetautomat (String billettype, int antalZoner, int antalBilletter, int billetPris) {
        this.billettype = billettype;                                           // Opdatering af variablen billettype
        this.antalZoner = antalZoner;                                           // Opdatering af variablen antalZoner
        this.antalBilletter = antalBilletter;                                   // Opdatering af variablen antalBilletter
        this.billetPris = billetPris;                                           // Opdatering af variablen summeretPris
    } // End of public Billetautomat

    // BILLETTYPE --------------------------------------------------------------
    public String getBillettype() {                                             // Public string-funktion, get (aflaesning)
        return billettype;                                                      // Returnerer typen af billet, string
    } // End of get billetType
    public void setBillettype(String billettype) {                              // Public void-funktion, set (redigering)
        this.billettype = billettype;                                           // Opdatering af vaiablen billettype
    } // End of set billetType

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

    // SUMMERET PRIS -----------------------------------------------------------
    public int getBilletPris() {                                                // Public int-funktion, get (aflaesning)
        return billetPris;                                                      // Returnerer den summerede pris
    } // End of get summeretPris
    public void setBilletPris(double type) {                                    // Public void-funktion, set (redigering)
        this.billetPris = (int) (type * getAntalZoner() * 12 * getAntalBilletter());  // Opdatering af integeren summeretPris
    } // End of set summeretPris
    */
    
    // ARRAYLIST ---------------------------------------------------------------// Oprettelse af ArrayList kaldet indkoebskurv, Indeholder typen class: Billetinfo2
    ArrayList<Billetautomat> indkoebskurv = new ArrayList<>( );

    // ADD BILLET MED NUVAERENDE INFO -------------------------------------------
    public void tilfoejBillet(int index, int zoner, int antal){                                       // Funktionen kaldes naar en ny billet skal tilfoejes til arraylisen indkoebskurv
        kurv.add(new Kurv(billetliste.get(index).getBillettype(), antal, billetliste.get(index).getPris(), zoner, index));
        //indkoebskurv.add(new Billetautomat(getBillettype(), getAntalZoner(), getAntalBilletter(), getBilletPris()));
    } // End of void tilfoejBillet

    // REMOVE
    public void fjernBillet(int fjern){
        kurv.remove(fjern);
        //indkoebskurv.remove(fjern);
        //indkoebskurv.remove(indkoebskurv.size()-1);
    }
    
    /*
    // TO STRING ---------------------------------------------------------------
    @Override                                                                   // Override enabled
    public String toString() {                                                  // Opretter public string-funktion. Omskriver class fra arraylisten til en samlet string
        return getBillettype()+ " \t" +getAntalZoner()+ "  \t"+ getAntalBilletter()+"  \t"+getBilletPris()+ " DKK";
    } // End of toString
    */

    // PRINT LIST
    public void udskrivKurv() {                                                 // Funktion til udskrivning af indkoebskurv
        Date date = new Date();
        System.out.println("------------- INDKOEBSKURV -------------");
        System.out.println(indkoebskurv.size());
        System.out.println("Billettype\tZone \tAntal \tSubtotal");
        for (int i = 0 ; i < kurv.size(); i++) {
            System.out.println(kurv.get(i).getBillettype()+"\t"+kurv.get(i).getAntalZoner()+"\t"+kurv.get(i).getAntalBilletter()+"\t"+kurv.get(i).getBilletPris());
        }
        System.out.println("---------------------------------------");
        total=0;
        for (int i=0; i < kurv.size(); i++) {
          total = total + kurv.get(i).getBilletPris();
        }
        System.out.println("          Total: "+total+"  DKK");
        System.out.println("---------------------------------------");
        System.out.println(" Billet gyldig i 2 timer fra udstedelse");
        System.out.println("   "+date.toString()+"  ");
        System.out.println("---------------------------------------");
        System.out.println();

    } // End of void udskrivKurv

    public void udskrivBillet(){
        Date date = new Date();

        // BILLET
        for (int i = 0 ; i < kurv.size() ; i++){
            for (int j = 0 ; j < kurv.get(i).getAntalBilletter() ; j++){
                System.out.println();
                System.out.println(" ________________________________________");
                System.out.println("|_______________    BT    _______________|");
                System.out.println("|________________________________________|");
                System.out.println("|               "+ kurv.get(i).getBillettype() +"             |");
                System.out.println("|                 "+kurv.get(i).getAntalZoner()+ " Zoner                |");
                System.out.println("|________________________________________|");
                System.out.println("| Billet gyldig i 2 timer fra udstedelse |");
                System.out.println("|        "+date.toString()+"    |");
                System.out.println("|________________________________________|");
                System.out.println();             

                antalBilletterSolgt++;
            }
        }



        automatLog.add(date.toString()+"\t | Koebt:\n"
                + "Billettype\t Zone \t Antal \t Subtotal\n"
                + indkoebskurv + "\n");
        returpenge();
    }

    // INDSAET PENGE ------------------------------------------------------------
    public void indsaetPenge(int beloeb) {                                      // Public void-function, set (redigering)
        balance = balance + beloeb;                                             // Indsatte beloeb laegges oveni nuvaerende balance
        Date date = new Date();                                                 // Foroegelse af balance overfoerer til automatlog
        automatLog.add(date.toString()+"\t | Indsat: " + beloeb + " DKK, ny balance: " + balance + "DKK\n");
    }

    // BALANCE -----------------------------------------------------------------
    public double getBalance() {                                                // Public int-function, get (aflaesning)
        return balance;                                                         // Returnerer balancen
    } // End of get balance
    public void setBalance(double balance) {                                    // Public void-function, set (redigering)
        this.balance = balance;                                                 // Opdateer balance til vaerdi angivet af montoer
    } // End of set balance (kan kun tilgaas som montoer)

    // CHECK BALANCE -----------------------------------------------------------
    public boolean checkBalance() {                                             // Tjekker om balancen er hoej nok til koeb af billet
        double totalPris = 0;
        for (int i = 0; i < kurv.size(); i++) {
            totalPris += kurv.get(i).getBilletPris();
        }
        if (balance >= totalPris) {                                             // Hvis dette er tilfaeldet, aendres den boolske vaerdi
            validBalance = true;                                                // Boolean = true (1)

            Date date = new Date();                                             // Godkendelse af balancen overfoeres til automatlog
            automatLog.add(date.toString()+"\t | Balance i orden\n");           // Dato og tid overfoeres sammen med string
        } else {
            validBalance = false;

            Date date = new Date();                                             // Fejlmeldelse overfoeres til automatlog
            automatLog.add(date.toString()+"\t | Balance ikke hoej nok\n");      // Dato og tid overfoeres sammen med string
        }
        return validBalance;
    }

    // TOTAL --------------------------------------------------------------------
    public double getTotal(){
        return total;
    }

    // RETURPENGE --------------------------------------------------------------
    public double returpenge() {
        double returbeloeb = balance-total;                                               // Tjekker automatens balance, overfoerer til returbeloeb
        balance = 0;                                                            // Nulstiller balancen, pengene er udbetalt
        System.out.println("Du faar "+returbeloeb+" DKK retur");                   // Orienterer kunden

        Date date = new Date();                                                 // Tilfoejer til log at der er udbetalt returnpenge
        automatLog.add(date.toString()+"\t | Returneret " + returbeloeb + " DKK \n");

        return returbeloeb;                                                      // Returnerer det returnerede beloeb
    }

    // -------------------------------------------------------------------------
    // -------------------- MONTOER ---------------------------------------------
    // -------------------------------------------------------------------------


    // MONTOER ------------------------------------------------------------------
    void montoerLogin(String adgangskode)
    {
        if ("1234".equals(adgangskode)) {
            montoertilstand = true;                                              // aendrer den boolske vaerdi til true (1)
            System.out.println("Montoertilstand aktiveret");                     // Montoeren kan nu foretage aendringer i systemet
            System.out.println("Du kan nu angive en fast billetpris, aendre zone for automatens placering mm.");
        } else {
            montoertilstand = false;                                             // aendrer eller bibeholder boolske vaerdi falsk (0)
            System.out.println("Montoertilstand deaktiveret");                   // Montoer er logget ud
        }
    }
     public boolean erMontoer() {
        return montoertilstand;
    }

    // AUTOMATZONE -------------------------------------------------------------
    public void setAutomatZone(int automatZone) {
        this.automatZone = automatZone;                                         // Returnerer zone for automats placering
    }
    public int getAutomatZone() {
        return automatZone;                                                     // Returnerer zone for automats placering
    }

     // ANTAL BILLETTER SOLGT --------------------------------------------------
    public int getAntalBilletterSolgt()
    {
        if (montoertilstand) {
            return antalBilletterSolgt;                                         // Returner kun antal billetter solgt, hvis montoer er logget ind
        } else {
            System.out.println("Afvist - log ind foerst");                       // Ellers udskrives fejlmeddelelse
            return 0;                                                           // Restart
        }
    }

     // NULSTIL ----------------------------------------------------------------
    public void nulstil()
    {
        if (montoertilstand) {
            antalBilletterSolgt = 0;
            indkoebskurv.clear();
        } else {
            System.out.println("Afvist - log ind foerst");
        }
    }

    // AUTOMAT LOGBOG ----------------------------------------------------------
    public void getLog() {
        System.out.println(automatLog);
    }

    // LOGSOEGNING --------------------------------------------------------------
    public void logSoegning(String soeg){
      if (montoertilstand) {
            String soegning = soeg;
            List<String> matches = automatLog.stream().filter(it->it.toLowerCase().contains(soegning.toLowerCase())).collect(Collectors.toList());
            matches.forEach(System.out::println);
        } else {
            System.out.println("Afvist - log ind foerst");
        }
    }
} // End of public class Billetinformation
