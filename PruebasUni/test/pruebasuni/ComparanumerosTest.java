/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebasuni;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Aaron
 */
public class ComparanumerosTest {
    
    public ComparanumerosTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of mayor method, of class Comparanumeros.
     */
    @Test
    public void testMayor() {
        System.out.println("mayor");
        int a = 15;
        int b = 2;
        Comparanumeros instance = new Comparanumeros();
        boolean expResult = true;
        boolean result = instance.mayor(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //ail("The test case is a prototype.");
    }

    /**
     * Test of igualdad method, of class Comparanumeros.
     */
    @Test
    public void testIgualdad() {
        System.out.println("igualdad");
        int a = 10;
        int b = 10;
        Comparanumeros instance = new Comparanumeros();
        boolean expResult = true;
        boolean result = instance.igualdad(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
}
