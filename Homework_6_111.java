
import java.util.Scanner;                    //Kütüphane importladık

public class Homework_6_111 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen  fibonacci sayıları için terim sayısı giriniz");
        int x = input.nextInt();                   //girdi aldık
        System.out.println();
        if (x == 1) {                   //koşuk açtık
            System.out.print("0 ");

        }
        if (x == 2) {                   //koşuk açtık
            System.out.print("0  ");
            System.out.print("  1  ");

        }
        if (x >= 3) {                   //koşuk açtık
            System.out.print("0  ");
            System.out.print("  1  ");
            System.out.print("  1  ");

        }
        int a = 1;                   //değerler tanımladık
        int b = 1;
        int i = 4;
        while (i <= x) {                 //döngü açtık
            a = a + b;
            System.out.print("  " + a + "  ");                   //çıktı verdi
            i++;
            if (i > x) {
                break;
            }
            i++;
            b = a + b;
            System.out.print("  " + b + "  ");                       //çıktı verdik
        }

    }

}
