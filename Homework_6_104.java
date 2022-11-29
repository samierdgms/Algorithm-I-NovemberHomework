
public class Homework_6_104 {

    public static void main(String[] args) {

        double toplam = 0;                 //değer tanımladık
        for (int x = 1; x <= 50; x++) {                  // iç içe 3 döngü açtık
            for (int y = x; y <= 50; y++) {
                for (int z = y; z <= 50; z++) { 
                    if ((x * x) + (y * y) + (z * z) == 3 * x * y * z) {                  //işlem tanımladık
                        System.out.print(x + "," + y + "," + z);                  //çıktı verdik
                        System.out.println();
                    }

                }

            }

        }

    }

}
