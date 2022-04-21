
package kanbagıs;

public class Randevu extends RandevuJ implements StateUI{
    private String ad;
    private String soyad;
    private int yaş;
    private String telefon_no;
    private String kan_grubu;
    private String bagıs_türü;
    private String tarih;
    private String saat;
   
    public Randevu() {
    }
   
    @Override
    public void randevuIslemleri() {
       String adA = ad;
        String soyadA = soyad;
        int yaşA = yaş;
        String telefon_noA = telefon_no;
        String kan_grubuA = kan_grubu;
        String bagıs_türüA = bagıs_türü;
        String tarihA = tarih;
        String saatA = saat;
    }
    
    public Randevu(String ad, String soyad, String bagıs_türü, String tarih, String saat) {
        this.ad = ad;
        this.soyad = soyad;
        this.bagıs_türü = bagıs_türü;
        this.tarih = tarih;
        this.saat = saat;
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

    public String getBagıs_türü() {
        return bagıs_türü;
    }

    public void setBagıs_türü(String bagıs_türü) {
        this.bagıs_türü = bagıs_türü;
    }

    public String getTarih() {
        return tarih;
    }

    public void setTarih(String tarih) {
        this.tarih = tarih;
    }

    public String getSaat() {
        return saat;
    }

    public void setSaat(String saat) {
        this.saat = saat;
    }

    public int getYaş() {
        return yaş;
    }

    public void setYaş(int yaş) {
        this.yaş = yaş;
    }

    public String getTelefon_no() {
        return telefon_no;
    }

    public void setTelefon_no(String telefon_no) {
        this.telefon_no = telefon_no;
    }

    public String getKan_grubu() {
        return kan_grubu;
    }

    public void setKan_grubu(String kan_grubu) {
        this.kan_grubu = kan_grubu;
    }

    
    
    
    
}
