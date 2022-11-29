
import java.util.Scanner;            //Kütüphanelerimizi importladık

public class Homework_6_75 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen binom için  x ve n değerlerini giriniz ");
        int a = input.nextInt();                  //input aldık
        int b = input.nextInt();
        double c = Math.pow(1 + a / b, b);                   //işlemimizi yaptık
        System.out.println("Sonuç" + c);                  // sonucu çıktı olarak verdik
    }

}
