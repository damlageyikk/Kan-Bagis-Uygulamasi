
package kanbagıs;

import javax.swing.JButton;
import static kanbagıs.KanBagis.db;


public class Test {
    private int id;
    private String ad;
    private String soyad;
    private String bagıs_Turu;
    private String kan_grubu;

    public Test() {
    }
    
    public Test(int id, String ad, String soyad, String bagıs_Turu, String kan_grubu) {
        this.id = id;
        this.ad = ad;
        this.soyad = soyad;
        this.bagıs_Turu = bagıs_Turu;
        this.kan_grubu = kan_grubu;
    }
  
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getBagıs_Turu() {
        return bagıs_Turu;
    }

    public void setBagıs_Turu(String bagıs_Turu) {
        this.bagıs_Turu = bagıs_Turu;
    }

    public String getKan_grubu() {
        return kan_grubu;
    }

    public void setKan_grubu(String kan_grubu) {
        this.kan_grubu = kan_grubu;
    }
    
    
    
    
}
