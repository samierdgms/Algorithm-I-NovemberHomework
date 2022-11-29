
import java.util.Scanner;

public class Homework_6_76 {                           //Kütüphanelerimizi importladık

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen e'yi hesaplamak  için  terşn sayısı giriniz  giriniz ");
        double x = input.nextInt();                     //girdi aldık
        double faktoriyel = 1;
        double toplam = 0;                        //değer tanımladık
        for (double i = 0; i < x; i++) {                         //döngülerimizi açtık
            for (double j = (2 * i) + 1; j > 0; j--) {
                faktoriyel = faktoriyel * j;                        //faktoriyelimizi hesapladık
            }
            toplam = toplam + ((2 * i) + 2) / faktoriyel;

        }
        System.out.println("Hesapladığınız e nin değeri -->  " + toplam);                        //çıktı verdik

    }

}
