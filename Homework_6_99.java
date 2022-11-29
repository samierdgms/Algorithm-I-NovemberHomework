
import java.util.Scanner;                    //Kütüphane importladık

public class Homework_6_99 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x;                    //değer tanımladık
        int y;
        do {
            System.out.println("Lutfen  Bağdaşık sayı olduğuna bakmak istediğiniz iki basamaklı istediğiniz iki sayıyı giriniz");
            System.out.println("Lütfen ilk sayıyı giriniz");
            x = input.nextInt();                    //girdi aldık
            System.out.println("Lütfen ikinci sayıyı giriniz");
            y = input.nextInt();                    //girdi aldık
        } while (x < 10 || x > 99 || y < 10 || y > 99);
        double b1 = x % 10;                    //işlemlerimizi tanımladık
        double b2 = y % 10;
        double bt = b1 + b2;
        double o1 = x / 10;
        double o2 = y / 10;
        if (bt == 10 && o1 == o2) {                    //kontrol ettik
            System.out.println("Girdiğiniz sayılar bağdaşık sayılardır");                    //çıktı verdik

        } else {
            System.out.println("Girdiğiniz sayılar bağdaşık sayılar değildir");                    //çıktı verdik
        }

    }
}
