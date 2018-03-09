package automat;                                                                // Skal tilhøre den overordnede package, automat for at kunne arbejde sammen med de resterende filer

import java.util.ArrayList;                                                    // Import, brugt til oprettelse af ArrayList
import java.util.Date;
import java.util.stream.Collectors;
import java.util.*;
import java.util.List;

public class Billetinformation2                                                 // Overordnet public class, initialisering af variable
{
    private String billettype;                                                  // Indeholder navn, billttypen
    private int antalZoner;                                                     // Antallet af zoner, int
    private int automatZone;
    private int destinationZone;
    private int antalBilletter;                                                 // Antallet af billetter, int
    private int billetPris;                                                     // Summeret pris: type*12*zone*antal
    private int balance;
    private int total;
    private int antalBilletterSolgt;
    private boolean montoertilstand = false;
    private boolean validBalance = false;
       
    ArrayList<String> automatLog = new ArrayList<String>();                     // Oprettelse af ArrayList itl automatlog

    public Billetinformation2 (String billettype, int antalZoner, int antalBilletter, int billetPris) {
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

    // SLUTZONE ----------------------------------------------------------------
    public void setSlutZone(int destZone) {
        this.destinationZone = destZone;
    }
    public int getSlutZone() {
        return destinationZone;
    }

    // ZONEBEREGNER ------------------------------------------------------------
    public int zoneBeregner() {
        int rejseZoner = 0;
        int slutZone = getSlutZone();

        if (slutZone < automatZone) {
            rejseZoner = (automatZone - slutZone);
        }
        else if (slutZone > automatZone) {
            rejseZoner = (slutZone - automatZone);
        }
        else if (slutZone == automatZone) {
            rejseZoner = 1;
        }
        if (slutZone > 6){
            rejseZoner = 6;
        }
        return rejseZoner;
    }

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
    public void setBilletPris(double type) {                                    // Public void-funktion, set (redigering)
        this.billetPris = (int) (type * getAntalZoner() * 12 * getAntalBilletter());  // Opdatering af integeren summeretPris
    } // End of set summeretPris

    // ARRAYLIST ---------------------------------------------------------------// Oprettelse af ArrayList kaldet indkøbskurv, Indeholder typen class: Billetinfo2
    ArrayList<Billetinformation2> indkoebskurv = new ArrayList<Billetinformation2>( );

    // ADD BILLET MED NUVÆRENDE INFO -------------------------------------------
    public void tilfoejBillet(){                                                 // Funktionen kaldes når en ny billet skal tilføjes til arraylisen indkøbskurv
        indkoebskurv.add(new Billetinformation2(getBillettype(), getAntalZoner(), getAntalBilletter(), getBilletPris()));
    } // End of void tilføjBillet
    
    // REMOVE
    public void fjernBillet(int fjern){
        indkoebskurv.remove(fjern);
        indkoebskurv.remove(indkoebskurv.size()-1);
    }
    
    
    // TO STRING ---------------------------------------------------------------
    @Override                                                                   // Override enabled
    public String toString() {                                                  // Opretter public string-funktion. Omskriver class fra arraylisten til en samlet string
        return getBillettype()+ " \t" +getAntalZoner()+ "  \t"+ getAntalBilletter()+"  \t"+getBilletPris()+ " DKK";
    } // End of toString

    // PRINT LIST
    public void udskrivKurv() {                                                 // Funktion til udskrivning af indkøbskurv
        Date date = new Date();
        System.out.println("------------- INDKØBSKURV -------------");
        System.out.println(indkoebskurv.size());
        System.out.println("Billettype\tZone \tAntal \tSubtotal");        
        for (int i = 0 ; i < indkoebskurv.size(); i++) {
            System.out.println(indkoebskurv.get(i).billettype+"\t"+indkoebskurv.get(i).antalZoner+"\t"+indkoebskurv.get(i).antalBilletter+"\t"+indkoebskurv.get(i).billetPris);
        }
        System.out.println("---------------------------------------");
        total=0;
        for (int i=0; i < indkoebskurv.size(); i++) {
          total = total + indkoebskurv.get(i).billetPris;
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
        for (int i = 0 ; i < indkoebskurv.size() ; i++){
            for (int j = 0 ; j < indkoebskurv.get(i).antalBilletter ; j++){
                System.out.println();
                System.out.println("__________________________________________");
                System.out.println("|    "+ indkoebskurv.get(i).billettype +"     |");
                System.out.println("|         "+indkoebskurv.get(i).antalZoner+ " Zoner" + "       |");
                System.out.println("__________________________________________");
                System.out.println("| Billet gyldig i 2 timer fra udstedelse |");
                System.out.println("|     "+date.toString()+"    |");
                System.out.println("__________________________________________");
                System.out.println();
                System.out.println();  
                
                antalBilletterSolgt++;
            }
        }
        
        
              
        automatLog.add(date.toString()+"\t | Købt:\n"
                + "Billettype\t Zone \t Antal \t Subtotal\n"
                + indkoebskurv + "\n");
        returpenge();
    }

    // INDSÆT PENGE ------------------------------------------------------------
    public void indsaetPenge(int beloeb) {                                        // Public void-function, set (redigering)
        balance = balance + beloeb;                                              // Indsatte beløb lægges oveni nuværende balance
        Date date = new Date();                                                 // Forøgelse af balance overfører til automatlog
        automatLog.add(date.toString()+"\t | Indsat: " + beloeb + " DKK, ny balance: " + balance + "DKK\n");
    }

    // BALANCE -----------------------------------------------------------------
    public int getBalance() {                                                   // Public int-function, get (aflæsning)
        return balance;                                                         // Returnerer balancen
    } // End of get balance
    public void setBalance(int balance) {                                       // Public void-function, set (redigering)
        this.balance = balance;                                                 // Opdateer balance til værdi angivet af montør
    } // End of set balance (kan kun tilgås som montør)

    // CHECK BALANCE -----------------------------------------------------------
    public boolean checkBalance() {                                              // Tjekker om balancen er høj nok til køb af billet
        if (balance >= billetPris) {                                             // Hvis dette er tilfældet, ændres den boolske værdi
            validBalance = true;                                                // Boolean = true (1)

            Date date = new Date();                                             // Godkendelse af balancen overføres til automatlog
            automatLog.add(date.toString()+"\t | Balance i orden\n");           // Dato og tid overføres sammen med string
        } else {
            validBalance = false;

            Date date = new Date();                                             // Fejlmeldelse overføres til automatlog
            automatLog.add(date.toString()+"\t | Balance ikke høj nok\n");      // Dato og tid overføres sammen med string
        }
        return validBalance;
    }

    // TOAL --------------------------------------------------------------------
    public int getTotal(){
        return total;
    }
   
    // RETURPENGE --------------------------------------------------------------
    public int returpenge() {
        int returbeloeb = balance-total;                                               // Tjekker automatens balance, overfører til returbeløb
        balance = 0;                                                            // Nulstiller balancen, pengene er udbetalt
        System.out.println("Du får "+returbeloeb+" DKK retur");                   // Orienterer kunden

        Date date = new Date();                                                 // Tilføjer til log at der er udbetalt returnpenge
        automatLog.add(date.toString()+"\t | Returneret " + returbeloeb + " DKK \n");

        return returbeloeb;                                                      // Returnerer det returnerede beløb
    }



    // -------------------------------------------------------------------------
    // -------------------- MONTØR ---------------------------------------------
    // -------------------------------------------------------------------------
    

    // MONTØR ------------------------------------------------------------------
    void montoerLogin(String adgangskode)
    {
        if ("1234".equals(adgangskode)) {
            montoertilstand = true;                                              // Ændrer den boolske værdi til true (1)
            System.out.println("Montørtilstand aktiveret");                     // Montøren kan nu foretage ændringer i systemet
            System.out.println("Du kan nu angive en fast billetpris, ændre zone for automatens placering mm.");
        } else {
            montoertilstand = false;                                             // Ændrer eller bibeholder boolske værdi falsk (0)
            System.out.println("Montørtilstand deaktiveret");                   // Montør er logget ud
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
            return antalBilletterSolgt;                                         // Returner kun antal billetter solgt, hvis montør er logget ind
        } else {
            System.out.println("Afvist - log ind først");                       // Ellers udskrives fejlmeddelelse
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
            System.out.println("Afvist - log ind først");
        }
    }

    // AUTOMAT LOGBOG ----------------------------------------------------------
    public void getLog() {
        System.out.println(automatLog);
    }
    
    // LOGSØGNING --------------------------------------------------------------
    public void logSoegning(String soeg){
      if (montoertilstand) {
            String soegning = soeg;
            List<String> matches = automatLog.stream().filter(it->it.toLowerCase().contains(soegning.toLowerCase())).collect(Collectors.toList());
            matches.forEach(System.out::println);
        } else {
            System.out.println("Afvist - log ind først");
        }  
    }
} // End of public class Billetinformation
