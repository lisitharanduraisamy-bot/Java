import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int count = 0;

        int[] coins = {100, 20, 10, 5, 1};

        for (int coin : coins) {
            count += n / coin;
            n %= coin;
        }

        System.out.println(count);
        scan.close();
    }
}
