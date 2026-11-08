
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int t = scan.nextInt();

        while (t-- > 0) {
            long a = scan.nextLong();
            long b = scan.nextLong();
            long c = scan.nextLong();

            if (a > b || (a == b && c % 2 == 1)) {
                System.out.println("First");
            } else {
                System.out.println("Second");
            }
        }

        scan.close();
    }
}
