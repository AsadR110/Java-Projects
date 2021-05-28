/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe318.lab5;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Asad
 */
public class CardTest {
    
    public CardTest() {
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
     * Test of isFaceUp method, of class Card.
     */
    @Test
    public void testIsFaceUp() {
        System.out.println("isFaceUp");
        Card instance = null;
        boolean expResult = false;
        boolean result = instance.isFaceUp();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFaceUp method, of class Card.
     */
    @Test
    public void testSetFaceUp() {
        System.out.println("setFaceUp");
        boolean faceUp = false;
        Card instance = null;
        instance.setFaceUp(faceUp);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRank method, of class Card.
     */
    @Test
    public void testGetRank() {
        System.out.println("getRank");
        Card instance = null;
        int expResult = 0;
        int result = instance.getRank();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSuit method, of class Card.
     */
    @Test
    public void testGetSuit() {
        System.out.println("getSuit");
        Card instance = null;
        int expResult = 0;
        int result = instance.getSuit();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Card.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object ob = null;
        Card instance = null;
        boolean expResult = false;
        boolean result = instance.equals(ob);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Card.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Card instance = null;
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of compareTo method, of class Card.
     */
//    @Test
//    public void testCompareTo_Object() {
//        System.out.println("compareTo");
//        Object obj = null;
//        Card instance = null;
//        int expResult = 1;
//        int result = instance.compareTo(obj);
//        assertEquals(0, 0);
//        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
//    }

    /**
     * Test of compareTo method, of class Card.
     */
    @Test
    public void testCompareTo_Card() {
        System.out.println("compareTo");
        Card c = new Card(5,2,false);
        Card instance = new Card(6,2,false);
        int expResult = 1;
        int result = instance.compareTo(c);
        assertEquals(expResult,result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getRankString method, of class Card.
     */
    @Test
    public void testGetRankString() {
        System.out.println("getRankString");
        Card instance = null;
        String expResult = "";
        String result = instance.getRankString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSuitString method, of class Card.
     */
    @Test
    public void testGetSuitString() {
        System.out.println("getSuitString");
        Card instance = null;
        String expResult = "";
        String result = instance.getSuitString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Card.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Card instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Card.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Card.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
