package automat;

import junit.framework.TestCase;

public class ZoneberegnerTest extends TestCase {
    
    public ZoneberegnerTest(String testName) {
        super(testName);
    }

  /**
   * Test of setSlutZone method, of class Zoneberegner.
   */
  public void testSetSlutZone() {
      System.out.println("setSlutZone");
      int destZone = 10;
      Zoneberegner instance = new Zoneberegner();
      instance.setSlutZone(destZone);
      int zoneResult = instance.getSlutZone();
      assertEquals(destZone, zoneResult);
  }
  
  /**
   * Test of getSlutZone method, of class Zoneberegner.
   */
  public void testGetSlutZone() {
      System.out.println("getSlutZone");
      Zoneberegner instance = new Zoneberegner();
      int expResult = 150;
      instance.setSlutZone(expResult);
      int result = instance.getSlutZone();
      assertEquals(expResult, result);
  }
  
  /**
   * Test of zoneBeregner method, of class Zoneberegner.
   */
  public void testZoneBeregner() {
      System.out.println("zoneBeregner");
      Zoneberegner instance = new Zoneberegner();
      instance.setSlutZone(10);
      int expResult = 6;
      int result = instance.zoneBeregner();
      assertEquals(expResult, result);
  }    

    /**
     * Test of setAutomatZone method, of class Zoneberegner.
     */
    public void testSetAutomatZone() {
        System.out.println("setAutomatZone");
        int startZone = 0;
        Zoneberegner instance = new Zoneberegner();
        instance.setAutomatZone(startZone);
        int result = instance.getAutomatZone();
        assertEquals(startZone, result);
    }

    /**
     * Test of getAutomatZone method, of class Zoneberegner.
     */
    public void testGetAutomatZone() {
        System.out.println("getAutomatZone");
        Zoneberegner instance = new Zoneberegner();
        int expResult = 5;
        instance.setAutomatZone(5);
        int result = instance.getAutomatZone();
        assertEquals(expResult, result);
    }
}