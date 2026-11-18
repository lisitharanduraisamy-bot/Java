
import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        ArrayList<Integer> c = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            int x = scan.nextInt();

            if (x == 1) {
                a.add(i);
            } else if (x == 2) {
                b.add(i);
            } else {
                c.add(i);
            }
        }

        int w = Math.min(a.size(),
                Math.min(b.size(), c.size()));

        System.out.println(w);

        for (int i = 0; i < w; i++) {
            System.out.println(a.get(i) + " "
                    + b.get(i) + " " + c.get(i));
        }

        scan.close();
    }
}
