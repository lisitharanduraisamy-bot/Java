
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();

        while (t-- > 0) {
            int n = scan.nextInt();
            String s = scan.next();

            if (s.contains("...")) {
                System.out.println(2);
            } else {
                int count = 0;
                for (int i = 0; i < n; i++) {
                    if (s.charAt(i) == '.') {
                        count++;
                    }
                }
                System.out.println(count);
            }
        }
        scan.close();
    }
}
