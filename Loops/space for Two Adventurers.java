import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int count = 0;

        for (int i = 0; i < n; i++) {
            int p = scan.nextInt();
            int q = scan.nextInt();

            if (q - p >= 2) {
                count++;
            }
        }

        System.out.println(count);
        scan.close();
    }
}
