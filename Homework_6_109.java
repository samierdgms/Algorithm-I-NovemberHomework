
import java.util.Scanner;                    //Kütüphane importladık

public class Homework_6_109 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen üçgensel sayı için terim sayısı giriniz");
        int x = input.nextInt();                    //girdi aldık
        double toplam = 0; //değer tanımladık

        for (int i = 1; i <= x; i++) {                          //döngü tanımladık       
            toplam = i * ((i + 1) / 2);
            System.out.print(toplam + " , ");              //çıktı verdik
        }
    }
}
