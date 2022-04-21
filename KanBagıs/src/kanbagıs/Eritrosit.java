package kanbagıs;

import java.util.Scanner;

public class Eritrosit extends EritrositJ implements KanBagisTuru {
    int sayac = 0;
    Scanner scan = new Scanner(System.in);
     
    @Override
    public void bagisTuru() {
        
        System.out.println("Eritrosit bağış için gereken bilgileri doldurunuz : \n");

        System.out.println("Kendinizi sağlıklı ve iyi hissediyor musunuz ? \n");

        String a = scan.nextLine();

        if (a.equals("hayır")) {
            sayac += 1;
        }

        System.out.println("Tehlikeli bir hobiniz var mı ? \n");
        String x = scan.nextLine();
        if (x.equals("evet")) {
            sayac += 1;
        }

        System.out.println("Son 5 gün içerisinde ağrı kesici ilacı aldınız mı ? \n");
        String y = scan.nextLine();
        if (y.equals("evet")) {
            sayac += 1;
        }

        System.out.println("Son 1 ay içerisinde aşı oldunuz mu ?\n");
        String t = scan.nextLine();
        if (t.equals("evet")) {
            sayac += 1;
        }

        System.out.println("Bel soğukluğu nedeniyle tedavi oldunuz mu? \n");
        String z = scan.nextLine();
        if (z.equals("evet")) {
            sayac += 1;
        }

        System.out.println("Daha önce hiç Kongo'da bulunduz mu? \n");
        String w = scan.nextLine();
        if (w.equals("evet")) {
            sayac += 1;
        }
    
        if (sayac >= 2) {
            System.out.println("Kan bağışlamaya uygun değilsiniz \n");
            System.exit(0);
        }
        
}
}
