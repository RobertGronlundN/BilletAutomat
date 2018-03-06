package automat;

    // Robert.Test.4
    // Benjamin.test.100

public class BenytBilletautomat
{
    public static void main(String[] arg)
    {
        Billetautomat automat = new Billetautomat();
        java.util.Scanner tastatur = new java.util.Scanner(System.in);  // forbered

        System.out.println("BenytBilletautomat version 3");
        System.out.println();

        while (true) {
            System.out.println("-----------------------------------------------");
            System.out.println("En billet koster " + automat.getBilletpris() + " kroner");
            System.out.println("Balancen er på " + automat.getBalance() + " kroner");
            System.out.println();
            System.out.println("Tast 1 for at indbetale penge");
            System.out.println("Tast 2 for at udskrive din billet");
            System.out.println("Tast 3 for at få returpengene");
            System.out.println();
            System.out.println("Tast 10 for at logge ind som montør");
            if (automat.erMontør()) {
                System.out.println("Tast 11 for at se status (montør)");
                System.out.println("Tast 12 for at nulstille (montør)");
                System.out.println("Tast 13 for at sætte billetpris (montør)");
                System.out.println("Tast 14 for at sætte zone (montør)");
                System.out.println("Tast 15 for udskrivning af log (montør)");
                System.out.println("Tast 16 for at logge ud af montørtilstand");
            }
            int valg = tastatur.nextInt();
            tastatur.nextLine();

            switch (valg) {
                case 1:
                {                    
                    int betalingsMetode;

                    do
                    {
                    System.out.println("Tast 1 for Dankort");
                    System.out.println("Tast 2 for Kontant");
                    System.out.println("Tast 3 for Kupon");
                    betalingsMetode = tastatur.nextInt();
                    switch(betalingsMetode){
                        case 1:                        
                        System.out.println("Indsæt kort og tast kode:");
                        System.out.println("...");
                        System.out.println("Godkendt");  
                        break;
                        
                        case 2:                        
                        System.out.println("Klar til modtagelse af kontanter");
                        break;
                        
                        case 3:
                        System.out.print("Indtast kuponkode: ");
                        //int kuponKode = tastatur.next();
                        //automat.checkKuponKode
                        break;
                    
                        default:
                            betalingsMetode = 0;
                            break;
                    }
                    } while (betalingsMetode == 0);
                    System.out.print("Skriv beløb: ");
                    int beløb = tastatur.nextInt();
                    automat.indsætPenge(beløb);
                    break;
                    }
                case 2:
                    if (automat.checkBalance() == true){
                        automat.udskrivBillet();
                    } else {
                        System.out.println("Balance for lav, indbetal penge");
                    }
                    break;
                case 3:
                    {
                    int beløb = automat.returpenge();
                    System.out.println("Du fik "+beløb+" retur retur");
                    break;
                    }
                case 10:
                    System.out.print("Skriv kode: ");
                    String kode = tastatur.next();
                    automat.montørLogin(kode);
                    break;
                case 11:
                    System.out.println("Antal billetter solgt: " + automat.getAntalBilletterSolgt());
                    System.out.println("Total indkomst: " + automat.getTotal()+" kr");
                    break;
                case 12:
                    automat.nulstil();
                    break;
                case 13:
                    {
                    System.out.print("Sæt ny billetpris: ");
                    int beløb = tastatur.nextInt();
                    automat.setBilletpris(beløb);
                    break;
                    }
                case 14:
                    {
                    System.out.print("Sæt ny zone: ");
                    int zone = tastatur.nextInt();
                    //automat.setZone(zone);
                    break;
                    }    
                case 15:
                    automat.getLog();
                    break;
                case 16:
                    automat.montørLogin("");
                    
                    break;
                default:
                    System.out.println("Ugyldigt valg, prøv igen");
                    break;
            }
        }
    }
}