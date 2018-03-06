/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automat;

import java.util.ArrayList;

public class Billetinformation 
{
    private String billettype;
    private int antalZoner;
    private int antalBilletter;

    ArrayList<Billetinformation> indkøbskurv = new ArrayList<Billetinformation>( );
    
    public String getBillettype() {
        return billettype;
    }

    public void setName(String name) {
        this.billettype = name;
    }

    public int getAntalZoner() {
        return antalZoner;
    }

    public void setAntalZoner(int zone) {
        this.antalZoner = zone;
    }
    
    public int getAntalBilletter() {
        return antalBilletter;
    }

    public void setAntalBilletter(int antal) {
        this.antalBilletter = antal;
    }
} // End of public class Billetinformation