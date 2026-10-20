
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int count = 0;

        for (int i = 0; i < n; i++) {
            int num = scan.nextInt();
            if (num % 2 == 0) {
                count++;
            }
        }

        System.out.println(count);
        scan.close();
    }
}
