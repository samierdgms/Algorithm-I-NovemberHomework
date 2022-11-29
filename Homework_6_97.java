
import java.util.Scanner;                    //Kütüphane importladık

public class Homework_6_97 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen  Dost sayı olduğuna bakmak istediğiniz iki sayıyı giriniz");
        System.out.println("Lütfen ilk sayıyı giriniz");
        int x = input.nextInt();                    //girdi aldık
        System.out.println("Lütfen ikinci sayıyı giriniz");
        int y = input.nextInt();                    //girdi aldık
        int toplam1 = 0;                    //değer tanımladık
        int toplam2 = 0;
        for (int i = 1; i < x; i++) {                     //döngü açtık
            if (x % i == 0) {                     //toplam hesapladık
                toplam1 = toplam1 + i;
            }
        }
        for (int b = 1; b < y; b++) {                     //döngü açtık
            if (x % b == 0) {                     //toplam hesapladık
                toplam2 = toplam2 + b;
            }
        }
        System.out.println();
        if (toplam1 == y && toplam2 == x) {                    // Kontrollerimizi yaptık
            System.out.println("Girdiğiniz sayılar dost sayılardır");                     //çıktı verdik

        } else {
            System.out.println("Girdiğiniz sayılar dost sayılar değildir");                         //çıktı verdik
        }
    }
}
