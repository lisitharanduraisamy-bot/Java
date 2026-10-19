import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        String t = scan.next();

        String rev = new StringBuilder(s).reverse().toString();

        if (rev.equals(t)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
