import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        long temp = n;
        int distinct = 0;

        for (long p = 2; p * p <= temp; p++) {
            if (temp % p == 0) {
                distinct++;
                while (temp % p == 0) {
                    temp /= p;
                }
            }
        }

        if (temp > 1) {
            distinct++;
        }

        long ans = (1L << distinct) - 1;
        System.out.println(ans);
    }
}
