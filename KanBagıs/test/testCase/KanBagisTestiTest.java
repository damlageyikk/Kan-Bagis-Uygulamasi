/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testCase;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author damla
 */
public class KanBagisTestiTest {
    
    public KanBagisTestiTest() {
    }

    /**
     * Test of Soru1 method, of class KanBagisTesti.
     */
    @Test
    public void testSoru1() {
        KanBagisTesti bagisTest = new KanBagisTesti();
        String cevap = "Hayır";
        String deger = bagisTest.Soru1();
        assertEquals(cevap, deger);
    }

    /**
     * Test of Soru2 method, of class KanBagisTesti.
     */
    @Test
    public void testSoru2() {
        KanBagisTesti bagisTest = new KanBagisTesti();
        String cevap = "Evet";
        String deger = bagisTest.Soru2();
        assertEquals(cevap, deger);
    }

    /**
     * Test of Soru3 method, of class KanBagisTesti.
     */
    @Test
    public void testSoru3() {
        KanBagisTesti bagisTest = new KanBagisTesti();
        String cevap = "Evet";
        String deger = bagisTest.Soru3();
        assertEquals(cevap, deger);
    }

    /**
     * Test of Soru4 method, of class KanBagisTesti.
     */
    @Test
    public void testSoru4() {
        KanBagisTesti bagisTest = new KanBagisTesti();
        String cevap = "Evet";
        String deger = bagisTest.Soru4();
        assertEquals(cevap, deger);
    }

    /**
     * Test of Soru5 method, of class KanBagisTesti.
     */
    @Test
    public void testSoru5() {
        KanBagisTesti bagisTest = new KanBagisTesti();
        String cevap = "Evet";
        String deger = bagisTest.Soru5();
        assertEquals(cevap, deger);
    }

    /**
     * Test of bagisTuru method, of class KanBagisTesti.
     */
    @Test
    public void testBagisTuru() {
        KanBagisTesti bagisTest = new KanBagisTesti();
        String deger = bagisTest.bagisTuru();
        System.out.println("Cevap 1:" +bagisTest.Soru1()+
                "\nCevap 2:" +bagisTest.Soru2()+
                "\nCevap 3:" +bagisTest.Soru3()+
                "\nCevap 4:" +bagisTest.Soru4()+
                "\nCevap 5:" +bagisTest.Soru5()+
                "\nKan Bağışı yapmaya Uygun degilsiniz");
 
    }
    
}
