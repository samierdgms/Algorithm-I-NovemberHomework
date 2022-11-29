
import java.util.Scanner;                    //Kütüphane importladık

public class Homework_6_96 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen Hilbert sayısı kontrolü için değer giriniz");
        int x = input.nextInt();                    //girdi aldık

        if ((x - 1) % 4 == 0) {                    //koşul açtık
            System.out.println("Hilbert sayısıdır");                    // koşul sağlanıyorsa çıktı verdik

        } else {                   //koşul sağlanmıyorsa çıktı verdik
            System.out.println("Hilbert sayısı değildir");
        }

    }
}
