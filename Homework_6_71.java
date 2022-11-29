
import java.util.Scanner;                    // kütüphanelerimizi importladık

public class Homework_6_71 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen  Ln(2) için terim sayısı giriniz");                   //input aldık
        double a = input.nextDouble();
        double toplam = 0;
        double payda = 1;
        double payda1 = 1;                                   //değerlerimizi tanımladık
        double payda2 = 2;

        for (double i = 1; i <= a; i++) {                    // döngüzümü başlattık
            payda = payda1 * payda2;
            toplam = toplam + (1 / payda);
            payda1 = payda2;                                // işlemlerimizi yaptık
            payda2++;
            payda = 1;
        }
        System.out.println("Ln(2) değeriniz -->  " + toplam);                   //sonucu çıktı olarak verdik
    }
}
