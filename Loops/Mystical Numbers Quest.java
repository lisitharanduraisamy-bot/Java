import java.util.*;

public class Main {
    static boolean isPrime(long x) {
        if (x < 2) return false;
        if (x % 2 == 0) return x == 2;

        for (long i = 3; i * i <= x; i += 2) {
            if (x % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        while (n-- > 0) {
            long x = sc.nextLong();

            long root = (long) Math.sqrt(x);

            if (root * root == x && isPrime(root)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }
}
