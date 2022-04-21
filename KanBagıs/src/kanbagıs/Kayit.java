
package kanbagıs;


public class Kayit extends KayitJ {
    private String ad;
    private String soyad;
    private String telefon_numarası;
    private String kan_grubu;
    private String cinsiyet;
    private String kullanıcı_ad;
    private String sifre;

    public Kayit() {
    }

    public Kayit(String ad, String soyad, String telefon_numarası, String kan_grubu, String cinsiyet, String kullanıcı_ad, String sifre) {
        this.ad = ad;
        this.soyad = soyad;
        this.telefon_numarası = telefon_numarası;
        this.kan_grubu = kan_grubu;
        this.cinsiyet = cinsiyet;
        this.kullanıcı_ad = kullanıcı_ad;
        this.sifre = sifre;
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

    public String getTelefon_numarası() {
        return telefon_numarası;
    }

    public void setTelefon_numarası(String telefon_numarası) {
        this.telefon_numarası = telefon_numarası;
    }

    public String getKan_grubu() {
        return kan_grubu;
    }

    public void setKan_grubu(String kan_grubu) {
        this.kan_grubu = kan_grubu;
    }

    public String getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(String cinsiyet) {
        this.cinsiyet = cinsiyet;
    }

    public String getKullanıcı_ad() {
        return kullanıcı_ad;
    }

    public void setKullanıcı_ad(String kullanıcı_ad) {
        this.kullanıcı_ad = kullanıcı_ad;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }
    
    
    
    
    
}
