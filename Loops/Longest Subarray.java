import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int left = 0;
        int mask = 0;
        int ans = 0;

        for (int right = 0; right < n; right++) {
            while ((mask & a[right]) != 0) {
                mask ^= a[left];
                left++;
            }

            mask |= a[right];
            ans = Math.max(ans, right - left + 1);
        }

        System.out.println(ans);
    }
}
