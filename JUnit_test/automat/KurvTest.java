package automat;

import junit.framework.TestCase;
import org.junit.Test;

public class KurvTest extends TestCase {
    
    public KurvTest(String testName) {
        super(testName);
    }

    /**
     * Test of getBillettype method, of class Kurv.
     */
    @Test
    public void testGetBillettype() {
        System.out.println("getBillettype");
        Kurv instance = new Kurv("Test", 0, 0, 0, 0);
        String expResult = "Test";
        String result = instance.getBillettype();
        assertEquals(expResult, result);
    }

     /** 
      * Test of setBillettype method, of class Kurv.
      */
    @Test
    public void testSetBillettype() {
        System.out.println("setBillettype");
        Kurv instance = new Kurv("123", 0, 0, 0, 0);
        String billettype = "Test";
        instance.setBillettype(billettype);
        String result = instance.getBillettype();
        assertEquals(billettype,result);
    }

    /**
     * Test of getBilletPris method, of class Kurv.
     */
    @Test
    public void testGetBilletPris() {
        System.out.println("getBilletPris");
        Kurv instance = new Kurv("123", 1, 155.1, 1, 0);
        double expResult = 155.1;
        double result = instance.getBilletPris();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of setBilletPris method, of class Kurv.
     */
    @Test
    public void testSetBilletPris() {
        System.out.println("setBilletPris");
        Kurv instance = new Kurv("123", 0, 0, 0, 0);
        double billetPris = 33.3;
        instance.setBilletPris(billetPris);
        double result = instance.getBilletPris();
        assertEquals(billetPris, result);
    }

    /**
     * Test of getIndex method, of class Kurv.
     */
    @Test
    public void testGetIndex() {
        System.out.println("getIndex");
        Kurv instance = new Kurv("123", 0, 0, 0, 8);
        int expResult = 8;
        int result = instance.getIndex();
        assertEquals(expResult, result);
    }

    /**
     * Test of setIndex method, of class Kurv.
     */
    @Test
    public void testSetIndex() {
        System.out.println("setIndex");
        Kurv instance = new Kurv("123", 0, 0, 0, 0);
        int index = 0;
        instance.setIndex(index);
        int result = instance.getIndex();
        assertEquals(index, result);
    }

    /**
     * Test of getAntalZoner method, of class Kurv.
     */
    @Test
    public void testGetAntalZoner() {
        System.out.println("getAntalZoner");
        Kurv instance = new Kurv("123", 0, 0, 57, 0);
        int expResult = 57;
        int result = instance.getAntalZoner();
        assertEquals(expResult, result);
    }

    /**
     * Test of setAntalZoner method, of class Kurv.
     */
    @Test
    public void testSetAntalZoner() {
        System.out.println("setAntalZoner");
        Kurv instance = new Kurv("123", 0, 0, 0, 0);
        int zone = 1;
        instance.setAntalZoner(zone);
        int result = instance.getAntalZoner();
        assertEquals(zone, result);
    }

    /**
     * Test of getAntalBilletter method, of class Kurv.
     */
    @Test
    public void testGetAntalBilletter() {
        System.out.println("getAntalBilletter");
        Kurv instance = new Kurv("123", 100, 0, 0, 0);
        int expResult = 100;
        int result = instance.getAntalBilletter();
        assertEquals(expResult, result);
    }

    /**
     * Test of setAntalBilletter method, of class Kurv.
     */
    @Test
    public void testSetAntalBilletter() {
        System.out.println("setAntalBilletter");
        Kurv instance = new Kurv("123", 0, 0, 0, 0);
        int antal = 99;
        instance.setAntalBilletter(antal);
        int result = instance.getAntalBilletter();
        assertEquals(result, antal);
    }
    
} // End of KurvTest.java
