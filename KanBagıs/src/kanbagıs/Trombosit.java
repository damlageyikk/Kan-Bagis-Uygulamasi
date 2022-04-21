package kanbagıs;

import java.util.Scanner;

public class Trombosit  extends TrombositJ implements KanBagisTuru {

    Scanner scan = new Scanner(System.in);

    @Override
    public void bagisTuru() {
      int sayac = 0;
        System.out.println("Trombosit bağış için gereken bilgileri doldurunuz : \n");
        System.out.println("Kendinizi sağlıklı ve iyi hissediyor musunuz ? \n");
        String a = scan.nextLine();
        if (a.equals("hayır")) {
            sayac += 1;
        }
        System.out.println("Son 5 gün içerisinde ağrı kesici kullandınız mı? \n");
        String b = scan.nextLine();
        if (b.equals("evet")) {
            sayac += 1;
        }
        System.out.println("AIDS hastalığınız var mı , yoksa olduğunuza dair şüpheleriniz var mı ? \n");
        String c = scan.nextLine();
        if (c.equals("evet")) {
            sayac += 1;
        }
        System.out.println("Hepatit geçirdiniz mi ? \n");
        String d = scan.nextLine();
        if (d.equals("evet")) {
            sayac += 1;
        }
    }

}
