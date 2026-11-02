
import java.util.Scanner;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String name = scan.next();

            if (!map.containsKey(name)) {
                System.out.println("OK");
                map.put(name, 1);
            } else {
                int count = map.get(name);

                while (map.containsKey(name + count)) {
                    count++;
                }

                String newName = name + count;

                System.out.println(newName);

                map.put(name, count + 1);
                map.put(newName, 1);
            }
        }

        scan.close();
    }
}
