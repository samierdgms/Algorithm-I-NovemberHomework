
import java.util.Scanner;                    //Kütüphane importladık

public class Homework_6_92 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen üst sınır giriniz");
        int x = input.nextInt();                    //girdi aldık
        int sayac = 0;
        double sonuc;
        for (int i = 1; i <= x; i++) {
            double a = Math.pow(2, i);                 //değer tanımladık
            double b = (Math.pow(2, (i + 1))) - 1;
            for (int j = 1; j <= b; j++) {                     //döngü açtık
                if (b % j == 0) {                     //asal mı diye kontrol ettik
                    sayac++;
                }
            }
            if (sayac == 2) {                     // asalsa çıktı verdik
                sonuc = a * b;
                System.out.println("i ==> " + i + " iken çıkan sonuc -->  " + sonuc);
            }
            sayac = 0;
        }

    }
}
