import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();

        while (t-- > 0) {
            int score = 0;

            for (int i = 0; i < 10; i++) {
                String s = scan.next();

                for (int j = 0; j < 10; j++) {
                    if (s.charAt(j) == 'X') {
                        score += Math.min(Math.min(i, 9 - i), Math.min(j, 9 - j)) + 1;
                    }
                }
            }

            System.out.println(score);
        }
        scan.close();
    }
}
