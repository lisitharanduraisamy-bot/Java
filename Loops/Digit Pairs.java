import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] odd = new int[10];
        int[] even = new int[10];

        for (int i = 1; i <= n; i++) {
            int num = sc.nextInt();

            int a = num / 100;
            int b = (num / 10) % 10;
            int c = num % 10;

            int largest = Math.max(a, Math.max(b, c));
            int smallest = Math.min(a, Math.min(b, c));

            int bitScore = (largest * 11 + smallest * 7) % 100;

            // Most significant digit of bit score
            int msd = bitScore / 10;

            if (i % 2 == 1) {
                odd[msd]++;
            } else {
                even[msd]++;
            }
        }

        int pairs = 0;

        for (int i = 0; i < 10; i++) {
            int possible = (odd[i] / 2) + (even[i] / 2);

            // At most two pairs for a given significant digit
            pairs += Math.min(2, possible);
        }

        System.out.println(pairs);
    }
}
