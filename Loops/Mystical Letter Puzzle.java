import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        String b = sc.nextLine();
        String pile = sc.nextLine();

        char[] combined = (a + b).toCharArray();
        char[] letters = pile.toCharArray();

        Arrays.sort(combined);
        Arrays.sort(letters);

        if (Arrays.equals(combined, letters))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
