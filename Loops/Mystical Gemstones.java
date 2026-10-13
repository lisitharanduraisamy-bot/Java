import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int odd = 0;
            for (int i = 0; i < n; i++) {
                if (scan.nextInt() % 2 != 0) {
                    odd++;
                }
            }
            if (odd % 2 == 0 && odd > 0 && odd < n) {
                System.out.println("YES");
            } else if (odd % 2 == 0 && odd == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        scan.close();
    }
}
