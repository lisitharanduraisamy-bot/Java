import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (i % 2 == 1) {
                    System.out.print("#");
                } else if (i % 4 == 0) {
                    System.out.print(j == 1 ? "#" : ".");
                } else {
                    System.out.print(j == m ? "#" : ".");
                }
            }
            System.out.println();
        }
        scan.close();
    }
}
