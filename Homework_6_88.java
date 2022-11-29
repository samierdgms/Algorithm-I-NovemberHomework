
import java.util.Scanner;                    //Kütüphane importladık

public class Homework_6_88 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int d;
        int sayac = 0;                    //değer tanımladık
        do {                    //do-while döngüsü açtık
            System.out.println("Lutfen asal carpanlarini bulmak istediginiz 1 den buyuk bir sayi giriniz");
            d = input.nextInt();                    //girdi aldık
        } while (d <= 1);                    //döngünün içine yazdık

        for (int i = 1; i <= d; i++) {                    //döngü açtık
            sayac = 0;
            for (int a = 1; a <= i; a++) {
                if (i % a == 0) {                    //işlemlerimizi sağlayan koşul açtık 
                    sayac++;

                }

            }
            if (sayac == 2 && d % i == 0) {                    //koşul açtık
                System.out.println(i);                    //koşulu sağladıysa çıktı verdik
                sayac = 0;
            }
        }
    }
}
