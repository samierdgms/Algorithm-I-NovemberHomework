
import java.util.Scanner;                    //Kütüphane importladık

public class Homework_6_81 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen  √3 icin bolum sayisi olarak n giriniz");
        double x = input.nextInt();                    //girdi aldık
        double a = 1;
        for (double i = 1; i <= x - 1; i++) {                    //döngümüzü alıp işlem yaptık
            a = 1 + (1 / (2 + 1 / a));

        }
        a = 1 + 1 / a;
        System.out.println("Girdiğiniz degere gore sonuc   " + a);                     //çıktı verdik
    }
}
