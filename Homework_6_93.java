
import java.util.Scanner;                    //Kütüphane importladık

public class Homework_6_93 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen Cullen sayısı için terim sayısı giriniz");
        int x = input.nextInt();                    //girdi aldık
        double deger;
        System.out.println();
        for (int i = 1; i <= x; i++) {                   //döngü açtık
            deger = i * (Math.pow(2, i + 1));                   // işlem tanımladık
            System.out.println(i + ". terim -->   " + deger);                   //çıktı verdik

        }
    }
}
