import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        boolean[] seen = new boolean[26];
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i) - 'a';
            if (!seen[index]) {
                seen[index] = true;
                count++;
            }
        }

        if (count % 2 == 0) {
            System.out.println("GENTLE SPIRIT!");
        } else {
            System.out.println("MYSTIC BEAST!");
        }

        scan.close();
    }
}
