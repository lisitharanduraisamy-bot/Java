import java.util.Scanner;
import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] a = new int[n];
        int total = 0;

        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
            total += a[i];
        }

        Arrays.sort(a);

        int sum = 0;
        int count = 0;

        for (int i = n - 1; i >= 0; i--) {
            sum += a[i];
            count++;

            if (sum > total - sum) {
                break;
            }
        }

        System.out.println(count);
        scan.close();
    }
}
