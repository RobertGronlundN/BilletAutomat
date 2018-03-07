package automat;

import java.util.ArrayList;
import java.util.Date;

public class Billetautomat
{
    // private int billetpris;                                                     // Prisen for én billet.
    // private int balance;                                                        // Hvor mange penge kunden p.t. har puttet i automaten
    // private int antalBilletterSolgt;                                            // Antal billetter automaten i alt har solgt
    // private int automatZone;                                                    // Angiver i hvilken zone automaten er installeret
    // private int rejseZoner;
    // private int destinationZone;
    // private boolean montørtilstand;
    // private boolean validBalance = false;

    ArrayList<String> automatLog = new ArrayList<String>();                     // Oprettelse af ArrayList itl automatlog

    public Billetautomat() {
        billetpris = 10;                                                        // Som standard er billetprisen 10
        balance = 0;                                                            // Som standard er balancen 0
        antalBilletterSolgt = 0;                                                // Som standard har automaten ingen billetter udstedt
        automatZone = 1;                                                        // Som standard står automat i zone 1
        destinationZone = 1;                                                    // Som standard er endestationen i samme zone som automaten
    }
    /*
    // INDSÆT PENGE ------------------------------------------------------------
    public void indsætPenge(int beløb) {                                        // Public void-function, set (redigering)
        balance = balance + beløb;                                              // Indsatte beløb lægges oveni nuværende balance

        Date date = new Date();                                                 // Forøgelse af balance overfører til automatlog
        automatLog.add(date.toString()+"\t | Indsat: " + beløb + " kr., ny balance: " + balance + " kr.\n");
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
        if (balance >= billetpris) {                                             // Hvis dette er tilfældet, ændres den boolske værdi
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


    // AUTOMATZONE -------------------------------------------------------------
    public void setAutomatZone(int autZone) {
        automatZone = autZone;                                                  // Returnerer zone for automats placering
    }
    public int getAutomatZone() {
        return automatZone;                                                     // Returnerer zone for automats placering
    }

    // SLUTZONE ----------------------------------------------------------------
    public void setSlutZone(int destZone) {
        this.destinationZone = destZone;
    }
    public int getSlutZone() {
        return destinationZone;
    }

    // ZONEBEREGNER ------------------------------------------------------------
    public int zoneBeregner() {
        rejseZoner = 0;
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
    } */

    // UDSKRIV BILLET ----------------------------------------------------------
    public void udskrivBillet() {
        if (balance < billetpris) {
            System.out.println("Du mangler at indbetale nogle penge");
        }

        Date date = new Date();

        System.out.println("##########B##T#########");
        System.out.println("# BlueJ Trafikselskab #");
        System.out.println("#                     #");
        System.out.println("#        Billet       #");
        System.out.println("#        " + billetpris + " kr.       #");
        System.out.println("#                     #");
        System.out.println("##########B##T#########");
        System.out.println("# Du har " + (balance-billetpris) + " kr til gode       #");
        System.out.println("##########B##T#########");
        System.out.println("#    Billet Gyldig    #");
        System.out.println("#  2 timer efter køb  #");
        System.out.println("# " + date.toString() + " #");                      // Udskrivning af data og tid.
        System.out.println("##########B##T#########");

        antalBilletterSolgt = antalBilletterSolgt + 1;
        balance = balance - billetpris;


        automatLog.add(date.toString()+"\t | Billet udskrevet til "+ billetpris +" kr., ny balance: "+balance+" kr.\n");
    }

    public void udskrivBillet2(){

    }

    /*
    // RETURPENGE --------------------------------------------------------------
    public int returpenge() {
        int returbeløb = balance;                                               // Tjekker automatens balance, overfører til returbeløb
        balance = 0;                                                            // Nulstiller balancen, pengene er udbetalt
        System.out.println("Du får "+returbeløb+" kr retur");                   // Orienterer kunden

        Date date = new Date();                                                 // Tilføjer til log at der er udbetalt returnpenge
        automatLog.add(date.toString()+"\t | Returneret " + returbeløb + " kr. \n");

        return returbeløb;                                                      // Returnerer det returnerede beløb
    }

    // TOTAL -------------------------------------------------------------------
    public int getTotal()
    {
        if (montørtilstand) {
            return billetpris * antalBilletterSolgt;
        } else {
            System.out.println("Afvist - log ind først");                       // Udskrivning af fejlmeddelelse
            return 0;                                                           // Restart
        }
    }

    // MONTØR ------------------------------------------------------------------
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
     public boolean erMontør() {
        return montørtilstand;
    }

     // ANTAL BILLETTER SOLGT --------------------------------------------------
    public void setAntalBilletterSolgt(int antalBilletterSolgt)
    {
        if (montørtilstand) {
            this.antalBilletterSolgt = antalBilletterSolgt;
        } else {
            System.out.println("Afvist - log ind først");
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

     // NULSTIL ----------------------------------------------------------------
    public void nulstil()
    {
        if (montørtilstand) {
            antalBilletterSolgt = 0;
        } else {
            System.out.println("Afvist - log ind først");
        }
    }

    // AUTOMAT LOGBOG ----------------------------------------------------------
    public void getLog() {
        System.out.println(automatLog);
    } */
}
