package automat;

// Test
public class BenytBilletautomatRedigering
{
    public static void main(String[] arg)
    {
        Billetautomat automat = new Billetautomat();
        Billetinformation info = new Billetinformation();
        java.util.Scanner tastatur = new java.util.Scanner(System.in);  // forbered

        System.out.println("BenytBilletautomat version mindst 4");
        System.out.println();

        while (true) {
            System.out.println("-----------------------------------------------");
            System.out.println("VELKOMMEN TIL BT BILLETAUTOMAT");
            System.out.println();
            System.out.println();
            System.out.println("Tast 1 | Køb billet");
            System.out.println();
            
            if (automat.erMontør()) {
                System.out.println("Tast 11 | Se status (montør)");
                System.out.println("Tast 12 | Nulstil (montør)");
                System.out.println("Tast 13 | Sæt zone (montør)");
                System.out.println("Tast 14 | Udskriv log (montør)");
                System.out.println("Tast 15 | Log ud af montørtilstand");
            }
            int start = tastatur.nextInt();
            tastatur.nextLine();
            
            double billetType = 0;
            String billetNavn = null;
            int billetZone = 0;
            int billetAntal = 0;
            int billetPris = 0;
            
            switch (start){
                case 1:
                    
                    int personType;
                                        
                    do
                    {
                    System.out.println("Tast 1 | Voksen (16+)");
                    System.out.println("Tast 2 | Børn");
                    System.out.println("Tast 3 | Studerende");
                    System.out.println("Tast 4 | Pensionist");
                    System.out.println("Tast 5 | Hund");
                    System.out.println("Tast 6 | Cykel");
                    personType = tastatur.nextInt();
                    switch(personType){
                        case 1:                        
                        System.out.println("Voksenbillet (16+) valgt");
                        billetType = 1;
                        billetNavn = "Voksenbillet";
                        break;
                        
                        case 2:                        
                        System.out.println("Børnebillet valgt");
                        billetType = 0.5;
                        billetNavn = "Børnebillet";
                        break;
                        
                        case 3:
                        System.out.println("Billet til studerende valgt (husk gyldig studiekort)");
                        billetNavn = "Studerende";
                        billetType = 0.8;
                        break;
                        
                        case 4:
                        System.out.println("Pensionistbillet valgt");
                        billetNavn = "Pensionist";
                        billetType = 0.8;
                        break;
                        
                        case 5:
                        System.out.println("Hundebillet valgt");
                        billetNavn = "Hundebillet";
                        billetType = 0.5;
                        break;
                        
                        case 6:
                        System.out.println("Cykelbillet valgt");
                        billetNavn = "Cykelbillet";
                        billetType = 0.5;
                        break;
                    
                        default:
                            personType = 0;
                            break;
                    }
                    } while (personType == 0);
                    
                    
                            
                    int zoneType;

                    do
                    {
                    System.out.println("Tast 1 | Vælg antal zoner");
                    System.out.println("Tast 2 | Udregn antal zoner");
                    zoneType = tastatur.nextInt();
                    switch(zoneType){
                        case 1:                     
                        int zoneValg;
                    
                            do
                            {
                            System.out.println("Tast 1 | 1 zone");
                            System.out.println("Tast 2 | 2 zoner");
                            System.out.println("Tast 3 | 3 zoner");
                            System.out.println("Tast 4 | 4 zoner");
                            System.out.println("Tast 5 | 5 zoner");
                            System.out.println("Tast 6 | 6 zoner");
                            zoneValg = tastatur.nextInt();
                            switch(zoneValg){
                                case 1:                        
                                System.out.println("1 zone valgt");
                                billetZone = 1;
                                break;

                                case 2:                        
                                System.out.println("2 zoner valgt");
                                billetZone = 2;
                                break;

                                case 3:
                                System.out.println("3 zoner valgt");
                                billetZone = 3;
                                break;

                                case 4:
                                System.out.println("4 zoner valgt");
                                billetZone = 4;
                                break;

                                case 5:
                                System.out.println("5 zoner valgt");
                                billetZone = 5;
                                break;

                                case 6:
                                System.out.println("6 zoner valgt");
                                billetZone = 6;
                                break;

                                default:
                                    zoneValg = 0;
                                    break;
                            }
                            } while (zoneValg == 0);  
                        break;
                        
                        case 2:                        
                        System.out.println("Hvilken zone ender rejsen i?");
                        int slutZone = tastatur.nextInt();
                        billetZone = automat.zoneBeregner(slutZone);
                        break;                                           
                    
                        default:
                            zoneType = 0;
                            break;
                    }
                    } while (zoneType == 0);
                    
                    System.out.println("Vælg antal billetter:");
                    billetAntal = tastatur.nextInt();
                    
                    info.tilføjKøb(billetNavn, billetZone, billetAntal, billetPris);
                    
                    // INDKØBSKURV
                    System.out.println("Indkøbskurv er nu:");
                    System.out.println(info.indkøbskurv);
                    
                    int godkendBillet;
                    
                    do
                    {
                    System.out.println("Tast 1 | Godkend og gå til betaling");
                    System.out.println("Tast 2 | Køb flere billetter");                   
                    godkendBillet = tastatur.nextInt();
                    switch(godkendBillet){
                        case 1:                        
                        {                    
                        int betalingsMetode;
                        boolean godkendtBetaling=false;
                        
                        while (godkendtBetaling == false)
                        {
                        do
                        {
                        System.out.println("Betal med:");
                        System.out.println("Tast 1 | Dankort");
                        System.out.println("Tast 2 | Kontant");
                        System.out.println("Tast 3 | Kupon");
                        betalingsMetode = tastatur.nextInt();
                        switch(betalingsMetode){
                            case 1:                        
                            System.out.println("Indsæt dankort og tast kode:");
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
                        
                        automat.setBilletpris(billetType, billetZone, billetAntal);       
                        
                        if (automat.checkBalance() == true){
                        godkendtBetaling = true;
                        automat.udskrivBillet();
                        } else {
                        System.out.println("Balance på " + automat.getBalance() + " kr. for lav, indbetal flere penge");
                        }
                        }
                        
                        break;
                        }
                        
                        case 2:                        
                        System.out.println("Returner til hovedmenu");
                        // Indsæt funktion for tilføjelse af børnebillet
                        break;                 
                    
                        default:
                            godkendBillet = 0;
                            break;
                    }
                    } while (godkendBillet == 0);
                    
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
                    System.out.print("Sæt ny zone: ");
                    int zone = tastatur.nextInt();
                    //automat.setZone(zone);
                    break;
                    }    
                case 14:
                    automat.getLog();
                    break;
                case 15:
                    automat.montørLogin("");                    
                    break;
                default:
                    System.out.println("Ugyldigt valg, prøv igen");
                    break;
            }
            
        }   
    }
}