package automat;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;                                                         // Importering af util til udskrivning af data i loggen.

public class LogEvent 
{
    private int event;
    private int zoner;
    private String udskrift;
    private String stringVal;
    private double doubleVal;

    File file = new File("MontoerLog.txt");
    
    LogEvent() {
        
    }
     
        
    public void LogEvent(int event, double doubleVal, String stringVal, int zoner) throws IOException {
        this.event = event;
        this.doubleVal = doubleVal;
        this.stringVal = stringVal;
        this.zoner = zoner;
        
        Date Date = new Date();
                
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
                switch (event) {
          case 1 : {    // Event 4: Montør har udført succesfuldt login
              udskrift = Date.toString() + ": Montoeren " + stringVal + " har udført succefuld login.\n";
              break;
          } // End of Case 1
          case 2 : {    // Event 6: Montør er logget ud
              udskrift = Date.toString() + ": Montoeren " +stringVal+ " har logget ud.\n";
              break;          
          } // End of Case 2
          case 3 : {    // Event 3: Forkert kode er indtastet
              udskrift = Date.toString() + ": Montoeren " +stringVal+ " har forsøgt at logge ind.\n";
              break;
          } // End of Case 3          
          case 4 : {    // Event 4: Billetter købt
              udskrift = Date.toString() + ": Købt: " + doubleVal + " ; " + stringVal + " ; " + zoner + " zoner.\n";
              break;
          } // End of Case 4          
          case 5 : {    // Event 5: Total for billetterne
              udskrift = Date.toString() + ": Total på køb " + doubleVal + ".\nTotal billetter solgt: " + zoner + ".\n";
              break;
          } // End of case 5
          default: {      // Default event, fejlmeddelelse udskrives
              udskrift = Date.toString() + " ERROR MESSAGE: " + event + ".\n";
              break;
          } // End of default

      } // End of switch
      
      writer.append(udskrift);
      writer.close();
      System.out.println("Print succesful");
	  } catch (FileNotFoundException e) {
              System.out.println("File not found.");
	  } // End of catch    
     
    } // End of Event

    
    public void printLog() throws FileNotFoundException, IOException{
        try(BufferedReader br = new BufferedReader(new FileReader(file))) {
        StringBuilder sb = new StringBuilder();
        String line = br.readLine();

        while (line != null) { 
            line = br.readLine();
            MontoerPanel.guiLog.append(line + "\n");
        }
        
        System.out.println("Indlæsning af log fuldført");
                
        } catch (FileNotFoundException e) {
              System.out.println("File not found.");
	} // End of catch 
    }
    

} // End of public class
