
import java.util.Random;                          //Kütüphanelerimizi importladık
import java.util.Scanner;

public class Homework_6_72 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int x = random.nextInt(99) + 1;             //sayımızı tanımladık
        int a;
        int c = 0;
        do {                                                    // döngü ile tahmin sayısını tuttuk
            System.out.println("Lütfen tahmininizi giriniz");
            a = input.nextInt();
            if (a < x && a > 0 && a < 100) {                                  // if ile kontrolleri yaptık
                System.out.println("lütfen daha BÜYÜK bir sayı giriniz");
            } else if (a > x && a > 0 && a < 100) {
                System.out.println("lütfen daha KÜÇÜK bir sayı giriniz");
            } else if (a < 0 || a > 100) {
                System.out.println("Lütfen 1-99 arasında bir sayı giriniz");
            }
            c++;
        } while (a != x || a < 0 || a > 100);              //kaç denemede verdiğini çıktı olarak yazdırdık
        System.out.println(c + " Tahminde doğru tahmin ettiniz!!");

    }

}
