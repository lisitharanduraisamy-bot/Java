import java.util.*;

public class DuplicateNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        boolean[] printed = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (printed[i]) continue;

            boolean duplicate = false;

            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    duplicate = true;
                    printed[j] = true;
                }
            }

            if (duplicate) {
                System.out.println(arr[i]);
            }
        }

        sc.close();
    }
}
