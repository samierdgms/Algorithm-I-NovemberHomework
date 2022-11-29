
import java.util.Scanner;                    //Kütüphane importladık

public class Homework_6_105 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen aritmetik sayı olduğu test etmek istediğiniz sayıyı giriniz");
        int x = input.nextInt();                    //girdi aldık
        double sayac = 0;                 //değer tanımladık
        double toplam = 0;
        
        for (int i = 1; i <= x; i++) {                          //döngü tanımladık       
            if (x % i == 0) {
                toplam = toplam + i;                //işlemlerimizi tanımladık
                sayac++;
            }
            
 }
        double deger=toplam/sayac;
        int degerint = (int)deger;
        if (deger-degerint==0) {                                 //koşul açtık
            System.out.println("Girdiğiniz sayı aritmetik sayıdır");                //çıktı verdik

        } else {
            System.out.println("Girdiğiniz sayı aritmetik sayı değildir");               //çıktı verdik
        }

    }
}
