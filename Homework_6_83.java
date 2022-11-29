
import java.util.Scanner;                    //kütüphane importladık

public class Homework_6_83 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen altin oran icin ab dogru parcasi giriniz");
        double ab = input.nextInt();                    //girdi aldık
        double cb = 2 * (ab / (1 + (Math.pow(5, 0.5))));                    //işlemlerimizi tanımladık
        double ac = ab - cb;

        System.out.println("Girdiğiniz degere gore ac-->    " + ac);                     //çıktılarımızı verdik
        System.out.println("cb -->   " + cb);
    }
}
