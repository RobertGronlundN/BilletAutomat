package automat;

//import java.lang.reflect.Array;
import java.util.ArrayList;

public class Billetinformation2
{
    private String billettype;
    private int antalZoner;
    private int antalBilletter;
    private int summeretPris;
    
    public Billetinformation2(String billettype, int antalZoner, int antalBilletter, int summeretPris){
        this.billettype = billettype;
        this.antalZoner = antalZoner;
        this.antalBilletter = antalBilletter;
        this.summeretPris = summeretPris;
    }
    
    // BILLETTYPE --------------------------------------------------------------
    public String getBillettype() {
        return billettype;
    }
    public void setBillettype(String name) {
        this.billettype = name;
    }

    // ANTAL ZONER -------------------------------------------------------------
    public int getAntalZoner() {
        return antalZoner;
    }
    public void setAntalZoner(int zone) {
        this.antalZoner = zone;
    }
    
    // ANTAL BILLETTER ---------------------------------------------------------
    public int getAntalBilletter() {
        return antalBilletter;
    }
    public void setAntalBilletter(int antal) {
        this.antalBilletter = antal;
    }
    
    // SUMMERET PRIS -----------------------------------------------------------
    public int getSummeretPris(){
        return summeretPris;
    }
    public void setSummeretPris(int sumpris){
        this.summeretPris = sumpris;
    }
    
    ArrayList<Billetinformation2> indkøbskurv = new ArrayList<Billetinformation2>( );

    
    // ADD BILLET MED NUVÆRENDE INFO -------------------------------------------
    public void tilføjBillet(){
        indkøbskurv.add(new Billetinformation2(getBillettype(), getAntalZoner(), getAntalBilletter(), getSummeretPris()));        
    }
    
    // TO STRING ---------------------------------------------------------------
    
    @Override
    public String toString()
    {
        return "Billettype: \t" +getBillettype()+ "; \tZoner: \t" +getAntalZoner()+ " zoner \tAntalBil: \t"+ getAntalBilletter()+" stk. \tSummeretPris: \t"+getSummeretPris()+ "DKK";
    }
    
    // PRINT LIST
    public void udskrivKurv()
    {
        System.out.println("------------- INDKØBSKURV -------------");
        for (Billetinformation2 b : indkøbskurv)
        {
            System.out.println(b); // Assuming a valid toString in the Book class
        }
        System.out.println("---------------------------------------");
    }    
} // End of public class Billetinformation