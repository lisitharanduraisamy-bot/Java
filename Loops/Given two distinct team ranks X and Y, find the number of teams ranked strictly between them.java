import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int X = scan.nextInt();
        int Y = scan.nextInt();
        System.out.println(Math.abs(X - Y) - 1);
        scan.close();
    }
}
