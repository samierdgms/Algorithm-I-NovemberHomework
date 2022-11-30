
import java.util.Scanner;           //Kütüphane importladık

public class Homework_6_78 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen π'yi hesaplamak  için  terim sayısı giriniz  giriniz ");
        double x = input.nextInt();                     //girdi aldık
        double a = 1;            //değer atadık
        double toplam = 1;
        for (int i = 1; i < x; i++) {
            double a1 = 4 * i * i;
            a = (a * a1) / (a1 - 1);            //işlemlerimizi yaptık
        }
        toplam = 2 * a;
        System.out.println("Hesapladığınız π nin değeri -->  " + toplam);                        //çıktı verdik

    }
}
