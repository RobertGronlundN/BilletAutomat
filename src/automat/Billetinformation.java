package automat;

import java.util.ArrayList;

public class Billetinformation 
{
    private String billettype;
    private int antalZoner;
    private int antalBilletter;
    private int summeretPris;
    
    ArrayList<Billetinformation> indkøbskurv = new ArrayList<Billetinformation>( );
    
    public Billetinformation ( ) {
        billettype = null;
        antalZoner = 0;
        antalBilletter = 0;
        summeretPris = 0;
    }
    
    public Billetinformation (String billettype, int antalZoner, int antalBilletter, int summeretPris)
    {
        this.billettype = billettype;
        this.antalZoner = antalZoner;
        this.antalBilletter = antalBilletter;
        this.summeretPris = summeretPris;
    }
    
    public void tilføjKøb(String billettype, int antalZoner, int antalBilletter, int summeretPris)
    {
        Billetinformation nytkøb = new Billetinformation(billettype, antalZoner, antalBilletter, summeretPris);
        indkøbskurv.add(nytkøb);
    }
}
