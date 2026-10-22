import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();

        for (int i = 0; i < t; i++) {
            long a = scan.nextLong();
            long b = scan.nextLong();

            long ans = (b - a % b) % b;

            if (i > 0) {
                System.out.print("");
            }
            System.out.println(ans);
        }

        System.out.println();
        scan.close();
    }
}
