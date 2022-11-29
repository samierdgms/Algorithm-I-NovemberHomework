
import java.util.Scanner;                 //Kütüphanelerimizi importladık

public class Homework_6_74 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen x değeri giriniz");                 // girdi aldık
        int x = input.nextInt();
        System.out.println("Lütfen terim sayısı giriniz");                 //girdik aldık
        int n = input.nextInt();
        int ex = 1;
        int p = 1;
        int t = 1;
        for (int i = 1; i <= n; i++) {                 // döngümüzü tanımladık
            for (int a = 1; a <= i; a++) {
                t = x * t;
            }
            for (int d = i; d > 0; d--) {                 //işlemlerimizi yaptık
                p = p * d;
            }

            ex = ex + (t / p);
            t = 1;
            p = 1;

        }
        System.out.println("Sonuç -->  " + ex);                 //Çıktı olarak sonucu verdik

    }

}
