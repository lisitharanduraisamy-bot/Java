import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hour = sc.nextInt();
        long shift = sc.nextLong();

        long result = ((hour + shift) % 24 + 24) % 24;

        System.out.printf("%02d", result);
    }
          }
