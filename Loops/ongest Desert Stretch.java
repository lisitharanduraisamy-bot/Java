import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int count = 0, max = 0;
            for (int i = 0; i < n; i++) {
                int num = scan.nextInt();
                if (num == 0) {
                    count++;
                    max = Math.max(max, count);
                } else {
                    count = 0;
                }
            }
            System.out.println(max);
        }
        scan.close();
    }
}
