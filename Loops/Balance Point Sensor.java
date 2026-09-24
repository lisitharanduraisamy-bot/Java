import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long[] arr = new long[n];

        long total = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
            total += arr[i];
        }

        long leftSum = 0;

        for (int i = 0; i < n; i++) {
            long rightSum = total - leftSum - arr[i];

            if (leftSum == rightSum) {
                System.out.println(i);
                return;
            }

            leftSum += arr[i];
        }

        System.out.println(-1);
    }
}
