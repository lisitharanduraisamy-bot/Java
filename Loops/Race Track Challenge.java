import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int t = scan.nextInt();

        while (t-- > 0) {
            int alex = scan.nextInt();
            int count = 0;

            for (int i = 0; i < 3; i++) {
                int distance = scan.nextInt();

                if (distance > alex) {
                    count++;
                }
            }

            System.out.println(count);
        }
    }
}
