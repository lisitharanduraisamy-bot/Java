import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if (x >= 0) {
                arr.add(x);
            }
        }

        int mid = (arr.size() - 1) / 2;
        System.out.println(arr.get(mid));

        sc.close();
    }
                        }
