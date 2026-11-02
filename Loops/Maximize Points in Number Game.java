
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int[] freq = new int[100001];

        for (int i = 0; i < n; i++) {
            int x = scan.nextInt();
            freq[x]++;
        }

        long[] dp = new long[100001];

        dp[1] = freq[1];

        for (int i = 2; i <= 100000; i++) {
            dp[i] = Math.max(dp[i - 1],
                    dp[i - 2] + (long) i * freq[i]);
        }

        System.out.println(dp[100000]);

        scan.close();
    }
}
