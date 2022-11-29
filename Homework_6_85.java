
import java.util.Scanner;                    //Kütüphane importladık

public class Homework_6_85 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen doğru parçası giriniz");
        double d = input.nextInt();                    //girdi aldık
        double b = d / (2 + Math.pow(2, 5));                    //işlemlerimizi yaptık
        double a = d - b;
        System.out.println("Girilen doğru parçası ve sonuç -->  " + a);                    //çıktı verdik
        System.out.println("-->  " + b);
    }

}
