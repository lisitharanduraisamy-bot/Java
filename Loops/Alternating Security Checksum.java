
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        long n = Math.abs(scan.nextLong());
        int sum = 0;
        int position = 1;

        while (n > 0) {
            int digit = (int)(n % 10);

            if (position % 2 == 1) {
                sum += digit;
            } else {
                sum -= digit;
            }

            n /= 10;
            position++;
        }

        System.out.println(sum);
    }
}
