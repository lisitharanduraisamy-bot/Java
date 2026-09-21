import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int free = 0;
        int unattended = 0;

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();

            if (x == -1) {
                if (free > 0) {
                    free--;
                } else {
                    unattended++;
                }
            } else {
                free += x;
            }
        }

        System.out.println(unattended);
    }
}
