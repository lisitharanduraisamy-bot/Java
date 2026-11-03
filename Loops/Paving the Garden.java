import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        long n = scan.nextLong();
        long m = scan.nextLong();
        long a = scan.nextLong();

        long x = (n + a - 1) / a;
        long y = (m + a - 1) / a;

        System.out.println(x * y);
    }
}
