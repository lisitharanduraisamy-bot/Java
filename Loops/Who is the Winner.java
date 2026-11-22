
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int[] vote = new int[n];
        int[] age = new int[n];

        for (int i = 0; i < n; i++) {
            vote[i] = scan.nextInt();
        }

        for (int i = 0; i < n; i++) {
            age[i] = scan.nextInt();
        }

        int[] count = new int[201];

        for (int i = 0; i < n; i++) {
            if (age[i] >= 18) {
                count[vote[i]]++;
            }
        }

        int maxVotes = 0;
        int winner = -1;
        boolean tie = false;

        for (int i = 1; i <= 200; i++) {
            if (count[i] > maxVotes) {
                maxVotes = count[i];
                winner = i;
                tie = false;
            } else if (count[i] == maxVotes && maxVotes > 0) {
                tie = true;
            }
        }

        if (tie || maxVotes == 0) {
            System.out.println(-1);
        } else {
            System.out.println(winner);
        }

        scan.close();
    }
}
