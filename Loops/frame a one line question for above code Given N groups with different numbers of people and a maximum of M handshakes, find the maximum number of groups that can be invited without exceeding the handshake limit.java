import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();

        while (T-- > 0) {
            int N = scan.nextInt();
            int M = scan.nextInt();
            int[] A = new int[N];

            for (int i = 0; i < N; i++) {
                A[i] = scan.nextInt();
            }

            Arrays.sort(A);
            int people = 0;
            int count = 0;

            for (int i = 0; i < N; i++) {
                people += A[i];
                if ((long) people * (people - 1) / 2 <= M) {
                    count++;
                } else {
                    break;
                }
            }

            System.out.println(count);
        }

        scan.close();
    }
}
