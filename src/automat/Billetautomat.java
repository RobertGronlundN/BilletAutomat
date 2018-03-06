package automat;
/**
 * Model af en simpel billetautomat til enkeltbilletter med én fast pris.
 */

    // Test comment 2
    // Ey Benjamin
    // Test commiting
		// Benjamin.test.2
                // Robert.test.3
                // Benjamin.test.4

import java.util.ArrayList;
import java.util.Date;

public class Billetautomat {
	private int billetpris;    // Prisen for én billet.
	private int balance; // Hvor mange penge kunden p.t. har puttet i automaten
	private int antalBilletterSolgt; // Antal billetter automaten i alt har solgt
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
		balance = balance + beløb;

                Date date = new Date();
                automatLog.add(date.toString()+"\t | Indsat: " + beløb + " kr., ny balance: " + balance + " kr.\n");
	}

	/**
	 * Giver balancen (beløbet maskinen har modtaget til den næste billet).
	 */
	public int getBalance() {
		return balance;
	}

        public boolean checkBalance(){
            if (balance >= billetpris){
                validBalance = true;

                Date date = new Date();
                automatLog.add(date.toString()+"\t | Balance i orden\n");
            } else {
                validBalance = false;

                Date date = new Date();
                automatLog.add(date.toString()+"\t | Balance ikke høj nok\n");
            }
            return validBalance;
        }

	/**
	 * Udskriv en billet.
	 * Opdater total og nedskriv balancen med billetprisen
	 */
	public void udskrivBillet() {
		if (balance<10) {
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
		int returbeløb = balance;
		balance = 0;
		System.out.println("Du får "+returbeløb+" kr retur");

                Date date = new Date();
                automatLog.add(date.toString()+"\t | Returneret " + returbeløb + " kr. \n");

                return returbeløb;
        }




	void montørLogin(String adgangskode) {
		if ("1234".equals(adgangskode)) {
			montørtilstand = true;
			System.out.println("Montørtilstand aktiveret");
			System.out.println("Du kan nu angive billetpris");
		} else {
			montørtilstand = false;
			System.out.println("Montørtilstand deaktiveret");
		}
	}


	public int getTotal() {
		if (montørtilstand) {
			return billetpris * antalBilletterSolgt;
		} else {
			System.out.println("Afvist - log ind først");
			return 0;
		}
	}

	public int getAntalBilletterSolgt() {
		if (montørtilstand) {
			return antalBilletterSolgt;
		} else {
			System.out.println("Afvist - log ind først");
			return 0;
		}
	}

	public void setBilletpris(int billetpris) {
		this.billetpris = billetpris;
	}

	public void nulstil() {
		if (montørtilstand) {
			antalBilletterSolgt = 0;
		} else {
			System.out.println("Afvist - log ind først");
		}
	}

	public void setAntalBilletterSolgt(int antalBilletterSolgt) {
		if (montørtilstand) {
			this.antalBilletterSolgt = antalBilletterSolgt;
		} else {
			System.out.println("Afvist - log ind først");
		}
	}

	public boolean erMontør() {
		return montørtilstand;
	}

        public void getLog(){
            System.out.println(automatLog);
        }

}
