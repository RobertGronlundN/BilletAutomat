package automat;


public class BenytBilletautomatRedigering
{
    public static void main(String[] arg)
    {
        //Billetautomat automat = new Billetautomat();
        Billetinformation2 automat = new Billetinformation2(null, 0, 0, 0);
        java.util.Scanner tastatur = new java.util.Scanner(System.in);          // forbereder keyboard scanner

        System.out.println("BenytBilletautomat version mindst 4");
        System.out.println();

        mainMenu: while (true)
        {
            System.out.println("-----------------------------------------------");
            System.out.println("VELKOMMEN TIL BT BILLETAUTOMAT");
            System.out.println();
            System.out.println();
            System.out.println("Tast 1 | Køb billet");
            System.out.println();

            if (automat.erMontør())
            {
                System.out.println("Tast 11 | Se status (montør)");
                System.out.println("Tast 12 | Nulstil (montør)");
                System.out.println("Tast 13 | Sæt zone (montør)");
                System.out.println("Tast 14 | Udskriv log (montør)");
                System.out.println("Tast 15 | Log ud af montørtilstand");
            }
            int start = tastatur.nextInt();
            tastatur.nextLine();

            double billetType = 0;
            int billetZone = 0;
            int billetPris = 0;

            switch (start)
            {
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
                    System.out.println();
                    System.out.println("Tast 9 | Afbryd billet");
                    personType = tastatur.nextInt();
                    switch(personType)
                    {
                        case 1:
                        System.out.println("Voksenbillet (16+) valgt");
                        billetType = 1;
                        automat.setBillettype("Voksenbillet");
                        break;

                        case 2:
                        System.out.println("Børnebillet valgt");
                        billetType = 0.5;
                        automat.setBillettype("Børnebillet");
                        break;

                        case 3:
                        System.out.println("Billet til studerende valgt (husk gyldig studiekort)");
                        automat.setBillettype("Studerende");
                        billetType = 0.8;
                        break;

                        case 4:
                        System.out.println("Pensionistbillet valgt");
                        automat.setBillettype("Pensionist");
                        billetType = 0.8;
                        break;

                        case 5:
                        System.out.println("Hundebillet valgt");
                        automat.setBillettype("Hundebillet");
                        billetType = 0.5;
                        break;

                        case 6:
                        System.out.println("Cykelbillet valgt");
                        automat.setBillettype("Cykelbillet");
                        billetType = 0.5;
                        break;

                        case 9:
                        continue mainMenu;

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
                    System.out.println();
                    System.out.println("Tast 9 | Afbryd billet");
                    zoneType = tastatur.nextInt();
                    switch(zoneType)
                    {
                        case 1:
                            System.out.print("Indtast antal zoner:  ");
                            int zoneValg = tastatur.nextInt();
                            if (zoneValg >= 1 && zoneValg <= 6) {
                                automat.setAntalZoner(zoneValg);
                            }
                            else {
                                automat.setAntalZoner(6);
                            }
                        break;

                    case 2:
                        System.out.println("Hvilken zone ender rejsen i?");
                        int slutZone = tastatur.nextInt();
                        automat.setSlutZone(slutZone);
                        int zoneVal = automat.zoneBeregner();
                        automat.setAntalZoner(zoneVal);
                    break;
                                        
                    case 9:
                    continue mainMenu;

                    default:
                        zoneType = 0;
                        break;
                    }
                } while (zoneType == 0);


                System.out.print("Vælg antal billetter: ");
                int billetAntal = tastatur.nextInt();
                automat.setAntalBilletter(billetAntal);

                automat.setBilletPris(billetType);
                
                int godkendBillet;

                do
                {
                automat.tilføjBillet();
                automat.udskrivKurv();
                System.out.println("Tast 1 | Godkend og gå til betaling");
                System.out.println("Tast 2 | Køb flere billetter");
                System.out.println("Tast 3 | Slet billet");
                System.out.println();
                System.out.println("Tast 9 | Afbryd billet");
                godkendBillet = tastatur.nextInt();
                switch(godkendBillet)
                {
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
                                if (automat.erMontør())
                                {
                                    System.out.println("Tast 10 | Sæt balance (montør)");
                                }
                                betalingsMetode = tastatur.nextInt();

                                switch(betalingsMetode)
                                {
                                    case 1:
                                    System.out.println("Indsæt dankort og tast kode:");
                                    System.out.println("...");
                                    System.out.println("Godkendt");
                                    System.out.println("Køb gennemført på "+automat.getTotal()+" DKK");
                                    automat.indsætPenge(automat.getTotal());
                                    break;

                                    case 2:
                                    System.out.println("Klar til modtagelse af kontanter");
                                    System.out.print("Skriv beløb: ");
                                    int beløb = tastatur.nextInt();
                                    automat.indsætPenge(beløb);
                                    break;

                                    case 3:
                                    System.out.print("Indtast kuponkode: ");
                                    //int kuponKode = tastatur.next();
                                    //automat.checkKuponKode
                                    break;

                                    case 10:
                                    {
                                    System.out.println("Indsæt ny balance: ");

                                    int nyBalance = tastatur.nextInt();
                                    automat.setBalance(nyBalance);
                                    break;
                                    }

                                    default:
                                    betalingsMetode = 0;
                                    break;
                                }
                            } while (betalingsMetode == 0);

                            

                            automat.setBilletPris(billetType);

                            if (automat.checkBalance() == true)  {
                                godkendtBetaling = true;

                                automat.udskrivBillet();
                                
                                automat.indkøbskurv.clear();

                                }
                            else {
                            System.out.println("Balance på " + automat.getBalance() + " kr. for lav, indbetal flere penge");
                            }
                        }
                    break;
                    }

                    case 2:
                        System.out.println("Returner til hovedmenu");                        
                        continue mainMenu;
                       
                    
                    case 3:
                        System.out.print("Indtast nummer på billet der skal slettes: ");
                        int sletBilletNr = tastatur.nextInt()-1;
                        if (sletBilletNr >= 0 && sletBilletNr < automat.indkøbskurv.size() ){
                            automat.fjernBillet(sletBilletNr);
                        }
                        
                        godkendBillet = 0;
                        break;


                    case 9:
                    automat.indkøbskurv.clear();
                    continue mainMenu;

                    default:
                        godkendBillet = 0;
                        break;
                }
            } while (godkendBillet == 0);
            break;

            // MONTØR INDSTILLINGER --------------------------------------------
            case 10:
                System.out.print("Skriv kode: ");
                String kode = tastatur.next();
                automat.montørLogin(kode);
                break;
            case 11:
                System.out.println("Antal billetter solgt: " + automat.getAntalBilletterSolgt());
                System.out.println("Total indkomst: " + automat.getStatus()+" kr");
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
