package automat;

import org.junit.Test;
import static org.junit.Assert.*;

public class Billetinformation2Test
{
  //Test of getBillettype method, of class Billetinformation2.
  @Test
  public void testGetBillettype() {
      System.out.println("getBillettype");
      Billetinformation2 instance = new Billetinformation2("Robert", 0, 0, 0);
      String expResult = "Robert";
      String result = instance.getBillettype();
      assertEquals(expResult, result);

  }

   // Test of setBillettype method, of class Billetinformation2.
  @Test
  public void testSetBillettype() {
      System.out.println("setBillettype");
      Billetinformation2 instance = new Billetinformation2("Robert", 0, 0, 0);
      String billettype = "Benjamin";
      instance.setBillettype(billettype);
      String navn = instance.getBillettype();
      assertEquals(billettype, navn);
  }

  // Test of getAntalZoner method, of class Billetinformation2.
  @Test
  public void testGetAntalZoner() {
      System.out.println("getAntalZoner");
      Billetinformation2 instance = new Billetinformation2("Robert", 2, 0, 0);
      int expResult = 2;
      int result = instance.getAntalZoner();
      assertEquals(expResult, result);
  }

  // Test of setAntalZoner method, of class Billetinformation2.
  @Test
  public void testSetAntalZoner() {
      System.out.println("setAntalZoner");
      Billetinformation2 instance = new Billetinformation2 ("Test", 0, 0, 0);
      int zone = 5;
      instance.setAntalZoner(zone);
      int zoneGet = instance.getAntalZoner();
      assertEquals(zone, zoneGet);
  }

  // Test of setSlutZone method, of class Billetinformation2.
  @Test
  public void testSetSlutZone() {
      System.out.println("setSlutZone");
      int destZone = 10;
      Billetinformation2 instance = new Billetinformation2(null,0,0,0);
      instance.setSlutZone(destZone);
      int zoneResult = instance.getSlutZone();
      assertEquals(destZone, zoneResult);
  }

  // Test of getSlutZone method, of class Billetinformation2.
  @Test
  public void testGetSlutZone() {
      System.out.println("getSlutZone");
      Billetinformation2 instance = new Billetinformation2(null,0,0,0);
      int expResult = 150;
      instance.setSlutZone(expResult);
      int result = instance.getSlutZone();
      assertEquals(expResult, result);
  }

  // Test of zoneBeregner method, of class Billetinformation2.
  @Test
  public void testZoneBeregner() {
      System.out.println("zoneBeregner");
      Billetinformation2 instance = new Billetinformation2(null, 0, 0, 0);
      instance.setSlutZone(10);
      int expResult = 6;
      int result = instance.zoneBeregner();
      assertEquals(expResult, result);
  }

  // Test of getAntalBilletter method, of class Billetinformation2.
  @Test
  public void testGetAntalBilletter() {
      System.out.println("getAntalBilletter");
      Billetinformation2 instance = new Billetinformation2(null,0,0,0);
      int expResult = 1000;
      instance.setAntalBilletter(expResult);
      int result = instance.getAntalBilletter();
      assertEquals(expResult, result);
  }

  // Test of setAntalBilletter method, of class Billetinformation2.
  @Test
  public void testSetAntalBilletter() {
      System.out.println("setAntalBilletter");
      int antal = 5000;
      Billetinformation2 instance = new Billetinformation2(null,0,0,0);
      instance.setAntalBilletter(antal);
      int result = instance.getAntalBilletter();
      assertEquals(antal, result);
  }

  // Test of getBilletPris method, of class Billetinformation2.
  @Test
  public void testGetBilletPris() {
      System.out.println("getBilletPris");
      Billetinformation2 instance = new Billetinformation2(null,0,0,150);
      int expResult = 150;
      int result = instance.getBilletPris();
      assertEquals(expResult, result);
  }

  // Test of setBilletPris method, of class Billetinformation2.
  @Test
  public void testSetBilletPris() {
      System.out.println("setBilletPris");
      double type = 10;
      Billetinformation2 instance = new Billetinformation2(null,0,0,10);
      instance.setAntalBilletter(1);
      instance.setAntalZoner(1);
      instance.setBilletPris(type);
      int resultat = instance.getBilletPris();
      assertEquals(type*12, resultat, 1.000);
  }

  // Test of tilfoejBillet method, of class Billetinformation2.
  @Test
  public void testTilfoejBillet() {
      System.out.println("tilf\u00f8jBillet");
      Billetinformation2 instance = new Billetinformation2(null,0,0,0);
      instance.tilfoejBillet();
  }
  
  /*
  // Test of fjernBillet method, of class Billetinformation2.
  @Test
  public void testFjernBillet() {
      System.out.println("fjernBillet");
      int fjern = 0;
      Billetinformation2 instance = new Billetinformation2(null,0,0,0);
      instance.fjernBillet(fjern);
  } 
  */

  // Test of toString method, of class Billetinformation2.
  @Test
  public void testToString() {
      System.out.println("toString");
      Billetinformation2 instance = new Billetinformation2("Test",1,2,3);
      String expResult = instance.getBillettype()+ " \t" +instance.getAntalZoner()+ "  \t"+ instance.getAntalBilletter()+"  \t"+instance.getBilletPris()+ " DKK";
      String result = instance.toString();
      assertEquals(expResult, result);
  }

  /*
  // Test of udskrivKurv method, of class Billetinformation2.
  @Test
  public void testUdskrivKurv() {
      System.out.println("udskrivKurv");
      Billetinformation2 instance = new Billetinformation2(null,0,0,0);
      instance.udskrivKurv();
  }

  // Test of udskrivBillet method, of class Billetinformation2.
  @Test
  public void testUdskrivBillet() {
      System.out.println("udskrivBillet");
      Billetinformation2 instance = new Billetinformation2(null,0,0,0);
      instance.udskrivBillet();
  }
  */

  // Test of indsaetPenge method, of class Billetinformation2.
  @Test
  public void testIndsaetPenge() {
      System.out.println("test af indsaet penge");
      int beloeb = 511;
      Billetinformation2 instance = new Billetinformation2(null,0,0,0);
      instance.indsaetPenge(beloeb);
      int result = instance.getBalance();
      assertEquals(beloeb, result);
  }

  // Test of getBalance method, of class Billetinformation2.
  @Test
  public void testGetBalance() {
      System.out.println("test af getBalance funktion");
      Billetinformation2 instance = new Billetinformation2(null,0,0,0);
      int expResult = 0;
      int result = instance.getBalance();
      assertEquals(expResult, result);
  }

  // Test of setBalance method, of class Billetinformation2.
  @Test
  public void testSetBalance() {
      System.out.println("setBalance");
      int balance = 144;
      Billetinformation2 instance = new Billetinformation2(null,0,0,0);
      instance.setBalance(balance);
      int result = instance.getBalance();
      assertEquals(balance, result);
  }

  // Test of checkBalance method, of class Billetinformation2.
  @Test
  public void testCheckBalance() {
      System.out.println("checkBalance");
      Billetinformation2 instance = new Billetinformation2(null,1,1,12);
      boolean expResult = true;
      instance.setBalance(12);
      boolean result = instance.checkBalance();
      assertEquals(expResult, result);
  }

  /*
  // Test of getTotal method, of class Billetinformation2.
  @Test
  public void testGetTotal() {
      System.out.println("getTotal");
      Billetinformation2 instance = new Billetinformation2("Test",2,3,88);
      instance.tilfoejBillet();
      instance.udskrivBillet();
      int expResult = 88;
      int result = instance.getTotal();
      assertEquals(expResult, result);
  }
  */

  // Test of returpenge method, of class Billetinformation2.
  @Test
  public void testReturpenge() {
      System.out.println("returpenge");
      Billetinformation2 instance = new Billetinformation2(null,0,0,0);
      int expResult = 1234;
      instance.setBalance(expResult);
      int result = instance.returpenge();
      assertEquals(expResult, result);
  }

  // Test of setAutomatZone method, of class Billetinformation2.
  @Test
  public void testSetAutomatZone() {
      System.out.println("setAutomatZone");
      int automatZone = 0;
      Billetinformation2 instance = new Billetinformation2(null,0,0,0);
      instance.setAutomatZone(automatZone);
      int resultat = instance.getAutomatZone();
      assertEquals(automatZone, resultat);
  }

  // Test of getAutomatZone method, of class Billetinformation2.
  @Test
  public void testGetAutomatZone() {
      System.out.println("getAutomatZone");
      Billetinformation2 instance = new Billetinformation2(null,0,0,0);
      int expResult = 0;
      instance.setAutomatZone(expResult);
      int result = instance.getAutomatZone();
      assertEquals(expResult, result);
  }

  // Test of montoerLogin method, of class Billetinformation2.
  @Test
  public void testMontoerLogin() {
      System.out.println("mont\u00f8rLogin");
      boolean expResult = true;
      String adgangskode = "1234";
      Billetinformation2 instance = new Billetinformation2(null,0,0,0);
      instance.montoerLogin(adgangskode);
      boolean result = instance.erMontoer();
      assertEquals(expResult, result);
  }

  // Test of erMontoer method, of class Billetinformation2.
  @Test
  public void testErMontoer() {
      System.out.println("erMont\u00f8r");
      Billetinformation2 instance = new Billetinformation2(null,0,0,0);
      boolean expResult = false;
      boolean result = instance.erMontoer();
      assertEquals(expResult, result);
  }

  // Test of getAntalBilletterSolgt method, of class Billetinformation2.
  @Test
  public void testGetAntalBilletterSolgt() {
      System.out.println("getAntalBilletterSolgt");
      Billetinformation2 instance = new Billetinformation2(null,0,0,0);
      int expResult = 0;
      int result = instance.getAntalBilletterSolgt();
      assertEquals(expResult, result);
  }

  // Test of nulstil method, of class Billetinformation2.
  @Test
  public void testNulstil() {
      System.out.println("nulstil");
      Billetinformation2 instance = new Billetinformation2(null,0,0,0);
      instance.montoerLogin("1234");
      instance.nulstil();
      int expResult = 0;
      int result = instance.getAntalBilletterSolgt();
      assertEquals(expResult, result);
  }
}