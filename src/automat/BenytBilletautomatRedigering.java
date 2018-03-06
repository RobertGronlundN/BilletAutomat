package automat;

    // Robert.Test.4
    // Benjamin.test.100

public class BenytBilletautomatRedigering
{
    public static void main(String[] arg)
    {
        Billetautomat automat = new Billetautomat();
        java.util.Scanner tastatur = new java.util.Scanner(System.in);  // forbered

        System.out.println("BenytBilletautomat version mindst 4");
        System.out.println();

        while (true) {
            System.out.println("-----------------------------------------------");
            System.out.println("VELKOMMEN TIL BT BILLETAUTOMAT");
            System.out.println();
            System.out.println();
            System.out.println("Tast 1 for at købe billet");
            System.out.println();
            
            if (automat.erMontør()) {
                System.out.println("Tast 11 for at se status (montør)");
                System.out.println("Tast 12 for at nulstille (montør)");
                System.out.println("Tast 13 for at sætte billetpris (montør)");
                System.out.println("Tast 14 for at sætte zone (montør)");
                System.out.println("Tast 15 for udskrivning af log (montør)");
                System.out.println("Tast 16 for at logge ud af montørtilstand");
            }
            int start = tastatur.nextInt();
            tastatur.nextLine();
            
            switch (start){
                case 1:
                    System.out.println("Vælg billettype:");
                    
                    
                    
                    
                    
                    break;
                    
                // MONTØR INDSTILLINGER
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