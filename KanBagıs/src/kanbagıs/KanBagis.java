package kanbagıs;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import org.postgresql.ds.PGPoolingDataSource;

public class KanBagis {

    static int port = 5432;
    static String local = "localhost";
    static String db = "KanBagıs";
    static String kullanici_adi = "postgres";
    static String parola = "789";

    static Connection getConnection(){
        Connection cn = null;
        PGPoolingDataSource source = new PGPoolingDataSource();
        source.setPortNumber(port);
        source.setServerName(local);
        source.setDatabaseName(db);
        source.setUser(kullanici_adi);
        source.setPassword(parola);
        
        try {
            cn = (Connection) source.getConnection();
        } catch (SQLException e) {
            System.out.println(e);
        }
        
        return cn;
    }

    public static void main(String[] args) {
        try {
            getConnection();
        } catch (Exception ex) {
            Logger.getLogger(KanBagis.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        /* Test*/
        Randevu randevu = new Randevu();

        /*Button*/
        JButton trombosit = new JButton();
        JButton eritrosit = new JButton();
        JButton plazma = new JButton();
        JButton giris_yap = new JButton();
        JButton doktor_giris = new JButton();

        /*Uygulama*/
        KanBagisUygulamasi kbu = new KanBagisUygulamasi();
        kbu.setVisible(false);
        kbu.setVisible(true);

        //Factory Method
        KanBagisTuruFactory factory = new KanBagisTuruFactory();

        if (trombosit.equals(db)) {
            KanBagisTuru bagisTur1 = factory.getKanBagisTuru("Eritrosit");
            bagisTur1.bagisTuru();
        } else if (eritrosit.equals(db)) {

            KanBagisTuru bagisTur2 = factory.getKanBagisTuru("Trombosit");
            bagisTur2.bagisTuru();
        } else if (plazma.equals(db)) {

            KanBagisTuru bagisTur3 = factory.getKanBagisTuru("Plazma");
            bagisTur3.bagisTuru();
        }

        //Facade Method
        GirisFacade girisFacade = new GirisFacade();

        if (giris_yap.equals(db)) {
            girisFacade.girisKullanıcı();
        } else if (eritrosit.equals(db)) {
            girisFacade.girisDoktor();

        }
        
        //STATE
        StateYonetim stateYonetim = new StateYonetim();
        
        stateYonetim.randevuIslemleri();

        stateYonetim.durumDegisimi(randevu);

        stateYonetim.randevuIslemleri();
    }

}
