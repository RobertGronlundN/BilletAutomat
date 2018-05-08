package automat;                                                                // Skal tilhoere den overordnede package, automat for at kunne arbejde sammen med de resterende filer

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;                                                     // Import, brugt til oprettelse af ArrayList
import java.util.stream.Collectors;     // BRUGES DENNE?
import java.util.List;                  // BRUGES DENNE?

public class Billetautomat                                                      // Overordnet public class, initialisering af variable
{
    public int automatZone = 1;
    private double balance;
    private double total;
    public int antalBilletterSolgt;
    private boolean montoertilstand = false;
    private boolean validBalance = false;

    Zoneberegner beregner = new Zoneberegner();                                 // Oprettelse af ny zoneberegner, beregner
    
    File setup = new File("automatSetup.txt");
    
    ArrayList<String> automatLog = new ArrayList<>();                           // Oprettelse af ArrayList til automatlog
    ArrayList<Billettype> billetType = new ArrayList<>();                       // Oprettelse af ArrayList til Billettype
    ArrayList<Kurv> kurv = new ArrayList<>();                                   // Oprettelse af ArrayList til kurv af billetter

    public Billetautomat(){
        billetType.add(new Billettype("Voksen        ", 12));
        billetType.add(new Billettype("Barn            ", 6));
        billetType.add(new Billettype("Pensionist   ", 9));
        billetType.add(new Billettype("Studerende ", 9));
        billetType.add(new Billettype("Cykel           ", 6));
        billetType.add(new Billettype("Hund           ", 6));
    }

    /*// SETUP -------------------------------------------------------------------
    public void automatSetup() throws IOException{
        try(BufferedReader br = new BufferedReader(new FileReader(setup))) {
        StringBuilder sb = new StringBuilder();
        
        String type = null;
        String pris = null;
        
        while (br.readLine() != "end") { 
            type = br.readLine();
            pris = br.readLine();
            billetType.add( new Billettype(type, Integer.parseInt (pris)));
            System.out.println(type + pris);
        }
        
        System.out.println("Setup fuldført");
                
        } catch (FileNotFoundException e) {
              System.out.println("File not found.");
	} // End of catch 
    } */
       
    
    // ADD BILLET MED NUVAERENDE INFO -------------------------------------------
    public void tilfoejBillet(int index, int zoner, int antal){                 // Funktionen kaldes naar en ny billet skal tilfoejes til arraylisen indkoebskurv
        kurv.add(new Kurv(billetType.get(index).getBillettype(), antal, billetType.get(index).getPris(), zoner, index));
    } // End of void tilfoejBillet

    // REMOVE
    public void fjernBillet(int fjern){                                         // Void-funktione som fjerner en billet fra kurv
        kurv.remove(fjern);                                                     // Fjerne de ønskede element, ud fra variable         
    } // End of funktion der fjerner billet

    // INDSAET PENGE ------------------------------------------------------------
    public void indsaetPenge(int beloeb) {                                      // Public void-function, set (redigering)
        balance = balance + beloeb;                                             // Indsatte beloeb laegges oveni nuvaerende balance
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
            totalPris += kurv.get(i).getBilletPris();                           // Den totale pris opdateres ved at laegge alle priser fra kurven sammen.
        }
        if (balance >= totalPris) {                                             // Hvis dette er tilfaeldet, aendres den boolske vaerdi
            validBalance = true;                                                // Boolean = true (1)
        } else {
            validBalance = false;
        }
        return validBalance;
    } // End of check balance

    // TOTAL --------------------------------------------------------------------
    public double getTotal(){ 
        total=0;                                                                // Total nulstilles
        for (int i=0; i < kurv.size(); i++) {                                   // For loop, afhaenger af størrelsen af kurv-ArrayList
          total = total + kurv.get(i).getBilletPris();                          // Beregner den totale pris ud fra billetpris pr. kurv element
        }
        return total;                                                           // Funktionen er af typen double, og vi returnerer derfor den beregnede totalpris
    } // End of get total

    // RETURPENGE --------------------------------------------------------------
    public double returpenge() {
        double returbeloeb = balance-total;                                     // Tjekker automatens balance, overfoerer til returbeloeb
        balance = 0;                                                            // Nulstiller balancen, pengene er udbetalt
        System.out.println("Du faar "+returbeloeb+" DKK retur");                // Orienterer kunden
        return returbeloeb;                                                     // Returnerer det returnerede beloeb
    } // End of returnpenge

    // -------------------------------------------------------------------------
    // -------------------- MONTOER --------------------------------------------
    // -------------------------------------------------------------------------

    // Herunder følger funktioner tilhørende montoer tilstanden. Funkitonerne kan ikke 
    // tilgaes andre steder i programmet, hvis ikke montoeren er logget ind

    // MONTOER LOGIN -----------------------------------------------------------
    void montoerLogin(String adgangskode)
    {
        montoertilstand = "1234".equals(adgangskode); 
    } // End of montoer login
    
    
    // MONTOERTILSTAND ---------------------------------------------------------
    public boolean getMontoertilstand() {
        return montoertilstand;                                                 // Returnerer nuvaerende montoertilstand
    } // End of get montoertilstand
    public void setMontoertilstand(boolean input) {
        montoertilstand = input;                                                // Opdaterer montoertilstand ud fra input boolean
    } // End of set montoertilstand

    
    // AUTOMATZONE -------------------------------------------------------------
    public void setAutomatZone(int automatZone) {
        if (montoertilstand == true ) {                                         // Tjekkeer om montoer er logget ind
            this.automatZone = automatZone;                                     // Returnerer zone for automats placering
        }
    } // End of set automatzone
    public int getAutomatZone() {
        return automatZone;                                                     // Returnerer zone for automats placering
    } // End of set automatzone

    
     // ANTAL BILLETTER SOLGT --------------------------------------------------
    public int getAntalBilletterSolgt()    {
        if (montoertilstand) {                                                  // Tjekker om montoer er logget ind
            return antalBilletterSolgt;                                         // Returner kun antal billetter solgt, hvis montoer er logget ind
        } else {
            return 0;                                                           // Restart
        }
    } // End of get antal billetter solgt

    
     // NULSTIL ----------------------------------------------------------------
    public void nulstil()  {
        if (montoertilstand) {                                                  // Tjekker om montoer er logget ind 
            antalBilletterSolgt = 0;                                            // Nulstiller antallet af solgte billetter 
            kurv.clear();                                                       // Nulstiller indkøbskurven
        }
    } // Endo of nulstil void-funktion
    
    
    // LOGSOEGNING --------------------------------------------------------------
    public void logSoegning(String soeg){
      if (montoertilstand) {                                                    // Tjekker om montoer er logget ind
            String soegning = soeg;                                             // Gemmer parameter soeg i en streng
            List<String> matches = automatLog.stream().filter(it->it.toLowerCase().contains(soegning.toLowerCase())).collect(Collectors.toList());
            matches.forEach(System.out::println);                               // Printer de fundne matches
        }
    } // End of logsoegnings funktion
    
} // End of public class Billetinformation
