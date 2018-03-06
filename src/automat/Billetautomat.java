package automat;
/**
 * Model af en simpel billetautomat til enkeltbilletter med én fast pris.
 */

import java.util.ArrayList;
import java.util.Date;

public class Billetautomat 
{
    private int billetpris;                                                     // Prisen for én billet.
    private int balance;                                                        // Hvor mange penge kunden p.t. har puttet i automaten
    private int antalBilletterSolgt;                                            // Antal billetter automaten i alt har solgt
    private int automatZone;                                                    // Angiver i hvilken zone automaten er installeret
    private int rejseZoner;
    private boolean montørtilstand;
    private boolean validBalance = false;

    ArrayList<String> automatLog = new ArrayList<String>();

    /**
     * Opret en billetautomat der sælger billetter til 10 kr.
     */
    public Billetautomat() {
        billetpris = 10;
        balance = 0;
        antalBilletterSolgt = 0;
        automatZone = 1;                                                        // Hvis ikke andet er angivet, står automat i zone 1
    }

    /**
     * Giver prisen for en billet.
     */
    public int getBilletpris() {
        int resultat = billetpris;
        return resultat;
    }

    /**
     * Modtag nogle penge (i kroner) fra en kunde.
     */
    public void indsætPenge(int beløb) {
        balance = balance + beløb;                                              // Indsatte beløb lægges oveni nuværende balance

        Date date = new Date();                                                 // Forøgelse af balance overfører til automatlog
        automatLog.add(date.toString()+"\t | Indsat: " + beløb + " kr., ny balance: " + balance + " kr.\n");
    }

    /**
     * Giver balancen (beløbet maskinen har modtaget til den næste billet).
     */
    public int getBalance() {
        return balance;                                                         // Returnerer balancen
    }
    
    public int getAutomatZone() {
        return automatZone;                                                     // Returnerer zone for automats placering
    }
    
    public int zoneBeregner(int slutZone)
    {
        rejseZoner = 0;
        
        if (slutZone > 6){
            slutZone = 6;
        }
        if (slutZone < automatZone) {
            rejseZoner = (automatZone - slutZone);
        }
        if (slutZone > automatZone) {
            rejseZoner = (slutZone - automatZone);
        }
        if (slutZone == automatZone) {
            rejseZoner = 1;
        }
        
        return rejseZoner;
    }

    public boolean checkBalance(){                                              // Tjekker om balancen er høj nok til køb af billet
        if (balance >= billetpris){                                             // Hvis dette er tilfældet, ændres den boolske værdi
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

    /**
     * Udskriv en billet.
     * Opdater total og nedskriv balancen med billetprisen
     */
    
    public void udskrivBillet() {
        if (balance < billetpris) {
            System.out.println("Du mangler at indbetale nogle penge");
        }
        
        System.out.println("##########B##T#########");
        System.out.println("# BlueJ Trafikselskab #");
        System.out.println("#                     #");
        System.out.println("#        Billet       #");
        System.out.println("#        " + billetpris + " kr.       #");
        System.out.println("#                     #");
        System.out.println("##########B##T#########");
        System.out.println("# Du har " + (balance-billetpris) + " kr til gode       #");
        System.out.println("##########B##T#########");
        System.out.println();

        antalBilletterSolgt = antalBilletterSolgt + 1;
        balance = balance - billetpris; // Billetter koster 10 kroner

        Date date = new Date();
        automatLog.add(date.toString()+"\t | Billet udskrevet til "+ billetpris +" kr., ny balance: "+balance+" kr.\n");
    }


    public int returpenge() {
        int returbeløb = balance;                                               // Tjekker automatens balance, overfører til returbeløb
        balance = 0;                                                            // Nulstiller balancen, pengene er udbetalt
        System.out.println("Du får "+returbeløb+" kr retur");                   // Orienterer kunden

        Date date = new Date();                                                 // Tilføjer til log at der er udbetalt returnpenge
        automatLog.add(date.toString()+"\t | Returneret " + returbeløb + " kr. \n");

        return returbeløb;                                                      // Returnerer det returnerede beløb
    }

    
    void montørLogin(String adgangskode) 
    {
        if ("1234".equals(adgangskode)) {
            montørtilstand = true;                                              // Ændrer den boolske værdi til true (1)
            System.out.println("Montørtilstand aktiveret");                     // Montøren kan nu foretage ændringer i systemet
            System.out.println("Du kan nu angive en fast billetpris, ændre zone for automatens placering mm.");
        } else {
            montørtilstand = false;                                             // Ændrer eller bibeholder boolske værdi falsk (0)
            System.out.println("Montørtilstand deaktiveret");                   // Montør er logget ud
        }
    }


    public int getTotal() 
    {
        if (montørtilstand) {
            return billetpris * antalBilletterSolgt;
        } else {
            System.out.println("Afvist - log ind først");                       // Udskrivning af fejlmeddelelse
            return 0;                                                           // Restart
        }
    }

    public int getAntalBilletterSolgt() 
    {
        if (montørtilstand) {
            return antalBilletterSolgt;                                         // Returner kun antal billetter solgt, hvis montør er logget ind
        } else {
            System.out.println("Afvist - log ind først");                       // Ellers udskrives fejlmeddelelse
            return 0;                                                           // Restart
        }
    }

    public void setBilletpris(int billetpris) {
        this.billetpris = billetpris;                                           // Opdatering af den forudbestemte pris (montør)
    }
    
    public void setZone(int montoerZone)  {
        this.automatZone = montoerZone;                                         // Opdatering af den forudbestemte zone (montør)
    }

    public void nulstil() 
    {
        if (montørtilstand) {
            antalBilletterSolgt = 0;
        } else {
            System.out.println("Afvist - log ind først");
        }
    }

    public void setAntalBilletterSolgt(int antalBilletterSolgt) 
    {
        if (montørtilstand) {
            this.antalBilletterSolgt = antalBilletterSolgt;
        } else {
            System.out.println("Afvist - log ind først");
        }
    }

    public boolean erMontør() {
        return montørtilstand;
    }

    public void getLog() {
        System.out.println(automatLog);
    }
}
