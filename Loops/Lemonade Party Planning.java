import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int l = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int p = sc.nextInt();
        int nl = sc.nextInt();
        int np = sc.nextInt();

        int lemonade = k * l;
        int lemons = c * d;
        int sugar = p;

        int glasses = Math.min(lemonade / nl, Math.min(lemons, sugar / np));

        System.out.println(glasses / n);
    }
}
