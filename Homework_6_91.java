
import java.util.Scanner;                    //Kütüphane importladık

public class Homework_6_91 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen test etmek istediğiniz sayıyı girinz");
        int x = input.nextInt();                    //girdi aldık
        int toplam = 0;                    //değer tanımladık
        for (int i = 1; i < x ; i++) {
            if (x % i == 0) {
                toplam = toplam + i;
            }

        }
        if (toplam == x) {                    // Kontrollerimizi yaptık
            System.out.println("Girdiğiniz sayı mükemmel sayıdır");                     //çıktı verdik

        } else {
            System.out.println("Girdiğiniz sayı mükemmel sayı değildir");                         //çıktı verdik
        }
    }
}
