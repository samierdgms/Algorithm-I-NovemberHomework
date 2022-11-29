
public class Homework_6_87 {

    public static void main(String[] args) {
        int d = 9;
        while (d <= 99) {                    //döngü tanımladık
            int a = d % 10;                    //değer tanımladık
            int x = d;
            x = x / 10;
            if ((a == 2 || a == 3 || a == 5 || a == 7) && (x == 2 || x == 3 || x == 5 || x == 7)) {                    //koşul tanımladık
                System.out.println(d);                    //çıktı verdik
            }
            d++;
        }

    }
}
