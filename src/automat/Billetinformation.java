package automat;

import java.util.ArrayList;

public class Billetinformation 
{
    private String billettype;
    private double antalZoner;
    private double antalBilletter;
    private double summeretPris;
    
    ArrayList<Billetinformation> indkøbskurv = new ArrayList<Billetinformation>( );
    
    public Billetinformation (String billettype, double antalZoner, double antalBilletter, double summeretPris)
    {
        this.billettype = billettype;
        this.antalZoner = antalZoner;
        this.antalBilletter = antalBilletter;
        this.summeretPris = summeretPris;
    }
    
    public void tilføjKøb(String billettype, double antalZoner, double antalBilletter, double summeretPris)
    {
        Billetinformation nytkøb = new Billetinformation(billettype, antalZoner, antalBilletter, summeretPris);
        indkøbskurv.add(nytkøb);
    }
