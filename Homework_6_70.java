
import java.util.Scanner;              //Kütüphanelerimizi importladık

public class Homework_6_70 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);                  //girdimiz için scanner ayarladık
        System.out.println("Lütfen sin(x) için  x  giriniz ");
        int x = input.nextInt();               //girdi aldık
        System.out.println("Lütfen sin(x) için  k giriniz ");
        int k = input.nextInt();                //girdi aldık
        int faktoriyel = 1;
        double toplam = 0;

        for (int i = 1; i <= k; i++) {               //döngümüzü ayarladık
            for (int j = (i * 2) - 1; j > 0; j--) {
                faktoriyel = faktoriyel * j;
            }
            toplam = toplam + (Math.pow(-1, i - 1) * Math.pow(x, (2 * i) - 1)) / faktoriyel;                //işlemleri yaptık
            faktoriyel = 1;
        }
        System.out.println("--->   " + toplam);                //çıktı olarak sonucu verdik
    }
}
