
import java.util.Scanner;                    //Kütüphane importladık

public class Homework_6_102 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen heterometrik sayı adeti giriniz");
        int x = input.nextInt();                    //girdi aldık
        int toplam = 0;                    //değer tanımladık
        int a = 1;
        int b = 2;
        System.out.println();
        for (int i = 1; i <= x; i++) {                //döngü tanımladık
            toplam = a * b;                //işlem tanımladık
            System.out.println(i + ". sayı --> " + toplam);                //çıktı verdik
            a = b;                //yine işlem tanımladık
            b = b + 1;

        }

    }
}
