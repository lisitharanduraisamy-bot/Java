
import java.util.Scanner;

public class Main {
    static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int k = scan.nextInt();

        int minimum = n * (n + 1) / 2;

        if (minimum > k) {
            System.out.println(0);
            return;
        }

        int remaining = k - minimum;

        int[] dp = new int[remaining + 1];
        dp[0] = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= remaining; j++) {
                dp[j] = (int) ((dp[j] + (long) dp[j - i]) % MOD);
            }
        }

        System.out.println(dp[remaining]);
    }
}
