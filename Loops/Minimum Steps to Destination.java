import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();

        int steps = (x + 4) / 5;

        System.out.println(steps);

        scan.close();
    }
}
