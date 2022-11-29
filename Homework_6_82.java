
import java.util.Scanner;                    //Kütüphane importladık

public class Homework_6_82 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen  √5 icin bolum sayisi olarak n giriniz");
        double x = input.nextInt();                    //girdi aldık
        double a = 1;
        for (double i = 1; i <= x; i++) {                    //değer tanımladık
            a = 4 + 1 / a;

        }
        a = 2 + 1 / a;
        System.out.println("Girdiğiniz degere gore sonuc   " + a);                     //çıktı verdik
    }
}
