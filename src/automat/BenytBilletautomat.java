package automat;

public class BenytBilletautomat
{
    public static void main(String[] arg)
    {
        Billetautomat automat = new Billetautomat(null, 0, 0, 0);
        Zoneberegner zoneberegner = new Zoneberegner();
        java.util.Scanner tastatur = new java.util.Scanner(System.in);          // forbereder keyboard scanner

        System.out.println("BenytBilletautomat version mindst 4");
        System.out.println();

        mainMenu: while (true)
        {
            System.out.println("-----------------------------------------------");
            System.out.println("VELKOMMEN TIL BT BILLETAUTOMAT");
            System.out.println();
            System.out.println();
            System.out.println("Tast 1 | Koeb billet");
            System.out.println();

            if (automat.erMontoer())
            {
                System.out.println("Tast 11 | Se status (montoer)");
                System.out.println("Tast 12 | Nulstil (montoer)");
                System.out.println("Tast 13 | Saet zone (montoer)");
                System.out.println("Tast 14 | Udskriv log (montoer)");
                System.out.println("Tast 15 | Log ud af montoertilstand");
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
                    System.out.println("Tast 1 | Voksen (16+)\t | 12 DKK/zone");
                    System.out.println("Tast 2 | Boern\t\t | 6 DKK/zone");
                    System.out.println("Tast 3 | Studerende\t | 9 DKK/zone");
                    System.out.println("Tast 4 | Pensionist\t | 9 DKK/zone");
                    System.out.println("Tast 5 | Hund\t\t | 6 DKK/zone");
                    System.out.println("Tast 6 | Cykel\t\t | 6 DKK/zone");
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
                        System.out.println("Boernebillet valgt");
                        billetType = 0.5;
                        automat.setBillettype("Boernebillet");
                        break;

                        case 3:
                        System.out.println("Billet til studerende valgt (husk gyldig studiekort)");
                        automat.setBillettype("Studerende");
                        billetType = 0.75;
                        break;

                        case 4:
                        System.out.println("Pensionistbillet valgt");
                        automat.setBillettype("Pensionist");
                        billetType = 0.75;
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
                    System.out.println("Tast 1 | Vaelg antal zoner");
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
                        zoneberegner.setSlutZone(slutZone);
                        int zoneVal = zoneberegner.zoneBeregner();
                        automat.setAntalZoner(zoneVal);
                    break;

                    case 9:
                    continue mainMenu;

                    default:
                        zoneType = 0;
                        break;
                    }
                } while (zoneType == 0);


                System.out.print("Vaelg antal billetter: ");
                int billetAntal = tastatur.nextInt();
                automat.setAntalBilletter(billetAntal);

                automat.setBilletPris(billetType);

                int godkendBillet;

                do
                {
                automat.tilfoejBillet();
                automat.udskrivKurv();
                System.out.println("Tast 1 | Godkend og gaa til betaling");
                System.out.println("Tast 2 | Koeb flere billetter");
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
                                if (automat.erMontoer())
                                {
                                    System.out.println("Tast 10 | Saet balance (montoer)");
                                }
                                betalingsMetode = tastatur.nextInt();

                                switch(betalingsMetode)
                                {
                                    case 1:
                                    System.out.println("Indsaet dankort og tast kode:");
                                    System.out.println("...");
                                    System.out.println("Godkendt");
                                    System.out.println("Koeb gennemfoert paa "+automat.getTotal()+" DKK");
                                    automat.indsaetPenge(automat.getTotal());
                                    break;

                                    case 2:
                                    System.out.println("Klar til modtagelse af kontanter");
                                    System.out.print("Skriv beloeb: ");
                                    int beloeb = tastatur.nextInt();
                                    automat.indsaetPenge(beloeb);
                                    break;

                                    case 10:
                                    {
                                    System.out.println("Indsaet ny balance: ");

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

                                automat.indkoebskurv.clear();

                                }
                            else {
                            System.out.println("Balance paa " + automat.getBalance() + " kr. for lav, indbetal flere penge");
                            }
                        }
                    break;
                    }

                    case 2:
                        System.out.println("Returner til hovedmenu");
                        continue mainMenu;


                    case 3:
                        System.out.print("Indtast nummer paa billet der skal slettes: ");
                        int sletBilletNr = tastatur.nextInt()-1;
                        if (sletBilletNr >= 0 && sletBilletNr < automat.indkoebskurv.size() ){
                            automat.fjernBillet(sletBilletNr);
                        }

                        godkendBillet = 0;
                        break;


                    case 9:
                    automat.indkoebskurv.clear();
                    continue mainMenu;

                    default:
                        godkendBillet = 0;
                        break;
                }
            } while (godkendBillet == 0);
            break;

            // MONToeR INDSTILLINGER --------------------------------------------
            case 10:
                System.out.print("Skriv kode: ");
                String kode = tastatur.next();
                automat.montoerLogin(kode);
                break;
            case 11:
                System.out.println("Antal billetter solgt: " + automat.getAntalBilletterSolgt());
                break;
            case 12:
                automat.nulstil();
                break;
            case 13:
                {
                    System.out.print("Saet ny zone: ");
                    int zone = tastatur.nextInt();
                    //automat.setZone(zone);
                    break;
                }
            case 14:
                automat.getLog();
                break;
            case 15:
                System.out.print("Indtast soegeord: ");
                String soegning = tastatur.nextLine();
                automat.logSoegning(soegning);
                break;
            case 16:
                automat.montoerLogin("");
                break;
            default:
                System.out.println("Ugyldigt valg, proev igen");
                break;
            }
        }
    }
}
