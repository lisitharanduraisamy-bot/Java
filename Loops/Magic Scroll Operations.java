
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int count = 0;

        for (int i = 0; i < n; i++) {
            String s = scan.next();
            if (s.contains("++")) {
                count++;
            } else {
                count--;
            }
        }

        System.out.println(count);
    }
}
