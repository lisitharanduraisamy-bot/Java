import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int left = 0, right = n - 1;
        int alex = 0, jamie = 0;
        boolean alexTurn = true;

        while (left <= right) {
            int coins;

            if (a[left] >= a[right]) {
                coins = a[left++];
            } else {
                coins = a[right--];
            }

            if (alexTurn)
                alex += coins;
            else
                jamie += coins;

            alexTurn = !alexTurn;
        }

        System.out.println(alex + " " + jamie);
    }
}
