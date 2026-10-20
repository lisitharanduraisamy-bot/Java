
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        Arrays.sort(arr);

        int count = 1;
        int largest = arr[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] != largest) {
                count++;
                largest = arr[i];
            }

            if (count == 3) {
                System.out.println(arr[i]);
                scan.close();
                return;
            }
        }

        System.out.println("Not Found");
        scan.close();
    }
}
