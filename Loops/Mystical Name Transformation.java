import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        System.out.println(Character.toUpperCase(name.charAt(0)) + name.substring(1));
        scan.close();
    }
}
