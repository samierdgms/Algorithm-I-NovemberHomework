
import java.util.Scanner;                    //Kütüphane importladık

public class Homework_6_110 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen  kare üçgensel sayı için terim sayısı giriniz");
        int x = input.nextInt();                    //girdi aldık
        double k2 = 0; //değer tanımladık
        double k0 = 0;
        double k1 = 1;
        System.out.print(k1 + " , ");
        for (int i = 1; i <= x - 1; i++) {                          //döngü tanımladık       
            k2 = (34 * k1) - k0 + 2;
            System.out.print(k2 + ", ");              //çıktı verdik
            k0 = k1;
            k1 = k2;
        }
    }
}
