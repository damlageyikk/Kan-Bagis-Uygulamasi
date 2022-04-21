package testCase;

import static junit.framework.TestCase.assertEquals;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author damla
 */
public class RandevuTest {

    public RandevuTest() {
    }

    @Test
    public void testAd() {
        Randevu r = new Randevu();
        String ad = "Damla";
        String deger = r.ad();
        assertEquals(ad, deger);
    }

    @Test
    public void testSoyad() {
        Randevu r = new Randevu();
        String soyad = "Geyik";
        String deger = r.soyad();
        assertEquals(soyad, deger);
    }

    @Test
    public void testYas() {
        Randevu r = new Randevu();
        int yas = 21;
        int deger = r.yas();
        assertEquals(yas, deger);
    }

    @Test
    public void testTelefon_no() {
        Randevu r = new Randevu();
        String telefon_no = "05555555555";
        String deger = r.telefon_no();
        assertEquals(telefon_no, deger);
    }
    
    @Test
    public void testKan_grubu() {
        Randevu r = new Randevu();
        String kan_grubu = "AB+";
        String deger = r.kan_grubu();
        assertEquals(kan_grubu, deger);
    }
    
    @Test
    public void testBagis_turu() {
        Randevu r = new Randevu();
        String bagis_turu = "Plazma";
        String deger = r.bagis_turu();
        assertEquals(bagis_turu, deger);
    }
    
      @Test
    public void testTarih() {
        Randevu r = new Randevu();
        String tarih = "26.05.2021";
        String deger = r.tarih();
        assertEquals(tarih, deger);
    }
    
    @Test
    public void testSaat() {
        Randevu r = new Randevu();
        String saat = "15.08";
        String deger = r.saat();
        assertEquals(saat, deger);
    }
    
       @Test
    public void olustur() {
           Randevu r = new Randevu();
           System.out.println("Ad: " + r.ad()
                   + "\nSoyad: " + r.soyad()
                   + "\nKan Grubu: " + r.kan_grubu()
                   + "\nBağış Türü: " + r.bagis_turu()
                   + "\nTelefon Numatrası:  " + r.telefon_no()
                   + "\nTarih: " + r.tarih()
                   + "\nSaat " + r.saat()+ "\n*****Randevu Oluştulruldu******");
    }
   
   
}
