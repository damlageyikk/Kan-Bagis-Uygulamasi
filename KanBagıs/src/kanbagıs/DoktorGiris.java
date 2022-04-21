
package kanbagıs;

/**
 *
 * @author damla
 */
public class DoktorGiris implements GirisSecenekleri{
    private String kullanıcı_ad;
    private String sifre;

    public DoktorGiris() {
    }
    
      @Override
    public void giris() {
      /*   DoktorGirisJ doktorgiris = new DoktorGiris();
         setVisible(false);
         doktorgiris.setVisible(true);
         */
    }

    public DoktorGiris(String kullanıcı_ad, String sifre) {
        this.kullanıcı_ad = kullanıcı_ad;
        this.sifre = sifre;
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
