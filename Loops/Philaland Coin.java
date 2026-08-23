import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();

            int count = 0;
            int power = 1;

            while (power <= N) {
                power *= 2;
                count++;
            }

            System.out.println(count);
        }

        sc.close();
    }
}
