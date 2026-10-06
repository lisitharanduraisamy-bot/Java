import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        long a = scan.nextLong();
        long b = scan.nextLong();
        long c = scan.nextLong();
        long d = scan.nextLong();

        long max = Math.max(Math.max(a, b), Math.max(c, d));

        if (a != max)
            System.out.print((max - a) + " ");

        if (b != max)
            System.out.print((max - b) + " ");

        if (c != max)
            System.out.print((max - c) + " ");

        if (d != max)
            System.out.print(max - d);
    }
}
