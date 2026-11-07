import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String s = scan.nextLine();
        String[] arr = s.split("\\+");

        Arrays.sort(arr);

        System.out.println(String.join("+", arr));

        scan.close();
    }
}
