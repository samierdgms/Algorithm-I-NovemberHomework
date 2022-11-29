
import java.util.Scanner;                        //Kütüphane importladık

public class Homework_6_80 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen  √2 icin bolum sayisi olarak n giriniz");
        double x = input.nextInt();                    //girdi aldık
        double a = 1;
        for (double i = 1; i <= x; i++) {                    //döngümüzü açtık
            a = 2 + 1 / a;                        //işlemlerimizi yaptık

        }
        a = 1 + 1 / a;                    //
        System.out.println("Girdiğiniz degere gore sonuc   " + a);                    //çıktı verdik
    }

}
