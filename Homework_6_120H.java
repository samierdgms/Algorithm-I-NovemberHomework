import java.util.Scanner;                    //Kütüphane importladık

public class Homework_6_120H {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a ;                //değer tanımladık
        do {                //döngü açtık
        System.out.println("Pisagor üçlemesi hesaplamak için pozitif bir tamsayı giriniz ");
        a=input.nextInt();                //girdi aldık
        } while (a<0);
        for (int i = 1; i <=a-1; i++) {
            for (int j = i+1; j < a-i; j++) {
                int c = a-(i+j);
                if (Math.pow(i,2)+Math.pow(j, 2)==Math.pow(c,2)); {
                int t = i*j*c;
                System.out.print(i+"  "+j+"  "+c+"  "+t);
                System.out.println();
                    
                }
                
            }
            
        }
                       
                    
        }
    
}