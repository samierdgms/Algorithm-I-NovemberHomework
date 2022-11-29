
import java.util.Scanner;                    //Kütüphane importladık

public class Homework_6_115 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen  Tribonacci sayıları için terim sayısı giriniz");
        int x = input.nextInt();                    //girdi aldık
        System.out.println();
        double k4;
        double k3 = 2;
        double k1 = 1; //değer tanımladık
        double k2 = 1;
        System.out.print(k1 + " , ");
        System.out.print(k2 + " , ");
        System.out.print(k3 + " , ");
        for (int i = 1; i <= x - 3; i++) {                          //döngü tanımladık       
            k4 = k1 + k2 + k3;
            System.out.print(k4 + ", ");              //çıktı verdik
            k1 = k2;
            k2 = k3;
            k3=k4;
        }
    }
}
