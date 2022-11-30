
import java.util.Scanner;

public class Homework_6_77 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen π'yi hesaplamak  için  terim sayısı giriniz  giriniz ");
        double x = input.nextInt();                     //girdi aldık
        double payda = 1;
        double toplam = 0;                        //değer tanımladık
        double deger = 3;
        double a = 0;
        double j = 3;
        for (double i = 0; i < x; i++) {                         //döngülerimizi açtık
            for (double b = 0; b < i; b++) {
                payda = j;
                j = j + 2;
                for (int k = 0; k < i; k++) {
                    payda = payda * 3;
                }
                //faktoriyelimizi hesapladık
            }
            if (i % 2 == 0) {                                   //- mi + mı olduğunu kontrol ettik
                a = a + (1 / payda);
            } else {
                a = a - (1 / payda);
            }
        }
        toplam = Math.pow(12, 1 / 2) * (1 - a);
        System.out.println("Hesapladığınız π nin değeri -->  " + toplam);                        //çıktı verdik

    }
}
