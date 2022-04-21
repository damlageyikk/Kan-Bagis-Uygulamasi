/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testCase;

import java.util.Scanner;

/**
 *
 * @author damla
 */
public class KanBagisTesti {
    //Eritrosit için test
     int sayac = 0;
    Scanner scan = new Scanner(System.in);
    
    String cevap;
    
    public String Soru1(){
        String cevap = "Hayır";
        sayac++;
        return cevap;
    }
     public String Soru2(){
        String cevap = "Evet";
        sayac++;
        return cevap;
    }
     public String Soru3(){
        String cevap = "Evet";
        sayac++;
        return cevap;
    }
     public String Soru4(){
        String cevap = "Evet";
        sayac++;
        return cevap;
    }
       public String Soru5(){
        String cevap = "Evet";
        sayac++;
        return cevap;
    }
    public String bagisTuru() {
        return "Kan bağısı yapmaya uygun değilsiniz";
     
}
}
