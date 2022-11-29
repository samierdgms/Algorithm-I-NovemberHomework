
import java.util.Scanner;                    //Kütüphane importladık

public class Homework_6_89 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen asal sayi tespiti icin sayı girisi yapiniz");
        int s = input.nextInt();                    //girdi aldık
        int sayac = 0;                    //değer tanımladık
        int sayac1 = 0;

        for (int a = 1; a <= s; a++) {
            if (s % a == 0) {                    //ilk döngümüzü açtık
                sayac++;
            }
        }
        for (int a = 1; a <= s + 2; a++) {
            if ((s + 2) % a == 0) {
                sayac1++;                    //ikinci döngümüzü açtık
            }
        }

        if (sayac == 2 && sayac1 == 2) {                    //koşul açtık
            System.out.println("Girilen sayi chan sayisidir");                    // koşul sağlanıyorsa çıktı verdik
            sayac = 0;

        } else {                   //koşul sağlanmıyorsa çıktı verdik
            System.out.println("Girilen sayi chan sayisi degildir");
        }

    }
}
