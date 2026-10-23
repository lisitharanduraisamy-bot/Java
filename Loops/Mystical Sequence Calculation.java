import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();

        if (n % 2 == 0) {
            System.out.println(n / 2);
        } else {
            System.out.println(-(n + 1) / 2);
        }

        scan.close();
    }
}
