import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int max = Integer.MIN_VALUE;
        int index = 0;

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();

            if (num > max) {
                max = num;
                index = i;
            }
        }

        System.out.println(max);
        System.out.println(index);
    }
}
