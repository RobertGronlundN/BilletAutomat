package automat;

import org.junit.Test;
import static org.junit.Assert.*;

public class ZoneberegnerTest
{
  // Test of setSlutZone method, of class Zoneberegner.
  @Test
  public void testSetSlutZone() {
      System.out.println("setSlutZone");
      int destZone = 10;
      Zoneberegner instance = new Zoneberegner();
      instance.setSlutZone(destZone);
      int zoneResult = instance.getSlutZone();
      assertEquals(destZone, zoneResult);
  }

  // Test of getSlutZone method, of class Zoneberegner.
  @Test
  public void testGetSlutZone() {
      System.out.println("getSlutZone");
      Zoneberegner instance = new Zoneberegner();
      int expResult = 150;
      instance.setSlutZone(expResult);
      int result = instance.getSlutZone();
      assertEquals(expResult, result);
  }

  // Test of zoneBeregner method, of class Zoneberegner.
  @Test
  public void testZoneBeregner() {
      System.out.println("zoneBeregner");
      Zoneberegner instance = new Zoneberegner();
      instance.setSlutZone(10);
      int expResult = 6;
      int result = instance.zoneBeregner();
      assertEquals(expResult, result);
  }    
}
