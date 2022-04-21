
package kanbagıs;

/**
 *
 * @author damla
 */
public class GirisFacade {
    private GirisSecenekleri kullanıcı;
    private GirisSecenekleri doktorgiris;
    
    public GirisFacade(){
        kullanıcı = new KullaniciGiris();
        doktorgiris= new DoktorGiris();    
    }
    public void girisKullanıcı(){
        kullanıcı.giris();
    }
    
    public void girisDoktor(){
        doktorgiris.giris();
    }
   
   
}
