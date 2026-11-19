
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int t = scan.nextInt();
        String target = "mysticrune";

        while (t-- > 0) {
            String s = scan.next();
            int count = 0;

            for (int i = 0; i < 10; i++) {
                if (s.charAt(i) != target.charAt(i)) {
                    count++;
                }
            }

            System.out.println(count);
        }
    }
}
