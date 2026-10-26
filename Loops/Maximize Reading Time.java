import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int t = scan.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }

        int left = 0;
        int sum = 0;
        int max = 0;

        for (int right = 0; right < n; right++) {
            sum += a[right];

            while (sum > t) {
                sum -= a[left];
                left++;
            }

            max = Math.max(max, right - left + 1);
        }

        System.out.println(max);
        scan.close();
    }
}
