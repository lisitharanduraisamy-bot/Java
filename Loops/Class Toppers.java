import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] marks = new int[n];

        for (int i = 0; i < n; i++) {
            marks[i] = sc.nextInt();
        }

        int highest = -1;
        int secondHighest = -1;

        for (int mark : marks) {
            if (mark > highest) {
                secondHighest = highest;
                highest = mark;
            } else if (mark > secondHighest && mark != highest) {
                secondHighest = mark;
            }
        }

        int highestCount = 0;
        int secondHighestCount = 0;

        for (int mark : marks) {
            if (mark == highest) {
                highestCount++;
            } else if (mark == secondHighest) {
                secondHighestCount++;
            }
        }

        int answer = Math.max(0, highestCount - 1)
                   + Math.max(0, secondHighestCount - 1);

        System.out.println(answer);
    }
}
