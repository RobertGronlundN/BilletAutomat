package automat;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Billetinformation2
{
    private String billettype;
    private int antalZoner;
    private int antalBilletter;
    private int summeretPris;

    ArrayList<Billetinformation2> indkøbskurv = new ArrayList<Billetinformation2>( );
    
    public Billetinformation2(){
        billettype = null;
        antalZoner = 0;
        antalBilletter = 0;
        summeretPris = 0;
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
    
    // ADD BILLET MED NUVÆRENDE INFO -------------------------------------------
    public void tilføjBillet(){
        for (int i = 0; i < 100; i++) 
        {
            Billetinformation2 nyBillet = new Billetinformation2();
            nyBillet.billettype = getBillettype();
            nyBillet.antalZoner = getAntalZoner();
            nyBillet.antalBilletter = getAntalBilletter();
            nyBillet.summeretPris = getSummeretPris();
            indkøbskurv.add(nyBillet);
        }
    }
    
    // TO STRING ---------------------------------------------------------------
    
    
    // PRINT LIST
    public void udskrivKurv(){
        System.out.println(indkøbskurv);
        
        for (int i = 0; i < indkøbskurv.size(); i++) 
        {
            System.out.println("------------- INDKØBSKURV ------------");
            System.out.println("Billet nummer "+(i+1)+"!");
            System.out.println("Billettype:     " +indkøbskurv.get(i).billettype);
            System.out.println("Antal Zoner:    " +indkøbskurv.get(i).antalZoner);
            System.out.println("Antal Billeter: " +indkøbskurv.get(i).antalBilletter);
            System.out.println("Subtotal:       " +indkøbskurv.get(i).summeretPris);
            System.out.println(" ");
        }
    }    
} // End of public class Billetinformation