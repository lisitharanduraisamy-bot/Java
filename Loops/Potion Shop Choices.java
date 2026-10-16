import java.util.Scanner;
import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }

        Arrays.sort(a);

        int q = scan.nextInt();

        for (int i = 0; i < q; i++) {
            int coins = scan.nextInt();
            int low = 0, high = n - 1;
            int count = 0;

            while (low <= high) {
                int mid = low + (high - low) / 2;

                if (a[mid] <= coins) {
                    count = mid + 1;
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }

            System.out.print(count);
            if (i < q - 1) {
                System.out.print(" ");
            }
        }

        scan.close();
    }
}
