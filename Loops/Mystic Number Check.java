import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        long n = scan.nextLong();
        int count = 0;

        while (n > 0) {
            int digit = (int)(n % 10);

            if (digit == 3 || digit == 8) {
                count++;
            }

            n /= 10;
        }

        if (count == 3 || count == 8) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        scan.close();
    }
}
