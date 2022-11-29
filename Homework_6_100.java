
import java.util.Scanner;                    //Kütüphane importladık

public class Homework_6_100 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen Eksik sayı olup olmadığını test etmek istediğiniz sayıyı girinz");
        int x = input.nextInt();                    //girdi aldık
        int toplam = 0;                    //değer tanımladık
        int sonuc = 0;
        for (int i = 1; i <= x ; i++) {
            if (x % i == 0) {
                toplam = toplam + i;
            }

        }
        if (toplam < 2*x) {                    // Kontrollerimizi yaptık
            System.out.println("Girdiğiniz sayı eksik sayıdır ve eksiklik miktarı");                     //çıktı verdik
            sonuc = (2*x)-toplam;
            System.out.println(sonuc);

        } else {
            System.out.println("Girdiğiniz sayı eksik sayı değildir");                         //çıktı verdik
        }
    }
}
