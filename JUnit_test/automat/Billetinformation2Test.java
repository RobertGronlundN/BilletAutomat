/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automat;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
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
      String billettype = "Benjamin";
      Billetinformation2 instance = new Billetinformation2("Robert", 0, 0, 0);
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
/*    @Test
  public void testSetAntalZoner() {
      System.out.println("setAntalZoner");
      int zone = 0;
      Billetinformation2 instance = null;
      instance.setAntalZoner(zone);
      // TODO review the generated test code and remove the default call to fail.
      fail("The test case is a prototype.");
  }

  /**
   * Test of setSlutZone method, of class Billetinformation2.
   */
/*    @Test
  public void testSetSlutZone() {
      System.out.println("setSlutZone");
      int destZone = 0;
      Billetinformation2 instance = null;
      instance.setSlutZone(destZone);
      // TODO review the generated test code and remove the default call to fail.
      fail("The test case is a prototype.");
  }

  /**
   * Test of getSlutZone method, of class Billetinformation2.
   */
  @Test
  public void testGetSlutZone() {
      System.out.println("getSlutZone");
      Billetinformation2 instance = null;
      int expResult = 0;
      int result = instance.getSlutZone();
      assertEquals(expResult, result);
      // TODO review the generated test code and remove the default call to fail.
      fail("The test case is a prototype.");
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
      Billetinformation2 instance = null;
      int expResult = 0;
      int result = instance.getAntalBilletter();
      assertEquals(expResult, result);
      // TODO review the generated test code and remove the default call to fail.
      fail("The test case is a prototype.");
  }

  // Test of setAntalBilletter method, of class Billetinformation2.
  @Test
  public void testSetAntalBilletter() {
      System.out.println("setAntalBilletter");
      int antal = 0;
      Billetinformation2 instance = null;
      instance.setAntalBilletter(antal);
      // TODO review the generated test code and remove the default call to fail.
      fail("The test case is a prototype.");
  }

  // Test of getBilletPris method, of class Billetinformation2.
  @Test
  public void testGetBilletPris() {
      System.out.println("getBilletPris");
      Billetinformation2 instance = null;
      int expResult = 0;
      int result = instance.getBilletPris();
      assertEquals(expResult, result);
      // TODO review the generated test code and remove the default call to fail.
      fail("The test case is a prototype.");
  }

  // Test of setBilletPris method, of class Billetinformation2.
  @Test
  public void testSetBilletPris() {
      System.out.println("setBilletPris");
      double type = 0.0;
      Billetinformation2 instance = null;
      instance.setBilletPris(type);
      // TODO review the generated test code and remove the default call to fail.
      fail("The test case is a prototype.");
  }

  /**
   * Test of tilfoejBillet method, of class Billetinformation2.
   */
  @Test
  public void testTilfoejBillet() {
      System.out.println("tilf\u00f8jBillet");
      Billetinformation2 instance = null;
      instance.tilfoejBillet();
      // TODO review the generated test code and remove the default call to fail.
      fail("The test case is a prototype.");
  }

  /**
   * Test of fjernBillet method, of class Billetinformation2.
   */
  @Test
  public void testFjernBillet() {
      System.out.println("fjernBillet");
      int fjern = 0;
      Billetinformation2 instance = null;
      instance.fjernBillet(fjern);
      // TODO review the generated test code and remove the default call to fail.
      fail("The test case is a prototype.");
  }

  /**
   * Test of toString method, of class Billetinformation2.
   */
  @Test
  public void testToString() {
      System.out.println("toString");
      Billetinformation2 instance = null;
      String expResult = "";
      String result = instance.toString();
      assertEquals(expResult, result);
      // TODO review the generated test code and remove the default call to fail.
      fail("The test case is a prototype.");
  }

  /**
   * Test of udskrivKurv method, of class Billetinformation2.
   */
  @Test
  public void testUdskrivKurv() {
      System.out.println("udskrivKurv");
      Billetinformation2 instance = null;
      instance.udskrivKurv();
      // TODO review the generated test code and remove the default call to fail.
      fail("The test case is a prototype.");
  }

  /**
   * Test of udskrivBillet method, of class Billetinformation2.
   */
  @Test
  public void testUdskrivBillet() {
      System.out.println("udskrivBillet");
      Billetinformation2 instance = null;
      instance.udskrivBillet();
      // TODO review the generated test code and remove the default call to fail.
      fail("The test case is a prototype.");
  }

  // Test of indsaetPenge method, of class Billetinformation2.
  @Test
  public void testIndsaetPenge() {
      System.out.println("inds\u00e6tPenge");
      int beloeb = 0;
      Billetinformation2 instance = null;
      instance.indsaetPenge(beloeb);
      // TODO review the generated test code and remove the default call to fail.
      fail("The test case is a prototype.");
  }

  // Test of getBalance method, of class Billetinformation2.
  @Test
  public void testGetBalance() {
      System.out.println("getBalance");
      Billetinformation2 instance = null;
      int expResult = 0;
      int result = instance.getBalance();
      assertEquals(expResult, result);
      // TODO review the generated test code and remove the default call to fail.
      fail("The test case is a prototype.");
  }

  // Test of setBalance method, of class Billetinformation2.
  @Test
  public void testSetBalance() {
      System.out.println("setBalance");
      int balance = 0;
      Billetinformation2 instance = null;
      instance.setBalance(balance);
      // TODO review the generated test code and remove the default call to fail.
      fail("The test case is a prototype.");
  }

  // Test of checkBalance method, of class Billetinformation2.
  @Test
  public void testCheckBalance() {
      System.out.println("checkBalance");
      Billetinformation2 instance = null;
      boolean expResult = false;
      boolean result = instance.checkBalance();
      assertEquals(expResult, result);
      // TODO review the generated test code and remove the default call to fail.
      fail("The test case is a prototype.");
  }

  // Test of getTotal method, of class Billetinformation2.
  @Test
  public void testGetTotal() {
      System.out.println("getTotal");
      Billetinformation2 instance = null;
      int expResult = 0;
      int result = instance.getTotal();
      assertEquals(expResult, result);
      // TODO review the generated test code and remove the default call to fail.
      fail("The test case is a prototype.");
  }

  // Test of returpenge method, of class Billetinformation2.
  @Test
  public void testReturpenge() {
      System.out.println("returpenge");
      Billetinformation2 instance = null;
      int expResult = 0;
      int result = instance.returpenge();
      assertEquals(expResult, result);
      // TODO review the generated test code and remove the default call to fail.
      fail("The test case is a prototype.");
  }

  // Test of setAutomatZone method, of class Billetinformation2.
  @Test
  public void testSetAutomatZone() {
      System.out.println("setAutomatZone");
      int automatZone = 0;
      Billetinformation2 instance = null;
      instance.setAutomatZone(automatZone);
      // TODO review the generated test code and remove the default call to fail.
      fail("The test case is a prototype.");
  }

  // Test of getAutomatZone method, of class Billetinformation2.
  @Test
  public void testGetAutomatZone() {
      System.out.println("getAutomatZone");
      Billetinformation2 instance = null;
      int expResult = 0;
      int result = instance.getAutomatZone();
      assertEquals(expResult, result);
      // TODO review the generated test code and remove the default call to fail.
      fail("The test case is a prototype.");
  }

  // Test of montoerLogin method, of class Billetinformation2.
  @Test
  public void testMontoerLogin() {
      System.out.println("mont\u00f8rLogin");
      String adgangskode = "";
      Billetinformation2 instance = null;
      instance.montoerLogin(adgangskode);
      // TODO review the generated test code and remove the default call to fail.
      fail("The test case is a prototype.");
  }

  // Test of erMontoer method, of class Billetinformation2.
  @Test
  public void testErMontoer() {
      System.out.println("erMont\u00f8r");
      Billetinformation2 instance = null;
      boolean expResult = false;
      boolean result = instance.erMontoer();
      assertEquals(expResult, result);
      // TODO review the generated test code and remove the default call to fail.
      fail("The test case is a prototype.");
  }

  // Test of getAntalBilletterSolgt method, of class Billetinformation2.
  @Test
  public void testGetAntalBilletterSolgt() {
      System.out.println("getAntalBilletterSolgt");
      Billetinformation2 instance = null;
      int expResult = 0;
      int result = instance.getAntalBilletterSolgt();
      assertEquals(expResult, result);
      // TODO review the generated test code and remove the default call to fail.
      fail("The test case is a prototype.");
  }

  // Test of nulstil method, of class Billetinformation2.
  @Test
  public void testNulstil() {
      System.out.println("nulstil");
      Billetinformation2 instance = null;
      instance.nulstil();
      // TODO review the generated test code and remove the default call to fail.
      fail("The test case is a prototype.");
  }

  // Test of getLog method, of class Billetinformation2.
  @Test
  public void testGetLog() {
      System.out.println("getLog");
      Billetinformation2 instance = null;
      instance.getLog();
      // TODO review the generated test code and remove the default call to fail.
      fail("The test case is a prototype.");
  }
}
