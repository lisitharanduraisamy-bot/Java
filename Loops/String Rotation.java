import java.util.*;

public class Main {
    public static String rotate(String s, char direction, int r) {
        int n = s.length();
        r = r % n;

        if (direction == 'L') {
            return s.substring(r) + s.substring(0, r);
        } else {
            return s.substring(n - r) + s.substring(0, n - r);
        }
    }

    public static boolean isAnagram(String a, String b) {
        int[] freq = new int[256];

        for (char c : a.toCharArray())
            freq[c]++;

        for (char c : b.toCharArray())
            freq[c]--;

        for (int x : freq)
            if (x != 0)
                return false;

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        int q = sc.nextInt();

        String current = s;
        StringBuilder first = new StringBuilder();

        for (int i = 0; i < q; i++) {
            char d = sc.next().charAt(0);
            int r = sc.nextInt();

            current = rotate(current, d, r);
            first.append(current.charAt(0));
        }

        String target = first.toString();

        if (target.length() > s.length()) {
            System.out.println("NO");
            return;
        }

        for (int i = 0; i <= s.length() - target.length(); i++) {
            String sub = s.substring(i, i + target.length());

            if (isAnagram(target, sub)) {
                System.out.println("YES");
                return;
            }
        }

        System.out.println("NO");
    }
}
