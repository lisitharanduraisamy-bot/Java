import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        Arrays.sort(a);

        int count = 0;

        for (int i = 0; i < n; i++) {
            if ((i > 0 && (long)a[i] - a[i - 1] <= k) ||
                (i < n - 1 && (long)a[i + 1] - a[i] <= k)) {
                count++;
            }
        }

        System.out.println(count);
    }
}
