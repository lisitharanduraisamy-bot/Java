import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();

        int mismatched = Math.min(a, b);
        int matching = Math.abs(a - b) / 2;

        System.out.println(mismatched + " " + matching);
    }
}
