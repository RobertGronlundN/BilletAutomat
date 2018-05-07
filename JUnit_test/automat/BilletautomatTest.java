package automat;

import junit.framework.TestCase;

public class BilletautomatTest extends TestCase {
    
    public BilletautomatTest(String testName) {
        super(testName);
    }

    /**
     * Test of tilfoejBillet method, of class Billetautomat.
     */
    public void testTilfoejBillet() {
        System.out.println("tilfoejBillet");
        int index = 1;
        int zoner = 3;
        int antal = 1;
        Billetautomat instance = new Billetautomat();
        instance.tilfoejBillet(index, zoner, antal);
        int result = instance.kurv.size();
        assertEquals(result, antal);
    }

    /**
     * Test of fjernBillet method, of class Billetautomat.
     */
    public void testFjernBillet() {
        System.out.println("fjernBillet");
        int index = 1;
        int zoner = 1;
        int antal = 2;
        Billetautomat instance = new Billetautomat();
        instance.tilfoejBillet(index, zoner, antal);
        instance.tilfoejBillet(index, zoner, antal);
        instance.tilfoejBillet(index, zoner, antal);        
        int fjern = 2;
        instance.fjernBillet(fjern);
        int result = instance.kurv.size();
        assertEquals(result, fjern);
    }

    /**
     * Test of indsaetPenge method, of class Billetautomat.
     */
    public void testIndsaetPenge() {
        System.out.println("indsaetPenge");
        Billetautomat instance = new Billetautomat();
        int beloeb = 100;
        instance.indsaetPenge(beloeb);
        double result = instance.getBalance();
        assertEquals(100.0, result);
    }

    /**
     * Test of getBalance method, of class Billetautomat.
     */
    public void testGetBalance() {
        System.out.println("getBalance");
        Billetautomat instance = new Billetautomat();
        double expResult = 33.2;
        instance.setBalance(expResult);
        double result = instance.getBalance();
        assertEquals(expResult, result, 33.2);
    }

    /**
     * Test of setBalance method, of class Billetautomat.
     */
    public void testSetBalance() {
        System.out.println("setBalance");
        Billetautomat instance = new Billetautomat();
        double expResult = 33.2;
        instance.setBalance(expResult);
        double result = instance.getBalance();
        assertEquals(expResult, result, 33.2);
    }

    /**
     * Test of checkBalance method, of class Billetautomat.
     */
    public void testCheckBalance() {
        System.out.println("checkBalance");
        Billetautomat instance = new Billetautomat();
        instance.setBalance(10);
        instance.tilfoejBillet(1, 5, 2);
        boolean expResult = false;
        boolean result = instance.checkBalance();
        assertEquals(expResult, result);
    }

    /**
     * Test of getTotal method, of class Billetautomat.
     */
    public void testGetTotal() {
        System.out.println("getTotal");
        Billetautomat instance = new Billetautomat();
        instance.tilfoejBillet(1, 5, 2);
        double expResult = 120.0;
        double result = instance.getTotal();
        assertEquals(expResult, result, 120.0);
    }

    /**
     * Test of returpenge method, of class Billetautomat.
     */
    public void testReturpenge() {
        System.out.println("returpenge");
        Billetautomat instance = new Billetautomat();
        instance.tilfoejBillet(1, 5, 2);
        instance.setBalance(200);
        double expResult = 80.0;
        double result = instance.returpenge() - instance.getTotal();
        assertEquals(expResult, result, 80.0);
    }

    /**
     * Test of montoerLogin method, of class Billetautomat.
     */
    public void testMontoerLogin() {
        System.out.println("montoerLogin");
        Billetautomat instance = new Billetautomat();
        String adgangskode = "1234";
        instance.montoerLogin(adgangskode);
        boolean result = instance.getMontoertilstand();
        assertEquals(result, true);
    }

    /**
     * Test of getMontoertilstand method, of class Billetautomat.
     */
    public void testGetMontoertilstand() {
        System.out.println("getMontoertilstand");
        Billetautomat instance = new Billetautomat();
        String adgangskode = "1234";
        instance.montoerLogin(adgangskode);
        boolean expResult = true;
        boolean result = instance.getMontoertilstand();
        assertEquals(expResult, result);
    }

    /**
     * Test of setMontoertilstand method, of class Billetautomat.
     */
    public void testSetMontoertilstand() {
        System.out.println("setMontoertilstand");
        Billetautomat instance = new Billetautomat();
        boolean input = false;
        instance.setMontoertilstand(input);
        boolean result = instance.getMontoertilstand();
        assertEquals(input, result);
    }

    /**
     * Test of setAutomatZone method, of class Billetautomat.
     */
    public void testSetAutomatZone() {
        System.out.println("setAutomatZone");
        int automatZone = 3;
        Billetautomat instance = new Billetautomat();
        instance.setMontoertilstand(true);
        instance.setAutomatZone(automatZone);
        int result = instance.getAutomatZone();
        assertEquals(automatZone, result);
    }

    /**
     * Test of getAutomatZone method, of class Billetautomat.
     */
    public void testGetAutomatZone() {
        System.out.println("getAutomatZone");
        Billetautomat instance = new Billetautomat();
        int expResult = 2;
        instance.setMontoertilstand(true);
        instance.setAutomatZone(expResult);
        int result = instance.getAutomatZone();
        assertEquals(expResult, result);
    }

    /**
     * Test of nulstil method, of class Billetautomat.
     */
    public void testNulstil() {
        System.out.println("nulstil");
        Billetautomat instance = new Billetautomat();
        instance.tilfoejBillet(1, 2, 3);
        instance.tilfoejBillet(4, 3, 3);
        int result1 = instance.kurv.size();
        assertEquals(result1, 2);
        instance.setMontoertilstand(true);
        instance.nulstil();
        int result2 = instance.kurv.size();
        assertEquals(result2, 0);
    }
}