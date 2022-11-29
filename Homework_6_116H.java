
import java.util.Scanner;                    //Kütüphane importladık

public class Homework_6_116H {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen  büyük değerli bir fibonacci sayısı giriniz ");
        int a = input.nextInt();                    //girdi aldık
        System.out.println();
        double x = (1 + Math.pow(5, 5)) / 2;
        double b = (a / x);
        int b1 = (int) b;
        double c = a * x;
        int c1 = (int) c;
        System.out.println(b1 + "  ,  " + a + "  ,  " + c1);
    }
}
