
import java.util.Scanner;                    //Kütüphane importladık

public class Homework_6_101 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen tau sayısı olduğu test etmek istediğiniz sayıyı giriniz");
        int x = input.nextInt();                    //girdi aldık
        int toplam = 0;                    //değer tanımladık
        for (int i = 1; i <=x ; i++) {
            if (x % i == 0) {
                toplam++;
            }

        }
        if (x%toplam==0) {                    // Kontrollerimizi yaptık
            System.out.println("Girdiğiniz sayı tau sayıdır");                     //çıktı verdik

        } else {
            System.out.println("Girdiğiniz sayı tau sayısı değildir");                         //çıktı verdik
        }
    }
}
