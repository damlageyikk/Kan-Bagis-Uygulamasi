
package kanbagıs;


public class Bagisci {
    String ad;
    String soyad;
    int yas;
    String kanTipi;
    String bagisTipi;
    int miktar;

    public Bagisci() {
    }

    public Bagisci(String ad, String soyad, int yas, String kanTipi, String bagisTipi, int miktar) {
        this.ad = ad;
        this.soyad = soyad;
        this.yas = yas;
        this.kanTipi = kanTipi;
        this.bagisTipi = bagisTipi;
        this.miktar = miktar;
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

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public String getKanTipi() {
        return kanTipi;
    }

    public void setKanTipi(String kanTipi) {
        this.kanTipi = kanTipi;
    }

    public String getBagisTipi() {
        return bagisTipi;
    }

    public void setBagisTipi(String bagisTipi) {
        this.bagisTipi = bagisTipi;
    }

    public int getMiktar() {
        return miktar;
    }

    public void setMiktar(int miktar) {
        this.miktar = miktar;
    }
    
    
    
}
