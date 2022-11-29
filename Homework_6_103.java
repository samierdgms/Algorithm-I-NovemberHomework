
import java.util.Scanner;                    //Kütüphane importladık

public class Homework_6_103 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen ore sayısı olduğu test etmek istediğiniz sayıyı giriniz");
        int x = input.nextInt();                    //girdi aldık
        double sayac = 0;                 //değer tanımladık
        double payda = 0;
        double toplam;
        int toplam2;
        for (int i = 1; i <= x; i++) {                          //döngü tanımladık       
            if (x % i == 0) {
                payda = payda + Math.pow(i, -1);                //işlemlerimizi tanımladık
                sayac++;
            }

        }
        toplam = sayac / payda;
        toplam2 = (int) toplam;
        if (toplam2 == toplam) {                //koşul açtık
            System.out.println("Girdiğiniz sayı ore sayısıdır");                //çıktı verdik

        } else {
            System.out.println("Girdiğiniz sayı ore sayısı değildir");               //çıktı verdik
        }

    }
}
