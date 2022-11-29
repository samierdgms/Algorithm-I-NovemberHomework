
public class Homework_6_112 {

    public static void main(String[] args) {
        for (int i = 10; i <= 99; i++) {                  //döngü açtık
            int a = i % 10;
            int b = i / 10;                 //deger tanımladık
            int t = a + b;
            if (t == 1 || t == 2 || t == 3 || t == 5 || t == 8 || t == 13) {                  //koşul çatık
                System.out.println(i);                  //çıktı verdik

            }

        }

    }

}
