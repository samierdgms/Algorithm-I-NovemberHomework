
import java.util.Scanner;                    //Kütüphane importladık

public class Homework_6_107 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen basamak sayısındaki palindrom miktarını bulmak istediğiniz basamağı giriniz");
        int x = input.nextInt();                    //girdi aldık
        double toplam = 9 * (Math.pow(10, ((x - 1) / 2))); // işlem tanımladık

        System.out.println("Polindrom sayısı" + toplam);                   //çıktı verdik
    }

}
