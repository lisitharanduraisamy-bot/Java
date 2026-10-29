import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        long n = scan.nextLong();
        long k = scan.nextLong();

        long odd = (n + 1) / 2;

        if (k <= odd) {
            System.out.println(2 * k - 1);
        } else {
            System.out.println(2 * (k - odd));
        }

        scan.close();
    }
}
