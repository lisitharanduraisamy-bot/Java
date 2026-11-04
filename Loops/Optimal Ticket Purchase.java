import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int m = scan.nextInt();
        int a = scan.nextInt();
        int b = scan.nextInt();

        int cost1 = n * a;
        int cost2 = (n / m) * b + Math.min((n % m) * a, b);
        int cost3 = (int) Math.ceil((double) n / m) * b;

        System.out.println(Math.min(cost1, Math.min(cost2, cost3)));

        scan.close();
    }
}
