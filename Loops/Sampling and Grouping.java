
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] count = new int[100001];

        for (int i = 0; i < n; i++) {
            int x = scan.nextInt();
            count[x]++;
        }

        int groups = 0;

        for (int i = 0; i < count.length; i++) {
            groups += count[i] / 2;
        }

        System.out.println(groups);
    }
}
