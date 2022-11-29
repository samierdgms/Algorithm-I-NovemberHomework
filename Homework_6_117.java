
import java.util.Scanner;                    //Kütüphane importladık

public class Homework_6_117 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen  Pell sayıları için terim sayısı giriniz");
        int x = input.nextInt();                    //girdi aldık
        System.out.println();
        double k3;
        double k1 = 0; //değer tanımladık
        double k2 = 1;
        System.out.print(k1 + " , ");
        System.out.print(k2 + " , ");
        
        for (int i = 1; i <= x-2 ; i++) {                          //döngü tanımladık       
            k3 = (2*k2)+k1;
            System.out.print(k3 + ", ");              //çıktı verdik
            k1 = k2;
            k2 = k3;
            
        }
    }
}
