import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder input = new StringBuilder();
        String line;

        while ((line = br.readLine()) != null) {
            input.append(line).append(" ");
        }

        if (input.toString().trim().isEmpty()) {
            System.out.println(-1);
            return;
        }

        StringTokenizer st = new StringTokenizer(input.toString());

        int n = Integer.parseInt(st.nextToken());

        if (n <= 0) {
            System.out.println(-1);
            return;
        }

        long[] arr = new long[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Long.parseLong(st.nextToken());
        }

        long maxRight = arr[n - 1];
        long sum = arr[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > maxRight) {
                sum += arr[i];
                maxRight = arr[i];
            }
        }

        System.out.println(sum);
    }
    }
