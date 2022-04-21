
package testCase;

import static junit.framework.TestCase.assertEquals;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author damla
 */
public class KayitTest {
    
    public KayitTest() throws Exception{
    }

    
    @Test
    public void testAd() {
        Kayit kayit = new Kayit();
        String ad = "Damla";
        String deger = kayit.ad();
        assertEquals(ad, deger);
    }

    /**
     * Test of soyad method, of class Kayit.
     */
    @Test
    public void testSoyad() {
         Kayit kayit = new Kayit();
        String soyad = "Geyik";
        String deger = kayit.soyad();
        assertEquals(soyad, deger);
    }

    /**
     * Test of telefon_no method, of class Kayit.
     */
    @Test
    public void testTelefon_no() {
        Kayit kayit = new Kayit();
        String telefon_no = "05555555555";
        String deger = kayit.telefon_no();
        assertEquals(telefon_no, deger);
    }

    /**
     * Test of kan_grubu method, of class Kayit.
     */
    @Test
    public void testKan_grubu() {
        Kayit kayit = new Kayit();
        String kan_grubu = "AB+";
        String deger = kayit.kan_grubu();
        assertEquals(kan_grubu, deger);
    }

    /**
     * Test of cinsiyet method, of class Kayit.
     */
    @Test
    public void testCinsiyet() {
        Kayit kayit = new Kayit();
        String cinsiyet = "Kadın";
        String deger = kayit.cinsiyet();
        assertEquals(cinsiyet, deger);
    }

    /**
     * Test of kullanıcı_ad method, of class Kayit.
     */
    @Test
    public void testKullanıcı_ad() {
        Kayit kayit = new Kayit();
        String kullanıcı_ad = "damlagyk";
        String deger = kayit.kullanıcı_ad();
        assertEquals(kullanıcı_ad, deger);
    }

    /**
     * Test of sifre method, of class Kayit.
     */
    @Test
    public void testSifre() {
        Kayit kayit = new Kayit();
        String sifre = "12345";
        String deger = kayit.sifre();
        assertEquals(sifre, deger);
    }
    @Test 
    public void kontrolEt(){
        Kayit kayit = new Kayit();
        System.out.println("Ad: " +kayit.ad()+
          "\nSoyad: " +kayit.soyad()+
          "\nTelefon Numarası: " +kayit.telefon_no()+
          "\nKan Grubu: " +kayit.kan_grubu()+
          "\nCinsiyet: " +kayit.cinsiyet()+
          "\nKullanıcı Adı: " +kayit.kullanıcı_ad()+
          "\nŞifre: " +kayit.sifre()+
          "\n*****Kayıt Oluştulruldu******"
           );
    }
    
}
