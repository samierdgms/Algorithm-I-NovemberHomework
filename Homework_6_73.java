
import java.util.Scanner;              //Kütüphanelerimizi importladık
import java.util.Random;

public class Homework_6_73 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);              //input tanımladık
        Random random = new Random();              //random tanımladık
        int x = random.nextInt(25) + 65;              //sayımızı ayarladık
        int i = 1;
        int k ;
        char c = (char) x;              //sayımızı harfe dönüştürdük

        while (i <= 10) {              //döngü ile deneme sıramızı ayarladık
            System.out.println("Lütfen  büyük harf tahmininizi giriniz");
            String deneme = input.nextLine();
            char deneme1 = deneme.charAt(0);
            if (deneme1 == c) {              //kazanıp kazanmadığını kontrol ediyoruz
                System.out.println(i + "   Denemede doğru tahmin ettiniz !!!");
                break;              // kazandıysa bitiriyoruz
            } else {
                k=10-i;
                System.out.println("Tahmininiz yanlış  ve  "+k+" hakkınız kaldı lütfen tekrar deneyin");
                i++; 
            }
        }
        if (i > 10) {              //kaybedip etmediğini kontrol ediyoruz
            System.out.println();
            System.out.println("Deneme hakkınız kalmadığı için kaybettiniz");
            System.out.println("Doğru cevap --> "+c);
        }

    }

}
