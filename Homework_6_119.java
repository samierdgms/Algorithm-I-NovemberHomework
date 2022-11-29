import java.util.Scanner;                    //Kütüphane importladık

public class Homework_6_119 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen  Floyd üçgeni için satır sayısı giriniz");
        int x = input.nextInt();                    //girdi aldık
        int a = 1;
        for (int i = 1; i <=x; i++) {                    //döngü açtık
            for (int j = 1; j <=i; j++) {                    //döngü açtık
                System.out.print(a+"  ");                    //çıktı verdik
                a=a+1;
                
            } 
            System.out.println();                    // satır atladık
        }
    }
}