package kanbagıs;

public class Doktor{

    private int d_id;
    private String ad;
    private String soyad;
    private String nöbet_tarihi;

    public Doktor() {
    }

    public Doktor(int d_id, String ad, String soyad, String nöbet_tarihi) {
        this.d_id = d_id;
        this.ad = ad;
        this.soyad = soyad;
        this.nöbet_tarihi = nöbet_tarihi;
    }

    Doktor(String string, String string0, String string1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getD_id() {
        return d_id;
    }

    public void setD_id(int d_id) {
        this.d_id = d_id;
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

    public String getNöbet_tarihi() {
        return nöbet_tarihi;
    }

    public void setNöbet_tarihi(String nöbet_tarihi) {
        this.nöbet_tarihi = nöbet_tarihi;
    }

}
