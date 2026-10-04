import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int t = scan.nextInt();
        String word = "mysticrune";

        for (int i = 0; i < t; i++) {
            char c = scan.next().charAt(0);

            if (word.indexOf(c) != -1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
