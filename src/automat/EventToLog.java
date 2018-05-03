package automat;

import java.util.Date;                                                         // Importering af util til udskrivning af data i loggen.

public class EventToLog {
    private int event;
    private int zoner;
    private String udskrift;
    private String stringVal;
    private double doubleVal;

    public EventToLog(int event, double doubleVal, String stringVal, int zoner) {
        this.event = event;
        this.doubleVal = doubleVal;
        this.stringVal = stringVal;
        this.zoner = zoner:

      switch (event) {
          case '1' : {    // Event 1: Kunde har indsat penge
              udskrift = Dato.toString() + "Der er af kunde indsat " +doubleVal+ " kr.";
              break;
          } // End of Case 1
          case '2' : {    // Event 2: Kunde har fået udbetalt returpenge
              udskrift = Date.toString() + "Der er retuneret " +doubleVal+ " kr.";
              break;
          } // End of Case 2
          case '3' : {    // Event 3: Der er udskrevet billet
              udskrift = Date.toString() + "Der er udskrevet en " +stringVal+ " billet til " +doubleVal+ " kr. ";
              break;
          } // End of Case 3
          case '4' : {    // Event 4: Montør har udført succesfuldt login
              udskrift = Date.toString() + "Montoeren " +stringVal+ " har udført succefuld login";
              break;
          } // End of Case 4
          case '5' : {    // Event 5: Montør har indtastet forkert kode
              udskrift = Date.toString() + "Montoeren " +stringVal+ " har forsøgt at logge ind";
              break;
          } // End of Case 5
          case '6' : {    // Event 6: Montør er logget ud
              udskrift = Date.toString() + "Montoeren " +stringVal+ " har logget ud";
              break;
          } // End of case 6
          case '7' : {    // Event 7: ???
              udskrift = Date.toString() + "Montoeren " +stringVal+ " har logget ud";
              break;
          } // End of case 7
          default: {      // Default event, fejlmeddelelse udskrives
              tekst = uuid.toString() + " " + Dato.toString() + " ERROR MESSAGE: " + event;
              break;
          } // End of default

      } // End of switch

    } // End of Event

} // End of public class
