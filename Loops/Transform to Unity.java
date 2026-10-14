import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            long n = scan.nextLong();
            int count = 0;
            while (n % 2 == 0) {
                n /= 2;
            }
            while (n % 3 == 0) {
                n /= 3;
                count++;
            }
            if (n == 1) {
                System.out.println(count * 2);
            } else {
                System.out.println(-1);
            }
        }
        scan.close();
    }
}
