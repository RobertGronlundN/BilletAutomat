package automat;

import java.util.Date;                                                         // Importering af util til udskrivning af data i loggen.

public class LogEvent 
{
    private int event;
    public int zoner;
    private String udskrift;
    public String stringVal;
    public double doubleVal;
    
            
    public LogEvent(int event, double doubleVal, String stringVal, int zoner) {
        this.event = event;
        this.doubleVal = doubleVal;
        this.stringVal = stringVal;
        this.zoner = zoner;
        
    } // End of Event
} // End of public class
