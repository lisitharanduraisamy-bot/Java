
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        System.out.print("I dislike");

        for (int i = 2; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.print(" that I admire");
            } else {
                System.out.print(" that I dislike");
            }
        }

        System.out.print(" it");
    }
}
