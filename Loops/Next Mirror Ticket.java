
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int num = n + 1;

        while (true) {
            int temp = num;
            int reverse = 0;

            while (temp > 0) {
                reverse = reverse * 10 + temp % 10;
                temp /= 10;
            }

            if (num == reverse) {
                System.out.println(num);
                break;
            }

            num++;
        }
    }
}
