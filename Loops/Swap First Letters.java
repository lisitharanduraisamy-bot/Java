import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();

        while (t-- > 0) {
            String a = scan.next();
            String b = scan.next();

            System.out.println(b.charAt(0) + a.substring(1) + " " + a.charAt(0) + b.substring(1));
        }
        scan.close();
    }
}
