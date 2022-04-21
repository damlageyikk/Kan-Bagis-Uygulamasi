package kanbagıs;

import java.util.Scanner;

public class Plazma extends PlazmaJ implements KanBagisTuru {
 Scanner scan = new Scanner(System.in);
   

    @Override
    public void bagisTuru() {
          int sayac = 0;

        System.out.println("Plazma bağış için gereken bilgileri doldurunuz : \n");

        System.out.println("Kendinizi sağlıklı ve iyi hissediyor musunuz ? \n");

        String a = scan.nextLine();

        if (a.equals("hayır")) {
            sayac += 1;
        }

        System.out.println("1980-1996 yılları arasında İngiltere, Kuzey İrlanda, Galler ya da İskoçya'da bulundunuz mu ? \n");

        String b = scan.nextLine();

        if (b.equals("evet")) {
            sayac += 1;
        }

        System.out.println("Beyin zarı veya kornea nakli yapıldı mı ? \n");

        String c = scan.nextLine();

        if (c.equals("evet")) {
            sayac += 1;
        }

        System.out.println("Son 12 ay içerisinde kan, doku veya organ nakli yapıldı mı? \n");

        String d = scan.nextLine();

        if (d.equals("evet")) {
            sayac += 1;
        }

        System.out.println("Hiç toksoplatma geçirdiniz mi ?(Kediler bulaşan bir parazit) \n");

        String e = scan.nextLine();

        if (e.equals("evet")) {
            sayac += 1;
        }

        System.out.println("Ailenizde Deli Dana hastalığı geçiren oldu mu? \n");

        String f = scan.nextLine();

        if (f.equals("evet")) {
            sayac += 1;
        }

        if (sayac >= 2) {
            System.out.println("Kan bağışlamaya uygun değilsiniz \n");
            System.exit(0);
        }

    }

}
