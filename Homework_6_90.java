
import java.util.Scanner;                    //Kütüphane importladık

public class Homework_6_90 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen asal sayi tespiti icin ust sinir girisi yapiniz");
        int s = input.nextInt();                    //girdi aldık
        int sayac = 0;                    //değer tanımladık
        int sayac1 = 0;
        int b;
        int c;
        for (int i = 1; i <= s; i++) {                  //döngümüzü açtık
            b=i;                  //değerlerimizi tanımladık
            c=i-2;
            for (int j = 1; j <=b; j++) {                  //sayıyı arttırıp asal mı diye kontrol ettik
                if (b%j==0) {
                sayac++;   
                }
            }
                for (int k = 1; k <=c; k++) {                  //sayıyı arttırıp asal mı diye kontrol ettik
                if (c%k==0) {
                sayac1++;   
                }   
                }
                if (sayac==2 && sayac1==2) {                  //ikiside asalsa yazdırdık
                    System.out.print(c);
                    System.out.print(" - ");
                    System.out.print(b);
                    System.out.println();
                
            } 
                sayac=0;                 //sayaçları sıfırladık
                sayac1=0;
            }
           
            }
        }

    

