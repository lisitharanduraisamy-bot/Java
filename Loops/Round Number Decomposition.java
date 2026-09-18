import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int place = 1;
            ArrayList<Integer> result = new ArrayList<>();

            while (n > 0) {
                int digit = n % 10;

                if (digit != 0) {
                    result.add(digit * place);
                }

                n /= 10;
                place *= 10;
            }

            System.out.println(result.size());

            for (int x : result) {
                System.out.print(x + " ");
            }

            System.out.println();
        }

        sc.close();
    }
}
