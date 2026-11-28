import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        long a = scan.nextLong();
        long b = scan.nextLong();

        int carry = 0;
        int count = 0;

        while (a > 0 || b > 0 || carry > 0) {
            long sum = (a % 10) + (b % 10) + carry;

            if (sum >= 10) {
                carry = 1;
                count++;
            } else {
                carry = 0;
            }

            a /= 10;
            b /= 10;
        }

        System.out.println("Carry Operations: " + count);
    }
}
