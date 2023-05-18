/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package flowtrabajar;

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Alumno
 */
public class medianaNGTest {

    public medianaNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of mediana method, of class mediana.
     */
    @Test
    public void testMediana() throws Exception {
        System.out.println("mediana");
        int[] numeros = {1,2,3,4,5,6,7,8,9,10};
        String expResult = "5.5";
        String result = mediana.mediana(numeros);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testMediana2() throws Exception {
        System.out.println("mediana");
        int[] numeros = {1,2,3,4,5,6,7,8,9,10};
        String expResult = "7";
        String result = mediana.mediana(numeros);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

}