import java.util.ArrayList;                 //Kütüphane importladık
import java.util.Scanner;                    //Kütüphane importladık

public class Homework_6_95 {

    public static void main(String[] args) {
         ArrayList<Double> Leyland = new ArrayList<Double>();                  //Arraylist oluşturduk
        Scanner input = new Scanner(System.in);
        int x;                    //deger tanımladık
        int y;
        do {
            System.out.println("Lutfen Leyland sayıları için 2 tane sayı giriniz");
            System.out.println("Lutfen ilk sayıyı giriniz");
            x = input.nextInt();                    //girdi aldık
            System.out.println("Lutfen ikinci sayıyı giriniz");
            y = input.nextInt();                    //girdi aldık
        } while (x < 1 || y < 1);
        for (int t = 2; t <= x; t++) {                    //döngü açtık
            for (int j = 2; j <= y; j++) {                    //döngü açtık
                double deger = (Math.pow(t, j)) + (Math.pow(j, t));                    //işlem tanımladık
                 if (!Leyland.contains(deger)) {                  //değer var mı yok mu baktık
               
                Leyland.add(deger);                  //değer yoksa eğer ekledik
            }
                            
            }
             

        }
        System.out.println(Leyland)    ;                   //listeyi yazdırdık

    }
}
