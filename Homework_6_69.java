
import java.util.Scanner;                   //Kütüphanelerimizi importladık

public class Homework_6_69 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);                  //girdimiz için scanner ayarladık
        System.out.println("Lütfen cos(x) için  x  giriniz ");
        int x = input.nextInt();//girdi aldık
        System.out.println("Lütfen cos(x) için  k giriniz ");
        int k = input.nextInt();                  //girdi aldık
        int faktoriyel = 1;
        double toplam = 0;

        for (int i = 0; i < k; i++) {                   //döngü kullandık
            for (int j = i * 2; j > 0; j--) {
                faktoriyel = faktoriyel * j;
            }
            toplam = toplam + (Math.pow(-1, i) * Math.pow(x, 2 * i)) / faktoriyel;
            faktoriyel = 1;
        }
        System.out.println("--->   " + toplam);                  //çıktı verdik

    }
}
