import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        int[] horizontal = new int[m - 1];
        int[] vertical = new int[n - 1];

        for (int i = 0; i < m - 1; i++)
            horizontal[i] = sc.nextInt();

        for (int i = 0; i < n - 1; i++)
            vertical[i] = sc.nextInt();

        Arrays.sort(horizontal);
        Arrays.sort(vertical);

        int h = m - 2;
        int v = n - 2;

        long cost = 0;
        long hp = 1;
        long vp = 1;

        while (h >= 0 && v >= 0) {
            if (horizontal[h] >= vertical[v]) {
                cost += (long) horizontal[h] * vp;
                hp++;
                h--;
            } else {
                cost += (long) vertical[v] * hp;
                vp++;
                v--;
            }
        }

        while (h >= 0) {
            cost += (long) horizontal[h] * vp;
            h--;
        }

        while (v >= 0) {
            cost += (long) vertical[v] * hp;
            v--;
        }

        System.out.println(cost);
    }
}
