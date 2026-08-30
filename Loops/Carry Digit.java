import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String num1 = sc.next();
        String num2 = sc.next();

        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;
        int count = 0;

        while (i >= 0 || j >= 0) {
            int d1 = (i >= 0) ? num1.charAt(i) - '0' : 0;
            int d2 = (j >= 0) ? num2.charAt(j) - '0' : 0;

            int sum = d1 + d2 + carry;

            if (sum >= 10) {
                carry = 1;
                count++;
            } else {
                carry = 0;
            }

            i--;
            j--;
        }

        System.out.println(count);
    }
}
