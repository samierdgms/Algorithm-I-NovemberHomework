
import java.util.Scanner;                    //Kütüphane importladık

public class Homework_6_86 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen asal sayi tespiti icin ust sinir girisi yapiniz");
        int s = input.nextInt();                    //girdi aldık
        int sayac = 0;
        for (int i = 1; i <= s; i++) {                    //döngü başlattık
            sayac = 0;                    //işlem tanımladık
            for (int a = 1; a <= i; a++) {                    //ikinci döngümüzü açtık
                if (i % a == 0) {
                    sayac++;

                }

            }
            if (sayac == 2) {                    //if komutu ile çıktı ayarladık
                System.out.println(i);
                sayac = 0;
            }

        }

    }
}
