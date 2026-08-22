import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s = sc.next();

        int[] count = new int[26];
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            int index = s.charAt(i) - 'a';
            ans[i] = count[index];
            count[index]++;
        }

        int q = sc.nextInt();

        while (q-- > 0) {
            int p = sc.nextInt();
            System.out.println(ans[p - 1]);
        }

        sc.close();
    }
}
