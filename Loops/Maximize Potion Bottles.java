
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        int[] dp = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            dp[i] = -10000;
        }

        dp[0] = 0;

        for (int i = 1; i <= n; i++) {
            if (i >= a)
                dp[i] = Math.max(dp[i], dp[i - a] + 1);

            if (i >= b)
                dp[i] = Math.max(dp[i], dp[i - b] + 1);

            if (i >= c)
                dp[i] = Math.max(dp[i], dp[i - c] + 1);
        }

        System.out.println(dp[n]);
        scan.close();
    }
}
