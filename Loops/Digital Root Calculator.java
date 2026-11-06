
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        while (n >= 10) {
            int sum = 0;

            while (n > 0) {
                sum += n % 10;
                n /= 10;
            }

            n = sum;
        }

        System.out.println(n);
        scan.close();
    }
}
