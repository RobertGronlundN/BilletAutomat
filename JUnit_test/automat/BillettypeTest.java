package automat;

import junit.framework.TestCase;
import org.junit.Test;

public class BillettypeTest extends TestCase {
    
    public BillettypeTest(String testName) {
        super(testName);
    }

    /**
     * Test of getBillettype method, of class Billettype.
     */
    @Test
    public void testGetBillettype() {
        System.out.println("getBillettype");
        Billettype instance = new Billettype("Test", 0);
        String expResult = "Test";
        String result = instance.getBillettype();
        assertEquals(expResult, result);
    }

    /**
     * Test of setBillettype method, of class Billettype.
     */
    @Test
    public void testSetBillettype() {
        System.out.println("setBillettype");
        Billettype instance = new Billettype("123", 0);
        String billettype = "Test";
        instance.setBillettype(billettype);
        String result = instance.getBillettype();
        assertEquals(billettype, result);
    }

    /**
     * Test of getPris method, of class Billettype.
     */
    @Test
    public void testGetPris() {
        System.out.println("getPris");
        Billettype instance = new Billettype("Test", 33.2);
        double expResult = 33.2;
        double result = instance.getPris();
        assertEquals(expResult, result, 33.2);
    }

    /**
     * Test of setPris method, of class Billettype.
     */
    @Test
    public void testSetPris() {
        System.out.println("setPris");
        Billettype instance = new Billettype("Test", 0);
        double pris = 22.2;
        instance.setPris(pris);
        double result = instance.getPris();
        assertEquals(pris, result);
    }
    
} // End of Billettype.java
