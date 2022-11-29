
import java.util.Scanner;                    //Kütüphane importladık

public class Homework_6_84 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen altin ucgen icin kisa kenar giriniz");
        double a = input.nextInt();                    //girdi aldık
        double b = ((a * (1 + Math.pow(5, 0.5)))) / 2;                    // işlemleri yaptık

        System.out.println("Girdiğiniz degere gore  kenarlar");
        System.out.println(a);                    //çıktılarımızı verdik
        System.out.println(b);
        System.out.println(b);
    }
}
