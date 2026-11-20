
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int k = scan.nextInt();

        while (k > 0) {
            if (n % 10 == 0) {
                n = n / 10;
            } else {
                n--;
            }
            k--;
        }

        System.out.println(n);
        scan.close();
    }
}
